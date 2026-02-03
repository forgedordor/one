package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dems implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListZ = arrayList;
        ArrayList arrayListZ2 = arrayList2;
        ArrayList arrayListZ3 = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int iF = 0;
        boolean zD = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        String strT6 = null;
        String strT7 = null;
        String strT8 = null;
        TimeInterval timeInterval = null;
        String strT9 = null;
        String strT10 = null;
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
                    strT3 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT5 = dclv.t(parcel, i);
                    break;
                case 7:
                    strT6 = dclv.t(parcel, i);
                    break;
                case 8:
                    strT7 = dclv.t(parcel, i);
                    break;
                case 9:
                    strT8 = dclv.t(parcel, i);
                    break;
                case 10:
                    iF = dclv.f(parcel, i);
                    break;
                case 11:
                    arrayListZ = dclv.z(parcel, i, WalletObjectMessage.CREATOR);
                    break;
                case 12:
                    timeInterval = (TimeInterval) dclv.n(parcel, i, TimeInterval.CREATOR);
                    break;
                case 13:
                    arrayListZ2 = dclv.z(parcel, i, LatLng.CREATOR);
                    break;
                case 14:
                    strT9 = dclv.t(parcel, i);
                    break;
                case 15:
                    strT10 = dclv.t(parcel, i);
                    break;
                case 16:
                    arrayListZ3 = dclv.z(parcel, i, LabelValueRow.CREATOR);
                    break;
                case 17:
                    zD = dclv.D(parcel, i);
                    break;
                case 18:
                    arrayList4 = dclv.z(parcel, i, UriData.CREATOR);
                    break;
                case 19:
                    arrayList5 = dclv.z(parcel, i, TextModuleData.CREATOR);
                    break;
                case 20:
                    arrayList6 = dclv.z(parcel, i, UriData.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new CommonWalletObject(strT, strT2, strT3, strT4, strT5, strT6, strT7, strT8, iF, arrayListZ, timeInterval, arrayListZ2, strT9, strT10, arrayListZ3, zD, arrayList4, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CommonWalletObject[i];
    }
}
