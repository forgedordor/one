package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyk implements dwx {
    public dyb a;
    public dop b;
    public dvj c;
    public dwm d;
    public boolean e;
    public iqt f;
    public final fdae g;
    public boolean h;
    public int i = 1;
    public dwy j = dxk.b;
    public final dyh k = new dyh(this);
    public final fdap l = new fdap() { // from class: dyd
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            long j = ((ihs) obj).a;
            dyk dykVar = this.a;
            return new ihs(dykVar.d(dykVar.j, j, dykVar.i));
        }
    };
    private final dwl m;

    public dyk(dyb dybVar, dop dopVar, dvj dvjVar, dwm dwmVar, boolean z, iqt iqtVar, dwl dwlVar, fdae fdaeVar) {
        this.a = dybVar;
        this.b = dopVar;
        this.c = dvjVar;
        this.d = dwmVar;
        this.e = z;
        this.f = iqtVar;
        this.m = dwlVar;
        this.g = fdaeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r12, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.dye
            if (r0 == 0) goto L13
            r0 = r14
            dye r0 = (defpackage.dye) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dye r0 = new dye
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            fdch r12 = r0.d
            defpackage.fctl.b(r14)     // Catch: java.lang.Throwable -> L2b
            r6 = r11
            goto L58
        L2b:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            defpackage.fctl.b(r14)
            fdch r7 = new fdch
            r7.<init>()
            r7.a = r12
            r11.h = r4
            dod r14 = defpackage.dod.a     // Catch: java.lang.Throwable -> L65
            dyg r5 = new dyg     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L63
            r0.d = r7     // Catch: java.lang.Throwable -> L63
            r0.c = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r12 = r11.i(r14, r5, r0)     // Catch: java.lang.Throwable -> L63
            if (r12 == r1) goto L62
            r12 = r7
        L58:
            r6.h = r3
            long r12 = r12.a
            kjo r14 = new kjo
            r14.<init>(r12)
            return r14
        L62:
            return r1
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r6 = r11
        L67:
            r12 = r0
        L68:
            r6.h = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyk.a(long, fcxy):java.lang.Object");
    }

    public final float b(float f) {
        return this.e ? -f : f;
    }

    public final float c(long j) {
        return Float.intBitsToFloat((int) (this.d == dwm.b ? j >> 32 : j & 4294967295L));
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [dwl, jbf] */
    public final long d(dwy dwyVar, long j, int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jB = this.f.b(j, i);
        long jD = ihs.d(j, jB);
        long jE = e(g(dwyVar.a(c(e(f(jD))))));
        ?? r11 = this.m;
        if (((icr) r11).C) {
            ViewTreeObserver viewTreeObserver = ((AndroidComposeView) jbg.f(r11)).getViewTreeObserver();
            try {
                if (AndroidComposeView.f == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.f = declaredMethod;
                }
                Method method = AndroidComposeView.f;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return ihs.e(ihs.e(jB, jE), this.f.a(jE, ihs.d(jD, jE), i));
    }

    public final long e(long j) {
        return this.e ? ihs.f(j, -1.0f) : j;
    }

    public final long f(long j) {
        return ihs.j(j, 0.0f, this.d == dwm.b ? 1 : 2);
    }

    public final long g(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == dwm.b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    public final Object h(long j, boolean z, fcxy fcxyVar) {
        if (!z) {
            long jG = kjo.g(j, 0.0f, 0.0f, this.d == dwm.b ? 1 : 2);
            dyi dyiVar = new dyi(this, null);
            dop dopVar = this.b;
            if (dopVar == null || !j()) {
                Object objA = dyiVar.a(new kjo(jG), fcxyVar);
                if (objA == fcyl.a) {
                    return objA;
                }
            } else {
                Object objD = dopVar.d(jG, dyiVar, fcxyVar);
                if (objD == fcyl.a) {
                    return objD;
                }
            }
        }
        return fctx.a;
    }

    public final Object i(dod dodVar, fdat fdatVar, fcxy fcxyVar) {
        Object objE = this.a.e(dodVar, new dyj(this, fdatVar, null), fcxyVar);
        return objE == fcyl.a ? objE : fctx.a;
    }

    public final boolean j() {
        return this.a.h() || this.a.g();
    }

    public final boolean k() {
        return this.d == dwm.a;
    }
}
