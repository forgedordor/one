package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbz implements afyw {
    private final Activity a;
    private final fcsu b;
    private final fcsu c;

    public agbz(Activity activity, fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = activity;
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws Throwable {
        Object objB = b((agbx) afzvVar, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.agbx r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.agby
            if (r0 == 0) goto L13
            r0 = r12
            agby r0 = (defpackage.agby) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            agby r0 = new agby
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = r0.a
            agbx r0 = r0.f
            defpackage.fctl.b(r12)
            goto La2
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = r0.a
            agbx r0 = r0.f
            defpackage.fctl.b(r12)
            goto L70
        L43:
            defpackage.fctl.b(r12)
            boolean r12 = r11.d
            if (r12 == 0) goto L7c
            fcsu r12 = r10.b
            java.lang.Object r12 = r12.b()
            avmp r12 = (defpackage.avmp) r12
            android.app.Activity r2 = r10.a
            fcsu r3 = r10.c
            java.lang.Object r3 = r3.b()
            agbe r3 = (defpackage.agbe) r3
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r11.a
            r0.f = r11
            r0.a = r12
            r0.b = r2
            r0.e = r4
            java.lang.Object r0 = r3.a(r5, r0)
            if (r0 == r1) goto Lbb
            r1 = r12
            r12 = r0
            r0 = r11
            r11 = r2
        L70:
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r12 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r12
            android.content.Context r11 = (android.content.Context) r11
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = r0.b
            java.lang.String r0 = r0.c
            r1.u(r11, r12, r2, r0)
            goto Lb8
        L7c:
            fcsu r12 = r10.b
            java.lang.Object r12 = r12.b()
            avmp r12 = (defpackage.avmp) r12
            android.app.Activity r2 = r10.a
            fcsu r4 = r10.c
            java.lang.Object r4 = r4.b()
            agbe r4 = (defpackage.agbe) r4
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = r11.a
            r0.f = r11
            r0.a = r12
            r0.b = r2
            r0.e = r3
            java.lang.Object r0 = r4.a(r5, r0)
            if (r0 == r1) goto Lbb
            r1 = r12
            r12 = r0
            r0 = r11
            r11 = r2
        La2:
            r3 = r12
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = (com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId) r3
            batr r6 = new batr
            r12 = 0
            r6.<init>(r12)
            r2 = r11
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r9 = r0.c
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r4 = r0.b
            r7 = 0
            r8 = 0
            r5 = 0
            r1.w(r2, r3, r4, r5, r6, r7, r8, r9)
        Lb8:
            fctx r11 = defpackage.fctx.a
            return r11
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbz.b(agbx, fcxy):java.lang.Object");
    }
}
