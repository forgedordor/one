package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvph implements cvpb {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2DataServiceImpl");
    public final ConversationId b;
    public final fdpl c;
    public final fdpl d;
    public final fcsu e;
    private final ajmh f;
    private final cssx g;
    private final fcsu h;
    private final fcsu i;
    private final Integer j;

    public cvph(ConversationId conversationId, fdpl fdplVar, fdpl fdplVar2, ajmh ajmhVar, fcsu fcsuVar, cssx cssxVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        conversationId.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        ajmhVar.getClass();
        fcsuVar.getClass();
        cssxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = conversationId;
        this.c = fdplVar;
        this.d = fdplVar2;
        this.f = ajmhVar;
        this.e = fcsuVar;
        this.g = cssxVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.j = (Integer) cvow.a.e();
    }

    public static final boolean e(ResolvedRecipient resolvedRecipient) {
        return (resolvedRecipient == null || resolvedRecipient.g().C()) ? false : true;
    }

    private final boolean f(ResolvedRecipient resolvedRecipient) throws IOException {
        eieu eieuVarA = eiiy.a("AddContactBanner2DataServiceImpl#isRecipientVerifiableBusiness");
        try {
            boolean z = false;
            if (this.g.b()) {
                if (resolvedRecipient.I().a()) {
                    z = true;
                }
            }
            fczl.a(eieuVarA, null);
            return z;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cvpc
            if (r0 == 0) goto L13
            r0 = r7
            cvpc r0 = (defpackage.cvpc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpc r0 = new cvpc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5b
        L29:
            r7 = move-exception
            goto L8e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.fctl.b(r7)
            java.lang.String r7 = "AddContactBanner2DataServiceImpl#anyLatestMessageIsOtp"
            eieu r7 = defpackage.eiiy.a(r7)
            ajmh r2 = r6.f     // Catch: java.lang.Throwable -> L8a
            java.lang.Integer r4 = r6.j     // Catch: java.lang.Throwable -> L8a
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L8a
            int r4 = r4 * 10
            int r4 = java.lang.Math.max(r4, r3)     // Catch: java.lang.Throwable -> L8a
            eiju r2 = r2.O(r4)     // Catch: java.lang.Throwable -> L8a
            r0.d = r7     // Catch: java.lang.Throwable -> L8a
            r0.c = r3     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)     // Catch: java.lang.Throwable -> L8a
            if (r0 == r1) goto L89
            r5 = r0
            r0 = r7
            r7 = r5
        L5b:
            ekgb r7 = (defpackage.ekgb) r7     // Catch: java.lang.Throwable -> L29
            r7.getClass()     // Catch: java.lang.Throwable -> L29
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            if (r1 == 0) goto L69
        L67:
            r3 = r2
            goto L80
        L69:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L29
        L6d:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L67
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L29
            ajlt r1 = (defpackage.ajlt) r1     // Catch: java.lang.Throwable -> L29
            int r1 = r1.D()     // Catch: java.lang.Throwable -> L29
            r4 = 2
            if (r1 != r4) goto L6d
        L80:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            r1 = 0
            defpackage.fczl.a(r0, r1)
            return r7
        L89:
            return r1
        L8a:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r1 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvph.a(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [cvph] */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ekgb r12, defpackage.ajlk r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvph.b(ekgb, ajlk, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: all -> 0x0029, TryCatch #1 {all -> 0x0029, blocks: (B:12:0x0025, B:22:0x0050, B:23:0x0059, B:25:0x0061, B:30:0x0076, B:33:0x007e), top: B:45:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cvpf
            if (r0 == 0) goto L13
            r0 = r8
            cvpf r0 = (defpackage.cvpf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpf r0 = new cvpf
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            eieu r0 = r0.d
            defpackage.fctl.b(r8)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r8 = move-exception
            goto L8b
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            defpackage.fctl.b(r8)
            java.lang.String r8 = "AddContactBanner2DataServiceImpl#isEarliestNonSystemMessageIncoming"
            eieu r8 = defpackage.eiiy.a(r8)
            ajmh r2 = r7.f     // Catch: java.lang.Throwable -> L87
            r4 = 5
            eiju r2 = r2.N(r4)     // Catch: java.lang.Throwable -> L87
            r0.d = r8     // Catch: java.lang.Throwable -> L87
            r0.c = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r0 == r1) goto L86
            r6 = r0
            r0 = r8
            r8 = r6
        L50:
            ekgb r8 = (defpackage.ekgb) r8     // Catch: java.lang.Throwable -> L29
            ekqh r8 = r8.iterator()     // Catch: java.lang.Throwable -> L29
            r8.getClass()     // Catch: java.lang.Throwable -> L29
        L59:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r4 = 0
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L29
            ajlt r1 = (defpackage.ajlt) r1     // Catch: java.lang.Throwable -> L29
            ajmc r1 = r1.d()     // Catch: java.lang.Throwable -> L29
            int r1 = r1.d()     // Catch: java.lang.Throwable -> L29
            r5 = 3
            if (r1 == r5) goto L59
            if (r1 != r3) goto L75
            goto L76
        L75:
            r3 = r4
        L76:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            defpackage.fczl.a(r0, r2)
            return r8
        L7e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L29
            defpackage.fczl.a(r0, r2)
            return r8
        L86:
            return r1
        L87:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L8c
        L8c:
            r1 = move-exception
            defpackage.fczl.a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvph.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cvpg
            if (r0 == 0) goto L13
            r0 = r7
            cvpg r0 = (defpackage.cvpg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpg r0 = new cvpg
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            eieu r0 = r0.d
            defpackage.fctl.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L5b
        L29:
            r7 = move-exception
            goto Lc1
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            defpackage.fctl.b(r7)
            java.lang.String r7 = "AddContactBanner2DataServiceImpl#isNotDismissed"
            eieu r7 = defpackage.eiiy.a(r7)
            fcsu r2 = r6.e     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> Lbd
            cvpi r2 = (defpackage.cvpi) r2     // Catch: java.lang.Throwable -> Lbd
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r6.b     // Catch: java.lang.Throwable -> Lbd
            eiju r2 = r2.a(r4)     // Catch: java.lang.Throwable -> Lbd
            r2.getClass()     // Catch: java.lang.Throwable -> Lbd
            r0.d = r7     // Catch: java.lang.Throwable -> Lbd
            r0.c = r3     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = defpackage.fdxs.c(r2, r0)     // Catch: java.lang.Throwable -> Lbd
            if (r0 == r1) goto Lbc
            r5 = r0
            r0 = r7
            r7 = r5
        L5b:
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L29
            java.lang.Integer r1 = r6.j     // Catch: java.lang.Throwable -> L29
            int r2 = r1.intValue()     // Catch: java.lang.Throwable -> L29
            int r2 = r2 + r3
            if (r7 != 0) goto L67
            goto La7
        L67:
            int r4 = r7.intValue()     // Catch: java.lang.Throwable -> L29
            if (r4 != r2) goto La7
            cczv r2 = defpackage.cvow.b     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto La7
            ejxr r2 = defpackage.cvox.a     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L29
            cczi r2 = (defpackage.cczi) r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L29
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L29
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L29
            r4 = 3
            if (r2 == 0) goto L9c
            fcsu r2 = r6.h     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L29
            cvox r2 = (defpackage.cvox) r2     // Catch: java.lang.Throwable -> L29
            r2.a(r4)     // Catch: java.lang.Throwable -> L29
            goto La7
        L9c:
            fcsu r2 = r6.i     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.b()     // Catch: java.lang.Throwable -> L29
            ajhd r2 = (defpackage.ajhd) r2     // Catch: java.lang.Throwable -> L29
            r2.ae(r4)     // Catch: java.lang.Throwable -> L29
        La7:
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L29
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L29
            if (r7 > r1) goto Lb2
            goto Lb3
        Lb2:
            r3 = 0
        Lb3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L29
            r1 = 0
            defpackage.fczl.a(r0, r1)
            return r7
        Lbc:
            return r1
        Lbd:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        Lc1:
            throw r7     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r1 = move-exception
            defpackage.fczl.a(r0, r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvph.d(fcxy):java.lang.Object");
    }
}
