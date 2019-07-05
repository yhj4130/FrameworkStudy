package com.test.spr;

public class RecordImpl implements Record
{
	private String name, tel, addr;
	
	@Override
	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public void setTel(String tel)
	{
		this.tel = tel;
	}

	@Override
	public String getTel()
	{
		return tel;
	}

	@Override
	public void setAddr(String addr)
	{
		this.addr = addr;
	}

	@Override
	public String getAddr()
	{
		return addr;
	}
	
}
