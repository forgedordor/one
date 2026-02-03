package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwbv {
    public static final cczv a;
    public static final cczv b;
    public static final cczv c;
    public static final cczv d;
    public static final cczv e;
    public static final cczv f;
    public static final cczv g;
    public static final ejxr h;
    public static final cczv i;
    public static final cczv j;
    public static final cczv k;
    public static int l;
    private static final cdaf m;
    private static final cczv n;

    static {
        dzzf dzzfVar = cdag.a;
        cdaf cdafVar = new cdaf(cdag.a, "Etouffee__");
        m = cdafVar;
        a = cdafVar.d("enable_group_etouffee", false);
        b = cdafVar.a("group_etouffee_size_limit", 100);
        c = cdafVar.d("enable_message_resending_full", true);
        d = cdafVar.d("enable_message_resending_full_receiver", true);
        e = cdafVar.d("enable_message_resending_otk", true);
        f = cdafVar.d("enable_message_resending_otk_receiver", true);
        g = cdafVar.d("enable_message_otkh_sender", true);
        h = ejxx.a(new ejxr() { // from class: bwbu
            @Override // defpackage.ejxr
            public final Object get() {
                cczv cczvVar = bwbv.a;
                return cdag.h(cdag.b, "enable_e2ee_info_data_source_in_details_page", false);
            }
        });
        i = cdafVar.a("max_otk_time_span_days", 3);
        j = cdafVar.a("max_pending_message_life_span_days", 5);
        k = cdafVar.a("max_pending_decrypted_message_life_span_days", 3);
        cdag.v("enable_group_downgrade_e2ee_on_plaintext");
        l = 1;
        n = cdafVar.a("max_ftd_retry_count_group", 3);
    }

    public static int a(int i2, boolean z) {
        if (!g() || l == 1 || z || !cqbe.e() || i2 <= 1) {
            return 1;
        }
        return Math.max(Math.min(l, 250 / i2), 1);
    }

    public static int b() {
        return ((Integer) n.e()).intValue();
    }

    public static boolean c() {
        return g() && ((Boolean) g.e()).booleanValue();
    }

    public static boolean d() {
        return g() && ((Boolean) c.e()).booleanValue();
    }

    public static boolean e() {
        return g() && ((Boolean) e.e()).booleanValue();
    }

    public static boolean f() {
        return g() && ((Boolean) f.e()).booleanValue();
    }

    public static boolean g() {
        return ((Boolean) a.e()).booleanValue() && bwbt.a();
    }

    public static boolean h() {
        return ((Boolean) a.e()).booleanValue() && bwbt.a();
    }
}
