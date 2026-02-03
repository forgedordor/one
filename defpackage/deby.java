package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$CorpusInfo;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deby implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        boolean zD = false;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        String strT5 = null;
        GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr = null;
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
                    iF2 = dclv.f(parcel, i);
                    break;
                case 4:
                    iF3 = dclv.f(parcel, i);
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
                    getGlobalSearchSourcesCall$CorpusInfoArr = (GetGlobalSearchSourcesCall$CorpusInfo[]) dclv.J(parcel, i, GetGlobalSearchSourcesCall$CorpusInfo.CREATOR);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    strT2 = dclv.t(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetGlobalSearchSourcesCall$GlobalSearchSource(strT, strT2, iF, iF2, iF3, strT3, strT4, strT5, getGlobalSearchSourcesCall$CorpusInfoArr, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGlobalSearchSourcesCall$GlobalSearchSource[i];
    }
}
