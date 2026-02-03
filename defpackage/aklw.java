package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aklw implements cdfg {
    public final Conversation a;
    private final fdjx b;
    private final fcsu c;
    private final fcsu d;

    public aklw(Conversation conversation, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        this.a = conversation;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aklr
            if (r0 == 0) goto L13
            r0 = r5
            aklr r0 = (defpackage.aklr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aklr r0 = new aklr
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cdew r1 = r0.e
            cdew r0 = r0.d
            defpackage.fctl.b(r5)
            goto L5c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.fctl.b(r5)
            cdew r5 = new cdew
            r5.<init>()
            java.lang.String r2 = "conversation_type"
            r5.b(r2)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r2 = r4.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r2 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r2
            anpj r2 = r2.f
            eiju r2 = r2.b()
            r2.getClass()
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)
            if (r0 == r1) goto L6e
            r1 = r5
            r5 = r0
            r0 = r1
        L5c:
            ajts r5 = (defpackage.ajts) r5
            int r5 = r5.A()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r1.c(r5)
            cdff r5 = r0.a()
            return r5
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.a(fcxy):java.lang.Object");
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju b() {
        return cdfd.b();
    }

    @Override // defpackage.cdfg
    public final /* synthetic */ eiju c() {
        return cdfd.c();
    }

    @Override // defpackage.cdfg
    public final eiju d() {
        return auvw.c(this.b, fcyi.a, fdjz.a, new aklv(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (r8 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c2 -> B:34:0x00c4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.akls
            if (r0 == 0) goto L13
            r0 = r8
            akls r0 = (defpackage.akls) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            akls r0 = new akls
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r2 = r0.a
            defpackage.fctl.b(r8)
            goto Lc4
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            goto L51
        L39:
            defpackage.fctl.b(r8)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r8 = r7.a
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r8 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r8
            anpj r8 = r8.d
            eiju r8 = r8.b()
            r8.getClass()
            r0.d = r4
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto Le3
        L51:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.fcva.p(r8, r5)
            r2.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L65:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r8.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            alqm r5 = r5.g()
            j$.util.Optional r5 = r5.e()
            r2.add(r5)
            goto L65
        L7d:
            fdev r8 = defpackage.fcva.ax(r2)
            aklq r5 = new aklq
            r5.<init>()
            fdfs r6 = new fdfs
            r6.<init>(r8, r5)
            java.util.List r8 = defpackage.fdey.g(r6)
            int r5 = r8.size()
            int r2 = r2.size()
            if (r5 >= r2) goto L9c
            cdgn r8 = defpackage.cdgn.c
            return r8
        L9c:
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto La3
            goto Lce
        La3:
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
        La8:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto Lce
            java.lang.Object r8 = r2.next()
            j$.util.Optional r8 = (j$.util.Optional) r8
            java.lang.Object r8 = r8.get()
            aubq r8 = (defpackage.aubq) r8
            r0.a = r2
            r0.d = r3
            java.lang.Object r8 = r7.g(r8, r0)
            if (r8 == r1) goto Le3
        Lc4:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La8
            r8 = 0
            goto Lcf
        Lce:
            r8 = r4
        Lcf:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r8 = defpackage.fdbq.f(r8, r0)
            if (r8 == 0) goto Le0
            cdgn r8 = defpackage.cdgn.a
            return r8
        Le0:
            cdgn r8 = defpackage.cdgn.b
            return r8
        Le3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.e(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fcxy r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.aklt
            if (r0 == 0) goto L13
            r0 = r6
            aklt r0 = (defpackage.aklt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aklt r0 = new aklt
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cdew r0 = r0.d
            defpackage.fctl.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            defpackage.fctl.b(r6)
            cdew r6 = new cdew
            r6.<init>()
            java.lang.String r2 = "everyone_gm"
            r6.b(r2)
            r0.d = r6
            r0.c = r3
            java.lang.Object r0 = r5.e(r0)
            if (r0 == r1) goto L59
            r4 = r0
            r0 = r6
            r6 = r4
        L4b:
            cdgn r6 = (defpackage.cdgn) r6
            java.lang.String r6 = r6.name()
            r0.c(r6)
            cdff r6 = r0.a()
            return r6
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.f(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aubq r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.aklu
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r7
            aklu r0 = (defpackage.aklu) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            aklu r0 = new aklu
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r2 = defpackage.fcyl.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L2f
            if (r3 != r4) goto L27
            defpackage.fctl.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fctl.b(r7)
            fcsu r7 = r5.d
            java.lang.Object r7 = r7.b()
            asxy r7 = (defpackage.asxy) r7
            eiju r6 = r7.b(r6)
            r0.c = r4
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r2) goto L7b
        L46:
            asts r7 = (defpackage.asts) r7
            asva r6 = r7.a()
            awhp r6 = defpackage.awhq.b(r6)
            fcsu r7 = r5.c
            java.lang.Object r7 = r7.b()
            cirj r7 = (defpackage.cirj) r7
            java.lang.String r7 = "1"
            int r7 = java.lang.Integer.parseInt(r7)
            java.lang.String r0 = "mms-group-upgrade"
            java.lang.String r6 = r6.a(r0)
            if (r6 != 0) goto L68
            java.lang.String r6 = "0"
        L68:
            java.lang.Integer r6 = defpackage.fdgn.g(r6)
            if (r6 == 0) goto L72
            int r1 = r6.intValue()
        L72:
            if (r1 < r7) goto L75
            goto L76
        L75:
            r4 = 0
        L76:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aklw.g(aubq, fcxy):java.lang.Object");
    }
}
