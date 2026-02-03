package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.axpf;
import defpackage.axpg;
import defpackage.cqce;
import defpackage.craw;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.eygg;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class InitializeP2pConversationTrainingAction extends Action<Void> {
    private final Optional b;
    private static final cqce a = cqce.g("Bugle", "InitializeP2pConversationTrainingAction");
    public static final Parcelable.Creator<Action<Void>> CREATOR = new axpf();

    /* compiled from: PG */
    public interface a {
        axpg hM();
    }

    public InitializeP2pConversationTrainingAction(Optional<eygg<craw>> optional) {
        super(elgm.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("InitializeP2pConversationTrainingAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        v();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.InitializeP2pConversationTraining.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final Bundle fP() {
        Optional optional = this.b;
        if (optional.isEmpty()) {
            a.m("P2pConversationTrainingUtils not available, cannot initialize training");
            return null;
        }
        a.m("Initializing p2p conversation training.");
        ((craw) ((eygg) optional.get()).b()).d();
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public InitializeP2pConversationTrainingAction(Optional<eygg<craw>> optional, Parcel parcel) {
        super(parcel, elgm.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION);
        this.b = optional;
    }
}
