package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cogh implements cogi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater");
    public static final String[] b = {"_id", "chset"};
    public static final Uri c;
    public final fcsu d;
    public final fdjx e;
    public final fcsu f;
    public final Context g;
    public final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;

    static {
        Uri uri = Uri.parse("content://mms/part");
        uri.getClass();
        c = uri;
    }

    public cogh(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar, fcsu fcsuVar4, Context context, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        fcsuVar4.getClass();
        context.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar8.getClass();
        this.d = fcsuVar;
        this.i = fcsuVar2;
        this.j = fcsuVar3;
        this.e = fdjxVar;
        this.f = fcsuVar4;
        this.g = context;
        this.k = fcsuVar5;
        this.h = fcsuVar6;
        this.l = fcsuVar7;
        this.m = fcsuVar8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r16v0, types: [cogh] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r17, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r18, long r19, defpackage.fcxy r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.a(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, java.lang.String r7, int r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.cofp
            if (r0 == 0) goto L13
            r0 = r9
            cofp r0 = (defpackage.cofp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cofp r0 = new cofp
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r9)
            goto L78
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r9)
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.String r2 = "address"
            r9.put(r2, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r8)
            java.lang.String r8 = "type"
            r9.put(r8, r7)
            java.lang.Integer r7 = new java.lang.Integer
            r8 = 106(0x6a, float:1.49E-43)
            r7.<init>(r8)
            java.lang.String r8 = "charset"
            r9.put(r8, r7)
            fcsu r7 = r4.d
            java.lang.Object r7 = r7.b()
            egxv r7 = (defpackage.egxv) r7
            java.lang.String r8 = "content://mms/"
            java.lang.String r2 = "/addr"
            java.lang.String r5 = defpackage.a.A(r5, r8, r2)
            android.net.Uri r5 = android.net.Uri.parse(r5)
            egxp r6 = new egxp
            r6.<init>()
            com.google.common.util.concurrent.ListenableFuture r5 = r7.c(r6)
            r0.c = r3
            java.lang.Object r9 = defpackage.fdxs.c(r5, r0)
            if (r9 != r1) goto L78
            return r1
        L78:
            android.net.Uri r9 = (android.net.Uri) r9
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.b(long, java.lang.String, int, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cofq
            if (r0 == 0) goto L13
            r0 = r12
            cofq r0 = (defpackage.cofq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cofq r0 = new cofq
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r12)
            goto L72
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L30:
            defpackage.fctl.b(r12)
            fcsu r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            egxv r5 = (defpackage.egxv) r5
            android.net.Uri r6 = defpackage.cogh.c
            java.lang.String r12 = "DISTINCT chset"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            java.util.Locale r12 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.String r9 = "chset"
            r8[r3] = r9
            r8[r4] = r9
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r8, r2)
            java.lang.String r8 = "%s IS NOT NULL AND %s != 0"
            java.lang.String r8 = java.lang.String.format(r12, r8, r2)
            r8.getClass()
            r9 = 0
            r10 = 0
            eopy r12 = r5.b(r6, r7, r8, r9, r10)
            fdjx r2 = r11.e
            fdkf r12 = defpackage.auus.b(r12, r2)
            r0.c = r4
            fdme r12 = (defpackage.fdme) r12
            java.lang.Object r12 = r12.hJ(r0)
            if (r12 == r1) goto La8
        L72:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r0 = r12
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> La0
            r0.getClass()     // Catch: java.lang.Throwable -> La0
        L7a:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L99
            java.lang.String r1 = r0.getString(r3)     // Catch: java.lang.Throwable -> La0
            r1.getClass()     // Catch: java.lang.Throwable -> La0
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> La0
            fcsu r2 = r11.j     // Catch: java.lang.Throwable -> La0
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> La0
            ains r2 = (defpackage.ains) r2     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Bugle.Telephony.Parts.Charset.Counts"
            r2.e(r4, r1)     // Catch: java.lang.Throwable -> La0
            goto L7a
        L99:
            r0 = 0
            defpackage.fczl.a(r12, r0)
            fctx r12 = defpackage.fctx.a
            return r12
        La0:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            defpackage.fczl.a(r12, r1)
            throw r0
        La8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        if (a(r1, r2, r3, r5) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0156, code lost:
    
        if (i((android.net.Uri) r4, r2, r5) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0158, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        r12 = r10;
        r11 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(android.database.Cursor r17, defpackage.fcxy r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.d(android.database.Cursor, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.database.Cursor r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.cofs
            if (r0 == 0) goto L13
            r0 = r11
            cofs r0 = (defpackage.cofs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cofs r0 = new cofs
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r10 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r11)
            r11 = r10
            r10 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.fctl.b(r11)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
        L3d:
            boolean r2 = r10.moveToNext()
            if (r2 == 0) goto Ldd
            r2 = 0
            long r4 = r10.getLong(r2)
            android.net.Uri r2 = android.provider.Telephony.Mms.CONTENT_URI
            android.net.Uri$Builder r2 = r2.buildUpon()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            android.net.Uri$Builder r2 = r2.appendPath(r4)
            android.net.Uri r2 = r2.build()
            r2.getClass()
            brdr r4 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.d()
            java.lang.String r5 = "getConversationIdByUri"
            r4.A(r5)
            cofb r5 = new cofb
            r5.<init>()
            r4.h(r5)
            brdp r4 = r4.b()
            dqpd r4 = r4.l()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r4 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData) r4
            if (r4 == 0) goto L80
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = r4.D()
            if (r4 != 0) goto L82
        L80:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = defpackage.barn.a
        L82:
            boolean r5 = r4.b()
            if (r5 == 0) goto La9
            ekrg r4 = defpackage.cogh.a
            ekrw r4 = r4.e()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "BugleTelephony"
            r4.X(r5, r6)
            r5 = 172(0xac, float:2.41E-43)
            java.lang.String r6 = "TelephonyDatabaseUpdater.kt"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater"
            java.lang.String r8 = "processOutgoingMmsMessagesInThreadZero"
            ekrw r4 = r4.h(r7, r8, r5, r6)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r5 = "Conversation not found for MMS. Skipping thread Id update: %s"
            r4.t(r5, r2)
            goto L3d
        La9:
            cofg r5 = new cofg
            r5.<init>()
            cofh r6 = new cofh
            r6.<init>()
            java.lang.Object r4 = j$.util.Map.EL.computeIfAbsent(r11, r4, r6)
            r4.getClass()
            cnqj r4 = (defpackage.cnqj) r4
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            long r6 = r4.a()
            int r4 = (int) r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            java.lang.String r4 = "thread_id"
            r5.put(r4, r6)
            r0.a = r10
            r0.b = r11
            r0.e = r3
            java.lang.Object r2 = r9.i(r2, r5, r0)
            if (r2 != r1) goto L3d
            return r1
        Ldd:
            fctx r10 = defpackage.fctx.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.e(android.database.Cursor, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.database.Cursor r9, defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.coft
            if (r0 == 0) goto L13
            r0 = r10
            coft r0 = (defpackage.coft) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            coft r0 = new coft
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r10)
            r10 = r9
            r9 = r2
            goto L3d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            defpackage.fctl.b(r10)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
        L3d:
            boolean r2 = r9.moveToNext()
            if (r2 == 0) goto La1
            cofn r2 = new cofn
            r4 = 0
            long r4 = r9.getLong(r4)
            java.lang.String r6 = r9.getString(r3)
            r6.getClass()
            r2.<init>(r4, r6)
            java.lang.String r4 = r2.b
            cofj r5 = new cofj
            r5.<init>()
            cofk r6 = new cofk
            r6.<init>()
            java.lang.Object r4 = j$.util.Map.EL.computeIfAbsent(r10, r4, r6)
            r4.getClass()
            cnqj r4 = (defpackage.cnqj) r4
            android.net.Uri r5 = android.provider.Telephony.Sms.CONTENT_URI
            android.net.Uri$Builder r5 = r5.buildUpon()
            long r6 = r2.a
            java.lang.String r2 = java.lang.String.valueOf(r6)
            android.net.Uri$Builder r2 = r5.appendPath(r2)
            android.net.Uri r2 = r2.build()
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            long r6 = r4.a()
            int r4 = (int) r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r4)
            java.lang.String r4 = "thread_id"
            r5.put(r4, r6)
            r2.getClass()
            r0.a = r9
            r0.b = r10
            r0.e = r3
            java.lang.Object r2 = r8.i(r2, r5, r0)
            if (r2 != r1) goto L3d
            return r1
        La1:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.f(android.database.Cursor, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r6, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cofu
            if (r0 == 0) goto L13
            r0 = r8
            cofu r0 = (defpackage.cofu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cofu r0 = new cofu
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r8)
            fcsu r8 = r5.d
            java.lang.Object r8 = r8.b()
            egxv r8 = (defpackage.egxv) r8
            java.lang.String r2 = "content://mms/"
            java.lang.String r4 = "/addr"
            java.lang.String r6 = defpackage.a.A(r6, r2, r4)
            android.net.Uri r6 = android.net.Uri.parse(r6)
            egxs r7 = new egxs
            r7.<init>()
            com.google.common.util.concurrent.ListenableFuture r6 = r8.c(r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r6, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            java.lang.Integer r8 = (java.lang.Integer) r8
            fctx r6 = defpackage.fctx.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.g(long, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d4 -> B:23:0x00d6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.util.List r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.h(java.util.List, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.net.Uri r5, android.content.ContentValues r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cofw
            if (r0 == 0) goto L13
            r0 = r7
            cofw r0 = (defpackage.cofw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cofw r0 = new cofw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r7)
            fcsu r7 = r4.d
            java.lang.Object r7 = r7.b()
            egxv r7 = (defpackage.egxv) r7
            r2 = 0
            com.google.common.util.concurrent.ListenableFuture r5 = r7.g(r5, r6, r2)
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r5, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.Integer r7 = (java.lang.Integer) r7
            fctx r5 = defpackage.fctx.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.i(android.net.Uri, android.content.ContentValues, fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (l(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cofx
            if (r0 == 0) goto L13
            r0 = r6
            cofx r0 = (defpackage.cofx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cofx r0 = new cofx
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r6)
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.fctl.b(r6)
            goto L41
        L36:
            defpackage.fctl.b(r6)
            r0.c = r4
            java.lang.Object r6 = r5.k(r0)
            if (r6 == r1) goto L4d
        L41:
            r0.c = r3
            java.lang.Object r6 = r5.l(r0)
            if (r6 != r1) goto L4a
            goto L4d
        L4a:
            fctx r6 = defpackage.fctx.a
            return r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.j(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [cogh] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cofy
            if (r0 == 0) goto L13
            r0 = r12
            cofy r0 = (defpackage.cofy) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cofy r0 = new cofy
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2c
            goto L82
        L2c:
            r0 = move-exception
        L2d:
            r12 = r0
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            defpackage.fctl.b(r12)
            goto L6f
        L3b:
            defpackage.fctl.b(r12)
            fcsu r12 = r11.m
            java.lang.Object r12 = r12.b()
            aryn r12 = (defpackage.aryn) r12
            java.lang.String r12 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            fcsu r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            egxv r5 = (defpackage.egxv) r5
            android.net.Uri r6 = android.provider.Telephony.Mms.Inbox.CONTENT_URI
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            eopy r12 = r5.b(r6, r7, r8, r9, r10)
            fdjx r2 = r11.e
            fdkf r12 = defpackage.auus.b(r12, r2)
            r0.d = r4
            fdme r12 = (defpackage.fdme) r12
            java.lang.Object r12 = r12.hJ(r0)
            if (r12 == r1) goto L92
        L6f:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r2 = r12
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch: java.lang.Throwable -> L89
            r2.getClass()     // Catch: java.lang.Throwable -> L89
            r0.a = r12     // Catch: java.lang.Throwable -> L89
            r0.d = r3     // Catch: java.lang.Throwable -> L89
            java.lang.Object r0 = r11.d(r2, r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == r1) goto L92
            r1 = r12
        L82:
            r12 = 0
            defpackage.fczl.a(r1, r12)
            fctx r12 = defpackage.fctx.a
            return r12
        L89:
            r0 = move-exception
            r1 = r12
            goto L2d
        L8c:
            throw r12     // Catch: java.lang.Throwable -> L8d
        L8d:
            r0 = move-exception
            defpackage.fczl.a(r1, r12)
            throw r0
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.k(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [cogh] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cogb
            if (r0 == 0) goto L13
            r0 = r12
            cogb r0 = (defpackage.cogb) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cogb r0 = new cogb
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2c
            goto L7a
        L2c:
            r0 = move-exception
        L2d:
            r12 = r0
            goto L84
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            defpackage.fctl.b(r12)
            goto L67
        L3b:
            defpackage.fctl.b(r12)
            fcsu r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            egxv r5 = (defpackage.egxv) r5
            android.net.Uri r6 = android.provider.Telephony.Mms.Sent.CONTENT_URI
            java.lang.String r12 = "_id"
            java.lang.String[] r7 = new java.lang.String[]{r12}
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            eopy r12 = r5.b(r6, r7, r8, r9, r10)
            fdjx r2 = r11.e
            fdkf r12 = defpackage.auus.b(r12, r2)
            r0.d = r4
            fdme r12 = (defpackage.fdme) r12
            java.lang.Object r12 = r12.hJ(r0)
            if (r12 == r1) goto L8a
        L67:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r2 = r12
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch: java.lang.Throwable -> L81
            r2.getClass()     // Catch: java.lang.Throwable -> L81
            r0.a = r12     // Catch: java.lang.Throwable -> L81
            r0.d = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r11.e(r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r0 == r1) goto L8a
            r1 = r12
        L7a:
            r12 = 0
            defpackage.fczl.a(r1, r12)
            fctx r12 = defpackage.fctx.a
            return r12
        L81:
            r0 = move-exception
            r1 = r12
            goto L2d
        L84:
            throw r12     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            defpackage.fczl.a(r1, r12)
            throw r0
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.l(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [cogh] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.coge
            if (r0 == 0) goto L13
            r0 = r12
            coge r0 = (defpackage.coge) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            coge r0 = new coge
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.a
            defpackage.fctl.b(r12)     // Catch: java.lang.Throwable -> L2c
            goto L7c
        L2c:
            r0 = move-exception
        L2d:
            r12 = r0
            goto L86
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            defpackage.fctl.b(r12)
            goto L69
        L3b:
            defpackage.fctl.b(r12)
            fcsu r12 = r11.d
            java.lang.Object r12 = r12.b()
            r5 = r12
            egxv r5 = (defpackage.egxv) r5
            android.net.Uri r6 = android.provider.Telephony.Sms.CONTENT_URI
            java.lang.String r12 = "_id"
            java.lang.String r2 = "address"
            java.lang.String[] r7 = new java.lang.String[]{r12, r2}
            r9 = 0
            r10 = 0
            java.lang.String r8 = "thread_id == 0"
            eopy r12 = r5.b(r6, r7, r8, r9, r10)
            fdjx r2 = r11.e
            fdkf r12 = defpackage.auus.b(r12, r2)
            r0.d = r4
            fdme r12 = (defpackage.fdme) r12
            java.lang.Object r12 = r12.hJ(r0)
            if (r12 == r1) goto L8c
        L69:
            java.io.Closeable r12 = (java.io.Closeable) r12
            r2 = r12
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch: java.lang.Throwable -> L83
            r2.getClass()     // Catch: java.lang.Throwable -> L83
            r0.a = r12     // Catch: java.lang.Throwable -> L83
            r0.d = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r11.f(r2, r0)     // Catch: java.lang.Throwable -> L83
            if (r0 == r1) goto L8c
            r1 = r12
        L7c:
            r12 = 0
            defpackage.fczl.a(r1, r12)
            fctx r12 = defpackage.fctx.a
            return r12
        L83:
            r0 = move-exception
            r1 = r12
            goto L2d
        L86:
            throw r12     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            defpackage.fczl.a(r1, r12)
            throw r0
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cogh.m(fcxy):java.lang.Object");
    }

    public final void n() {
        if (((cnmc) this.i.b()).a()) {
            return;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleTelephony");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater", "checkTelephonyPermissions", 359, "TelephonyDatabaseUpdater.kt")).q("Insufficient permissions to update Telephony. Skipping update job.");
        throw new coer();
    }

    @Override // defpackage.cogi
    public final void o() {
        n();
        auvw.k(this.e, null, null, new cogg(this, null), 3);
    }
}
