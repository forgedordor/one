package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vod implements vdy {
    public final Context a;
    public final fdjx b;
    public final Conversation c;
    public final ConversationId d;
    public final fcsu e;
    public final fcsu f;
    public final ahax g;
    public final fcsu h;
    private final fdpl i;
    private final fcsu j;
    private final fdvc k;

    public vod(Context context, fdjx fdjxVar, fdpl fdplVar, Conversation conversation, ConversationId conversationId, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, ahax ahaxVar, fcsu fcsuVar4) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        conversation.getClass();
        conversationId.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        ahaxVar.getClass();
        fcsuVar4.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.i = fdplVar;
        this.c = conversation;
        this.d = conversationId;
        this.e = fcsuVar;
        this.j = fcsuVar2;
        this.f = fcsuVar3;
        this.g = ahaxVar;
        this.h = fcsuVar4;
        this.k = fdtg.b(new voc(fdplVar, this), fdjxVar, fdur.a(0L, 3), true);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return new fdua(this.i, this.k, new vnx(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.vny
            if (r0 == 0) goto L13
            r0 = r6
            vny r0 = (defpackage.vny) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vny r0 = new vny
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.fctl.b(r6)
            goto L61
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            defpackage.fctl.b(r6)
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r5.c
            ajmh r2 = r6.c()
            boolean r2 = r2 instanceof defpackage.alza
            if (r2 == 0) goto L6c
            ajmh r6 = r6.c()
            r6.getClass()
            alza r6 = (defpackage.alza) r6
            cczi r2 = defpackage.crvx.j
            java.lang.Object r2 = r2.e()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            eiju r6 = r6.Z(r2)
            r0.c = r4
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L6b
        L61:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6c
            r3 = r4
            goto L6c
        L6b:
            return r1
        L6c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vod.c(fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ekgb r5, defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vnz
            if (r0 == 0) goto L13
            r0 = r6
            vnz r0 = (defpackage.vnz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vnz r0 = new vnz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.fctl.b(r6)
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.fctl.b(r6)
            java.lang.Object r5 = defpackage.fcva.Y(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 != 0) goto L41
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L41:
            fcsu r6 = r4.j
            java.lang.Object r6 = r6.b()
            crwr r6 = (defpackage.crwr) r6
            anue r2 = r5.F()
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r6.e(r2, r0)
            if (r6 == r1) goto L7b
        L57:
            crwh r6 = (defpackage.crwh) r6
            if (r6 != 0) goto L60
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L60:
            crwi r6 = r6.c
            int r6 = r6.ordinal()
            r0 = 3
            r1 = 0
            if (r6 == r0) goto L70
            r5 = 4
            if (r6 == r5) goto L6e
            goto L76
        L6e:
            r3 = r1
            goto L76
        L70:
            boolean r5 = r5.D()
            if (r5 != 0) goto L6e
        L76:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vod.d(ekgb, fcxy):java.lang.Object");
    }
}
