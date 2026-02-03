package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jdb implements iyz {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    final /* synthetic */ jde d;

    public jdb(jde jdeVar) {
        this.d = jdeVar;
    }

    @Override // defpackage.iyz
    public final ivy a() {
        this.a = true;
        jde jdeVar = this.d;
        ivy ivyVarJ = jdeVar.J();
        if (kjb.f(this.b, 9223372034707292159L)) {
            this.b = kjc.c(ivz.c(ivyVarJ));
            this.c = ivyVarJ.g();
        }
        jdeVar.L().w.f();
        return ivyVarJ;
    }

    @Override // defpackage.iyz
    public final void b(iyw iywVar, float f) {
        jde jdeVar = this.d;
        jfx jfxVar = jdeVar.n;
        if (jfxVar == null) {
            jfxVar = new jfx();
            jdeVar.n = jfxVar;
        }
        int iE = fcur.E(jfxVar.b, iywVar);
        if (iE >= 0) {
            float[] fArr = jfxVar.c;
            if (fArr[iE] == f) {
                jfxVar.d[iE] = 0;
                return;
            } else {
                fArr[iE] = f;
                jfxVar.d[iE] = 1;
                return;
            }
        }
        int i = jfxVar.a;
        iyw[] iywVarArr = jfxVar.b;
        if (i == iywVarArr.length) {
            int i2 = i + i;
            Object[] objArrCopyOf = Arrays.copyOf(iywVarArr, i2);
            objArrCopyOf.getClass();
            jfxVar.b = (iyw[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(jfxVar.c, i2);
            fArrCopyOf.getClass();
            jfxVar.c = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(jfxVar.d, i2);
            bArrCopyOf.getClass();
            jfxVar.d = bArrCopyOf;
        }
        jfxVar.b[i] = iywVar;
        jfxVar.d[i] = 3;
        jfxVar.c[i] = f;
        jfxVar.a++;
    }

    @Override // defpackage.kio
    public final float ed() {
        return this.d.ed();
    }

    @Override // defpackage.kiy
    public final float ee() {
        return this.d.ee();
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
}
