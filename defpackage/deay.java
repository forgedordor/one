package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deay implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        Status status = null;
        CorpusConfigParcelable[] corpusConfigParcelableArr = null;
        AppIndexingErrorInfo[] appIndexingErrorInfoArr = null;
        AppIndexingUserActionInfo[] appIndexingUserActionInfoArr = null;
        long jI = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    status = (Status) dclv.n(parcel, i, Status.CREATOR);
                    break;
                case 2:
                    corpusConfigParcelableArr = (CorpusConfigParcelable[]) dclv.J(parcel, i, CorpusConfigParcelable.CREATOR);
                    break;
                case 3:
                    jI = dclv.i(parcel, i);
                    break;
                case 4:
                    appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) dclv.J(parcel, i, AppIndexingErrorInfo.CREATOR);
                    break;
                case 5:
                    appIndexingUserActionInfoArr = (AppIndexingUserActionInfo[]) dclv.J(parcel, i, AppIndexingUserActionInfo.CREATOR);
                    break;
                case 6:
                    zD = dclv.D(parcel, i);
                    break;
                case 7:
                    zD2 = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GetAppIndexingPackageDetailsCall$Response(status, corpusConfigParcelableArr, jI, appIndexingErrorInfoArr, appIndexingUserActionInfoArr, zD, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAppIndexingPackageDetailsCall$Response[i];
    }
}
