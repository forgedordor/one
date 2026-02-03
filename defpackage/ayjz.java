package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateContactDisambiguationAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayjz implements ayms {
    public ayjz(fcsu fcsuVar) {
        fcsuVar.getClass();
    }

    public static final UpdateContactDisambiguationAction a(Parcel parcel) {
        parcel.getClass();
        return new UpdateContactDisambiguationAction(parcel);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        return a(parcel);
    }
}
