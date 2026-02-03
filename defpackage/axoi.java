package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ForwardIncomingTypingIndicatorToTachyonAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axoi implements ayms {
    public final fcsu a;
    public final fcsu b;

    public axoi(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ForwardIncomingTypingIndicatorToTachyonAction c(Parcel parcel) {
        atxs atxsVar = (atxs) this.b.b();
        atxsVar.getClass();
        parcel.getClass();
        return new ForwardIncomingTypingIndicatorToTachyonAction(this.a, atxsVar, parcel);
    }
}
