package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvld implements bvkx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/directrcs/CryptoKeyDataServiceImpl");
    public final fcsu b;
    public final fcsu c;
    private final fdjx d;
    private final fctc e;

    public bvld(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.d = fdjxVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.e = fctd.a(new fdae() { // from class: bvky
            @Override // defpackage.fdae
            public final Object invoke() {
                ecem.b();
                cmgk cmgkVar = (cmgk) this.a.b.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.DITTO_RCS_CRYPTO_KEY_SETTINGS);
                cmggVarC.f(bvkv.a);
                return cmgkVar.a(cmggVarC.a());
            }
        });
    }

    @Override // defpackage.bvkx
    public final eiju a() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bvla(this, null));
    }

    @Override // defpackage.bvkx
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new bvlc(this, null));
    }

    public final cmfo c() {
        return (cmfo) this.e.a();
    }
}
