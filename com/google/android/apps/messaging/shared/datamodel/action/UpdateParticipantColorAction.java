package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.ayks;
import defpackage.aymo;
import defpackage.aypp;
import defpackage.bakt;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateParticipantColorAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayks();
    private final fcsu a;

    /* compiled from: PG */
    public interface a {
        aypp bc();
    }

    public UpdateParticipantColorAction(fcsu fcsuVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_PARTICIPANT_COLOR_ACTION);
        this.a = fcsuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateParticipantColorAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        ((bakt) this.a.b()).X(aymoVar.l("participantId"), (ParticipantCoreColor) aymoVar.h(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR));
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantColor.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateParticipantColorAction(fcsu fcsuVar, String str, ParticipantCoreColor participantCoreColor) {
        super(elgm.UPDATE_PARTICIPANT_COLOR_ACTION);
        this.a = fcsuVar;
        this.v.v("participantId", str);
        this.v.t(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.COLOR, participantCoreColor);
    }
}
