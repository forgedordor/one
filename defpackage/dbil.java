package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.CacheSpec;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.CorpusScoringInfo;
import com.google.android.gms.appdatasearch.GlobalSearchQuerySpecification;
import com.google.android.gms.appdatasearch.STSortSpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbil implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        CorpusId[] corpusIdArr = null;
        CorpusScoringInfo[] corpusScoringInfoArr = null;
        String strT = null;
        byte[] bArrE = null;
        int[] iArrH = null;
        byte[] bArrE2 = null;
        STSortSpec sTSortSpec = null;
        String strT2 = null;
        CacheSpec cacheSpec = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = true;
        boolean zD4 = true;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    corpusIdArr = (CorpusId[]) dclv.J(parcel, i, CorpusId.CREATOR);
                    break;
                case 2:
                    iF = dclv.f(parcel, i);
                    break;
                case 3:
                    corpusScoringInfoArr = (CorpusScoringInfo[]) dclv.J(parcel, i, CorpusScoringInfo.CREATOR);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 6:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                case 9:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 10:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 11:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 12:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 13:
                    iArrH = dclv.H(parcel, i);
                    break;
                case 14:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                case 15:
                    sTSortSpec = (STSortSpec) dclv.n(parcel, i, STSortSpec.CREATOR);
                    break;
                case 16:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 17:
                default:
                    dclv.C(parcel, i);
                    break;
                case 18:
                    cacheSpec = (CacheSpec) dclv.n(parcel, i, CacheSpec.CREATOR);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GlobalSearchQuerySpecification(corpusIdArr, iF, corpusScoringInfoArr, iF2, iF3, iF4, strT, zD, bArrE, zD3, zD4, zD2, iArrH, bArrE2, sTSortSpec, strT2, cacheSpec);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GlobalSearchQuerySpecification[i];
    }
}
