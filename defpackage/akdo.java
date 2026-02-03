package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akdo {
    public static final akdo a = new akdo();

    private akdo() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008c -> B:24:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.api.messaging.Conversation r7, defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.akdn
            if (r0 == 0) goto L13
            r0 = r8
            akdn r0 = (defpackage.akdn) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            akdn r0 = new akdn
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.c
            java.lang.Object r2 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r8)
            goto L8d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            defpackage.fctl.b(r8)
            goto L52
        L3c:
            defpackage.fctl.b(r8)
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r7 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r7
            anpj r7 = r7.d
            eiju r7 = r7.b()
            r7.getClass()
            r0.f = r4
            java.lang.Object r8 = defpackage.fdxs.c(r7, r0)
            if (r8 == r1) goto Lbb
        L52:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.fcva.p(r8, r2)
            r7.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
        L67:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L94
            java.lang.Object r8 = r2.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r8
            anpj r8 = r8.E(r3)
            eiju r8 = r8.b()
            r8.getClass()
            r0.a = r7
            r0.b = r2
            r0.c = r7
            r0.f = r3
            java.lang.Object r8 = defpackage.fdxs.c(r8, r0)
            if (r8 == r1) goto Lbb
            r5 = r7
        L8d:
            anyy r8 = (defpackage.anyy) r8
            r7.add(r8)
            r7 = r5
            goto L67
        L94:
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L9f
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L9f
            goto Lb6
        L9f:
            java.util.Iterator r7 = r7.iterator()
        La3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb6
            java.lang.Object r8 = r7.next()
            anyy r8 = (defpackage.anyy) r8
            boolean r8 = r8.b()
            if (r8 != 0) goto La3
            r4 = 0
        Lb6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akdo.a(com.google.android.apps.messaging.shared.api.messaging.Conversation, fcxy):java.lang.Object");
    }
}
