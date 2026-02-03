package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axnj;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DoNothingAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<DoNothingAction> CREATOR = new axnj();

    public DoNothingAction() {
        super(elgm.DO_NOTHING_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("DoNothingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DoNothingAction(Parcel parcel) {
        super(parcel, elgm.DO_NOTHING_ACTION);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
