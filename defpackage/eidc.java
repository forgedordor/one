package defpackage;

import android.os.Trace;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidc {
    public static boolean a;
    static final ecar b;
    public static final WeakHashMap c;
    public static final Deque d;
    public static final Deque e;
    public static final Object f;
    public static final Runnable g;
    public static int h;
    public static int i;
    public static eifn j;
    private static final ekhx k;
    private static ekhx l;
    private static final AtomicReference m;
    private static final eidf n;

    /* compiled from: PG */
    final class a {
        public static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        ekhx ekhxVarU = ekhx.u("android.support.v4.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl");
        k = ekhxVarU;
        l = ekhxVarU;
        a = true;
        m = new AtomicReference(ekon.a);
        b = new ecar("tiktok_systrace");
        c = new WeakHashMap();
        n = new eidf();
        d = new ArrayDeque();
        e = new ArrayDeque();
        f = new Object();
        g = new Runnable() { // from class: eicu
            @Override // java.lang.Runnable
            public final void run() {
                Object objRemove = eidc.d.remove();
                if (objRemove == eidc.f) {
                    eidc.e.pop();
                } else {
                    eidc.e.push((eifn) objRemove);
                }
            }
        };
        i = 0;
    }

    static void A() {
        eifn eifnVarD;
        h++;
        if (i == 0) {
            eifi eifiVarB = b();
            if (eifiVarB.c != null || (eifnVarD = d()) == null) {
                return;
            }
            h(eifiVarB, eifnVarD);
            i = h;
        }
    }

    public static eieh a(eieh eiehVar) {
        if (eiehVar == null || (eiehVar instanceof eifn)) {
            return g((eifn) eiehVar);
        }
        throw new IllegalStateException("RootTrace object can't be casted to Trace, this might be caused by duplicate trace error");
    }

    public static eifi b() {
        return (eifi) n.get();
    }

    public static eifn c() {
        return b().c;
    }

    static eifn d() {
        return (eifn) e.peek();
    }

    public static eifn e() {
        eifi eifiVarB = b();
        eifn eifnVar = eifiVarB.c;
        return eifnVar != null ? eifnVar : eidu.m(eifiVarB);
    }

    public static eifn f() {
        eifn eifnVar = j;
        if (eifnVar == null) {
            return null;
        }
        j = null;
        return eifnVar;
    }

    public static eifn g(eifn eifnVar) {
        return h(b(), eifnVar);
    }

    public static eifn h(eifi eifiVar, eifn eifnVar) {
        return eifiVar.e != null ? x(eifiVar, eifnVar, 2) : x(eifiVar, eifnVar, 4);
    }

    public static eifn i(eifi eifiVar, eifn eifnVar) {
        eifn eifnVar2 = eifiVar.d;
        eifiVar.d = eifnVar;
        return eifnVar2;
    }

    public static eifp j() {
        A();
        return new eifp() { // from class: eicz
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eidc.q();
            }
        };
    }

    public static eifp k() {
        eifi eifiVarB = b();
        if (!eifiVarB.a) {
            return new eifp() { // from class: eida
                @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    boolean z = eidc.a;
                }
            };
        }
        eifp eifpVarM = eifiVarB.c;
        if (eifpVarM == null) {
            eifpVarM = eidu.m(eifiVarB);
        }
        d.add(eifpVarM);
        ecem.e(g);
        return new eifp() { // from class: eidb
            @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eidc.d.add(eidc.f);
                ecem.e(eidc.g);
            }
        };
    }

    static ekhx l() {
        return (ekhx) m.get();
    }

    public static Closeable m(eifn eifnVar) {
        eifn eifnVar2;
        final eiit eiitVar = b().e;
        if (eiitVar == null) {
            if (eifnVar == eieo.a) {
                return new Closeable() { // from class: eicx
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        boolean z = eidc.a;
                    }
                };
            }
            final eifn eifnVarG = g(eifnVar);
            return new Closeable() { // from class: eicy
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eidc.g(eifnVarG);
                }
            };
        }
        ejwl.r(!eiitVar.b || eifnVar == eieo.a || (eifnVar2 = eiitVar.a) == null || (eifnVar2 instanceof eicp) || (eifnVar2 instanceof eidy) || (eifnVar2 instanceof eieo) || (eifnVar2 instanceof eied) || eifnVar2 == eifnVar, "The trace manually propagated should be the same as the one was propagated with automatic trace propagation. Existing trace: %s, new trace: %s", eiitVar.a, eifnVar);
        final int i2 = eiitVar.c;
        if (eifnVar == eieo.a) {
            eiitVar.c = 3;
            g(null);
            return new Closeable() { // from class: eiiq
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    eiitVar.c = i2;
                }
            };
        }
        eiitVar.c = 1;
        final eifn eifnVarG2 = g(eifnVar);
        return new Closeable() { // from class: eiir
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                eiit eiitVar2 = eiitVar;
                eifi eifiVarB = eidc.b();
                if (eiitVar2.c == 2) {
                    eifiVarB.d = eiitVar2.a;
                }
                int i3 = i2;
                eidc.h(eifiVarB, eifnVarG2);
                eiitVar2.c = i3;
            }
        };
    }

    static String n(String str) {
        return str.length() > 127 ? str.substring(0, 127) : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a0, code lost:
    
        r9 = r1.c.d;
        r16 = r10;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        if (r9.containsKey(r10) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
    
        r1.c.d.put(r10, new defpackage.eifd(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00be, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cd, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        r1.d = r7;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String o(defpackage.eifn r20) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eidc.o(eifn):java.lang.String");
    }

    static void p(eifn eifnVar) {
        eifi eifiVarB = b();
        eifn eifnVar2 = eifiVarB.c;
        if (eifnVar2 == null) {
            throw new eidd("Tried to end [" + eifnVar.d() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (eifnVar == eifnVar2) {
            h(eifiVarB, eifnVar2.a());
            return;
        }
        throw new eide("Tried to end span " + eifnVar.d() + ", but that span is not the current span. The current span is " + eifnVar2.d() + ".");
    }

    public static void q() {
        int i2 = h;
        int i3 = i2 - 1;
        h = i3;
        if (i3 < 0) {
            throw new IllegalStateException("More calls to pause than to resume");
        }
        if (i == i2) {
            ejwl.m(!e.isEmpty(), "current async trace should not be null");
            g(null);
            i = 0;
        }
    }

    public static void r() {
        j = c();
        ecem.e(new Runnable() { // from class: eicv
            @Override // java.lang.Runnable
            public final void run() {
                eidc.j = null;
            }
        });
    }

    static void s() {
        eifn eifnVarD;
        h++;
        if (i == 0) {
            eifi eifiVarB = b();
            if (eifiVarB.c != null || (eifnVarD = d()) == null) {
                return;
            }
            h(eifiVarB, eifnVarD);
            i = h;
        }
    }

    static void t(ekhx ekhxVar) {
        ekhv ekhvVar = new ekhv();
        ekhvVar.j(ekhxVar);
        ekhvVar.j(k);
        l = ekhvVar.g();
    }

    static boolean u(Throwable th) {
        if (l.isEmpty()) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            ekqg ekqgVarListIterator = l.listIterator();
            while (ekqgVarListIterator.hasNext()) {
                if (stackTraceElement.toString().startsWith((String) ekqgVarListIterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean v() {
        eifn eifnVarC = c();
        return (eifnVarC == null || eifnVarC == eieo.a) ? false : true;
    }

    public static boolean w() {
        eifn eifnVarD = d();
        if (eifnVarD == null) {
            return false;
        }
        if ((eifnVarD instanceof eicp) && !((eicp) eifnVarD).h()) {
            return false;
        }
        s();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab A[PHI: r8
      0x00ab: PHI (r8v2 eifn) = (r8v4 eifn), (r8v0 eifn) binds: [B:65:0x00a9, B:60:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.eifn x(defpackage.eifi r7, defpackage.eifn r8, int r9) {
        /*
            eifn r0 = r7.c
            r1 = 2
            if (r0 != r8) goto Lc
            if (r9 == r1) goto L98
            r2 = 4
            if (r9 == r2) goto L98
            if (r0 == 0) goto L98
        Lc:
            if (r0 != 0) goto L21
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L19
            boolean r2 = eidc.a.a()
            goto L1f
        L19:
            ecar r2 = defpackage.eidc.b
            boolean r2 = defpackage.ecat.b(r2)
        L1f:
            r7.b = r2
        L21:
            eiit r2 = r7.e
            boolean r3 = r7.b
            r4 = 0
            if (r3 == 0) goto L96
            if (r2 == 0) goto L65
            int r3 = r9 + (-1)
            if (r3 == 0) goto L36
            if (r3 == r1) goto L33
            r5 = r8
            r3 = r0
            goto L38
        L33:
            r3 = r0
            r5 = r4
            goto L38
        L36:
            r5 = r8
            r3 = r4
        L38:
            if (r3 == 0) goto L5f
            if (r5 == 0) goto L5c
            eifn r6 = r3.a()
            if (r6 != r5) goto L4c
            boolean r6 = r2.d(r3)
            if (r6 != 0) goto L4c
            android.os.Trace.endSection()
            goto L96
        L4c:
            eifn r6 = r5.a()
            if (r3 != r6) goto L5c
            boolean r6 = r2.d(r5)
            if (r6 != 0) goto L5c
            defpackage.eiit.a(r5)
            goto L96
        L5c:
            r2.c(r3)
        L5f:
            if (r5 == 0) goto L96
            r2.b(r5)
            goto L96
        L65:
            if (r0 == 0) goto L90
            if (r8 == 0) goto L8b
            eifn r3 = r0.a()
            if (r3 != r8) goto L79
            boolean r3 = defpackage.eifj.d(r0)
            if (r3 != 0) goto L79
            android.os.Trace.endSection()
            goto L96
        L79:
            eifn r3 = r8.a()
            if (r0 != r3) goto L89
            boolean r3 = defpackage.eifj.d(r8)
            if (r3 != 0) goto L89
            defpackage.eifj.a(r8)
            goto L96
        L89:
            r3 = r8
            goto L8c
        L8b:
            r3 = r4
        L8c:
            defpackage.eifj.c(r0)
            goto L91
        L90:
            r3 = r8
        L91:
            if (r3 == 0) goto L96
            defpackage.eifj.b(r3)
        L96:
            if (r0 != r8) goto L99
        L98:
            return r8
        L99:
            if (r8 == 0) goto La2
            boolean r3 = r8.r()
            if (r3 == 0) goto La3
            goto Lab
        La2:
            r8 = r4
        La3:
            if (r0 == 0) goto Lc3
            boolean r3 = r0.r()
            if (r3 == 0) goto Lc3
        Lab:
            long r3 = android.os.SystemClock.currentThreadTimeMillis()
            int r3 = (int) r3
            int r4 = r7.f
            int r4 = r3 - r4
            if (r4 <= 0) goto Lc1
            if (r0 == 0) goto Lc1
            boolean r5 = r0.r()
            if (r5 == 0) goto Lc1
            r0.o(r4)
        Lc1:
            r7.f = r3
        Lc3:
            r7.c = r8
            if (r9 != r1) goto Lcc
            r2.getClass()
            r2.a = r8
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eidc.x(eifi, eifn, int):eifn");
    }

    static void y() {
        z(true);
    }

    static void z(boolean z) {
        if (eifo.a()) {
            eifn eifnVarC = c();
            IllegalStateException illegalStateException = (eifnVarC == null || (eifnVarC instanceof eieo)) ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See http://go/tiktok-tracing for more details.") : eifnVarC instanceof eicp ? new IllegalStateException("Was supposed to have a trace - did you forget to propagate or create one? See this exception's cause for the last place a trace was missing. See http://go/tiktok-tracing for more details.", ((eicp) eifnVarC).c()) : null;
            if (illegalStateException != null) {
                if (eifnVarC instanceof eicp ? ((eicp) eifnVarC).h() : u(illegalStateException)) {
                    return;
                }
                if (!z) {
                    throw illegalStateException;
                }
                Log.e("Tracer", "Missing trace", illegalStateException);
            }
        }
    }
}
