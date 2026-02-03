package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxk extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctxr b;
    final /* synthetic */ alqm c;
    final /* synthetic */ aoer d;
    final /* synthetic */ fdau e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxk(fcxy fcxyVar, ctxr ctxrVar, alqm alqmVar, aoer aoerVar, fdau fdauVar) {
        super(2, fcxyVar);
        this.b = ctxrVar;
        this.c = alqmVar;
        this.d = aoerVar;
        this.e = fdauVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctxk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r10.f(r2, r3, r9) != r0) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x002a, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x001e, B:28:0x006c, B:31:0x0075, B:15:0x0026, B:23:0x0052, B:26:0x005c), top: B:49:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075 A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #3 {all -> 0x002a, blocks: (B:12:0x001e, B:28:0x006c, B:31:0x0075, B:15:0x0026, B:23:0x0052, B:26:0x005c), top: B:49:0x0008 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.a
            java.lang.String r2 = "ChatStarterImpl.kt"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1a
            java.lang.Object r0 = r9.f
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L17
            goto Lb8
        L17:
            r10 = move-exception
            goto Lc4
        L1a:
            java.lang.Object r1 = r9.f
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L6c
        L22:
            java.lang.Object r1 = r9.f
            java.io.Closeable r1 = (java.io.Closeable) r1
            defpackage.fctl.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r10 = move-exception
            r0 = r1
            goto Lc4
        L2e:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.f
            fdjx r10 = (defpackage.fdjx) r10
            java.lang.String r10 = "ChatStarterImpl.startChat"
            eieu r10 = defpackage.eiiy.h(r10)
            ctxr r1 = r9.b     // Catch: java.lang.Throwable -> Lc0
            ctxw r1 = r1.f     // Catch: java.lang.Throwable -> Lc0
            alqm r5 = r9.c     // Catch: java.lang.Throwable -> Lc0
            aoer r6 = r9.d     // Catch: java.lang.Throwable -> Lc0
            fdau r7 = r9.e     // Catch: java.lang.Throwable -> Lc0
            r9.f = r10     // Catch: java.lang.Throwable -> Lc0
            r9.a = r4     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r1 = r1.a(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Lc0
            if (r1 == r0) goto Lbf
            r8 = r1
            r1 = r10
            r10 = r8
        L52:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto L5c
        L5a:
            r0 = r1
            goto Lb8
        L5c:
            ctxr r10 = r9.b     // Catch: java.lang.Throwable -> L2a
            alqm r4 = r9.c     // Catch: java.lang.Throwable -> L2a
            aoer r5 = r9.d     // Catch: java.lang.Throwable -> L2a
            r9.f = r1     // Catch: java.lang.Throwable -> L2a
            r9.a = r3     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = r10.e(r4, r5, r9)     // Catch: java.lang.Throwable -> L2a
            if (r10 == r0) goto Lbf
        L6c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2a
            if (r10 == 0) goto L75
            goto Lb7
        L75:
            ekrg r10 = defpackage.ctxr.a     // Catch: java.lang.Throwable -> L2a
            ekrw r10 = r10.h()     // Catch: java.lang.Throwable -> L2a
            ekrz r3 = defpackage.eksq.a     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "BugleContacts"
            r10.X(r3, r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$startChatInternal$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r4 = "invokeSuspend"
            r5 = 125(0x7d, float:1.75E-43)
            ekrw r10 = r10.h(r3, r4, r5, r2)     // Catch: java.lang.Throwable -> L2a
            ekrd r10 = (defpackage.ekrd) r10     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "Starting 1-1 chat: %s"
            alqm r3 = r9.c     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = defpackage.cqcv.c(r3)     // Catch: java.lang.Throwable -> L2a
            r10.t(r2, r4)     // Catch: java.lang.Throwable -> L2a
            ctxr r10 = r9.b     // Catch: java.lang.Throwable -> L2a
            ctxu r2 = r10.m     // Catch: java.lang.Throwable -> L2a
            ctxe r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L2a
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r2 = r2.a     // Catch: java.lang.Throwable -> L2a
            ekgb r2 = defpackage.ekgb.r(r2)     // Catch: java.lang.Throwable -> L2a
            r2.getClass()     // Catch: java.lang.Throwable -> L2a
            aoer r3 = r9.d     // Catch: java.lang.Throwable -> L2a
            r9.f = r1     // Catch: java.lang.Throwable -> L2a
            r4 = 3
            r9.a = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r10 = r10.f(r2, r3, r9)     // Catch: java.lang.Throwable -> L2a
            if (r10 == r0) goto Lbf
        Lb7:
            goto L5a
        Lb8:
            r10 = 0
            defpackage.fczl.a(r0, r10)
            fctx r10 = defpackage.fctx.a
            return r10
        Lbf:
            return r0
        Lc0:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        Lc4:
            throw r10     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r1 = move-exception
            defpackage.fczl.a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctxk ctxkVar = new ctxk(fcxyVar, this.b, this.c, this.d, this.e);
        ctxkVar.f = obj;
        return ctxkVar;
    }
}
