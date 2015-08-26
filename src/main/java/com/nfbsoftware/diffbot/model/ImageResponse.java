package com.nfbsoftware.diffbot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author brendanclemenzi
 */
public class ImageResponse
{
    private Request m_request;
    
    private List<Image> m_objects = new ArrayList<Image>();

    public Request getRequest()
    {
        return m_request;
    }
    public void setRequest(Request request)
    {
        m_request = request;
    }
    
    public List<Image> getObjects()
    {
        return m_objects;
    }
    public void setObjects(List<Image> objects)
    {
        m_objects = objects;
    }
}
