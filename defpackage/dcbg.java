package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        int iF3 = 0;
        boolean zD2 = false;
        int iF4 = 0;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        Integer numR = null;
        boolean zD3 = true;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 6:
                default:
                    dclv.C(parcel, i);
                    break;
                case 7:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 8:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 9:
                    zD = dclv.D(parcel, i);
                    break;
                case 10:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 11:
                    numR = dclv.r(parcel, i);
                    break;
                case 12:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 13:
                    iF4 = dclv.f(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new PlayLoggerContext(strT, iF, iF2, strT2, zD3, strT3, zD, iF3, numR, zD2, iF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
