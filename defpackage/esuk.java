package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.frameworks.client.data.android.server.contrib.parcelables.ParcelableBinder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new ParcelableBinder(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ParcelableBinder[i];
    }
}
