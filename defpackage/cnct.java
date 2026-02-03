package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnct {
    private static final eksp a = eksp.c("BugleTachygram");

    public static Iterable a(eqdo eqdoVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        eqdf eqdfVar = (eqdf) eqdoVar;
        int iOrdinal = eqdfVar.b.ordinal();
        if (iOrdinal == 0) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 30, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown renaming policy.");
        } else if (iOrdinal == 2) {
            ekfwVar.h(aucp.SUBJECT_UPDATE);
        }
        int iOrdinal2 = eqdfVar.a.ordinal();
        if (iOrdinal2 == 0) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 45, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown removal policy.");
        } else if (iOrdinal2 == 2) {
            ekfwVar.h(aucp.REMOVE_PARTICIPANT_BY_ALL);
        } else if (iOrdinal2 == 3) {
            ekfwVar.h(aucp.REMOVE_PARTICIPANT_BY_ADMIN);
        }
        if (eotp.a("bugle.propagate_icon_modification_policy", "bugle")) {
            int iOrdinal3 = eqdfVar.c.ordinal();
            if (iOrdinal3 == 0) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 59, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown icon modification policy.");
            } else if (iOrdinal3 == 2) {
                ekfwVar.h(aucp.ICON_UPDATE);
            }
        }
        if (eotp.a("bugle.enable_populate_join_by_link_properties", "bugle")) {
            int iOrdinal4 = eqdfVar.d.ordinal();
            if (iOrdinal4 == 0) {
                ((eksl) ((eksl) a.e()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupFeaturesConverter", "convert", 75, "TachygramGroupFeaturesConverter.java")).q("getGroupInfo() tachygram group has unknown join by link policy.");
            } else if (iOrdinal4 == 2) {
                ekfwVar.h(aucp.INVITE_LINK_UPDATE);
            }
        }
        return ekfwVar.g();
    }
}
