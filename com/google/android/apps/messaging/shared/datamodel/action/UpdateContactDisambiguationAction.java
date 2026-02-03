package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ayjy;
import defpackage.aymo;
import defpackage.bpai;
import defpackage.bpbc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateContactDisambiguationAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayjy();

    /* compiled from: PG */
    public interface a {
        void jc();
    }

    public UpdateContactDisambiguationAction(Parcel parcel) {
        super(parcel, elgm.UPDATE_CONTACT_DISAMBIGUATION_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateContactDisambiguationAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        String[] strArr = bpbc.a;
        bpai bpaiVar = new bpai();
        aymo aymoVar = this.v;
        bpaiVar.b(aymoVar.l("contact_key"));
        bpaiVar.c(aymoVar.l("new_msisdn"));
        bpaiVar.a().k();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateContactDisambiguation.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }
}
