package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.learning.InAppTrainingConstraints;
import com.google.android.gms.learning.TrainingInterval;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        Uri uri = null;
        InAppTrainingConstraints inAppTrainingConstraints = null;
        Uri uri2 = null;
        TrainingInterval trainingInterval = null;
        byte[] bArrE = null;
        Uri uri3 = null;
        Bundle bundleK = null;
        byte[] bArrE2 = null;
        long jI = 0;
        int iF = 0;
        boolean zD = false;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 6:
                    uri = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                case 8:
                default:
                    dclv.C(parcel, i);
                    break;
                case 9:
                    inAppTrainingConstraints = (InAppTrainingConstraints) dclv.n(parcel, i, InAppTrainingConstraints.CREATOR);
                    break;
                case 10:
                    jI = dclv.i(parcel, i);
                    break;
                case 11:
                    uri2 = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 12:
                    trainingInterval = (TrainingInterval) dclv.n(parcel, i, TrainingInterval.CREATOR);
                    break;
                case 13:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 14:
                    uri3 = (Uri) dclv.n(parcel, i, Uri.CREATOR);
                    break;
                case 15:
                    bundleK = dclv.k(parcel, i);
                    break;
                case 16:
                    bArrE2 = dclv.E(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new InAppTrainerOptions(strT, iF, zD, strT2, iF2, uri, inAppTrainingConstraints, jI, uri2, trainingInterval, bArrE, uri3, bundleK, bArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InAppTrainerOptions[i];
    }
}
