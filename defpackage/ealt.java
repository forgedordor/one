package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealt {
    private static final ekgp a;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(eatg.ACCESSIBILITY_OPTIONS, "accessibilityOptions");
        ekgiVar.i(eatg.ADDRESS, "formattedAddress");
        ekgiVar.i(eatg.ADDRESS_COMPONENTS, "addressComponents");
        ekgiVar.i(eatg.ADR_FORMAT_ADDRESS, "adrFormatAddress");
        ekgiVar.i(eatg.ALLOWS_DOGS, "allowsDogs");
        ekgiVar.i(eatg.BUSINESS_STATUS, "businessStatus");
        ekgiVar.i(eatg.CURBSIDE_PICKUP, "curbsidePickup");
        ekgiVar.i(eatg.CURRENT_OPENING_HOURS, "currentOpeningHours");
        ekgiVar.i(eatg.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours");
        ekgiVar.i(eatg.DELIVERY, "delivery");
        ekgiVar.i(eatg.DINE_IN, "dineIn");
        ekgiVar.i(eatg.DISPLAY_NAME, "displayName");
        ekgiVar.i(eatg.EDITORIAL_SUMMARY, "editorialSummary");
        ekgiVar.i(eatg.EV_CHARGE_OPTIONS, "evChargeOptions");
        ekgiVar.i(eatg.FORMATTED_ADDRESS, "formattedAddress");
        ekgiVar.i(eatg.FUEL_OPTIONS, "fuelOptions");
        ekgiVar.i(eatg.GOOD_FOR_CHILDREN, "goodForChildren");
        ekgiVar.i(eatg.GOOD_FOR_GROUPS, "goodForGroups");
        ekgiVar.i(eatg.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports");
        ekgiVar.i(eatg.GOOGLE_MAPS_URI, "googleMapsUri");
        ekgiVar.i(eatg.ICON_BACKGROUND_COLOR, "iconBackgroundColor");
        ekgiVar.i(eatg.ICON_MASK_URL, "iconMaskBaseUri");
        ekgiVar.i(eatg.ICON_URL, "iconMaskBaseUri");
        ekgiVar.i(eatg.ID, "id");
        ekgiVar.i(eatg.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber");
        ekgiVar.i(eatg.LAT_LNG, "location");
        ekgiVar.i(eatg.LIVE_MUSIC, "liveMusic");
        ekgiVar.i(eatg.LOCATION, "location");
        ekgiVar.i(eatg.MENU_FOR_CHILDREN, "menuForChildren");
        ekgiVar.i(eatg.NAME, "displayName");
        ekgiVar.i(eatg.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber");
        ekgiVar.i(eatg.OPENING_HOURS, "regularOpeningHours");
        ekgiVar.i(eatg.OUTDOOR_SEATING, "outdoorSeating");
        ekgiVar.i(eatg.PARKING_OPTIONS, "parkingOptions");
        ekgiVar.i(eatg.PAYMENT_OPTIONS, "paymentOptions");
        ekgiVar.i(eatg.PHONE_NUMBER, "internationalPhoneNumber");
        ekgiVar.i(eatg.PHOTO_METADATAS, "photos");
        ekgiVar.i(eatg.PLUS_CODE, "plusCode");
        ekgiVar.i(eatg.PRICE_LEVEL, "priceLevel");
        ekgiVar.i(eatg.PRICE_RANGE, "priceRange");
        ekgiVar.i(eatg.PRIMARY_TYPE, "primaryType");
        ekgiVar.i(eatg.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName");
        ekgiVar.i(eatg.PURE_SERVICE_AREA_BUSINESS, "pureServiceAreaBusiness");
        ekgiVar.i(eatg.RATING, "rating");
        ekgiVar.i(eatg.RESERVABLE, "reservable");
        ekgiVar.i(eatg.RESOURCE_NAME, "name");
        ekgiVar.i(eatg.RESTROOM, "restroom");
        ekgiVar.i(eatg.REVIEWS, "reviews");
        ekgiVar.i(eatg.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours");
        ekgiVar.i(eatg.SERVES_BEER, "servesBeer");
        ekgiVar.i(eatg.SERVES_BREAKFAST, "servesBreakfast");
        ekgiVar.i(eatg.SERVES_BRUNCH, "servesBrunch");
        ekgiVar.i(eatg.SERVES_COCKTAILS, "servesCocktails");
        ekgiVar.i(eatg.SERVES_COFFEE, "servesCoffee");
        ekgiVar.i(eatg.SERVES_DESSERT, "servesDessert");
        ekgiVar.i(eatg.SERVES_DINNER, "servesDinner");
        ekgiVar.i(eatg.SERVES_LUNCH, "servesLunch");
        ekgiVar.i(eatg.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood");
        ekgiVar.i(eatg.SERVES_WINE, "servesWine");
        ekgiVar.i(eatg.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress");
        ekgiVar.i(eatg.SUB_DESTINATIONS, "subDestinations");
        ekgiVar.i(eatg.TAKEOUT, "takeout");
        ekgiVar.i(eatg.TYPES, "types");
        ekgiVar.i(eatg.USER_RATINGS_TOTAL, "userRatingCount");
        ekgiVar.i(eatg.USER_RATING_COUNT, "userRatingCount");
        ekgiVar.i(eatg.UTC_OFFSET, "utcOffsetMinutes");
        ekgiVar.i(eatg.VIEWPORT, "viewport");
        ekgiVar.i(eatg.WEBSITE_URI, "websiteUri");
        ekgiVar.i(eatg.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "accessibilityOptions");
        a = ekgiVar.c();
    }

    public static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((eatg) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
