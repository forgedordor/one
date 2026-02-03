package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.WriteDraftMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aylq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((WriteDraftMessageAction.a) cqtf.a(WriteDraftMessageAction.a.class)).aT().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new WriteDraftMessageAction[i];
    }
}
