package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rtl implements rte, rtz, rtk {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private int A;
    private boolean B;
    private RuntimeException C;
    private int D;
    private final String b;
    private final rvu c;
    private final Object d;
    private final rti e;
    private final rtg f;
    private final Context g;
    private final rbc h;
    private final Object i;
    private final Class j;
    private final rta k;
    private final int l;
    private final int m;
    private final rbh n;
    private final rua o;
    private final List p;
    private final rul q;
    private final Executor r;
    private rhy s;
    private rhg t;
    private long u;
    private volatile rhh v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private int z;

    public rtl(Context context, rbc rbcVar, Object obj, Object obj2, Class cls, rta rtaVar, int i, int i2, rbh rbhVar, rua ruaVar, rti rtiVar, List list, rtg rtgVar, rhh rhhVar, rul rulVar, Executor executor) {
        this.b = a ? String.valueOf(super.hashCode()) : null;
        this.c = new rvt();
        this.d = obj;
        this.g = context;
        this.h = rbcVar;
        this.i = obj2;
        this.j = cls;
        this.k = rtaVar;
        this.l = i;
        this.m = i2;
        this.n = rbhVar;
        this.o = ruaVar;
        this.e = rtiVar;
        this.p = list;
        this.f = rtgVar;
        this.v = rhhVar;
        this.q = rulVar;
        this.r = executor;
        this.D = 1;
        if (this.C == null && rbcVar.g.a(rba.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(f * i);
    }

    private final Drawable i() {
        Drawable drawable = this.y;
        if (drawable != null) {
            return drawable;
        }
        rta rtaVar = this.k;
        Drawable drawable2 = rtaVar.o;
        this.y = drawable2;
        if (drawable2 != null) {
            return drawable2;
        }
        int i = rtaVar.p;
        return null;
    }

    private final Drawable o() {
        int i;
        if (this.x == null) {
            rta rtaVar = this.k;
            Drawable drawable = rtaVar.g;
            this.x = drawable;
            if (drawable == null && (i = rtaVar.h) > 0) {
                this.x = p(i);
            }
        }
        return this.x;
    }

    private final Drawable p(int i) {
        Resources.Theme theme = this.k.t;
        if (theme == null) {
            theme = this.g.getTheme();
        }
        Context context = this.g;
        return rqg.a(context, context, i, theme);
    }

    private final void q() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void r(String str) {
        Log.v("GlideRequest", str + " this: " + this.b);
    }

    private final void s(rhs rhsVar, int i) {
        boolean zA;
        int i2;
        this.c.a();
        synchronized (this.d) {
            if (this.h.h <= i) {
                Log.w("Glide", "Load failed for [" + String.valueOf(this.i) + "] with dimensions [" + this.z + "x" + this.A + "]", rhsVar);
                List listA = rhsVar.a();
                int size = listA.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    Log.i("Glide", a.z(size, i4, "Root cause (", " of ", ")"), (Throwable) listA.get(i3));
                    i3 = i4;
                }
            }
            this.t = null;
            this.D = 5;
            rtg rtgVar = this.f;
            if (rtgVar != null) {
                rtgVar.d(this);
            }
            boolean z = true;
            this.B = true;
            try {
                List list = this.p;
                if (list != null) {
                    Iterator it = list.iterator();
                    zA = false;
                    while (it.hasNext()) {
                        zA |= ((rti) it.next()).a(rhsVar, this.i, this.o, u());
                    }
                } else {
                    zA = false;
                }
                rti rtiVar = this.e;
                if (rtiVar == null || !rtiVar.a(rhsVar, this.i, this.o, u())) {
                    z = false;
                }
                if (!(zA | z) && t()) {
                    Drawable drawableI = this.i == null ? i() : null;
                    if (drawableI == null) {
                        if (this.w == null) {
                            rta rtaVar = this.k;
                            Drawable drawable = rtaVar.e;
                            this.w = drawable;
                            if (drawable == null && (i2 = rtaVar.f) > 0) {
                                this.w = p(i2);
                            }
                        }
                        drawableI = this.w;
                    }
                    if (drawableI == null) {
                        drawableI = o();
                    }
                    this.o.a(drawableI);
                }
            } finally {
                this.B = false;
            }
        }
    }

    private final boolean t() {
        rtg rtgVar = this.f;
        return rtgVar == null || rtgVar.h(this);
    }

    private final boolean u() {
        rtg rtgVar = this.f;
        return rtgVar == null || !rtgVar.a().j();
    }

    @Override // defpackage.rtk
    public final Object a() {
        this.c.a();
        return this.d;
    }

    @Override // defpackage.rte
    public final void b() {
        synchronized (this.d) {
            q();
            this.c.a();
            int i = rvd.a;
            this.u = SystemClock.elapsedRealtimeNanos();
            if (this.i == null) {
                int i2 = this.l;
                int i3 = this.m;
                if (rvk.p(i2, i3)) {
                    this.z = i2;
                    this.A = i3;
                }
                s(new rhs("Received null model"), i() == null ? 5 : 3);
                return;
            }
            int i4 = this.D;
            if (i4 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i4 == 4) {
                e(this.s, reb.MEMORY_CACHE);
                return;
            }
            List<rti> list = this.p;
            if (list != null) {
                for (rti rtiVar : list) {
                    if (rtiVar instanceof rtc) {
                        throw null;
                    }
                }
            }
            this.D = 3;
            int i5 = this.l;
            int i6 = this.m;
            if (rvk.p(i5, i6)) {
                g(i5, i6);
            } else {
                this.o.d(this);
            }
            int i7 = this.D;
            if ((i7 == 2 || i7 == 3) && t()) {
                this.o.f(o());
            }
            if (a) {
                r("finished run method in " + rvd.a(this.u));
            }
        }
    }

    @Override // defpackage.rte
    public final void c() {
        synchronized (this.d) {
            q();
            rvu rvuVar = this.c;
            rvuVar.a();
            if (this.D == 6) {
                return;
            }
            q();
            rvuVar.a();
            this.o.g(this);
            rhg rhgVar = this.t;
            rhy rhyVar = null;
            if (rhgVar != null) {
                synchronized (rhgVar.c) {
                    rhgVar.a.g(rhgVar.b);
                }
                this.t = null;
            }
            rhy rhyVar2 = this.s;
            if (rhyVar2 != null) {
                this.s = null;
                rhyVar = rhyVar2;
            }
            rtg rtgVar = this.f;
            if (rtgVar == null || rtgVar.g(this)) {
                this.o.e(o());
            }
            this.D = 6;
            if (rhyVar != null) {
                ((rhq) rhyVar).f();
            }
        }
    }

    @Override // defpackage.rtk
    public final void d(rhs rhsVar) {
        s(rhsVar, 5);
    }

    @Override // defpackage.rtk
    public final void e(rhy rhyVar, reb rebVar) throws Throwable {
        boolean zB;
        rhy rhyVar2 = rhyVar;
        this.c.a();
        rhy rhyVar3 = null;
        try {
            try {
                synchronized (this.d) {
                    try {
                        this.t = null;
                        if (rhyVar2 == null) {
                            d(new rhs("Expected to receive a Resource<R> with an object of " + this.j.toString() + " inside, but instead got null."));
                            return;
                        }
                        Object objC = rhyVar2.c();
                        if (objC == null || !this.j.isAssignableFrom(objC.getClass())) {
                            this.s = null;
                            d(new rhs("Expected to receive an object of " + this.j.toString() + " but instead got " + String.valueOf(objC != null ? objC.getClass() : "") + "{" + String.valueOf(objC) + "} inside Resource{" + rhyVar2.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
                        } else {
                            rtg rtgVar = this.f;
                            if (rtgVar == null || rtgVar.i(this)) {
                                boolean zU = u();
                                this.D = 4;
                                this.s = rhyVar2;
                                if (this.h.h <= 3) {
                                    Log.d("Glide", "Finished loading " + objC.getClass().getSimpleName() + " from " + String.valueOf(rebVar) + " for " + String.valueOf(this.i) + " with size [" + this.z + "x" + this.A + "] in " + rvd.a(this.u) + " ms");
                                }
                                if (rtgVar != null) {
                                    rtgVar.e(this);
                                }
                                boolean z = true;
                                this.B = true;
                                try {
                                    List<rti> list = this.p;
                                    if (list != null) {
                                        zB = false;
                                        for (rti rtiVar : list) {
                                            zB |= rtiVar.b(objC, this.i, this.o, rebVar, zU);
                                            if (rtiVar instanceof rtc) {
                                                zB |= ((rtc) rtiVar).c();
                                            }
                                        }
                                    } else {
                                        zB = false;
                                    }
                                    rti rtiVar2 = this.e;
                                    if (rtiVar2 == null || !rtiVar2.b(objC, this.i, this.o, rebVar, zU)) {
                                        z = false;
                                    }
                                    if (!(z | zB)) {
                                        this.o.b(objC, this.q.a(rebVar));
                                    }
                                    return;
                                } finally {
                                    this.B = false;
                                }
                            }
                            this.s = null;
                            this.D = 4;
                        }
                        ((rhq) rhyVar2).f();
                    } catch (Throwable th) {
                        th = th;
                        rhyVar2 = null;
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            rhyVar3 = rhyVar2;
                            if (rhyVar3 != null) {
                                ((rhq) rhyVar3).f();
                            }
                            throw th;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.rte
    public final void f() {
        synchronized (this.d) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: all -> 0x01e8, TryCatch #2 {all -> 0x01e8, blocks: (B:46:0x0112, B:48:0x011e, B:50:0x0123, B:51:0x0128, B:60:0x01b6, B:52:0x012f, B:56:0x01a2, B:58:0x01aa, B:59:0x01b1, B:74:0x01e9, B:64:0x01bc, B:26:0x00be, B:28:0x00c6, B:31:0x00cd, B:33:0x00db, B:41:0x0101, B:44:0x010b, B:36:0x00eb, B:38:0x00f1, B:39:0x00f7), top: B:85:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bc A[Catch: all -> 0x01e8, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x01e8, blocks: (B:46:0x0112, B:48:0x011e, B:50:0x0123, B:51:0x0128, B:60:0x01b6, B:52:0x012f, B:56:0x01a2, B:58:0x01aa, B:59:0x01b1, B:74:0x01e9, B:64:0x01bc, B:26:0x00be, B:28:0x00c6, B:31:0x00cd, B:33:0x00db, B:41:0x0101, B:44:0x010b, B:36:0x00eb, B:38:0x00f1, B:39:0x00f7), top: B:85:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:20:0x00a1, B:21:0x00b1, B:66:0x01c3, B:68:0x01ca, B:70:0x01cf, B:71:0x01e6, B:75:0x01ea, B:65:0x01bd, B:78:0x01ee), top: B:82:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01cf A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:20:0x00a1, B:21:0x00b1, B:66:0x01c3, B:68:0x01ca, B:70:0x01cf, B:71:0x01e6, B:75:0x01ea, B:65:0x01bd, B:78:0x01ee), top: B:82:0x0010 }] */
    @Override // defpackage.rtz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r32, int r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtl.g(int, int):void");
    }

    @Override // defpackage.rte
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 4;
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 6;
        }
        return z;
    }

    @Override // defpackage.rte
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.D == 4;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // defpackage.rte
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(defpackage.rte r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof defpackage.rtl
            r3 = 0
            if (r2 != 0) goto La
            return r3
        La:
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            int r4 = r1.l     // Catch: java.lang.Throwable -> L76
            int r5 = r1.m     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r1.i     // Catch: java.lang.Throwable -> L76
            java.lang.Class r7 = r1.j     // Catch: java.lang.Throwable -> L76
            rta r8 = r1.k     // Catch: java.lang.Throwable -> L76
            rbh r9 = r1.n     // Catch: java.lang.Throwable -> L76
            java.util.List r10 = r1.p     // Catch: java.lang.Throwable -> L76
            if (r10 == 0) goto L22
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L76
            goto L23
        L22:
            r10 = r3
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            rtl r0 = (defpackage.rtl) r0
            java.lang.Object r11 = r0.d
            monitor-enter(r11)
            int r2 = r0.l     // Catch: java.lang.Throwable -> L73
            int r12 = r0.m     // Catch: java.lang.Throwable -> L73
            java.lang.Object r13 = r0.i     // Catch: java.lang.Throwable -> L73
            java.lang.Class r14 = r0.j     // Catch: java.lang.Throwable -> L73
            rta r15 = r0.k     // Catch: java.lang.Throwable -> L73
            r16 = r3
            rbh r3 = r0.n     // Catch: java.lang.Throwable -> L73
            java.util.List r0 = r0.p     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L40
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L73
            goto L42
        L40:
            r0 = r16
        L42:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L73
            if (r4 != r2) goto L72
            if (r5 != r12) goto L72
            char[] r2 = defpackage.rvk.a
            if (r6 != 0) goto L4e
            if (r13 != 0) goto L72
            goto L60
        L4e:
            boolean r2 = r6 instanceof defpackage.rll
            if (r2 == 0) goto L59
            rll r6 = (defpackage.rll) r6
            boolean r2 = r6.a()
            goto L5d
        L59:
            boolean r2 = r6.equals(r13)
        L5d:
            if (r2 != 0) goto L60
            goto L72
        L60:
            boolean r2 = r7.equals(r14)
            if (r2 == 0) goto L72
            boolean r2 = r8.equals(r15)
            if (r2 == 0) goto L72
            if (r9 != r3) goto L72
            if (r10 != r0) goto L72
            r0 = 1
            return r0
        L72:
            return r16
        L73:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L73
            throw r0
        L76:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L76
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rtl.m(rte):boolean");
    }

    @Override // defpackage.rte
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.D;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + String.valueOf(obj) + ", transcodeClass=" + cls.toString() + "]";
    }
}
