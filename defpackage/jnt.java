package defpackage;

import android.graphics.Outline;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnt {
    public boolean a;
    private boolean b = true;
    private final Outline c;
    private ijz d;
    private ikd e;
    private ikd f;
    private boolean g;
    private ikd h;
    private ihw i;
    private float j;
    private long k;
    private long l;
    private boolean m;

    public jnt() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.c = outline;
        this.k = 0L;
        this.l = 0L;
    }

    private final void g() {
        if (this.a) {
            this.k = 0L;
            this.j = 0.0f;
            this.f = null;
            this.a = false;
            this.g = false;
            ijz ijzVar = this.d;
            if (ijzVar == null || !this.m || Float.intBitsToFloat((int) (this.l >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.l & 4294967295L)) <= 0.0f) {
                this.c.setEmpty();
                return;
            }
            this.b = true;
            if (ijzVar instanceof ijx) {
                ihu ihuVar = ((ijx) ijzVar).a;
                float f = ihuVar.b;
                long jFloatToRawIntBits = Float.floatToRawIntBits(f);
                float f2 = ihuVar.c;
                this.k = (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
                float f3 = ihuVar.d;
                float f4 = ihuVar.e;
                this.l = (4294967295L & Float.floatToRawIntBits(f4 - f2)) | (Float.floatToRawIntBits(f3 - f) << 32);
                this.c.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f4));
                return;
            }
            if (!(ijzVar instanceof ijy)) {
                if (!(ijzVar instanceof ijw)) {
                    throw new fctg();
                }
                h(((ijw) ijzVar).a);
                return;
            }
            ihw ihwVar = ((ijy) ijzVar).a;
            long j = ihwVar.e >> 32;
            float f5 = ihwVar.a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) j);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
            float f6 = ihwVar.b;
            this.k = (jFloatToRawIntBits2 << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
            float fB = ihwVar.b();
            this.l = (Float.floatToRawIntBits(ihwVar.a()) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
            if (ihx.c(ihwVar)) {
                this.c.setRoundRect(Math.round(f5), Math.round(f6), Math.round(ihwVar.c), Math.round(ihwVar.d), fIntBitsToFloat);
                this.j = fIntBitsToFloat;
                return;
            }
            ikd iikVar = this.e;
            if (iikVar == null) {
                iikVar = new iik((byte[]) null);
                this.e = iikVar;
            }
            iikVar.k();
            iikVar.t(ihwVar);
            h(iikVar);
        }
    }

    private final void h(ikd ikdVar) {
        if (Build.VERSION.SDK_INT > 28 || ikdVar.p()) {
            if (Build.VERSION.SDK_INT >= 30) {
                jnu.a.a(this.c, ikdVar);
            } else {
                this.c.setConvexPath(((iik) ikdVar).a);
            }
            this.g = !this.c.canClip();
        } else {
            this.b = false;
            this.c.setEmpty();
            this.g = true;
        }
        this.f = ikdVar;
    }

    public final Outline a() {
        g();
        if (this.m && this.b) {
            return this.c;
        }
        return null;
    }

    public final ikd b() {
        g();
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ijb r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnt.c(ijb):void");
    }

    public final boolean d() {
        return !this.g;
    }

    public final boolean e(long j) {
        ijz ijzVar;
        if (this.m && (ijzVar = this.d) != null) {
            return joi.a(ijzVar, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        return true;
    }

    public final boolean f(ijz ijzVar, float f, boolean z, float f2, long j) {
        this.c.setAlpha(f);
        boolean zF = fdbq.f(this.d, ijzVar);
        boolean z2 = !zF;
        if (!zF) {
            this.d = ijzVar;
            this.a = true;
        }
        this.l = j;
        boolean z3 = false;
        if (ijzVar != null && (z || f2 > 0.0f)) {
            z3 = true;
        }
        if (this.m != z3) {
            this.m = z3;
            this.a = true;
        }
        return z2;
    }
}
