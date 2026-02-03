package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcmg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        Long lS = null;
        Long lS2 = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 3) {
                lS = dclv.s(parcel, i);
            } else if (iD == 4) {
                lS2 = dclv.s(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                iF3 = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ModuleInstallStatusUpdate(iF, iF2, lS, lS2, iF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ModuleInstallStatusUpdate[i];
    }
}
