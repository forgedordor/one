package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateMessagePartSizeAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykr implements ayms {
    public final fcsu a;

    public aykr(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateMessagePartSizeAction c(Parcel parcel) {
        parcel.getClass();
        return new UpdateMessagePartSizeAction(this.a, parcel);
    }
}
