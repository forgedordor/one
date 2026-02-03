package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ReadDraftDataAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ReadDraftDataAction.a) cqtf.a(ReadDraftDataAction.a.class)).aS().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ReadDraftDataAction[i];
    }
}
