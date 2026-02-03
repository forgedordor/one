package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accf implements ccyz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/gaia/listener/DittoBugleGaiaPairingFlagChangeListener");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fdjx h;

    public accf(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fdjx fdjxVar, fcsu fcsuVar6) {
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fdjxVar.getClass();
        fcsuVar6.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.d = fcsuVar5;
        this.h = fdjxVar;
        this.e = fcsuVar6;
    }

    @Override // defpackage.ccyz
    public final void a() {
        if (((aqpb) this.f.b()).a()) {
            auvw.c(this.h, fcyi.a, fdjz.a, new acce(this, null));
            if (!((Boolean) this.b.b()).booleanValue() || ((abjz) this.g.b()).a()) {
                return;
            }
            ((bvll) this.d.b()).o();
        }
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return false;
    }
}
