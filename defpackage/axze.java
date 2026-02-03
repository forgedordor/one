package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReadDraftDataAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axze extends ayoz {
    @Override // defpackage.ayms
    public final Action c(Parcel parcel) {
        return new ReadDraftDataAction(parcel);
    }
}
