package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ayku;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class UpdateParticipantRcsAvailableAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayku();

    private UpdateParticipantRcsAvailableAction() {
        super(elgm.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateParticipantRcsAvailableAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateParticipantRcsAvailable.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateParticipantRcsAvailableAction(Parcel parcel) {
        super(parcel, elgm.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION);
    }
}
