package com.rainforest.model.user;

public interface IUserPrivileges {
	public boolean canViewRegistrationRequests();
	public boolean canProcessRegistrationRequests();
	public boolean canDeleteRegistrationRequests();
}