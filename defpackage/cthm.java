package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cthm extends cayv {
    public static final /* synthetic */ int a = 0;
    private final fdjx b;
    private final cthb c;
    private final cths d;

    static {
        cdag.e(cdag.b, "starred_message_configuration_batch_size", 100);
    }

    public cthm(fdjx fdjxVar, cthb cthbVar, cths cthsVar) {
        fdjxVar.getClass();
        this.b = fdjxVar;
        this.c = cthbVar;
        this.d = cthsVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("StarAnalyticsWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cthd.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cthd cthdVar = (cthd) evuhVar;
        cthdVar.getClass();
        return auvw.c(this.b, fcyi.a, fdjz.a, new cthk(this, cthdVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.bqrm r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cthj
            if (r0 == 0) goto L13
            r0 = r6
            cthj r0 = (defpackage.cthj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cthj r0 = new cthj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L8b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            java.lang.String[] r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            java.lang.String r6 = "parts"
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData> r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData.class
            dqpd r5 = r5.aw(r6, r2)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData r5 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData) r5
            cthb r6 = r4.c
            r5.getClass()
            r0.c = r3
            java.lang.String r2 = r5.L()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L5c
            java.lang.String r5 = r5.L()
            r5.getClass()
            java.lang.Object r5 = r6.a(r5, r0)
        L5a:
            r6 = r5
            goto L89
        L5c:
            java.lang.String r6 = r5.I()
            java.util.Set r0 = defpackage.cthb.a
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L6f
            ctht r5 = defpackage.ctht.g
            java.util.List r5 = defpackage.fcva.b(r5)
            goto L5a
        L6f:
            java.lang.String r5 = r5.I()
            java.util.Set r6 = defpackage.cthb.b
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L82
            ctht r5 = defpackage.ctht.h
            java.util.List r5 = defpackage.fcva.b(r5)
            goto L5a
        L82:
            ctht r5 = defpackage.ctht.i
            java.util.List r5 = defpackage.fcva.b(r5)
            goto L5a
        L89:
            if (r6 == r1) goto Lb5
        L8b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r5 = r6.iterator()
        L91:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r5.next()
            ctht r6 = (defpackage.ctht) r6
            cths r0 = r4.d
            r6.getClass()
            fcsu r0 = r0.a
            java.lang.Object r0 = r0.b()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.Star.Message.Type.Counts"
            int r6 = r6.j
            r0.e(r1, r6)
            goto L91
        Lb2:
            fctx r5 = defpackage.fctx.a
            return r5
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthm.k(bqrm, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00e9 -> B:19:0x00eb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cthd r8, defpackage.fcxy r9) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cthm.l(cthd, fcxy):java.lang.Object");
    }
}
