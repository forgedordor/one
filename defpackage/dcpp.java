package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Bundle bundleK = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 2) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new DroidGuardResultsRequest(bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DroidGuardResultsRequest[i];
    }
}
