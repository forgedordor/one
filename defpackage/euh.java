package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euh extends icr {
    private eug a;

    public euh(eug eugVar) {
        this.a = eugVar;
    }

    private final void e() {
        eug eugVar = this.a;
        if (eugVar instanceof eug) {
            eugVar.getClass();
            eugVar.a.m(this);
        }
    }

    public final void a(eug eugVar) {
        e();
        if (eugVar instanceof eug) {
            eugVar.a.n(this);
        }
        this.a = eugVar;
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dU() {
        a(this.a);
    }

    @Override // defpackage.icr
    public final void s() {
        e();
    }
}
