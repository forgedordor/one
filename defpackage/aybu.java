package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveP2pSuggestionsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aybu implements ayms {
    public final fcsu a;

    public aybu(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ReceiveP2pSuggestionsAction c(Parcel parcel) {
        ayca aycaVar = (ayca) this.a.b();
        aycaVar.getClass();
        parcel.getClass();
        return new ReceiveP2pSuggestionsAction(aycaVar, parcel);
    }
}
