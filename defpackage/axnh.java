package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.DeleteMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((axni) ((DeleteMessageAction.a) cqtf.a(DeleteMessageAction.a.class)).aY()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeleteMessageAction[i];
    }
}
