package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agvz implements agva {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/penpal/conversation/reauthenticate/PenpalReauthenticateHandlerImpl");
    public static final Bundle b;
    public final Context c;
    public final fdjx d;
    public final ConversationId e;
    public final ains f;
    public final yir g;
    public final afzc h;
    public final fcsu i;
    public final eigp j;
    public final ahax k;
    public final fcsu l;
    public final fcsu m;
    public final fdvc n;
    private final fcyh o;
    private final addt p;

    static {
        Bundle bundle = new Bundle();
        bundle.putBoolean("handle_notification", true);
        b = bundle;
    }

    public agvz(Context context, fdjx fdjxVar, fcyh fcyhVar, ConversationId conversationId, ains ainsVar, yir yirVar, addt addtVar, afzc afzcVar, Optional optional, fcsu fcsuVar, eigp eigpVar, ahax ahaxVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdvc fdvcVarJ;
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        conversationId.getClass();
        ainsVar.getClass();
        yirVar.getClass();
        addtVar.getClass();
        afzcVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        eigpVar.getClass();
        ahaxVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.o = fcyhVar;
        this.e = conversationId;
        this.f = ainsVar;
        this.g = yirVar;
        this.p = addtVar;
        this.h = afzcVar;
        this.i = fcsuVar;
        this.j = eigpVar;
        this.k = ahaxVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        if (optional.isEmpty()) {
            fdvcVarJ = fdvf.a(false);
        } else {
            cgte cgteVar = (cgte) optional.get();
            Object objB = fcsuVar.b();
            objB.getClass();
            fdvcVarJ = cgteVar.j((efwo) objB);
        }
        this.n = fdvcVarJ;
    }

    @Override // defpackage.agva
    public final void a() {
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            auvw.k(this.d, null, null, new agvy(this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agvz.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r6, boolean r7, boolean r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.agvp
            if (r0 == 0) goto L13
            r0 = r9
            agvp r0 = (defpackage.agvp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            agvp r0 = new agvp
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fctl.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.fctl.b(r9)
            goto L4a
        L36:
            defpackage.fctl.b(r9)
            if (r6 == 0) goto L5d
            if (r7 == 0) goto L5d
            if (r8 == 0) goto L5d
            addt r6 = r5.p
            r0.c = r4
            java.lang.Object r9 = r6.c(r0)
            if (r9 != r1) goto L4a
            goto L5b
        L4a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            if (r6 != 0) goto L53
            goto L5d
        L53:
            r0.c = r3
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r6
        L5d:
            agve r6 = defpackage.agve.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agvz.c(boolean, boolean, boolean, fcxy):java.lang.Object");
    }
}
