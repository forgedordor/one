package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        String strT = null;
        ApplicationParameters applicationParameters = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    applicationParameters = (ApplicationParameters) dclv.n(parcel, i, ApplicationParameters.CREATOR);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 8:
                    iF = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new BuyFlowConfig(strT, applicationParameters, strT2, strT3, strT4, strT5, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowConfig[i];
    }
}
