package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axpd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((HandleLowStorageAction.a) cqtf.a(HandleLowStorageAction.a.class)).hL().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new HandleLowStorageAction[i];
    }
}
