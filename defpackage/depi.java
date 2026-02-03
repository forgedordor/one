package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.AcceptTermsRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        boolean zD = false;
        ArrayList arrayListW = null;
        String strT = null;
        String strT2 = null;
        String strT3 = null;
        String strT4 = null;
        ArrayList arrayListW2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    arrayListW = dclv.w(parcel, i);
                    break;
                case 3:
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 5:
                    strT3 = dclv.t(parcel, i);
                    break;
                case 6:
                    strT4 = dclv.t(parcel, i);
                    break;
                case 7:
                    arrayListW2 = dclv.w(parcel, i);
                    break;
                case 8:
                    zD = dclv.D(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new AcceptTermsRequest(iF, arrayListW, strT, strT2, strT3, strT4, arrayListW2, zD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AcceptTermsRequest[i];
    }
}
