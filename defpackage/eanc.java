package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import defpackage.eane;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanc {
    public static final /* synthetic */ int a = 0;
    private static final ekgp b;
    private static final ekgp c;
    private static final ekgp d;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("OPERATIONAL", eate.OPERATIONAL);
        ekgiVar.i("CLOSED_TEMPORARILY", eate.CLOSED_TEMPORARILY);
        ekgiVar.i("CLOSED_PERMANENTLY", eate.CLOSED_PERMANENTLY);
        b = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i("accounting", eati.ACCOUNTING);
        ekgiVar2.i("administrative_area_level_1", eati.ADMINISTRATIVE_AREA_LEVEL_1);
        ekgiVar2.i("administrative_area_level_2", eati.ADMINISTRATIVE_AREA_LEVEL_2);
        ekgiVar2.i("administrative_area_level_3", eati.ADMINISTRATIVE_AREA_LEVEL_3);
        ekgiVar2.i("administrative_area_level_4", eati.ADMINISTRATIVE_AREA_LEVEL_4);
        ekgiVar2.i("administrative_area_level_5", eati.ADMINISTRATIVE_AREA_LEVEL_5);
        ekgiVar2.i("airport", eati.AIRPORT);
        ekgiVar2.i("amusement_park", eati.AMUSEMENT_PARK);
        ekgiVar2.i("aquarium", eati.AQUARIUM);
        ekgiVar2.i("archipelago", eati.ARCHIPELAGO);
        ekgiVar2.i("art_gallery", eati.ART_GALLERY);
        ekgiVar2.i("atm", eati.ATM);
        ekgiVar2.i("bakery", eati.BAKERY);
        ekgiVar2.i("bank", eati.BANK);
        ekgiVar2.i("bar", eati.BAR);
        ekgiVar2.i("beauty_salon", eati.BEAUTY_SALON);
        ekgiVar2.i("bicycle_store", eati.BICYCLE_STORE);
        ekgiVar2.i("book_store", eati.BOOK_STORE);
        ekgiVar2.i("bowling_alley", eati.BOWLING_ALLEY);
        ekgiVar2.i("bus_station", eati.BUS_STATION);
        ekgiVar2.i("cafe", eati.CAFE);
        ekgiVar2.i("campground", eati.CAMPGROUND);
        ekgiVar2.i("car_dealer", eati.CAR_DEALER);
        ekgiVar2.i("car_rental", eati.CAR_RENTAL);
        ekgiVar2.i("car_repair", eati.CAR_REPAIR);
        ekgiVar2.i("car_wash", eati.CAR_WASH);
        ekgiVar2.i("casino", eati.CASINO);
        ekgiVar2.i("cemetery", eati.CEMETERY);
        ekgiVar2.i("church", eati.CHURCH);
        ekgiVar2.i("city_hall", eati.CITY_HALL);
        ekgiVar2.i("clothing_store", eati.CLOTHING_STORE);
        ekgiVar2.i("colloquial_area", eati.COLLOQUIAL_AREA);
        ekgiVar2.i("continent", eati.CONTINENT);
        ekgiVar2.i("convenience_store", eati.CONVENIENCE_STORE);
        ekgiVar2.i("country", eati.COUNTRY);
        ekgiVar2.i("courthouse", eati.COURTHOUSE);
        ekgiVar2.i("dentist", eati.DENTIST);
        ekgiVar2.i("department_store", eati.DEPARTMENT_STORE);
        ekgiVar2.i("doctor", eati.DOCTOR);
        ekgiVar2.i("drugstore", eati.DRUGSTORE);
        ekgiVar2.i("electrician", eati.ELECTRICIAN);
        ekgiVar2.i("electronics_store", eati.ELECTRONICS_STORE);
        ekgiVar2.i("embassy", eati.EMBASSY);
        ekgiVar2.i("establishment", eati.ESTABLISHMENT);
        ekgiVar2.i("finance", eati.FINANCE);
        ekgiVar2.i("fire_station", eati.FIRE_STATION);
        ekgiVar2.i("floor", eati.FLOOR);
        ekgiVar2.i("florist", eati.FLORIST);
        ekgiVar2.i("food", eati.FOOD);
        ekgiVar2.i("funeral_home", eati.FUNERAL_HOME);
        ekgiVar2.i("furniture_store", eati.FURNITURE_STORE);
        ekgiVar2.i("gas_station", eati.GAS_STATION);
        ekgiVar2.i("general_contractor", eati.GENERAL_CONTRACTOR);
        ekgiVar2.i("geocode", eati.GEOCODE);
        ekgiVar2.i("grocery_or_supermarket", eati.GROCERY_OR_SUPERMARKET);
        ekgiVar2.i("gym", eati.GYM);
        ekgiVar2.i("hair_care", eati.HAIR_CARE);
        ekgiVar2.i("hardware_store", eati.HARDWARE_STORE);
        ekgiVar2.i("health", eati.HEALTH);
        ekgiVar2.i("hindu_temple", eati.HINDU_TEMPLE);
        ekgiVar2.i("home_goods_store", eati.HOME_GOODS_STORE);
        ekgiVar2.i("hospital", eati.HOSPITAL);
        ekgiVar2.i("insurance_agency", eati.INSURANCE_AGENCY);
        ekgiVar2.i("intersection", eati.INTERSECTION);
        ekgiVar2.i("jewelry_store", eati.JEWELRY_STORE);
        ekgiVar2.i("laundry", eati.LAUNDRY);
        ekgiVar2.i("lawyer", eati.LAWYER);
        ekgiVar2.i("library", eati.LIBRARY);
        ekgiVar2.i("light_rail_station", eati.LIGHT_RAIL_STATION);
        ekgiVar2.i("liquor_store", eati.LIQUOR_STORE);
        ekgiVar2.i("local_government_office", eati.LOCAL_GOVERNMENT_OFFICE);
        ekgiVar2.i("locality", eati.LOCALITY);
        ekgiVar2.i("locksmith", eati.LOCKSMITH);
        ekgiVar2.i("lodging", eati.LODGING);
        ekgiVar2.i("meal_delivery", eati.MEAL_DELIVERY);
        ekgiVar2.i("meal_takeaway", eati.MEAL_TAKEAWAY);
        ekgiVar2.i("mosque", eati.MOSQUE);
        ekgiVar2.i("movie_rental", eati.MOVIE_RENTAL);
        ekgiVar2.i("movie_theater", eati.MOVIE_THEATER);
        ekgiVar2.i("moving_company", eati.MOVING_COMPANY);
        ekgiVar2.i("museum", eati.MUSEUM);
        ekgiVar2.i("natural_feature", eati.NATURAL_FEATURE);
        ekgiVar2.i("neighborhood", eati.NEIGHBORHOOD);
        ekgiVar2.i("night_club", eati.NIGHT_CLUB);
        ekgiVar2.i("painter", eati.PAINTER);
        ekgiVar2.i("park", eati.PARK);
        ekgiVar2.i("parking", eati.PARKING);
        ekgiVar2.i("pet_store", eati.PET_STORE);
        ekgiVar2.i("pharmacy", eati.PHARMACY);
        ekgiVar2.i("physiotherapist", eati.PHYSIOTHERAPIST);
        ekgiVar2.i("place_of_worship", eati.PLACE_OF_WORSHIP);
        ekgiVar2.i("plumber", eati.PLUMBER);
        ekgiVar2.i("plus_code", eati.PLUS_CODE);
        ekgiVar2.i("point_of_interest", eati.POINT_OF_INTEREST);
        ekgiVar2.i("police", eati.POLICE);
        ekgiVar2.i("political", eati.POLITICAL);
        ekgiVar2.i("post_box", eati.POST_BOX);
        ekgiVar2.i("post_office", eati.POST_OFFICE);
        ekgiVar2.i("postal_code_prefix", eati.POSTAL_CODE_PREFIX);
        ekgiVar2.i("postal_code_suffix", eati.POSTAL_CODE_SUFFIX);
        ekgiVar2.i("postal_code", eati.POSTAL_CODE);
        ekgiVar2.i("postal_town", eati.POSTAL_TOWN);
        ekgiVar2.i("premise", eati.PREMISE);
        ekgiVar2.i("primary_school", eati.PRIMARY_SCHOOL);
        ekgiVar2.i("real_estate_agency", eati.REAL_ESTATE_AGENCY);
        ekgiVar2.i("restaurant", eati.RESTAURANT);
        ekgiVar2.i("roofing_contractor", eati.ROOFING_CONTRACTOR);
        ekgiVar2.i("room", eati.ROOM);
        ekgiVar2.i("route", eati.ROUTE);
        ekgiVar2.i("rv_park", eati.RV_PARK);
        ekgiVar2.i("school", eati.SCHOOL);
        ekgiVar2.i("secondary_school", eati.SECONDARY_SCHOOL);
        ekgiVar2.i("shoe_store", eati.SHOE_STORE);
        ekgiVar2.i("shopping_mall", eati.SHOPPING_MALL);
        ekgiVar2.i("spa", eati.SPA);
        ekgiVar2.i("stadium", eati.STADIUM);
        ekgiVar2.i("storage", eati.STORAGE);
        ekgiVar2.i("store", eati.STORE);
        ekgiVar2.i("street_address", eati.STREET_ADDRESS);
        ekgiVar2.i("street_number", eati.STREET_NUMBER);
        ekgiVar2.i("sublocality_level_1", eati.SUBLOCALITY_LEVEL_1);
        ekgiVar2.i("sublocality_level_2", eati.SUBLOCALITY_LEVEL_2);
        ekgiVar2.i("sublocality_level_3", eati.SUBLOCALITY_LEVEL_3);
        ekgiVar2.i("sublocality_level_4", eati.SUBLOCALITY_LEVEL_4);
        ekgiVar2.i("sublocality_level_5", eati.SUBLOCALITY_LEVEL_5);
        ekgiVar2.i("sublocality", eati.SUBLOCALITY);
        ekgiVar2.i("subpremise", eati.SUBPREMISE);
        ekgiVar2.i("subway_station", eati.SUBWAY_STATION);
        ekgiVar2.i("supermarket", eati.SUPERMARKET);
        ekgiVar2.i("synagogue", eati.SYNAGOGUE);
        ekgiVar2.i("taxi_stand", eati.TAXI_STAND);
        ekgiVar2.i("tourist_attraction", eati.TOURIST_ATTRACTION);
        ekgiVar2.i("town_square", eati.TOWN_SQUARE);
        ekgiVar2.i("train_station", eati.TRAIN_STATION);
        ekgiVar2.i("transit_station", eati.TRANSIT_STATION);
        ekgiVar2.i("travel_agency", eati.TRAVEL_AGENCY);
        ekgiVar2.i("university", eati.UNIVERSITY);
        ekgiVar2.i("veterinary_care", eati.VETERINARY_CARE);
        ekgiVar2.i("zoo", eati.ZOO);
        c = ekgiVar2.c();
        ekgi ekgiVar3 = new ekgi();
        ekgiVar3.i("ACCESS", easo.ACCESS);
        ekgiVar3.i("BREAKFAST", easo.BREAKFAST);
        ekgiVar3.i("BRUNCH", easo.BRUNCH);
        ekgiVar3.i("DELIVERY", easo.DELIVERY);
        ekgiVar3.i("DINNER", easo.DINNER);
        ekgiVar3.i("DRIVE_THROUGH", easo.DRIVE_THROUGH);
        ekgiVar3.i("HAPPY_HOUR", easo.HAPPY_HOUR);
        ekgiVar3.i("KITCHEN", easo.KITCHEN);
        ekgiVar3.i("LUNCH", easo.LUNCH);
        ekgiVar3.i("ONLINE_SERVICE_HOURS", easo.ONLINE_SERVICE_HOURS);
        ekgiVar3.i("PICKUP", easo.PICKUP);
        ekgiVar3.i("SENIOR_HOURS", easo.SENIOR_HOURS);
        ekgiVar3.i("TAKEOUT", easo.TAKEOUT);
        d = ekgiVar3.c();
    }

    static easi a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return easi.e(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.format("Unable to convert %s to LocalDate; date should be in format YYYY-MM-DD.", str), e);
        }
    }

    static eatb b(Boolean bool) {
        return bool == null ? eatb.UNKNOWN : bool.booleanValue() ? eatb.TRUE : eatb.FALSE;
    }

    static eatv c(eane.d.c cVar) {
        eary earyVar;
        easi easiVarA = null;
        if (cVar == null) {
            return null;
        }
        try {
            Integer num = cVar.day;
            num.getClass();
            String str = cVar.time;
            str.getClass();
            boolean z = true;
            String str2 = String.format("Unable to convert %s to LocalTime, must be of format \"hhmm\".", str);
            if (str.length() != 4) {
                z = false;
            }
            ejwl.b(z, str2);
            try {
                easj easjVarC = easj.c(Integer.parseInt(str.substring(0, 2)), Integer.parseInt(str.substring(2, 4)));
                try {
                    easiVarA = a(cVar.date);
                } catch (IllegalArgumentException unused) {
                }
                switch (num.intValue()) {
                    case 0:
                        earyVar = eary.SUNDAY;
                        break;
                    case 1:
                        earyVar = eary.MONDAY;
                        break;
                    case 2:
                        earyVar = eary.TUESDAY;
                        break;
                    case 3:
                        earyVar = eary.WEDNESDAY;
                        break;
                    case 4:
                        earyVar = eary.THURSDAY;
                        break;
                    case 5:
                        earyVar = eary.FRIDAY;
                        break;
                    case 6:
                        earyVar = eary.SATURDAY;
                        break;
                    default:
                        throw new IllegalArgumentException("pabloDayOfWeek can only be an integer between 0 and 6");
                }
                eatu eatuVarE = eatv.e(earyVar, easjVarC);
                ((eapj) eatuVarE).a = easiVarA;
                eatuVarE.b(Boolean.TRUE.equals(cVar.truncated));
                return eatuVarE.a();
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(str2, e);
            }
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final defpackage.eatj d(defpackage.eane r14, java.util.List r15) throws defpackage.dcff {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanc.d(eane, java.util.List):eatj");
    }

    private static dcff e(String str) {
        return new dcff(new Status(8, "Unexpected server error: ".concat(String.valueOf(str))));
    }

    private static LatLng f(eane.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        Double d2 = aVar.lat;
        Double d3 = aVar.lng;
        if (d2 == null || d3 == null) {
            return null;
        }
        return new LatLng(d2.doubleValue(), d3.doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static easp g(eane.d dVar) {
        ekgb ekgbVarP;
        ArrayList arrayList;
        eats eatsVarA;
        easx easxVarA;
        if (dVar == null) {
            return null;
        }
        easm easmVarH = easp.h();
        eane.d.a[] aVarArr = dVar.periods;
        if (aVarArr != null) {
            ekgbVarP = ekgb.p(aVarArr);
        } else {
            int i = ekgb.d;
            ekgbVarP = ekoe.a;
        }
        if (ekgbVarP.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            ekqh it = ekgbVarP.iterator();
            while (it.hasNext()) {
                eane.d.a aVar = (eane.d.a) it.next();
                if (aVar != null) {
                    eaot eaotVar = new eaot();
                    eaotVar.a = c(aVar.open);
                    eaotVar.b = c(aVar.close);
                    easxVarA = eaotVar.a();
                } else {
                    easxVarA = null;
                }
                h(arrayList, easxVarA);
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        easmVarH.b(arrayList);
        String[] strArr = dVar.weekdayText;
        easmVarH.d(strArr != null ? ekgb.p(strArr) : ekoe.a);
        ((eaon) easmVarH).a = (easo) d.getOrDefault(dVar.type, null);
        eane.d.b[] bVarArr = dVar.specialDays;
        ekgb ekgbVarP2 = bVarArr != null ? ekgb.p(bVarArr) : ekoe.a;
        ArrayList arrayList2 = new ArrayList();
        if (!ekgbVarP2.isEmpty()) {
            ekqh it2 = ekgbVarP2.iterator();
            while (it2.hasNext()) {
                eane.d.b bVar = (eane.d.b) it2.next();
                if (bVar == null) {
                    eatsVarA = null;
                } else {
                    try {
                        easi easiVarA = a(bVar.date);
                        easiVarA.getClass();
                        eatr eatrVarC = eats.c(easiVarA);
                        eatrVarC.b(Boolean.TRUE.equals(bVar.exceptionalHours));
                        eatsVarA = eatrVarC.a();
                    } catch (IllegalArgumentException | NullPointerException unused) {
                    }
                }
                h(arrayList2, eatsVarA);
            }
        }
        easmVarH.c(arrayList2);
        return easmVarH.e();
    }

    private static void h(Collection collection, Object obj) {
        if (obj != null) {
            collection.add(obj);
        }
    }
}
