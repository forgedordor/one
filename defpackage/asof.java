package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asof {
    public static final cqce a = cqce.g("Bugle", "RbmBusinessInfoUpdateHelper");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/business/RbmBusinessInfoUpdateHelper");
    public final ContentResolver c;
    final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    private final fcsu k;

    public asof(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.c = context.getContentResolver();
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.k = fcsuVar5;
        this.h = fcsuVar6;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
    }

    public static void b(String str, String str2) {
        cqbd cqbdVarE = a.e();
        cqbdVarE.I(str2);
        cqbdVarE.A("botId", str);
        cqbdVarE.r();
    }

    public final void a(String str, Iterable iterable, String str2) {
        ((ajhd) this.e.b()).al(11, str);
        cqbd cqbdVarB = a.b();
        cqbdVarB.I(str2);
        cqbdVarB.A("botId", str);
        cqbdVarB.N("canonical address", iterable);
        cqbdVarB.r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0005  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(java.lang.String r5, java.lang.String r6, com.google.android.ims.rcsservice.businessinfo.BusinessInfoData r7, defpackage.eyga r8) {
        /*
            r4 = this;
            if (r7 != 0) goto L2f
            r0 = 0
            if (r8 != 0) goto L7
        L5:
            r8 = r0
            goto L2a
        L7:
            eyge r1 = defpackage.eyge.a
            evub r8 = r8.b
            java.lang.String r2 = "urn:rcs:google:"
            boolean r3 = r8.containsKey(r2)
            if (r3 == 0) goto L1a
            java.lang.Object r8 = r8.get(r2)
            r1 = r8
            eyge r1 = (defpackage.eyge) r1
        L1a:
            evub r8 = r1.b
            java.lang.String r1 = "Agent-Name"
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L5
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
        L2a:
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = defpackage.bbbd.a(r6, r8, r0)
            goto L3b
        L2f:
            java.lang.String r8 = r7.getName()
            java.lang.String r0 = r7.getColor()
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData r6 = defpackage.bbbd.a(r6, r8, r0)
        L3b:
            bsbs r8 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.f()
            java.lang.String r0 = "updateParticipantAndConversations"
            r8.ap(r0)
            java.lang.String r0 = r6.O()
            r8.r(r0)
            int r0 = r6.n()
            r8.s(r0)
            int r0 = r6.k()
            r8.j(r0)
            int r6 = r6.m()
            r8.k(r6)
            if (r7 == 0) goto L6f
            java.lang.String r6 = r7.getLogoImageLocalUri()
            if (r6 == 0) goto L6f
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r8.M(r6)
        L6f:
            boolean r6 = r8.e(r5)
            cqce r7 = defpackage.asof.a
            cqbd r7 = r7.c()
            java.lang.String r8 = "participant updated"
            r7.B(r8, r6)
            r7.r()
            if (r6 == 0) goto L8e
            fcsu r7 = r4.k
            java.lang.Object r7 = r7.b()
            bakt r7 = (defpackage.bakt) r7
            r7.R(r5)
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asof.c(java.lang.String, java.lang.String, com.google.android.ims.rcsservice.businessinfo.BusinessInfoData, eyga):boolean");
    }
}
