package com.lealpha.visualalpha.server.response;

import com.google.gson.annotations.SerializedName;
import com.lealpha.visualalpha.client.strava.response.AtletaJsonStrava;

public class AtividadeResponseJson {
	
	@SerializedName("resource_state")
    private int resourceState;

    @SerializedName("athlete")
    private AtletaJsonStrava atleta;

    @SerializedName("name")
    private String name;

    @SerializedName("distancia")
    private String distancia;

    @SerializedName("tempo")
    private String tempo;

    @SerializedName("elapsed_time")
    private int elapsedTime;

    @SerializedName("total_elevation_gain")
    private float totalElevationGain;

    //TODO Obejeto do tipo AcitivityType
    @SerializedName("type")
    private String type;

    @SerializedName("workout_type")
    private int workoutType;

    @SerializedName("id")
    private Long id;

    @SerializedName("external_id")
    private String externalId;

    @SerializedName("upload_id")
    private Long uploadId;

    @SerializedName("start_date")
    private String startDate;

    @SerializedName("start_date_local")
    private String startDateLocal;

    @SerializedName("timezone")
    private String timeZone;

    @SerializedName("utc_offset")
    private int utcOffSet;

    @SerializedName("start_latlng")
    private float[] startLatLng;

    @SerializedName("end_latlng")
    private float[] endLatLng;

    @SerializedName("location_city")
    private String locationCity;

    @SerializedName("location_state")
    private String locationState;

    @SerializedName("location_country")
    private String locationCountry;

    @SerializedName("start_latitude")
    private float startLatitude;

    @SerializedName("start_longitude")
    private float startLongitude;

    @SerializedName("achievement_count")
    private int achievementCount;

    @SerializedName("kudos_count")
    private int kudosCount;

    @SerializedName("comment_count")
    private int commentCount;

    @SerializedName("athlete_count")
    private int athleteCount;

    @SerializedName("photo_count")
    private int photoCount;

    @SerializedName("map")
    private PolylineMapResponseJson map;

    @SerializedName("trainer")
    private boolean trainer;

    @SerializedName("commute")
    private boolean commute;

    @SerializedName("manual")
    private boolean manual;

    @SerializedName("private")
    private boolean privateVal;

    @SerializedName("everyone")
    private String everyone;

    @SerializedName("gear_id")
    private String gearId;

    @SerializedName("from_accepted_tag")
    private boolean fromAcceptedTag;

    @SerializedName("has_heartrate")
    private boolean hasHeartrate;

    @SerializedName("heartrate_opt_out")
    private boolean heartrateOptOut;

    @SerializedName("display_hide_heartrate_option")
    private boolean displayHideHeartrateOption;

    @SerializedName("elev_high")
    private float elevHigh;

    @SerializedName("elev_low")
    private float elevLow;

    @SerializedName("pr_count")
    private int prCount;

    @SerializedName("total_photo_count")
    private int totalPhotoCount;

    @SerializedName("has_kudoed")
    private boolean hasKudoed;
    
    @SerializedName("velocidadeMedia")
    private float velocidadeMedia;

    @SerializedName("velocidadeMaxima")
    private float velocidadeMaxima;
    
    @SerializedName("pace")
    private String pace;
    
	public int getResourceState() {
		return resourceState;
	}

	public void setResourceState(int resourceState) {
		this.resourceState = resourceState;
	}

	public AtletaJsonStrava getAtleta() {
		return atleta;
	}

