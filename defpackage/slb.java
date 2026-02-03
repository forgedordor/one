package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class slb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        int iF4 = 0;
        int iF5 = 0;
        int iF6 = 0;
        int iF7 = 0;
        ArrayList arrayListZ = null;
        IBinder iBinderL = null;
        IBinder iBinderL2 = null;
        skw skwVar = null;
        float fC = 0.0f;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    arrayListZ = dclv.z(parcel, i, sky.CREATOR);
                    break;
                case 2:
                    fC = dclv.c(parcel, i);
                    break;
                case 3:
                    iF = dclv.f(parcel, i);
                    break;
                case 4:
                    iF2 = dclv.f(parcel, i);
                    break;
                case 5:
                    iF3 = dclv.f(parcel, i);
                    break;
                case 6:
                    iBinderL = dclv.l(parcel, i);
                    break;
                case 7:
                    iF4 = dclv.f(parcel, i);
                    break;
                case 8:
                    iF5 = dclv.f(parcel, i);
                    break;
                case 9:
                    iBinderL2 = dclv.l(parcel, i);
                    break;
                case 10:
                    iF6 = dclv.f(parcel, i);
                    break;
                case 11:
                    skwVar = (skw) dclv.n(parcel, i, skw.CREATOR);
                    break;
                case 12:
                    iF7 = dclv.f(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new sla(arrayListZ, fC, iF, iF2, iF3, iBinderL, iF4, iF5, iBinderL2, iF6, skwVar, iF7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new sla[i];
    }
}
