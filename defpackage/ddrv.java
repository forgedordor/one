package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StyleSpan;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayListZ2 = null;
        ArrayList arrayListZ3 = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF2 = 0;
        float fC = 0.0f;
        float fC2 = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    arrayListZ = dclv.z(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    fC = dclv.c(parcel, i);
                    break;
                case 4:
                    iF = dclv.f(parcel, i);
                    break;
                case 5:
                    fC2 = dclv.c(parcel, i);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 8:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 9:
                    cap = (Cap) dclv.n(parcel, i, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) dclv.n(parcel, i, Cap.CREATOR);
                    break;
                case 11:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 12:
                    arrayListZ2 = dclv.z(parcel, i, PatternItem.CREATOR);
                    break;
                case 13:
                    arrayListZ3 = dclv.z(parcel, i, StyleSpan.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PolylineOptions(arrayListZ, fC, iF, fC2, zD, zD2, zD3, cap, cap2, iF2, arrayListZ2, arrayListZ3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
