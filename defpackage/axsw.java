package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axsw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((PauseRcsFileTransferAction.a) cqtf.a(PauseRcsFileTransferAction.a.class)).hR().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PauseRcsFileTransferAction[i];
    }
}
