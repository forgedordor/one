package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csfa {
    public static final cczi a = cdag.m(cdag.b, "enable_spam_fm", false);
    public static final cczi b = cdag.m(cdag.b, "enable_fm_tachyon_sync", false);
    public static final cczi c = cdag.i(cdag.b, "spam_fm_mct", 0.5f);
    public static final cczi d;
    public static final cczi e;
    public static final cczi f;
    public static final cczv g;

    static {
        cdag.i(cdag.b, "spam_fm_hct", 0.9f);
        d = cdag.l(cdag.b, "spam_fm_fid", "");
        e = cdag.l(cdag.b, "spam_fm_gid", "");
        cdag.k(cdag.b, "spam_fm_cadence", 4L);
        f = cdag.k(cdag.b, "spam_fm_cadence_m", 30L);
        cdag.x("spam_fm_update_threshold");
        dzzf dzzfVar = cdag.b;
        ewtl ewtlVar = (ewtl) ewtm.a.createBuilder();
        ewtlVar.a((int) eoob.e(1).toSeconds());
        ewtlVar.a((int) eoob.e(30).toSeconds());
        ewtlVar.a((int) eoob.b(4).toSeconds());
        ewtlVar.a((int) eoob.b(3).toSeconds());
        g = cdag.t(dzzfVar, "spam_fm_delay_array_seconds", ewtlVar.build(), new dzze() { // from class: csez
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (ewtm) evsn.parseFrom(ewtm.a, bArr);
            }
        });
    }
}
