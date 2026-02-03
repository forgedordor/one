package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaqj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eaqk((easf) parcel.readParcelable(easg.class.getClassLoader()), (easl) parcel.readParcelable(easg.class.getClassLoader()), (Instant) parcel.readSerializable());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eaqk[i];
    }
}
