package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateParticipantColorAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykt extends aypp {
    public final fcsu a;

    public aykt(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateParticipantColorAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateParticipantColorAction(this.a, parcel);
    }
}
