package com.nfbsoftware.diffbot.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author brendanclemenzi
 */
public class VideoResponse
{
    private Request m_request;
    
    private List<Video> m_objects = new ArrayList<Video>();

    public Request getRequest()
    {
        return m_request;
    }
    public void setRequest(Request request)
    {
        m_request = request;
    }
    
    public List<Video> getObjects()
    {
        return m_objects;
    }
    public void setObjects(List<Video> objects)
    {
        m_objects = objects;
    }
}
