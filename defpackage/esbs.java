package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        Thing[] thingArr = null;
        String[] strArrK = null;
        String[] strArrK2 = null;
        esav esavVar = null;
        String strT = null;
        String strT2 = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    thingArr = (Thing[]) dclv.J(parcel, i, Thing.CREATOR);
                    break;
                case 3:
                    strArrK = dclv.K(parcel, i);
                    break;
                case 4:
                default:
                    dclv.C(parcel, i);
                    break;
                case 5:
                    strArrK2 = dclv.K(parcel, i);
                    break;
                case 6:
                    esavVar = (esav) dclv.n(parcel, i, esav.CREATOR);
                    break;
                case 7:
                    strT = dclv.t(parcel, i);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new esbr(iF, thingArr, strArrK, strArrK2, esavVar, strT, strT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new esbr[i];
    }
}
