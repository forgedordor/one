package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdz implements afyw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler");
    public final fcyh b;
    public final fcsu c;
    private final Context d;
    private final fdjx e;
    private final fcsu f;

    public agdz(Context context, fcyh fcyhVar, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcyhVar.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.d = context;
        this.b = fcyhVar;
        this.e = fdjxVar;
        this.f = fcsuVar;
        this.c = fcsuVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    @Override // defpackage.afyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object a(defpackage.afzv r9, defpackage.fcxy r10) {
        /*
            r8 = this;
            agdw r9 = (defpackage.agdw) r9
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r9.a
            java.lang.String r3 = r9.b
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r6 = r9.c
            bvdk r9 = r9.d
            java.lang.String r10 = r5.b()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r4 = defpackage.barn.b(r10)
            fcsu r10 = r8.c
            java.lang.Object r0 = r10.b()
            cqdn r0 = (defpackage.cqdn) r0
            java.lang.String r2 = r0.e(r4)
            boolean r0 = defpackage.craf.d
            if (r0 == 0) goto L4a
            boolean r9 = r9.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r0.getClass()
            java.lang.Object r10 = r10.b()
            cqdn r10 = (defpackage.cqdn) r10
            boolean r10 = r10.i(r2)
            if (r10 != 0) goto L4a
            if (r9 != 0) goto L4a
            fdjx r9 = r8.e
            agdy r0 = new agdy
            r7 = 0
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10 = 3
            r2 = 0
            defpackage.auvw.k(r9, r2, r2, r0, r10)
            goto L6e
        L4a:
            r1 = r8
            ekrg r9 = defpackage.agdz.a
            ekrw r9 = r9.h()
            ekrz r10 = defpackage.eksq.a
            java.lang.String r0 = "Bugle"
            r9.X(r10, r0)
            r10 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = "NotificationSettings.kt"
            java.lang.String r5 = "com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler"
            java.lang.String r6 = "handleNotificationNavigation"
            ekrw r9 = r9.h(r5, r6, r10, r0)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Shortcut already exists. Will launch notification settings now."
            r9.q(r10)
            r8.b(r3, r4, r2)
        L6e:
            fctx r9 = defpackage.fctx.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdz.a(afzv, fcxy):java.lang.Object");
    }

    public final void b(String str, ConversationIdType conversationIdType, String str2) {
        Intent intentB = ((cgoq) this.f.b()).b(str, str2, conversationIdType);
        if (intentB != null) {
            this.d.startActivity(intentB);
            return;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarJ;
        ekrdVar.X(cqnc.s, conversationIdType);
        ekrdVar.X(cgey.t, str2);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/navigation/targets/NotificationSettingsNavigationHandler", "createAndOpenNotificationChannel", 157, "NotificationSettings.kt")).q("intent is null, unable to open notification channel settings");
    }
}
