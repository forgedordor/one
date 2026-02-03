package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axsp;
import defpackage.axsq;
import defpackage.bxjn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ParticipantFullRefreshAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axsp();
    private final bxjn a;

    /* compiled from: PG */
    public interface a {
        axsq hQ();
    }

    public ParticipantFullRefreshAction(bxjn bxjnVar) {
        super(elgm.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = bxjnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ParticipantFullRefreshAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ParticipantFullRefreshAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        this.a.a();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ParticipantFullRefreshAction(bxjn bxjnVar, Parcel parcel) {
        super(parcel, elgm.PARTICIPANT_FULL_REFRESH_ACTION);
        this.a = bxjnVar;
    }
}
