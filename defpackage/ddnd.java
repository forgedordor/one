package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        Bundle bundleK = null;
        int iF = 0;
        long jI = 0;
        long jI2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                arrayListZ = dclv.z(parcel, i, DetectedActivity.CREATOR);
            } else if (iD == 2) {
                jI = dclv.i(parcel, i);
            } else if (iD == 3) {
                jI2 = dclv.i(parcel, i);
            } else if (iD == 4) {
                iF = dclv.f(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                bundleK = dclv.k(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ActivityRecognitionResult(arrayListZ, jI, jI2, iF, bundleK);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
