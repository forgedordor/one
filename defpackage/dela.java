package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dela implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListW = null;
        String strT = null;
        String strT2 = null;
        ArrayList arrayListW2 = null;
        String strT3 = null;
        boolean zD = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    arrayListW = dclv.w(parcel, i);
                    break;
                case 3:
                default:
                    dclv.C(parcel, i);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                    arrayListW2 = dclv.w(parcel, i);
                    break;
                case 7:
                    zD = dclv.D(parcel, i);
                    break;
                case 8:
                    strT3 = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new IsReadyToPayRequest(arrayListW, strT, strT2, arrayListW2, zD, strT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
