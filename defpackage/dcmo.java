package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        String strT2 = null;
        ConverterWrapper converterWrapper = null;
        int iF = 0;
        int iF2 = 0;
        boolean zD = false;
        int iF3 = 0;
        boolean zD2 = false;
        int iF4 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 5:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 8:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 9:
                    converterWrapper = (ConverterWrapper) dclv.n(parcel, i, ConverterWrapper.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new FastJsonResponse.Field(iF, iF2, zD, iF3, zD2, strT, iF4, strT2, converterWrapper);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
