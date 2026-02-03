package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcla implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = -1;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        String strT = null;
        String strT2 = null;
        long jI = 0;
        long jI2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 2:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 3:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 4:
                    jI = dclv.i(parcel, i);
                    break;
                case 5:
                    jI2 = dclv.i(parcel, i);
                    break;
                case 6:
                    strT = dclv.t(parcel, i);
                    break;
                case 7:
                    strT2 = dclv.t(parcel, i);
                    break;
                case 8:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 9:
                    iF = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new MethodInvocation(iF2, iF3, iF4, jI, jI2, strT, strT2, iF5, iF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
