package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.axyg;
import defpackage.axyh;
import defpackage.basd;
import defpackage.baxe;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessRevocationSentAction extends Action<Void> {
    private final fcsu b;
    private static final cqce a = cqce.g("BugleDataModel", "ProcessRevocationSentAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axyg();

    /* compiled from: PG */
    public interface a {
        axyh hZ();
    }

    public ProcessRevocationSentAction(fcsu fcsuVar, Parcel parcel) {
        super(parcel, elgm.PROCESS_REVOCATION_SENT_ACTION);
        this.b = fcsuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessRevocationSentAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        basd basdVarB = basd.b(this.v.f(), "rcs_message_id");
        fcsu fcsuVar = this.b;
        MessageCoreData messageCoreDataX = ((baxe) fcsuVar.b()).x(basdVarB);
        if (messageCoreDataX == null) {
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Revocation sent but message is missing.");
            cqbdVarE.A("rcsMessageId ", basdVarB);
            cqbdVarE.r();
            return null;
        }
        if (messageCoreDataX.k() != 15) {
            cqbd cqbdVarE2 = a.e();
            cqbdVarE2.I("Revocation sent, but message is not pending revocation.");
            cqbdVarE2.A("rcsMessageId", basdVarB);
            cqbdVarE2.y("status", messageCoreDataX.k());
            cqbdVarE2.r();
            return null;
        }
        messageCoreDataX.aZ(messageCoreDataX.r());
        ((baxe) fcsuVar.b()).U(messageCoreDataX);
        cqbd cqbdVarC = a.c();
        cqbdVarC.I("Revocation sent for message");
        cqbdVarC.d(messageCoreDataX.C());
        cqbdVarC.h(basdVarB);
        cqbdVarC.r();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessRevocationSent.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessRevocationSentAction(fcsu fcsuVar, basd basdVar) {
        super(elgm.PROCESS_REVOCATION_SENT_ACTION);
        if (basd.l(basdVar)) {
            basd.h(this.v.f(), "rcs_message_id", basdVar);
        }
        this.b = fcsuVar;
    }
}