	public void setAtleta(AtletaJsonStrava atleta) {
		this.atleta = atleta;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDistancia() {
		return distancia;
	}

	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public int getElapsedTime() {
		return elapsedTime;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public float getTotalElevationGain() {
		return totalElevationGain;
	}

	public void setTotalElevationGain(float totalElevationGain) {
		this.totalElevationGain = totalElevationGain;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWorkoutType() {
		return workoutType;
	}

	public void setWorkoutType(int workoutType) {
		this.workoutType = workoutType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExternalId() {
		return externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Long getUploadId() {
		return uploadId;
	}

	public void setUploadId(Long uploadId) {
		this.uploadId = uploadId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getStartDateLocal() {
		return startDateLocal;
	}

	public void setStartDateLocal(String startDateLocal) {
		this.startDateLocal = startDateLocal;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public int getUtcOffSet() {
		return utcOffSet;
	}

	public void setUtcOffSet(int utcOffSet) {
		this.utcOffSet = utcOffSet;
	}

	public float[] getStartLatLng() {
		return startLatLng;
	}

	public void setStartLatLng(float[] startLatLng) {
		this.startLatLng = startLatLng;
	}

	public float[] getEndLatLng() {
		return endLatLng;
	}

	public void setEndLatLng(float[] endLatLng) {
		this.endLatLng = endLatLng;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getLocationState() {
		return locationState;
	}

	public void setLocationState(String locationState) {
		this.locationState = locationState;
	}

	public String getLocationCountry() {
		return locationCountry;
	}

	public void setLocationCountry(String locationCountry) {
		this.locationCountry = locationCountry;
	}

	public float getStartLatitude() {
		return startLatitude;
	}

	public void setStartLatitude(float startLatitude) {
		this.startLatitude = startLatitude;
	}

	public float getStartLongitude() {
		return startLongitude;
	}

	public void setStartLongitude(float startLongitude) {
		this.startLongitude = startLongitude;
	}

	public int getAchievementCount() {
		return achievementCount;
	}

	public void setAchievementCount(int achievementCount) {
		this.achievementCount = achievementCount;
	}

	public int getKudosCount() {
		return kudosCount;
	}

	public void setKudosCount(int kudosCount) {
		this.kudosCount = kudosCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getAthleteCount() {
		return athleteCount;
	}

	public void setAthleteCount(int athleteCount) {
		this.athleteCount = athleteCount;
	}

	public int getPhotoCount() {
		return photoCount;
	}

	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}

	public PolylineMapResponseJson getMap() {
		return map;
	}

	public void setMap(PolylineMapResponseJson map) {
		this.map = map;
	}

	public boolean isTrainer() {
		return trainer;
	}

	public void setTrainer(boolean trainer) {
		this.trainer = trainer;
	}

	public boolean isCommute() {
		return commute;
	}

	public void setCommute(boolean commute) {
		this.commute = commute;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public boolean isPrivateVal() {
		return privateVal;
	}

	public void setPrivateVal(boolean privateVal) {
		this.privateVal = privateVal;
	}

	public String getEveryone() {
		return everyone;
	}

	public void setEveryone(String everyone) {
		this.everyone = everyone;
	}

	public String getGearId() {
		return gearId;
	}

	public void setGearId(String gearId) {
		this.gearId = gearId;
	}

	public boolean isFromAcceptedTag() {
		return fromAcceptedTag;
	}

	public void setFromAcceptedTag(boolean fromAcceptedTag) {
		this.fromAcceptedTag = fromAcceptedTag;
	}

	public boolean isHasHeartrate() {
		return hasHeartrate;
	}

	public void setHasHeartrate(boolean hasHeartrate) {
		this.hasHeartrate = hasHeartrate;
	}

	public boolean isHeartrateOptOut() {
		return heartrateOptOut;
	}

	public void setHeartrateOptOut(boolean heartrateOptOut) {
		this.heartrateOptOut = heartrateOptOut;
	}

	public boolean isDisplayHideHeartrateOption() {
		return displayHideHeartrateOption;
	}

	public void setDisplayHideHeartrateOption(boolean displayHideHeartrateOption) {
		this.displayHideHeartrateOption = displayHideHeartrateOption;
	}

	public float getElevHigh() {
		return elevHigh;
	}

	public void setElevHigh(float elevHigh) {
		this.elevHigh = elevHigh;
	}

	public float getElevLow() {
		return elevLow;
	}

	public void setElevLow(float elevLow) {
		this.elevLow = elevLow;
	}

	public int getPrCount() {
		return prCount;
	}

	public void setPrCount(int prCount) {
		this.prCount = prCount;
	}

	public int getTotalPhotoCount() {
		return totalPhotoCount;
	}

	public void setTotalPhotoCount(int totalPhotoCount) {
		this.totalPhotoCount = totalPhotoCount;
	}

	public boolean isHasKudoed() {
		return hasKudoed;
	}

	public void setHasKudoed(boolean hasKudoed) {
		this.hasKudoed = hasKudoed;
	}

	public float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getPace() {
		return pace;
	}

	public void setPace(String pace) {
		this.pace = pace;
	}

}