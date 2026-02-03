package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.appdatasearch.ScoringConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbix implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        Feature[] featureArr = null;
        String strT4 = null;
        ScoringConfig scoringConfig = null;
        boolean zD = false;
        boolean zD2 = false;
        int iF = 1;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 11) {
                strT4 = dclv.t(parcel, i);
            } else if (iD != 12) {
                switch (iD) {
                    case 1:
                        strT = dclv.t(parcel, i);
                        break;
                    case 2:
                        strT2 = dclv.t(parcel, i);
                        break;
                    case 3:
                        zD = dclv.D(parcel, i);
                        break;
                    case 4:
                        iF = dclv.f(parcel, i);
                        break;
                    case 5:
                        zD2 = dclv.D(parcel, i);
                        break;
                    case 6:
                        strT3 = dclv.t(parcel, i);
                        break;
                    case 7:
                        featureArr = (Feature[]) dclv.J(parcel, i, Feature.CREATOR);
                        break;
                    default:
                        dclv.C(parcel, i);
                        break;
                }
            } else {
                scoringConfig = (ScoringConfig) dclv.n(parcel, i, ScoringConfig.CREATOR);
            }
        }
        dclv.B(parcel, iH);
        return new RegisterSectionInfo(strT, strT2, zD, iF, zD2, strT3, featureArr, strT4, scoringConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterSectionInfo[i];
    }
}
