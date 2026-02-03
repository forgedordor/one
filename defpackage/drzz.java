package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzz implements drzn {
    private static final eksp b = eksp.c("GnpSdk");
    private static final Duration c;
    public final diep a;
    private final String d;
    private final dsbr e;
    private final dsah f;
    private final eygg g;
    private final dski h;
    private final ddud i;

    static {
        Duration durationOfMinutes = Duration.ofMinutes(1L);
        durationOfMinutes.getClass();
        c = durationOfMinutes;
    }

    public drzz(String str, diep diepVar, dsbr dsbrVar, dsah dsahVar, eygg eyggVar, dski dskiVar, ddud ddudVar) {
        str.getClass();
        diepVar.getClass();
        dsbrVar.getClass();
        dsahVar.getClass();
        eyggVar.getClass();
        dskiVar.getClass();
        this.d = str;
        this.a = diepVar;
        this.e = dsbrVar;
        this.f = dsahVar;
        this.g = eyggVar;
        this.h = dskiVar;
        this.i = ddudVar;
    }

    private final void e(long j, boolean z) {
        ((ecog) ((dxtx) this.g.b()).u.get()).b(SystemClock.elapsedRealtime() - j, this.d, Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00de -> B:17:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012f -> B:37:0x0131). Please report as a decompilation issue!!! */
    @Override // defpackage.drzn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drzz.a(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final long r9, final j$.time.Instant r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.drzu
            if (r0 == 0) goto L13
            r0 = r12
            drzu r0 = (defpackage.drzu) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            drzu r0 = new drzu
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            long r9 = r0.a
            defpackage.fctl.b(r12)     // Catch: java.lang.Exception -> L2a
            goto L72
        L2a:
            r11 = move-exception
            goto L90
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            defpackage.fctl.b(r12)
            long r5 = android.os.SystemClock.elapsedRealtime()
            eksp r12 = defpackage.drzz.b     // Catch: java.lang.Exception -> L8d
            ekrw r12 = r12.o()     // Catch: java.lang.Exception -> L8d
            java.lang.String r2 = "Getting cross-app impression count."
            r12.q(r2)     // Catch: java.lang.Exception -> L8d
            ddud r12 = r8.i     // Catch: java.lang.Exception -> L8d
            r11.getClass()     // Catch: java.lang.Exception -> L8d
            dciz r2 = new dciz     // Catch: java.lang.Exception -> L8d
            r2.<init>()     // Catch: java.lang.Exception -> L8d
            r2.b()     // Catch: java.lang.Exception -> L8d
            ddub r7 = new ddub     // Catch: java.lang.Exception -> L8d
            r7.<init>()     // Catch: java.lang.Exception -> L8d
            r2.a = r7     // Catch: java.lang.Exception -> L8d
            r9 = 34602(0x872a, float:4.8488E-41)
            r2.c = r9     // Catch: java.lang.Exception -> L8d
            dcja r9 = r2.a()     // Catch: java.lang.Exception -> L8d
            defn r9 = r12.j(r9)     // Catch: java.lang.Exception -> L8d
            r0.a = r5     // Catch: java.lang.Exception -> L8d
            r0.d = r4     // Catch: java.lang.Exception -> L8d
            java.lang.Object r12 = defpackage.febo.a(r9, r0)     // Catch: java.lang.Exception -> L8d
            if (r12 == r1) goto L8c
            r9 = r5
        L72:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Exception -> L2a
            int r11 = r12.intValue()     // Catch: java.lang.Exception -> L2a
            r8.e(r9, r3)     // Catch: java.lang.Exception -> L2a
            eksp r12 = defpackage.drzz.b     // Catch: java.lang.Exception -> L2a
            ekrw r12 = r12.o()     // Catch: java.lang.Exception -> L2a
            java.lang.String r0 = "Got cross-app impression count: %d"
            r12.r(r0, r11)     // Catch: java.lang.Exception -> L2a
            java.lang.Integer r12 = new java.lang.Integer     // Catch: java.lang.Exception -> L2a
            r12.<init>(r11)     // Catch: java.lang.Exception -> L2a
            return r12
        L8c:
            return r1
        L8d:
            r9 = move-exception
            r11 = r9
            r9 = r5
        L90:
            r8.e(r9, r4)
            eksp r9 = defpackage.drzz.b
            ekrw r9 = r9.j()
            java.lang.String r10 = "Failed to get cross-app capping for promotions, API might not be available."
            defpackage.a.N(r9, r10, r11)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drzz.b(long, j$.time.Instant, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (defpackage.fbch.b() != false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dsbi r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drzz.c(dsbi, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.drzy
            if (r0 == 0) goto L13
            r0 = r5
            drzy r0 = (defpackage.drzy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            drzy r0 = new drzy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            dski r5 = r4.h
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r0 = r5.entrySet()
            drzt r1 = new drzt
            r1.<init>()
            defpackage.fcva.A(r0, r1)
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drzz.d(fcxy):java.lang.Object");
    }
}
