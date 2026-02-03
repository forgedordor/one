package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.WriteDraftMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aylr extends aypa {
    @Override // defpackage.ayms
    public final Action c(Parcel parcel) {
        return new WriteDraftMessageAction(parcel);
    }
}
