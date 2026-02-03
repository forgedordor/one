package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tet {
    public static final ejxr a;
    public static final ejxr b;
    public static final ejxr c;
    public static final ejxr d;
    public static final ejxr e;
    public static final ejxr f;
    public static final ejxr g;
    public static final cczi h;
    public static final cczi i;
    public static final cczi j;
    public static final ejxr k;
    public static final ejxr l;
    public static final cczi m;
    public static final ejxr n;

    static {
        ejxr ejxrVarV = cdag.v("enable_birthday_nudge");
        ejxrVarV.getClass();
        a = ejxrVarV;
        ejxr ejxrVarV2 = cdag.v("enable_birthday_suggestions");
        ejxrVarV2.getClass();
        b = ejxrVarV2;
        ejxr ejxrVarV3 = cdag.v("enable_birthday_nudge_setting");
        ejxrVarV3.getClass();
        c = ejxrVarV3;
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: teq
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar = tet.a;
                return cdag.f(cdag.b, "birthday_nudge_recent_message_threshold_seconds", 31536000L);
            }
        });
        ejxrVarA.getClass();
        d = ejxrVarA;
        ejxr ejxrVarA2 = ejxx.a(new ejxr() { // from class: ter
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar = tet.a;
                return cdag.e(cdag.b, "birthday_nudge_days_to_sync", 2);
            }
        });
        ejxrVarA2.getClass();
        e = ejxrVarA2;
        ejxr ejxrVarA3 = ejxx.a(new ejxr() { // from class: tes
            @Override // defpackage.ejxr
            public final Object get() {
                ejxr ejxrVar = tet.a;
                return cdag.e(cdag.b, "cake_animation_repeat_count", -1);
            }
        });
        ejxrVarA3.getClass();
        f = ejxrVarA3;
        ejxr ejxrVarV4 = cdag.v("enable_same_birthday_nudge_string");
        ejxrVarV4.getClass();
        g = ejxrVarV4;
        cdag.v("enable_birthday_banner_settings_button").getClass();
        h = cdag.l(cdag.b, "birthday_suggestion_spec", "");
        i = cdag.j(cdag.b, "birthday_max_suggestions", -1);
        j = cdag.j(cdag.b, "birthday_max_sticker_suggestions", -1);
        ejxr ejxrVarV5 = cdag.v("enable_save_birthday_banner");
        ejxrVarV5.getClass();
        k = ejxrVarV5;
        ejxr ejxrVarV6 = cdag.v("enable_birthday_contact_name_fix");
        ejxrVarV6.getClass();
        l = ejxrVarV6;
        m = cdag.j(cdag.b, "save_birthday_banner_max_impressions", 3);
        cdag.j(cdag.b, "birthday_banner_max_impressions", 3);
        ejxr ejxrVarX = cdag.x("enable_birthday_coverage_logging");
        ejxrVarX.getClass();
        n = ejxrVarX;
    }

    public static final boolean a() {
        Object objE = ((cczi) a.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }
}
