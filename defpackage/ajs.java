package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        lcg.i(bundle);
        String string = bundle.getString("packageName");
        lcg.i(string);
        byte[] byteArray = bundle.getByteArray("sha256Certificate");
        lcg.i(byteArray);
        return new ajr(string, byteArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ajr[i];
    }
}
