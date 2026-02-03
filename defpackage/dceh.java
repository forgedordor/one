package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dceh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        String strT = null;
        IBinder iBinderL = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT = dclv.t(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 4:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 5:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 6:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 7:
                default:
                    dclv.C(parcel, i);
                    break;
                case 8:
                    zD5 = dclv.D(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GoogleCertificatesLookupQuery(strT, zD, zD2, iBinderL, zD3, zD4, zD5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesLookupQuery[i];
    }
}
