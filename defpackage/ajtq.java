package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajtq implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationLocalIdentitiesSupplier");
    public static final ekrz b = new ekrz("local_self_identities", String.class, false, false);
    public final BugleConversationId c;
    private final fdjx d;
    private final anpj e;
    private final anpj f;
    private final anpj g;

    public ajtq(fdjx fdjxVar, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, BugleConversationId bugleConversationId) {
        fdjxVar.getClass();
        anpjVar.getClass();
        anpjVar2.getClass();
        anpjVar3.getClass();
        this.d = fdjxVar;
        this.e = anpjVar;
        this.f = anpjVar2;
        this.g = anpjVar3;
        this.c = bugleConversationId;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        return cqty.b(this.g.a(anpiVar), this.e.a(anpiVar));
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.d, fcyi.a, fdjz.a, new ajtp(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new fcth("An operation is not implemented: Can't be implemented until BugleConversationPropertiesSupplier#getBlocking");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r7 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ajtn
            if (r0 == 0) goto L13
            r0 = r7
            ajtn r0 = (defpackage.ajtn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajtn r0 = new ajtn
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.fctl.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            defpackage.fctl.b(r7)
            goto L6f
        L39:
            defpackage.fctl.b(r7)
            goto L51
        L3d:
            defpackage.fctl.b(r7)
            anpj r7 = r6.f
            eiju r7 = r7.b()
            r7.getClass()
            r0.c = r5
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto L7d
        L51:
            ajts r7 = (defpackage.ajts) r7
            int r7 = r7.A()
            boolean r7 = defpackage.bvdi.d(r7)
            if (r7 != 0) goto L73
            anpj r7 = r6.g
            eiju r7 = r7.b()
            r7.getClass()
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 != r1) goto L6f
            goto L7d
        L6f:
            r7.getClass()
            return r7
        L73:
            r0.c = r3
            java.lang.Object r7 = r6.e(r0)
            if (r7 != r1) goto L7c
            goto L7d
        L7c:
            return r7
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtq.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r13 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        r13 = true;
        r7 = r7;
        r8 = r8;
        r9 = r9;
     */
    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:33:0x00c7, B:34:0x00c9], limit reached: 49 */
    /* JADX WARN: Path cross not found for [B:33:0x00c7, B:37:0x00d3], limit reached: 49 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009f -> B:33:0x00c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00bd -> B:31:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtq.e(fcxy):java.lang.Object");
    }
}
