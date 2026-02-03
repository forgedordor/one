package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csie implements cscu, cscy {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/hades/MoiraiOnDeviceSpamProtection");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcyh f;

    public csie(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcyh fcyhVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcyhVar.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcyhVar;
    }

    private final Object j(csch cschVar, sck sckVar, fcxy fcxyVar) {
        return fdin.a(eicg.a(this.f), new csid(null, this, cschVar, sckVar), fcxyVar);
    }

    @Override // defpackage.cscu
    public final csdl a() {
        return csdl.h;
    }

    @Override // defpackage.cscu
    public final eieu b() {
        return eiiy.a("MoiraiOnDeviceSpamProtection.classify");
    }

    @Override // defpackage.cscu
    public final /* synthetic */ eieu c() {
        return csct.a();
    }

    @Override // defpackage.cscu
    public final Object d(csch cschVar, fcxy fcxyVar) {
        return j(cschVar, null, fcxyVar);
    }

    @Override // defpackage.cscu
    public final /* synthetic */ Object e(csch cschVar, int i, fcxy fcxyVar) {
        return csct.b();
    }

    @Override // defpackage.cscu
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.cscy
    public final eieu g() {
        return eiiy.a("MoiraiOnDeviceSpamProtection.reinforceClassification");
    }

    @Override // defpackage.cscy
    public final Object h(csch cschVar, csdb csdbVar, fcxy fcxyVar) {
        sck sckVar = csdbVar.a;
        return sckVar == null ? csdc.a() : j(cschVar, sckVar, fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.csch r6, defpackage.fcxy r7) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csie.i(csch, fcxy):java.lang.Object");
    }
}
