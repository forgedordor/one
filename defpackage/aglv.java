package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aglv implements aglb {
    private static final eksp a = eksp.c("BugleNudge");
    private final agla b;
    private final aglr c;
    private final cogw d;
    private final tfh e;
    private final fcsu f;
    private final cohc g;

    public aglv(agla aglaVar, aglr aglrVar, cogw cogwVar, cohc cohcVar, tfh tfhVar, fcsu fcsuVar) {
        aglrVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        this.b = aglaVar;
        this.c = aglrVar;
        this.d = cogwVar;
        this.g = cohcVar;
        this.e = tfhVar;
        this.f = fcsuVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
    
        if (r12 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        if (b(r0) == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fc -> B:36:0x00ff). Please report as a decompilation issue!!! */
    @Override // defpackage.aglb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglv.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (defpackage.fctx.a == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.agls
            if (r0 == 0) goto L13
            r0 = r8
            agls r0 = (defpackage.agls) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agls r0 = new agls
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.fctl.b(r8)
            goto Lca
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.fctl.b(r8)
            goto L66
        L37:
            defpackage.fctl.b(r8)
            ejxr r8 = defpackage.tet.k
            java.lang.Object r8 = r8.get()
            cczi r8 = (defpackage.cczi) r8
            java.lang.Object r8 = r8.e()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lca
            agla r8 = r7.b
            r0.c = r4
            agmd r8 = (defpackage.agmd) r8
            fcyh r2 = r8.b
            fcyh r2 = defpackage.eicg.a(r2)
            agly r5 = new agly
            r6 = 0
            r5.<init>(r6, r8)
            java.lang.Object r8 = defpackage.fdin.a(r2, r5, r0)
            if (r8 == r1) goto Lc9
        L66:
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto Lca
            tfh r2 = r7.e
            int r8 = r8.intValue()
            r0.c = r3
            ellh r0 = defpackage.ellh.a
            evsf r0 = r0.createBuilder()
            ellg r0 = (defpackage.ellg) r0
            ellf r3 = defpackage.ellf.BUGLE_CONTACTS_BIRTHDAY_COVERAGE_INFO
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r0.instance
            ellh r5 = (defpackage.ellh) r5
            int r3 = r3.f11do
            r5.j = r3
            int r3 = r5.b
            r3 = r3 | r4
            r5.b = r3
            emri r3 = defpackage.emri.a
            evsf r3 = r3.createBuilder()
            emrh r3 = (defpackage.emrh) r3
            r3.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r5 = r3.instance
            emri r5 = (defpackage.emri) r5
            int r6 = r5.b
            r4 = r4 | r6
            r5.b = r4
            r5.c = r8
            r0.copyOnWrite()
            MessageType extends evsn<MessageType, BuilderType> r8 = r0.instance
            ellh r8 = (defpackage.ellh) r8
            evsn r3 = r3.build()
            emri r3 = (defpackage.emri) r3
            r3.getClass()
            r8.bd = r3
            int r3 = r8.f
            r3 = r3 | 64
            r8.f = r3
            fcsu r8 = r2.a
            java.lang.Object r8 = r8.b()
            aill r8 = (defpackage.aill) r8
            r8.j(r0)
            fctx r8 = defpackage.fctx.a
            if (r8 != r1) goto Lca
        Lc9:
            return r1
        Lca:
            fctx r8 = defpackage.fctx.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglv.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.Map r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aglt
            if (r0 == 0) goto L13
            r0 = r7
            aglt r0 = (defpackage.aglt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            aglt r0 = new aglt
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L38
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r6 = r0.a
            defpackage.fctl.b(r7)
            goto L4b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.fctl.b(r7)
            goto L45
        L38:
            defpackage.fctl.b(r7)
            aglr r7 = r5.c
            r0.d = r3
            java.lang.Object r7 = r7.b(r6, r0)
            if (r7 == r1) goto L70
        L45:
            ekhx r7 = (defpackage.ekhx) r7
            java.util.Iterator r6 = r7.iterator()
        L4b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6d
            java.lang.Object r7 = r6.next()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = (com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType) r7
            tfh r2 = r5.e
            r7.getClass()
            r0.a = r6
            r0.d = r4
            aukf r3 = defpackage.aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY
            java.lang.Object r7 = r2.c(r7, r4, r3, r0)
            if (r7 == r1) goto L6a
            fctx r7 = defpackage.fctx.a
        L6a:
            if (r7 != r1) goto L4b
            goto L70
        L6d:
            fctx r6 = defpackage.fctx.a
            return r6
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aglv.c(java.util.Map, fcxy):java.lang.Object");
    }
}
