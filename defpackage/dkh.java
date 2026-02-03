package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkh implements dop {
    public long a = 9205357640488583168L;
    public final hox b;
    public long c;
    private final kio d;
    private final dmc e;
    private boolean f;
    private long g;
    private final ith h;
    private final jbf i;

    public dkh(Context context, kio kioVar, long j, egc egcVar) {
        this.d = kioVar;
        dmc dmcVar = new dmc(context, ijg.b(j));
        this.e = dmcVar;
        this.b = new hpl(fctx.a, hpb.a);
        this.g = 0L;
        this.c = -1L;
        dkg dkgVar = new dkg(this);
        irs irsVar = itf.a;
        ito itoVar = new ito(null, null, null, dkgVar);
        this.h = itoVar;
        this.i = Build.VERSION.SDK_INT >= 31 ? new dpt(itoVar, this, dmcVar) : new dmq(itoVar, this, dmcVar, egcVar);
    }

    private final float h(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectA = this.e.a();
        return dma.a(edgeEffectA) == 0.0f ? (-dma.c(edgeEffectA, -fIntBitsToFloat2, f)) * Float.intBitsToFloat((int) (4294967295L & this.g)) : Float.intBitsToFloat(i);
    }

    private final float i(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        float f = 1.0f - fIntBitsToFloat;
        EdgeEffect edgeEffectC = this.e.c();
        return dma.a(edgeEffectC) == 0.0f ? dma.c(edgeEffectC, fIntBitsToFloat2, f) * Float.intBitsToFloat((int) (this.g >> 32)) : Float.intBitsToFloat(i);
    }

    private final float j(long j) {
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() & 4294967295L));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectE = this.e.e();
        return dma.a(edgeEffectE) == 0.0f ? (-dma.c(edgeEffectE, -fIntBitsToFloat2, fIntBitsToFloat)) * Float.intBitsToFloat((int) (this.g >> 32)) : Float.intBitsToFloat(i);
    }

    private final float k(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (b() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectG = this.e.g();
        return dma.a(edgeEffectG) == 0.0f ? dma.c(edgeEffectG, fIntBitsToFloat2, fIntBitsToFloat) * Float.intBitsToFloat((int) (4294967295L & this.g)) : Float.intBitsToFloat(i);
    }

    private final void l() {
        boolean z;
        dmc dmcVar = this.e;
        EdgeEffect edgeEffect = dmcVar.b;
        boolean z2 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = dmcVar.c;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = dmcVar.d;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = dmcVar.e;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (!edgeEffect4.isFinished() || z) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[PHI: r20
      0x00ab: PHI (r20v1 float) = (r20v0 float), (r20v2 float) binds: [B:47:0x00d6, B:36:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119 A[PHI: r5
      0x0119: PHI (r5v6 float) = (r5v4 float), (r5v8 float) binds: [B:71:0x0143, B:60:0x0112] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.dop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r23, int r25, defpackage.fdap r26) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkh.a(long, int, fdap):long");
    }

    public final long b() {
        long jB = this.a;
        if ((9223372034707292159L & jB) == 9205357640488583168L) {
            jB = iia.b(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jB >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jB & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.dop
    public final jbf c() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r13.a(r14, r0) == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0118, code lost:
    
        if (r14 != r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dop
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r11, defpackage.fdat r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkh.d(long, fdat, fcxy):java.lang.Object");
    }

    public final void e() {
        this.b.b(fctx.a);
    }

    public final void f(long j) {
        long j2 = this.g;
        boolean zF = ihz.f(j2, 0L);
        boolean zF2 = ihz.f(j, j2);
        this.g = j;
        if (!zF2) {
            dmc dmcVar = this.e;
            long jB = (fdcu.b(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (fdcu.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            dmcVar.a = jB;
            EdgeEffect edgeEffect = dmcVar.b;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect2 = dmcVar.c;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect3 = dmcVar.d;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect4 = dmcVar.e;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect5 = dmcVar.f;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect6 = dmcVar.g;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jB >> 32), (int) (jB & 4294967295L));
            }
            EdgeEffect edgeEffect7 = dmcVar.h;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
            EdgeEffect edgeEffect8 = dmcVar.i;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (jB & 4294967295L), (int) (jB >> 32));
            }
        }
        if (zF || zF2) {
            return;
        }
        l();
    }

    @Override // defpackage.dop
    public final boolean g() {
        dmc dmcVar = this.e;
        EdgeEffect edgeEffect = dmcVar.b;
        if (edgeEffect != null && dma.a(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = dmcVar.c;
        if (edgeEffect2 != null && dma.a(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = dmcVar.d;
        if (edgeEffect3 != null && dma.a(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = dmcVar.e;
        return (edgeEffect4 == null || dma.a(edgeEffect4) == 0.0f) ? false : true;
    }
}
