package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctwn implements ctwi {
    public static final cqce a = cqce.g("BugleContacts", "AddPeopleToGroupHandlerImpl");
    public final afzc b;
    public final cisv c;
    public final fcsu d;
    public final fcsu e;
    private final Context f;
    private final fcyh g;
    private final ctvb h;
    private final cubp i;

    public ctwn(Context context, fcyh fcyhVar, cubp cubpVar, ctvb ctvbVar, afzc afzcVar, cisv cisvVar, fcsu fcsuVar, fcsu fcsuVar2) {
        context.getClass();
        fcyhVar.getClass();
        cubpVar.getClass();
        ctvbVar.getClass();
        afzcVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.f = context;
        this.g = fcyhVar;
        this.i = cubpVar;
        this.h = ctvbVar;
        this.b = afzcVar;
        this.c = cisvVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
    }

    @Override // defpackage.ctwi
    public final Object a(fdae fdaeVar, ConversationId conversationId, cudx cudxVar, fcxy fcxyVar) {
        if (!cudxVar.d.c()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list = cudxVar.e;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Object objA = fdin.a(eicg.a(this.g), new ctwj(null, this, list, cudxVar, conversationId, fdaeVar), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r5, defpackage.fcxy r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ctwm
            if (r0 == 0) goto L13
            r0 = r6
            ctwm r0 = (defpackage.ctwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ctwm r0 = new ctwm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r6)
            ctvb r6 = r4.h
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto L66
        L3c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r5 = r6 instanceof java.util.Collection
            if (r5 == 0) goto L4c
            r5 = r6
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L4c
            goto L61
        L4c:
            java.util.Iterator r5 = r6.iterator()
        L50:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L61
            java.lang.Object r6 = r5.next()
            ctva r6 = (defpackage.ctva) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L50
            r3 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctwn.b(java.util.List, fcxy):java.lang.Object");
    }

    public final void c(String str) {
        String string = str != null ? this.f.getString(R.string.user_inviting_failed, str) : this.f.getString(R.string.user_inviting_failed_plural);
        string.getClass();
        this.i.a(string);
    }
}
