package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eanh {
    private static final ekgp a;

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i(eatg.ADDRESS, "formatted_address");
        ekgiVar.i(eatg.ADDRESS_COMPONENTS, "address_components");
        ekgiVar.i(eatg.BUSINESS_STATUS, "business_status");
        ekgiVar.i(eatg.CURBSIDE_PICKUP, "curbside_pickup");
        ekgiVar.i(eatg.CURRENT_OPENING_HOURS, "current_opening_hours");
        ekgiVar.i(eatg.DELIVERY, "delivery");
        ekgiVar.i(eatg.DINE_IN, "dine_in");
        ekgiVar.i(eatg.DISPLAY_NAME, "name");
        ekgiVar.i(eatg.EDITORIAL_SUMMARY, "editorial_summary");
        ekgiVar.i(eatg.FORMATTED_ADDRESS, "formatted_address");
        ekgiVar.i(eatg.ICON_BACKGROUND_COLOR, "icon_background_color");
        ekgiVar.i(eatg.ICON_MASK_URL, "icon_mask_base_uri");
        ekgiVar.i(eatg.ICON_URL, "icon_mask_base_uri");
        ekgiVar.i(eatg.ID, "place_id");
        ekgiVar.i(eatg.INTERNATIONAL_PHONE_NUMBER, "international_phone_number");
        ekgiVar.i(eatg.LAT_LNG, "geometry/location");
        ekgiVar.i(eatg.LOCATION, "geometry/location");
        ekgiVar.i(eatg.NAME, "name");
        ekgiVar.i(eatg.OPENING_HOURS, "opening_hours");
        ekgiVar.i(eatg.PHONE_NUMBER, "international_phone_number");
        ekgiVar.i(eatg.PHOTO_METADATAS, "photos");
        ekgiVar.i(eatg.PLUS_CODE, "plus_code");
        ekgiVar.i(eatg.PRICE_LEVEL, "price_level");
        ekgiVar.i(eatg.RATING, "rating");
        ekgiVar.i(eatg.RESERVABLE, "reservable");
        ekgiVar.i(eatg.SECONDARY_OPENING_HOURS, "secondary_opening_hours");
        ekgiVar.i(eatg.SERVES_BEER, "serves_beer");
        ekgiVar.i(eatg.SERVES_BREAKFAST, "serves_breakfast");
        ekgiVar.i(eatg.SERVES_BRUNCH, "serves_brunch");
        ekgiVar.i(eatg.SERVES_DINNER, "serves_dinner");
        ekgiVar.i(eatg.SERVES_LUNCH, "serves_lunch");
        ekgiVar.i(eatg.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food");
        ekgiVar.i(eatg.SERVES_WINE, "serves_wine");
        ekgiVar.i(eatg.TAKEOUT, "takeout");
        ekgiVar.i(eatg.TYPES, "types");
        ekgiVar.i(eatg.USER_RATINGS_TOTAL, "user_ratings_total");
        ekgiVar.i(eatg.USER_RATING_COUNT, "user_ratings_total");
        ekgiVar.i(eatg.UTC_OFFSET, "utc_offset");
        ekgiVar.i(eatg.VIEWPORT, "geometry/viewport");
        ekgiVar.i(eatg.WEBSITE_URI, "website");
        ekgiVar.i(eatg.WHEELCHAIR_ACCESSIBLE_ENTRANCE, "wheelchair_accessible_entrance");
        a = ekgiVar.c();
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) a.get((eatg) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
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
