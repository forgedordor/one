package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakd extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aake c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakd(fcxy fcxyVar, aake aakeVar) {
        super(3, fcxyVar);
        this.c = aakeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aakd aakdVar = new aakd((fcxy) obj3, this.c);
        aakdVar.d = (fdpm) obj;
        aakdVar.b = obj2;
        return aakdVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r14 = this.d;
            ((Boolean) this.b).booleanValue();
            aakh aakhVar = this.c.a;
            fcsu fcsuVar = aakhVar.c;
            eiju eijuVarT = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.a));
            eijuVarT.getClass();
            auvw.n(eijuVarT);
            fdpl fdplVarA = auyk.a(auvw.f(eijuVarT), "Images");
            eiju eijuVarT2 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.d));
            eijuVarT2.getClass();
            auvw.n(eijuVarT2);
            fdpl fdplVarA2 = auyk.a(auvw.f(eijuVarT2), "Videos");
            eiju eijuVarT3 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.c));
            eijuVarT3.getClass();
            auvw.n(eijuVarT3);
            fdpl fdplVarA3 = auyk.a(auvw.f(eijuVarT3), "Locations");
            eiju eijuVarT4 = ((ajmh) fcsuVar.b()).t(ekgb.r(amvv.b));
            eijuVarT4.getClass();
            auvw.n(eijuVarT4);
            fdpl fdplVarD = avac.d(fdplVarA, fdplVarA2, fdplVarA3, auyk.a(auvw.f(eijuVarT4), "Links"), auyk.a(new fdui(new aakj(aakhVar.d, null)), "TooltipEligible"), auyk.a(aakhVar.e.a(ygp.b), "IsScrolledPastThreshold"), aakhVar.b, new aakf(aakhVar, null));
            this.a = 1;
            if (fdpy.c(r14, fdplVarD, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
