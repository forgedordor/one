package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aykp;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class UpdateConversationXmsLatchAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aykp();

    public UpdateConversationXmsLatchAction(Parcel parcel) {
        super(parcel, elgm.UPDATE_CONVERSATION_XMS_LATCH_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateConversationXmsLatchAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationXmsLatch.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
