package com.nfbsoftware.diffbot.model;

import java.math.BigDecimal;

/**
 * 
 * @author brendanclemenzi
 */
public class ErrorResponse
{
    private String m_error;
    private BigDecimal m_errorCode;
    
    public String getError()
    {
        return m_error;
    }
    public void setError(String error)
    {
        m_error = error;
    }
    public BigDecimal getErrorCode()
    {
        return m_errorCode;
    }
    public void setErrorCode(BigDecimal errorCode)
    {
        m_errorCode = errorCode;
    }
}
