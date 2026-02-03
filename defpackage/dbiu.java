package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.appdatasearch.Section;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListY = null;
        ArrayList arrayListZ = null;
        int[] iArrH = null;
        byte[] bArrE = null;
        STSortSpec sTSortSpec = null;
        String strT = null;
        CacheSpec cacheSpec = null;
        boolean zD = true;
        boolean zD2 = false;
        boolean zD3 = false;
        int iF = 0;
        int iF2 = 0;
        boolean zD4 = false;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 2:
                    arrayListY = dclv.y(parcel, i);
                    break;
                case 3:
                    arrayListZ = dclv.z(parcel, i, Section.CREATOR);
                    break;
                case 4:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 5:
                    iF = dclv.f(parcel, i);
                    break;
                case 6:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 7:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 8:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 11:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 12:
                    sTSortSpec = (STSortSpec) dclv.n(parcel, i, STSortSpec.CREATOR);
                    break;
                case 13:
                    strT = dclv.t(parcel, i);
                    break;
                case 14:
                default:
                    dclv.C(parcel, i);
                    break;
                case 15:
                    cacheSpec = (CacheSpec) dclv.n(parcel, i, CacheSpec.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new QuerySpecification(zD2, arrayListY, arrayListZ, zD3, iF, iF2, zD4, iF3, zD, iArrH, bArrE, sTSortSpec, strT, cacheSpec);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new QuerySpecification[i];
    }
}
