
package model;


import java.time.LocalDate;


public class Festival {
private int festivalId;
private String country;
private String city;
private String type; // e.g., Music, Food
private String descriptionEN;
private String descriptionES;
private String descriptionFR;
private String languagesSupported; // "EN,ES,FR"
private LocalDate startDate;
private LocalDate endDate;
private int popularity; // simple score


public Festival() {}


// Getters and setters omitted for brevity (generate in IDE)


public int getFestivalId() { return festivalId; }
public void setFestivalId(int festivalId) { this.festivalId = festivalId; }
public String getCountry() { return country; }
public void setCountry(String country) { this.country = country; }
public String getCity() { return city; }
public void setCity(String city) { this.city = city; }
public String getType() { return type; }
public void setType(String type) { this.type = type; }
public String getDescriptionEN() { return descriptionEN; }
public void setDescriptionEN(String descriptionEN) { this.descriptionEN = descriptionEN; }
public String getDescriptionES() { return descriptionES; }
public void setDescriptionES(String descriptionES) { this.descriptionES = descriptionES; }
public String getDescriptionFR() { return descriptionFR; }
public void setDescriptionFR(String descriptionFR) { this.descriptionFR = descriptionFR; }
public String getLanguagesSupported() { return languagesSupported; }
public void setLanguagesSupported(String languagesSupported) { this.languagesSupported = languagesSupported; }
public LocalDate getStartDate() { return startDate; }
public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
public LocalDate getEndDate() { return endDate; }
public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
public int getPopularity() { return popularity; }
public void setPopularity(int popularity) { this.popularity = popularity; }


// Utility: returns description according to language code
public String getDescription(String langCode) {
if (langCode == null) return descriptionEN;
switch(langCode.toUpperCase()) {
case "ES": return descriptionES != null ? descriptionES : descriptionEN;
case "FR": return descriptionFR != null ? descriptionFR : descriptionEN;
default: return descriptionEN;
}
}
}
