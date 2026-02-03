package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Request;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deco implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            dclv.C(parcel, parcel.readInt());
        }
        dclv.B(parcel, iH);
        return new GetNativeApiInfoCall$Request();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetNativeApiInfoCall$Request[i];
    }
}
