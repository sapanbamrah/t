package com.australia.cqimport.service;

import java.util.HashMap;
import java.util.Map;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.apache.sling.api.resource.PersistenceException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.jcr.resource.JcrResourceConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.australia.cqimport.domain.ConsumerBaseFoundationType;
import com.day.cq.commons.jcr.JcrConstants;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.WCMException;

/**
 * Created by Viren Pushpanayagam on 27/03/2014.
 */
public class StateCityBuilder extends PageBuilder {
	private static final Logger LOG = LoggerFactory.getLogger(StateCityBuilder.class);
	private static final String TEMPLATE = "/apps/tourismaustralia/templates/cityState";

	@Override
	public void createPage(String oldPath, String newPath, ResourceResolver resourceResolver, boolean addMixin)
		throws WCMException {
		PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
		Page page = pageManager.getPage(PageBuilder.CRX_ROOT_PATH + newPath);

		Resource pageResource;

		if (page == null) {
			LOG.debug("Importing: " + PageBuilder.CRX_ROOT_PATH + oldPath);
			DefaultConsumerBaseFoundationService service = new DefaultConsumerBaseFoundationService();
			ConsumerBaseFoundationType cbf = service.getByPath(oldPath);

			page = pageManager.create(getPath(PageBuilder.CRX_ROOT_PATH + newPath, false),
				getPath(PageBuilder.CRX_ROOT_PATH + newPath, true), TEMPLATE, null, true);

			if (addMixin) {
				pageResource = page.adaptTo(Resource.class);
				Resource jcrContentResource = pageResource.getChild(JcrConstants.JCR_CONTENT);
				try {
					jcrContentResource.adaptTo(Node.class).addMixin("cq:LiveSync");
				} catch (RepositoryException e) {
					LOG.error(e.getMessage(), e);
				}
			}

			createHero(page, resourceResolver, cbf);
			createSummery(page, resourceResolver, cbf);

		}
	}

	private void createHero(Page page, ResourceResolver resourceResolver, ConsumerBaseFoundationType cbf) {
		Resource pageResource = page.adaptTo(Resource.class);
		Resource jcrContentResource = pageResource.getChild(JcrConstants.JCR_CONTENT);
		try {

			Map params = new HashMap<String, String>();
			params.put("title", cbf.getHdlTitle());
			params.put("image", cbf.getImgBackground());
			params.put(JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY, "tourismaustralia/components/content/hero");

			resourceResolver.create(jcrContentResource, "hero", params);
			resourceResolver.commit();
		} catch (PersistenceException e) {
			LOG.error(e.getMessage(), e);
		}

	}

	private void createSummery(Page page, ResourceResolver resourceResolver, ConsumerBaseFoundationType cbf) {
		Resource pageResource = page.adaptTo(Resource.class);
		Resource jcrContentResource = pageResource.getChild(JcrConstants.JCR_CONTENT);
		try {

			Map params = new HashMap<String, String>();
			params.put("text", cbf.getStfDescription());
			params
				.put(JcrResourceConstants.SLING_RESOURCE_TYPE_PROPERTY, "tourismaustralia/components/content/summery");

			resourceResolver.create(jcrContentResource, "summary", params);
			resourceResolver.commit();
		} catch (PersistenceException e) {
			LOG.error(e.getMessage(), e);
		}

	}
}
