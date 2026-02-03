package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReloadCequintParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydz implements ayqe {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public aydz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    @Override // defpackage.ayqe
    public final /* bridge */ /* synthetic */ Action a(ParticipantsTable.BindData bindData) {
        Context context = (Context) this.a.b();
        context.getClass();
        bacb bacbVar = (bacb) this.c.b();
        bacbVar.getClass();
        ayqe ayqeVar = (ayqe) this.d.b();
        ayqeVar.getClass();
        bxkp bxkpVar = (bxkp) this.f.b();
        bxkpVar.getClass();
        return new ReloadCequintParticipantAction(context, this.b, bacbVar, ayqeVar, this.e, bxkpVar, bindData);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        bacb bacbVar = (bacb) this.c.b();
        bacbVar.getClass();
        ayqe ayqeVar = (ayqe) this.d.b();
        ayqeVar.getClass();
        bxkp bxkpVar = (bxkp) this.f.b();
        bxkpVar.getClass();
        parcel.getClass();
        return new ReloadCequintParticipantAction(context, bacbVar, ayqeVar, this.e, bxkpVar, parcel);
    }
}
