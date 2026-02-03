package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddye implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long jI = 0;
        String strT = null;
        String strT2 = null;
        Configuration[] configurationArr = null;
        byte[] bArrE = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 4:
                    configurationArr = (Configuration[]) dclv.J(parcel, i, Configuration.CREATOR);
                    break;
                case 5:
                    zD = dclv.D(parcel, i);
                    break;
                case 6:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 7:
                    jI = dclv.i(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new Configurations(strT, strT2, configurationArr, zD, bArrE, jI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Configurations[i];
    }
}
