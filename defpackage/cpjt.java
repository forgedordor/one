package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpjt implements bbar {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;

    public cpjt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fdjxVar;
    }

    @Override // defpackage.bbar
    public final eieu a() {
        return eiiy.a("UpdateBlockStatusOnParticipantInsertedListener#afterParticipantInserted");
    }

    @Override // defpackage.bbar
    public final /* synthetic */ void b(String str, ParticipantsTable.BindData bindData, boolean z) {
        if (((dqsn) this.c.b()).i()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        auvw.k(this.d, null, null, new cpjs(this, str, null), 3);
    }
}
