package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aady implements aadt, aadq {
    public final cmfo a;
    public boolean b;
    public fdlr c;
    public final fduf d;
    private final fcyh e;
    private final fdjx f;
    private final cczi g;
    private final cczi h;
    private final fduf i;
    private final fduf j;
    private final fduf k;

    public aady(fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        this.e = fcyhVar;
        this.f = fdjxVar;
        dzzf dzzfVar = cdag.b;
        cczi ccziVarI = cdag.i(dzzfVar, "conversation_2_min_pinch_to_zoom_scale", 1.0f);
        this.g = ccziVarI;
        this.h = cdag.i(dzzfVar, "conversation_2_max_pinch_to_zoom_scale", 1.6f);
        fduf fdufVarA = fdvf.a(false);
        this.i = fdufVarA;
        fduf fdufVarA2 = fdvf.a(ccziVarI.e());
        this.d = fdufVarA2;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.CONVERSATION_SCALE);
        cmggVarC.f(cvua.a);
        this.a = cmgkVar.a(cmggVarC.a());
        auvw.k(fdjxVar, fcyhVar, null, new aadv(this, null), 2);
        this.j = fdufVarA;
        this.k = fdufVarA2;
    }

    @Override // defpackage.aadq
    public final /* synthetic */ fdvc a() {
        return this.j;
    }

    @Override // defpackage.aadq
    public final void b(boolean z) {
        if (this.b) {
            this.j.f(Boolean.valueOf(z));
        }
    }

    @Override // defpackage.aadt
    public final /* synthetic */ fdvc c() {
        return this.k;
    }

    @Override // defpackage.aadt
    public final void d(float f) {
        if (this.b) {
            fduf fdufVar = this.d;
            float fFloatValue = ((Number) fdufVar.c()).floatValue() * f;
            Object objE = this.g.e();
            objE.getClass();
            float fFloatValue2 = ((Number) objE).floatValue();
            Object objE2 = this.h.e();
            objE2.getClass();
            float fE = fddu.e(fFloatValue, fFloatValue2, ((Number) objE2).floatValue());
            if (fdbq.d(fE, (Float) fdufVar.c())) {
                return;
            }
            fdufVar.f(Float.valueOf(fE));
            fdlr fdlrVar = this.c;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            this.c = auvw.k(this.f, null, null, new aadx(this, fE, null), 3);
        }
    }
}
