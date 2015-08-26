package com.nfbsoftware.diffbot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author brendanclemenzi
 */
public class ArticleResponse
{
    private Request m_request;
    
    private List<Article> m_objects = new ArrayList<Article>();

    public Request getRequest()
    {
        return m_request;
    }
    public void setRequest(Request request)
    {
        m_request = request;
    }
    
    public List<Article> getObjects()
    {
        return m_objects;
    }
    public void setObjects(List<Article> objects)
    {
        m_objects = objects;
    }
}
