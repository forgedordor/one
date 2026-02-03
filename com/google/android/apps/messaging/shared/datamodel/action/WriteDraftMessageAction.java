package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aylq;
import defpackage.aypa;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class WriteDraftMessageAction extends Action<String> implements Parcelable {
    public static final Parcelable.Creator<Action<String>> CREATOR = new aylq();

    /* compiled from: PG */
    public interface a {
        aypa aT();
    }

    public WriteDraftMessageAction(Parcel parcel) {
        super(parcel, elgm.WRITE_DRAFT_MESSAGE_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("WriteDraftMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.WriteDraftMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
