package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkk implements vdy {
    public final Context a;
    public final ajln b;
    public final ahax c;
    public final cssw d;
    public final cqdn e;
    public final fcsu f;
    public final dalj g;
    public final eigp h;
    public final afzc i;
    public final arpr j;
    public final fcsu k;
    public final fdpl l;
    private final fdjx m;
    private final Set n;

    public vkk(Context context, fdjx fdjxVar, ajln ajlnVar, ahax ahaxVar, cssw csswVar, cqdn cqdnVar, fcsu fcsuVar, dalj daljVar, eigp eigpVar, afzc afzcVar, arpr arprVar, fcsu fcsuVar2, fdpl fdplVar) {
        context.getClass();
        fdjxVar.getClass();
        ajlnVar.getClass();
        ahaxVar.getClass();
        csswVar.getClass();
        cqdnVar.getClass();
        fcsuVar.getClass();
        daljVar.getClass();
        eigpVar.getClass();
        afzcVar.getClass();
        arprVar.getClass();
        fdplVar.getClass();
        this.a = context;
        this.m = fdjxVar;
        this.b = ajlnVar;
        this.c = ahaxVar;
        this.d = csswVar;
        this.e = cqdnVar;
        this.f = fcsuVar;
        this.g = daljVar;
        this.h = eigpVar;
        this.i = afzcVar;
        this.j = arprVar;
        this.k = fcsuVar2;
        this.l = new vkj(fdplVar, this);
        this.n = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.n;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.l;
    }

    public final Object c(ajlk ajlkVar, fcxy fcxyVar) {
        if (ajlkVar.c() == ajlj.GROUP && (ajlkVar instanceof ajts)) {
            ajts ajtsVar = (ajts) ajlkVar;
            if (bvdi.d(ajtsVar.A()) && ajtsVar.B() != 2) {
                return d(ajlkVar, fcxyVar);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ajlk r6, defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.vkf
            if (r0 == 0) goto L13
            r0 = r7
            vkf r0 = (defpackage.vkf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vkf r0 = new vkf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            defpackage.fctl.b(r7)
            goto L4d
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            defpackage.fctl.b(r7)
            aoer r6 = r6.h()
            if (r6 == 0) goto L57
            anpj r6 = r6.f()
            if (r6 == 0) goto L57
            eiju r6 = r6.b()
            if (r6 == 0) goto L57
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r6, r0)
            if (r7 == r1) goto L56
        L4d:
            aoio r7 = (defpackage.aoio) r7
            if (r7 == 0) goto L57
            boolean r4 = r7.a()
            goto L57
        L56:
            return r1
        L57:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkk.d(ajlk, fcxy):java.lang.Object");
    }

    public final void e(ConversationId conversationId) {
        auvw.k(this.m, null, null, new vkg(this, conversationId, null), 3);
    }
}
