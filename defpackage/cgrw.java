package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgrw extends cgiw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/unapprovedincomingmessage/UnapprovedIncomingMessageNotificationBlueprint");
    public final ajln b;
    private final Context c;
    private final fdjx d;
    private final aofc e;
    private final cogw f;
    private final fcsu g;
    private final avmp h;
    private final Optional i;
    private final fcsu j;

    public cgrw(Context context, fdjx fdjxVar, ajln ajlnVar, aofc aofcVar, cogw cogwVar, fcsu fcsuVar, avmp avmpVar, Optional optional, fcsu fcsuVar2) {
        context.getClass();
        fdjxVar.getClass();
        ajlnVar.getClass();
        aofcVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        avmpVar.getClass();
        optional.getClass();
        fcsuVar2.getClass();
        this.c = context;
        this.d = fdjxVar;
        this.b = ajlnVar;
        this.e = aofcVar;
        this.f = cogwVar;
        this.g = fcsuVar;
        this.h = avmpVar;
        this.i = optional;
        this.j = fcsuVar2;
    }

    @Override // defpackage.cgiw
    public final /* bridge */ /* synthetic */ eiju a(List list, Object obj) {
        cgrq cgrqVar = (cgrq) obj;
        cgrqVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cgrt(this, cgrqVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.Conversation r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgrw.b(com.google.android.apps.messaging.shared.api.messaging.Conversation, fcxy):java.lang.Object");
    }

    @Override // defpackage.cgiw
    public final cgkq c() {
        return new cgrv();
    }

    @Override // defpackage.cgiw
    public final cglf d() {
        return cglf.NT_INCOMING_UNAPPROVED_MESSAGE;
    }

    @Override // defpackage.cgiw
    public final eiju e() {
        eiju eijuVarE = eijx.e(true);
        eijuVarE.getClass();
        return eijuVarE;
    }

    @Override // defpackage.cgiw
    public final String g() {
        return "msg";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r14, defpackage.fcxy r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgrw.h(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId, fcxy):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ajlk r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cgru
            if (r0 == 0) goto L13
            r0 = r9
            cgru r0 = (defpackage.cgru) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cgru r0 = new cgru
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r8 = r0.a
            defpackage.fctl.b(r9)
            goto L52
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.fctl.b(r9)
            aoer r9 = r8.h()
            if (r9 != 0) goto L5d
            aofc r9 = r7.e
            anpj r9 = r9.a()
            eiju r9 = r9.b()
            r9.getClass()
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = defpackage.fdxs.c(r9, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            r9.getClass()
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = defpackage.fcva.N(r9)
            aoer r9 = (defpackage.aoer) r9
        L5d:
            android.content.Context r0 = r7.c
            r1 = 2132084856(0x7f150878, float:1.9809894E38)
            java.lang.String r1 = r0.getString(r1)
            r9.getClass()
            android.net.Uri r9 = r9.c()
            cglt r9 = defpackage.cglt.d(r1, r9)
            cgkp[] r1 = new defpackage.cgkp[r3]
            java.lang.String r2 = r8.m()
            android.net.Uri r3 = r8.a()
            cglt r2 = defpackage.cglt.d(r2, r3)
            cogw r3 = r7.f
            r4 = 2132088215(0x7f151597, float:1.9816707E38)
            java.lang.String r4 = r0.getString(r4)
            j$.time.Instant r3 = r3.f()
            long r5 = r3.toEpochMilli()
            cgko r2 = defpackage.cgkp.f(r2, r4, r5)
            cgkp r2 = r2.a()
            r3 = 0
            r1[r3] = r2
            java.util.List r1 = defpackage.fcva.i(r1)
            java.lang.String r2 = r8.m()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            cgkr r9 = defpackage.cgkt.u(r9, r1, r2, r3)
            java.lang.String r8 = r8.m()
            r9.d(r8)
            r8 = 2131232107(0x7f08056b, float:1.8080314E38)
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.h(r0, r8)
            r1 = r9
            cggx r1 = (defpackage.cggx) r1
            r1.a = r8
            r8 = 2131102639(0x7f060baf, float:1.7817722E38)
            int r8 = r0.getColor(r8)
            r9.c(r8)
            cgkt r8 = r9.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgrw.i(ajlk, fcxy):java.lang.Object");
    }
}
