package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        boolean zD = false;
        boolean zD2 = false;
        long jI = -1;
        String strT = "/";
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 2:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 3:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 4:
                    strT = dclv.t(parcel, i);
                    break;
                case 5:
                    jI = dclv.i(parcel, i);
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
        return new BrowserResolutionCookie(strT2, strT3, strT4, strT, jI, zD, zD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BrowserResolutionCookie[i];
    }
}
