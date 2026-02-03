package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsm implements Parcelable {
    public static final Parcelable.Creator<efsm> CREATOR = new efsl();
    private final int a;
    private Bundle b;

    protected efsm(Parcel parcel) {
        int i = parcel.readInt();
        this.b = new Bundle();
        this.a = i;
        this.b = parcel.readBundle(Bundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeBundle(this.b);
    }
}
