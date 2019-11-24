package com.lealpha.visualalpha.client.strava.response;

import com.google.gson.annotations.SerializedName;

public class AtletaJsonStrava {
	
	@SerializedName("id")
    private long id;
	
    @SerializedName("username")
    private String userName;

    @SerializedName("resource_state")
    private int resourceState;

    @SerializedName("firstname")
    private String firstName;

    @SerializedName("lastname")
    private String lastName;

    @SerializedName("city")
    private String city;

    @SerializedName("state")
    private String state;

    @SerializedName("country")
    private String country;

    @SerializedName("sex")
    private String sex;

    @SerializedName("premium")
    private boolean premium;

    @SerializedName("summit")
    private boolean summit;

    @SerializedName("created_at")
    private String dateCriated;

    @SerializedName("updated_at")
    private String dateUpdate;

    @SerializedName("badge_type_id")
    private int badgeTypeId;

    @SerializedName("profile_medium")
    private String profileMedium;

    @SerializedName("profile")
    private String profile;

    @SerializedName("friend")
    private int friend;

    @SerializedName("follower")
    private int follower;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getResourceState() {
		return resourceState;
	}

	public void setResourceState(int resourceState) {
		this.resourceState = resourceState;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isPremium() {
		return premium;
	}

	public void setPremium(boolean premium) {
		this.premium = premium;
	}

	public boolean isSummit() {
		return summit;
	}

	public void setSummit(boolean summit) {
		this.summit = summit;
	}

	public String getDateCriated() {
		return dateCriated;
	}

	public void setDateCriated(String dateCriated) {
		this.dateCriated = dateCriated;
	}

	public String getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(String dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public int getBadgeTypeId() {
		return badgeTypeId;
	}

	public void setBadgeTypeId(int badgeTypeId) {
		this.badgeTypeId = badgeTypeId;
	}

	public String getProfileMedium() {
		return profileMedium;
	}

	public void setProfileMedium(String profileMedium) {
		this.profileMedium = profileMedium;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getFriend() {
		return friend;
	}

	public void setFriend(int friend) {
		this.friend = friend;
	}

	public int getFollower() {
		return follower;
	}

	public void setFollower(int follower) {
		this.follower = follower;
	}
    
  
}