package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axzd;
import defpackage.ayoz;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class ReadDraftDataAction extends Action implements Parcelable {
    public static final Parcelable.Creator<Action> CREATOR = new axzd();

    /* compiled from: PG */
    public interface a {
        ayoz aS();
    }

    public ReadDraftDataAction(Parcel parcel) {
        super(parcel, elgm.READ_DRAFT_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReadDraftDataAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReadDraftData.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
