package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzt implements bbar {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/ParticipantContactUpdater");
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    private final fcsu e;

    public anzt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.e = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.bbar
    public final eieu a() {
        return eiiy.a("ParticipantContactUpdater#afterParticipantInserted");
    }

    @Override // defpackage.bbar
    public final void b(String str, ParticipantsTable.BindData bindData, boolean z) {
        String strS;
        String strN;
        if (z || bindData.u() <= -1 || (strS = bindData.S()) == null || fdgn.H(strS) || (strN = bindData.N()) == null || fdgn.H(strN)) {
            return;
        }
        Object objB = this.e.b();
        objB.getClass();
        auvw.m((fdjx) objB, null, new anzs(this, str, bindData, null), 3);
    }
}
