package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axtl;
import defpackage.axxw;
import defpackage.aypv;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessPendingMessagesAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axxw();

    /* compiled from: PG */
    public interface a {
        aypv bg();
    }

    public ProcessPendingMessagesAction() {
        super(elgm.PROCESS_PENDING_MESSAGES_ACTION);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("ProcessPendingMessagesAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        axtl.d(this.v.b("reason", 0), this);
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessPendingMessages.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public ProcessPendingMessagesAction(Parcel parcel) {
        super(parcel, elgm.PROCESS_PENDING_MESSAGES_ACTION);
    }

    public ProcessPendingMessagesAction(int i) {
        super(defpackage.a.g(i, "ProcessPendingMessagesActionKey_"), elgm.PROCESS_PENDING_MESSAGES_ACTION);
        this.v.r("reason", i);
    }
}
