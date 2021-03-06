package com.australia.cqimport.servlet;

import com.australia.cqimport.service.ContentImporterService;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by Viren Pushpanayagam on 27/03/2014.
 */

/**
 * Paths to be created before you can call this servlet
 * /content/australia/places /content/australia/articles
 * /content/australia/facts /content/australia/facts/australias-seasons
 * /content/australia/planning
 */

@SlingServlet(methods = {"POST"}, paths = "/apps/ta/servlets/ContentImporter")
@Properties({
        @Property(name = "service.pid", value = "com.australia.cqimport.servlet.ContentImporter", propertyPrivate = false),
        @Property(name = "service.description", value = "Content Importer", propertyPrivate = false),
        @Property(name = "service.vendor", value = "DT Digital", propertyPrivate = false)})
public class ContentImporter extends SlingAllMethodsServlet {
    private static final long serialVersionUID = 1L;

    @Reference
    private ContentImporterService contentImporter;

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,
            IOException {

        String[] languages = new String[]{"de", "jp", "es", "ko", "zht", "id", "my", "en", "it", "fr", "pt"};
        //String lang = request.getParameter("lang");

        for (String lang : languages) {
            contentImporter.importLanguage(lang);
        }

    }

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException,
            IOException {
        doPost(request, response);

    }
}
