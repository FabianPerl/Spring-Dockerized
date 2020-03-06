package com.webservices.family.restservice.model;

public class Member
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(final int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals (Object object) {
       if (!(object instanceof Member)) return false;
       Member member = (Member) object;

       return member.getAge() == this.age && member.getName().equals(this.name);
    }
}
