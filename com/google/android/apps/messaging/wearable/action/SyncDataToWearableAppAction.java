package com.google.android.apps.messaging.wearable.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import defpackage.dapy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.elgm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class SyncDataToWearableAppAction extends ThrottledAction {
    public static final Parcelable.Creator<SyncDataToWearableAppAction> CREATOR = new dapy();

    private SyncDataToWearableAppAction() {
        super(elgm.SYNC_DATA_TO_WEARABLE_APP_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SyncDataToWearableApp.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 110;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 1L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SyncDataToWearableAppAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final eiju k() {
        return eijx.e(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SyncDataToWearableAppAction(Parcel parcel) {
        super(parcel, elgm.SYNC_DATA_TO_WEARABLE_APP_ACTION);
    }
}
