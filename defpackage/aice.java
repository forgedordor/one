package defpackage;

import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aice extends dbwk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/restore/service/CustomD2DTargetServiceImpl");
    public final cmrp b;
    public final ahwe c;
    public final ahwd d;
    public final cogw e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fdjx i;
    public final ahzu j;
    private final Context k;
    private final ahtn l;
    private final fdjx m;
    private final fcyh n;
    private final aick o;
    private final fcsu p;
    private final fcsu q;

    public aice(Context context, cmrp cmrpVar, ahtn ahtnVar, ahwe ahweVar, ahwd ahwdVar, fdjx fdjxVar, fcyh fcyhVar, cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar2, aick aickVar, fcsu fcsuVar4, fcsu fcsuVar5, ahzv ahzvVar) {
        context.getClass();
        cmrpVar.getClass();
        ahtnVar.getClass();
        ahweVar.getClass();
        ahwdVar.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar2.getClass();
        aickVar.getClass();
        fcsuVar5.getClass();
        this.k = context;
        this.b = cmrpVar;
        this.l = ahtnVar;
        this.c = ahweVar;
        this.d = ahwdVar;
        this.m = fdjxVar;
        this.n = fcyhVar;
        this.e = cogwVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
        this.i = fdjxVar2;
        this.o = aickVar;
        this.p = fcsuVar4;
        this.q = fcsuVar5;
        this.j = ahzvVar.a(a, null, null);
    }

    public static final void j(fcsf fcsfVar, aibj aibjVar) {
        Exception exc = aibjVar.b;
        if (exc != null) {
            fcsfVar.b(exc);
        } else {
            fcsfVar.c(aibjVar.a);
            fcsfVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aibp
            if (r0 == 0) goto L13
            r0 = r5
            aibp r0 = (defpackage.aibp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aibp r0 = new aibp
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            ahwd r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.i(r0)
            if (r5 == r1) goto L63
        L3c:
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.ListIterator r5 = r5.listIterator(r0)
        L46:
            boolean r0 = r5.hasPrevious()
            r1 = 0
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r5.previous()
            r2 = r0
            ahto r2 = (defpackage.ahto) r2
            aiba r2 = r2.b
            aiba r3 = defpackage.aiba.D2D
            if (r2 != r3) goto L46
            goto L5c
        L5b:
            r0 = r1
        L5c:
            ahto r0 = (defpackage.ahto) r0
            if (r0 == 0) goto L63
            java.util.UUID r5 = r0.a
            return r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.evqs r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aibq
            if (r0 == 0) goto L13
            r0 = r6
            aibq r0 = (defpackage.aibq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aibq r0 = new aibq
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 == r1) goto L7f
        L3e:
            java.util.UUID r6 = (java.util.UUID) r6
            if (r6 != 0) goto L50
            ahzu r6 = r4.j
            java.lang.String r0 = "No active executions found when getting last session id"
            r6.k(r0)
            evqs r5 = (defpackage.evqs) r5
            java.util.UUID r5 = defpackage.cobs.c(r5)
            return r5
        L50:
            evqs r5 = (defpackage.evqs) r5
            boolean r0 = r5.H()
            if (r0 == 0) goto L60
            ahzu r5 = r4.j
            java.lang.String r0 = "Passed in session id was empty, using last active restore execution session id %s"
            r5.l(r0, r6)
            return r6
        L60:
            java.util.UUID r0 = defpackage.cobs.c(r5)
            boolean r0 = defpackage.fdbq.f(r6, r0)
            if (r0 != 0) goto L7a
            ahzu r0 = r4.j
            java.util.UUID r5 = defpackage.cobs.c(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r1 = "Passed in session id %s does not match last active restore execution session id %s"
            r0.m(r1, r5, r6)
            return r6
        L7a:
            java.util.UUID r5 = defpackage.cobs.c(r5)
            return r5
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.c(evqs, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [dbwf] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.os.ParcelFileDescriptor r23, defpackage.dbwf r24, java.util.UUID r25, defpackage.fcxy r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.e(android.os.ParcelFileDescriptor, dbwf, java.util.UUID, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0420, code lost:
    
        if (r3.b(r0, r8) != r9) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04e6, code lost:
    
        if (r0 != r9) goto L217;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0307 A[Catch: all -> 0x03bb, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030c A[Catch: all -> 0x03bb, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0312 A[Catch: all -> 0x03bb, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0317 A[Catch: all -> 0x03bb, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0321 A[Catch: all -> 0x03bb, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0327 A[Catch: all -> 0x03bb, TRY_LEAVE, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x039e A[Catch: all -> 0x03bb, TRY_LEAVE, TryCatch #6 {all -> 0x03bb, blocks: (B:143:0x0376, B:145:0x039e, B:119:0x02fd, B:121:0x0307, B:123:0x030e, B:125:0x0312, B:127:0x0319, B:129:0x0321, B:130:0x0323, B:132:0x0327, B:126:0x0317, B:122:0x030c), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03a8 A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x00bf, blocks: (B:14:0x0060, B:176:0x0446, B:180:0x045f, B:182:0x046e, B:184:0x0475, B:191:0x0483, B:187:0x047c, B:183:0x0473, B:17:0x0080, B:171:0x0423, B:20:0x009c, B:161:0x03e5, B:166:0x03f3, B:168:0x0408, B:23:0x00b9, B:149:0x03a8), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03c9 A[Catch: all -> 0x049e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x049e, blocks: (B:158:0x03c9, B:163:0x03e8), top: B:259:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e8 A[Catch: all -> 0x049e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x049e, blocks: (B:158:0x03c9, B:163:0x03e8), top: B:259:0x03c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f3 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #9 {all -> 0x00bf, blocks: (B:14:0x0060, B:176:0x0446, B:180:0x045f, B:182:0x046e, B:184:0x0475, B:191:0x0483, B:187:0x047c, B:183:0x0473, B:17:0x0080, B:171:0x0423, B:20:0x009c, B:161:0x03e5, B:166:0x03f3, B:168:0x0408, B:23:0x00b9, B:149:0x03a8), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x046e A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:14:0x0060, B:176:0x0446, B:180:0x045f, B:182:0x046e, B:184:0x0475, B:191:0x0483, B:187:0x047c, B:183:0x0473, B:17:0x0080, B:171:0x0423, B:20:0x009c, B:161:0x03e5, B:166:0x03f3, B:168:0x0408, B:23:0x00b9, B:149:0x03a8), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0473 A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:14:0x0060, B:176:0x0446, B:180:0x045f, B:182:0x046e, B:184:0x0475, B:191:0x0483, B:187:0x047c, B:183:0x0473, B:17:0x0080, B:171:0x0423, B:20:0x009c, B:161:0x03e5, B:166:0x03f3, B:168:0x0408, B:23:0x00b9, B:149:0x03a8), top: B:253:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225 A[Catch: Exception -> 0x04b1, TRY_ENTER, TryCatch #8 {Exception -> 0x04b1, blocks: (B:49:0x013f, B:51:0x016c, B:53:0x0171, B:59:0x0197, B:61:0x019d, B:63:0x01a1, B:64:0x01a3, B:66:0x01a7, B:68:0x01ae, B:70:0x01b6, B:76:0x01e0, B:78:0x01e4, B:79:0x01e6, B:81:0x01ea, B:83:0x01f1, B:85:0x01fb, B:82:0x01ef, B:67:0x01ac, B:91:0x0225, B:93:0x0229, B:95:0x024e, B:97:0x0252, B:98:0x0254, B:100:0x0258, B:102:0x025f, B:104:0x026d, B:105:0x026f, B:101:0x025d, B:94:0x0231), top: B:260:0x013f }] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v56, types: [int] */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r24v0, types: [aice, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v75 */
    /* JADX WARN: Type inference failed for: r5v76 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.dbxr r25, defpackage.fbog r26, defpackage.fcxy r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.f(dbxr, fbog, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.os.ParcelFileDescriptor r17, defpackage.dbwf r18, java.util.UUID r19, defpackage.fcxy r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aice.g(android.os.ParcelFileDescriptor, dbwf, java.util.UUID, fcxy):java.lang.Object");
    }

    @Override // defpackage.dbwk
    public final void h(dbxa dbxaVar, fcsf fcsfVar) {
        Duration durationOfMillis = Duration.ofMillis(this.e.a());
        this.j.e("Starting handshake on target device, request=%s", fczx.c(fczx.a, dbxaVar.toByteArray()));
        auvw.k(this.m, null, null, new aibs(this, fcsfVar, durationOfMillis, null), 3);
    }

    @Override // defpackage.dbwk
    public final void i(dbxr dbxrVar, fcsf fcsfVar) {
        auvw.k(this.m, null, null, new aibz(this, dbxrVar, fbog.k(), fcsfVar, Duration.ofMillis(this.e.a()), null), 3);
    }
}
