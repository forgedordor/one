package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iyk implements kio {
    private boolean a;

    public static /* synthetic */ void A(iyk iykVar, iyl iylVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (iykVar.p() == kji.a || iykVar.a() == 0) {
            iykVar.r(iylVar);
            iylVar.ef(kjb.d(j, iylVar.e), 0.0f, null);
            return;
        }
        int iA = iykVar.a() - iylVar.a;
        int iA2 = kjb.a(j);
        iykVar.r(iylVar);
        iylVar.ef(kjb.d((kjb.b(j) & 4294967295L) | ((iA - iA2) << 32), iylVar.e), 0.0f, null);
    }

    public static /* synthetic */ void B(iyk iykVar, iyl iylVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        fdap fdapVar = iyn.a;
        if (iykVar.p() == kji.a || iykVar.a() == 0) {
            iykVar.r(iylVar);
            iylVar.ef(kjb.d(j, iylVar.e), 0.0f, fdapVar);
            return;
        }
        int iA = iykVar.a() - iylVar.a;
        int iA2 = kjb.a(j);
        iykVar.r(iylVar);
        iylVar.ef(kjb.d((kjb.b(j) & 4294967295L) | ((iA - iA2) << 32), iylVar.e), 0.0f, fdapVar);
    }

    public static /* synthetic */ void C(iyk iykVar, iyl iylVar, long j) {
        fdap fdapVar = iyn.a;
        if (iykVar.p() == kji.a || iykVar.a() == 0) {
            iykVar.r(iylVar);
            iylVar.ef(kjb.d(j, iylVar.e), 0.0f, fdapVar);
            return;
        }
        int iA = iykVar.a() - iylVar.a;
        int iA2 = kjb.a(j);
        int iB = kjb.b(j);
        iykVar.r(iylVar);
        iylVar.ef(kjb.d((iB & 4294967295L) | ((iA - iA2) << 32), iylVar.e), 0.0f, fdapVar);
    }

    public static /* synthetic */ void D(iyk iykVar, iyl iylVar, int i, int i2, fdap fdapVar, int i3) {
        if ((i3 & 8) != 0) {
            fdapVar = iyn.a;
        }
        iykVar.u(iylVar, i, i2, 0.0f, fdapVar);
    }

    public static /* synthetic */ void G(iyk iykVar, iyl iylVar) {
        if (iykVar.p() == kji.a || iykVar.a() == 0) {
            iykVar.r(iylVar);
            iylVar.ef(kjb.d(0L, iylVar.e), 0.0f, null);
            return;
        }
        int iA = iykVar.a() - iylVar.a;
        int iA2 = kjb.a(0L);
        int iB = kjb.b(0L);
        iykVar.r(iylVar);
        iylVar.ef(kjb.d(((iA - iA2) << 32) | (iB & 4294967295L), iylVar.e), 0.0f, null);
    }

    public abstract int a();

    public ivy b() {
        throw null;
    }

    @Override // defpackage.kio
    public float ed() {
        throw null;
    }

    @Override // defpackage.kiy
    public float ee() {
        throw null;
    }

    @Override // defpackage.kiy
    public final /* synthetic */ float eg(long j) {
        return kix.a(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float eh(float f) {
        return kin.a(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float el(int i) {
        return kin.b(this, i);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float em(long j) {
        return kin.c(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ float en(float f) {
        return kin.d(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int eo(long j) {
        return kin.e(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ int ep(float f) {
        return kin.f(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long eq(long j) {
        return kin.g(this, j);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long er(long j) {
        return kin.h(this, j);
    }

    @Override // defpackage.kiy
    public final /* synthetic */ long es(float f) {
        return kix.b(this, f);
    }

    @Override // defpackage.kio
    public final /* synthetic */ long et(float f) {
        return kin.i(this, f);
    }

    public abstract kji p();

    public float q(iyw iywVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(iyl iylVar) {
        if (iylVar instanceof jdz) {
            ((jdz) iylVar).U(this.a);
        }
    }

    public final void s(iyl iylVar, int i, int i2, float f) {
        r(iylVar);
        iylVar.ef(kjb.d((i2 & 4294967295L) | (i << 32), iylVar.e), f, null);
    }

    public final void t(iyl iylVar, long j, float f) {
        r(iylVar);
        iylVar.ef(kjb.d(j, iylVar.e), f, null);
    }

    public final void u(iyl iylVar, int i, int i2, float f, fdap fdapVar) {
        r(iylVar);
        iylVar.ef(kjb.d((i2 & 4294967295L) | (i << 32), iylVar.e), f, fdapVar);
    }

    public final void v(iyl iylVar, long j, float f, fdap fdapVar) {
        r(iylVar);
        iylVar.ef(kjb.d(j, iylVar.e), f, fdapVar);
    }

    public final void w(iyl iylVar, long j, ini iniVar, float f) {
        r(iylVar);
        iylVar.x(kjb.d(j, iylVar.e), f, iniVar);
    }

    public final void x(fdap fdapVar) {
        this.a = true;
        fdapVar.invoke(this);
        this.a = false;
    }
}
