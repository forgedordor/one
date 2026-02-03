package defpackage;

import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkg {
    public static final dkkg a = new dkkg();

    private dkkg() {
    }

    public static final float b(boolean z) {
        return z ? 504.0f : 356.0f;
    }

    public static final float c(float f, boolean z, boolean z2, hml hmlVar, int i) {
        float fEl;
        hmlVar.v(-508501803);
        int width = ((View) hmlVar.e(AndroidCompositionLocals_androidKt.f)).getWidth();
        if (width > 0) {
            hmlVar.v(-427296121);
            fEl = ((kio) hmlVar.e(jmh.e)).el(width);
            hmlVar.o();
        } else {
            hmlVar.v(-427212452);
            fEl = ((Configuration) hmlVar.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            hmlVar.o();
        }
        if (1 == (i & 1)) {
            f = 360.0f;
        }
        if (z && Float.compare(f, 325.0f) > 0) {
            Log.println(4, "getBubbleMaxWidth", " the max width passed to the function was bigger than the maximum allowed: " + kir.a(f) + " > " + kir.a(325.0f));
            f = 325.0f;
        }
        float f2 = z ? ((kir) fddu.n(new kir((fEl - 16.0f) - 70.0f), new kir(0.0f))).a : ((kir) fddu.n(new kir((fEl - 30.0f) - 16.0f), new kir(0.0f))).a;
        boolean z3 = z2 & ((i & 4) == 0);
        float fMin = Math.min(f, f2);
        if (z3) {
            fMin -= 22.0f;
        }
        hmlVar.o();
        return fMin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0099, code lost:
    
        if (defpackage.ddp.k(r1, r2, r3, null, r5, 12) != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ddp r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.dkkf
            if (r0 == 0) goto L13
            r0 = r14
            dkkf r0 = (defpackage.dkkf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dkkf r0 = new dkkf
            r0.<init>(r12, r14)
        L18:
            r5 = r0
            java.lang.Object r14 = r5.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.c
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 3
            r2 = 1
            r10 = 0
            r11 = 2
            if (r1 == 0) goto L48
            if (r1 == r2) goto L41
            if (r1 == r11) goto L3a
            if (r1 != r9) goto L32
            defpackage.fctl.b(r14)
            goto L9c
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            ddp r13 = r5.d
            defpackage.fctl.b(r14)
            r1 = r13
            goto L80
        L41:
            ddp r13 = r5.d
            defpackage.fctl.b(r14)
            r1 = r13
            goto L66
        L48:
            defpackage.fctl.b(r14)
            r14 = r2
            java.lang.Float r2 = new java.lang.Float
            r1 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r2.<init>(r1)
            r1 = 6
            dia r3 = defpackage.dea.c(r8, r10, r7, r1)
            r5.d = r13
            r5.c = r14
            r4 = 0
            r6 = 12
            r1 = r13
            java.lang.Object r13 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto L9f
        L66:
            java.lang.Float r2 = new java.lang.Float
            r13 = 1084227584(0x40a00000, float:5.0)
            r2.<init>(r13)
            des r13 = defpackage.dev.d
            dia r3 = defpackage.dea.c(r8, r10, r13, r11)
            r5.d = r1
            r5.c = r11
            r4 = 0
            r6 = 12
            java.lang.Object r13 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto L9f
        L80:
            java.lang.Float r2 = new java.lang.Float
            r13 = 0
            r2.<init>(r13)
            r13 = 100
            des r14 = defpackage.dev.d
            dia r3 = defpackage.dea.c(r13, r10, r14, r11)
            r5.d = r7
            r5.c = r9
            r4 = 0
            r6 = 12
            java.lang.Object r13 = defpackage.ddp.k(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L9c
            goto L9f
        L9c:
            fctx r13 = defpackage.fctx.a
            return r13
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkkg.a(ddp, fcxy):java.lang.Object");
    }
}
