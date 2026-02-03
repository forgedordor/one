package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqbe {
    public static elvg a = elvg.ROBOLECTRIC_BUILD;

    public static boolean a() {
        return a.equals(elvg.ARIGATO_BUILD);
    }

    public static boolean b() {
        return a.equals(elvg.DOMO_BUILD);
    }

    public static boolean c() {
        return a.equals(elvg.ENG_BUILD) || a.equals(elvg.WEAR_ENG_BUILD);
    }

    public static boolean d() {
        return a.equals(elvg.ENG_BUILD) || a.equals(elvg.FISH_FOOD_BUILD) || a.equals(elvg.WEAR_ENG_BUILD) || a.equals(elvg.WEAR_FISH_FOOD_BUILD);
    }

    public static boolean e() {
        return a.equals(elvg.ENG_BUILD) || a.equals(elvg.FISH_FOOD_BUILD) || a.equals(elvg.DOG_FOOD_BUILD) || a.equals(elvg.WEAR_ENG_BUILD) || a.equals(elvg.WEAR_FISH_FOOD_BUILD) || a.equals(elvg.WEAR_DOG_FOOD_BUILD);
    }

    public static boolean f() {
        return a.equals(elvg.PERFORMANCE_BUILD);
    }

    public static boolean g() {
        return a.equals(elvg.RELEASE_BUILD) || a.equals(elvg.GO_BUILD) || a.equals(elvg.WEAR_BUILD) || a.equals(elvg.OPEN_BETA_BUILD) || a.equals(elvg.PLATFORM_BUILD) || a.equals(elvg.DITTO_SATELLITE_BUILD);
    }

    public static boolean h() {
        return a.equals(elvg.ROBOLECTRIC_BUILD);
    }

    public static boolean i() {
        return a.equals(elvg.STABILITY_BUILD) || a.equals(elvg.STABILITY_GO_BUILD) || a.equals(elvg.STABILITY_PLATFORM_BUILD);
    }

    public static boolean j() {
        return a.equals(elvg.ROBOLECTRIC_BUILD) || a.equals(elvg.ARIGATO_BUILD) || a.equals(elvg.DOMO_BUILD) || a.equals(elvg.PERFORMANCE_BUILD) || a.equals(elvg.ARTIK_BUILD) || i();
    }
}
