package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import defpackage.auvw;
import defpackage.axzn;
import defpackage.axzo;
import defpackage.axzz;
import defpackage.ayau;
import defpackage.aybe;
import defpackage.aybf;
import defpackage.aymo;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.elgm;
import defpackage.fcyi;
import defpackage.fdjz;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ReceiveMmsMessageAction extends Action<MessageCoreData> implements Parcelable {
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new axzn();
    private final aybf a;

    /* compiled from: PG */
    public interface a {
        axzo ic();
    }

    public ReceiveMmsMessageAction(int i, byte[] bArr, long j, int i2, int i3, aybf aybfVar) {
        super(elgm.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = aybfVar;
        this.v.r("sub_id", i);
        this.v.q("push_data", bArr);
        this.v.s("message_logging_id", j);
        this.v.r("mcc_mnc", i2);
        this.v.r("carrier_id", i3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ReceiveMmsMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ReceiveMmsMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju e() {
        aybe aybeVarA = this.a.a(this);
        aymo aymoVar = this.v;
        aymoVar.getClass();
        return auvw.c(aybeVarA.H, fcyi.a, fdjz.a, new ayau(aybeVarA, aymoVar, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eiju fQ() {
        aybe aybeVarA = this.a.a(this);
        aymo aymoVar = this.v;
        aymoVar.getClass();
        return auvw.c(aybeVarA.H, fcyi.a, fdjz.a, new axzz(aybeVarA, aymoVar, null));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final boolean fT() {
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ReceiveMmsMessageAction(Parcel parcel, aybf aybfVar) {
        super(parcel, elgm.RECEIVE_MMS_MESSAGE_ACTION);
        this.a = aybfVar;
    }
}
