package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lty {
    public final List a;
    public final List b;
    private final long c;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0 A[LOOP:0: B:11:0x0086->B:35:0x00f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a A[EDGE_INSN: B:51:0x009a->B:19:0x009a BREAK  A[LOOP:0: B:11:0x0086->B:35:0x00f0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lty(java.util.List r18, long r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lty.<init>(java.util.List, long):void");
    }

    public static /* synthetic */ float[] e(lty ltyVar, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4 = 1;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        fArr2.getClass();
        List list = ltyVar.b;
        int i2 = ((fcww) list).c;
        char c5 = 0;
        float fMax = Float.MIN_VALUE;
        int i3 = 0;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        while (i3 < i2) {
            ltb ltbVar = (ltb) list.get(i3);
            if (ltbVar.l()) {
                fArr2[c5] = ltbVar.a();
                fArr2[c4] = ltbVar.b();
                fArr2[2] = ltbVar.a();
                fArr2[3] = ltbVar.b();
                c = c4;
                c2 = c5;
                c3 = 3;
            } else {
                float fMin3 = Math.min(ltbVar.a(), ltbVar.c());
                float fMin4 = Math.min(ltbVar.b(), ltbVar.d());
                c = c4;
                float fMax3 = Math.max(ltbVar.a(), ltbVar.c());
                c2 = c5;
                float fMax4 = Math.max(ltbVar.b(), ltbVar.d());
                c3 = 3;
                fArr2[c2] = Math.min(fMin3, Math.min(ltbVar.e(), ltbVar.g()));
                fArr2[c] = Math.min(fMin4, Math.min(ltbVar.f(), ltbVar.h()));
                fArr2[2] = Math.max(fMax3, Math.max(ltbVar.e(), ltbVar.g()));
                fArr2[3] = Math.max(fMax4, Math.max(ltbVar.f(), ltbVar.h()));
            }
            fMin = Math.min(fMin, fArr2[c2]);
            fMin2 = Math.min(fMin2, fArr2[c]);
            fMax = Math.max(fMax, fArr2[2]);
            fMax2 = Math.max(fMax2, fArr2[c3]);
            i3++;
            c5 = c2;
            c4 = c;
        }
        fArr2[c5] = fMin;
        fArr2[c4] = fMin2;
        fArr2[2] = fMax;
        fArr2[3] = fMax2;
        return fArr2;
    }

    public final float a() {
        return ltt.c(this.c);
    }

    public final float b() {
        return ltt.d(this.c);
    }

    public final lty c() {
        float[] fArrE = e(this, null, 3);
        float f = fArrE[2] - fArrE[0];
        float f2 = fArrE[3] - fArrE[1];
        float fMax = Math.max(f, f2);
        return d(new ltx(((fMax - f) / 2.0f) - fArrE[0], fMax, ((fMax - f2) / 2.0f) - fArrE[1]));
    }

    public final lty d(ltu ltuVar) {
        long j = this.c;
        long jA = ltuVar.a(ltt.c(j), ltt.d(j));
        long jA2 = csy.a(Float.intBitsToFloat((int) (jA >> 32)), Float.intBitsToFloat((int) (jA & 4294967295L)));
        fcww fcwwVar = new fcww((byte[]) null);
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fcwwVar.add(((lti) list.get(i)).a(ltuVar));
        }
        return new lty(fcva.a(fcwwVar), jA2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lty) {
            return fdbq.f(this.a, ((lty) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "[RoundedPolygon. Cubics = " + fcva.aF(this.b, null, null, null, null, 63) + " || Features = " + fcva.aF(this.a, null, null, null, null, 63) + " || Center = (" + a() + ", " + b() + ")]";
    }
}
