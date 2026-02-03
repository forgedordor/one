package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dear implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        Thing thing = null;
        esav esavVar = null;
        long jI = 0;
        int iF = 0;
        int iF2 = 0;
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
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    jI = dclv.i(parcel, i);
                    break;
                case 6:
                    thing = (Thing) dclv.n(parcel, i, Thing.CREATOR);
                    break;
                case 7:
                    esavVar = (esav) dclv.n(parcel, i, esav.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AppIndexingErrorInfo(strT, iF, iF2, strT2, jI, thing, esavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AppIndexingErrorInfo[i];
    }
}
