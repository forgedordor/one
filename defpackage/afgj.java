package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/linkify/TextLinkToLinkifyEntityTypeConverter");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final cdrw a(eulq eulqVar) {
        if (eulqVar.a() <= 0) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/linkify/TextLinkToLinkifyEntityTypeConverter", "getLinkifyEntityType", 17, "TextLinkToLinkifyEntityTypeConverter.kt")).q("TextLink has no entity type!");
            return cdrw.UNKNOWN;
        }
        String strB = eulqVar.b(0);
        switch (strB.hashCode()) {
            case -1271823248:
                if (strB.equals("flight")) {
                    return cdrw.FLIGHT_NUMBER;
                }
                break;
            case -1147692044:
                if (strB.equals("address")) {
                    return cdrw.STREET_ADDRESS;
                }
                break;
            case -133689903:
                if (strB.equals("tracking_number")) {
                    return cdrw.TRACKING_NUMBER;
                }
                break;
            case 116079:
                if (strB.equals("url")) {
                    return cdrw.WEB_URL;
                }
                break;
            case 3076014:
                if (strB.equals("date")) {
                    return cdrw.DATE;
                }
                break;
            case 3594628:
                if (strB.equals("unit")) {
                    return cdrw.UNIT;
                }
                break;
            case 96619420:
                if (strB.equals("email")) {
                    return cdrw.EMAIL_ADDRESS;
                }
                break;
            case 106642798:
                if (strB.equals("phone")) {
                    return cdrw.PHONE_NUMBER;
                }
                break;
            case 1793702779:
                if (strB.equals("datetime")) {
                    return cdrw.DATE_TIME;
                }
                break;
        }
        return cdrw.UNKNOWN;
    }
}
