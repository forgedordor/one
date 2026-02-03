package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.Example;
import com.google.android.gms.learning.ExampleStoreResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddiy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Example example = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                example = (Example) dclv.n(parcel, i, Example.CREATOR);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ExampleStoreResult(example, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExampleStoreResult[i];
    }
}
