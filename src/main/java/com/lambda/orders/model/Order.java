package com.lambda.orders.model;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordnum;
    
    private double ordamount;
    private double advanceamount;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custcode", nullable = false)
    private long custcode;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "agentcode")
    private long agentcode;
    
    private String orddescription;
    
    public Order()
    {
    }
    
    public Order(double ordamount, double advanceamount, long custcode, long agentcode, String orddescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.custcode = custcode;
        this.agentcode = agentcode;
        this.orddescription = orddescription;
    }
    
    public long getOrdnum()
    {
        return ordnum;
    }
    
    public void setOrdnum(long ordnum)
    {
        this.ordnum = ordnum;
    }
    
    public double getOrdamount()
    {
        return ordamount;
    }
    
    public void setOrdamount(double ordamount)
    {
        this.ordamount = ordamount;
    }
    
    public double getAdvanceamount()
    {
        return advanceamount;
    }
    
    public void setAdvanceamount(double advanceamount)
    {
        this.advanceamount = advanceamount;
    }
    
    public long getCustcode()
    {
        return custcode;
    }
    
    public void setCustcode(long custcode)
    {
        this.custcode = custcode;
    }
    
    public long getAgentcode()
    {
        return agentcode;
    }
    
    public void setAgentcode(long agentcode)
    {
        this.agentcode = agentcode;
    }
    
    public String getOrddescription()
    {
        return orddescription;
    }
    
    public void setOrddescription(String orddescription)
    {
        this.orddescription = orddescription;
    }
}
