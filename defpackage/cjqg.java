package defpackage;

import android.content.ContentValues;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqg extends cayv {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleTelephony");
    private static final ContentValues c;
    private final fcyh d;
    private final fdjx e;
    private final egxv f;
    private final ains g;

    static {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ct_cls", (Integer) 135);
        c = contentValues;
    }

    public cjqg(fcyh fcyhVar, fdjx fdjxVar, egxv egxvVar, ains ainsVar) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        egxvVar.getClass();
        ainsVar.getClass();
        this.d = fcyhVar;
        this.e = fdjxVar;
        this.f = egxvVar;
        this.g = ainsVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("MarkRcsMessagesInTelephonyWorkerHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cjpv.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cjpv cjpvVar = (cjpv) evuhVar;
        cjpvVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new cjqe(this, cayyVar, cjpvVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(android.net.Uri r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cjqf
            if (r0 == 0) goto L13
            r0 = r7
            cjqf r0 = (defpackage.cjqf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjqf r0 = new cjqf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L47
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            defpackage.fctl.b(r7)
            egxv r7 = r5.f
            android.content.ContentValues r2 = defpackage.cjqg.c
            r4 = 0
            com.google.common.util.concurrent.ListenableFuture r7 = r7.g(r6, r2, r4)
            r0.a = r6
            r0.d = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L63
        L47:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L4c
            goto L52
        L4c:
            int r0 = r7.intValue()
            if (r0 == r3) goto L5f
        L52:
            eksp r0 = defpackage.cjqg.b
            ekrw r0 = r0.j()
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Did not mark RCS in telephony for %s"
            r0.t(r1, r6)
        L5f:
            r7.getClass()
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjqg.k(android.net.Uri, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [cjqg] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15, types: [eksl] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [android.net.Uri, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c9 -> B:29:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:42:0x0106). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(final defpackage.cjpv r11, defpackage.fcxy r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjqg.l(cjpv, fcxy):java.lang.Object");
    }
}
