package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SetDittoSessionInactiveAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.ayij;
import defpackage.ayik;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SetDittoSessionInactiveAction extends Action<Void> {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new ayij();
    private final Optional a;

    /* compiled from: PG */
    public interface a {
        ayik ij();
    }

    public SetDittoSessionInactiveAction(Optional optional) {
        super(elgm.SET_DITTO_SESSION_INACTIVE_ACTION);
        this.a = optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("SetDittoSessionInactiveAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        this.a.ifPresent(new Consumer() { // from class: ayii
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Parcelable.Creator<Action<Void>> creator = SetDittoSessionInactiveAction.CREATOR;
                ((cqzo) obj).b(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SetDittoSessionInactive.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public SetDittoSessionInactiveAction(Optional optional, Parcel parcel) {
        super(parcel, elgm.SET_DITTO_SESSION_INACTIVE_ACTION);
        this.a = optional;
    }
}
