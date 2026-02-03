package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        RemoteDevice remoteDevice = null;
        Role[] roleArr = null;
        byte[] bArrE = null;
        int iF = 0;
        int iF2 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                remoteDevice = (RemoteDevice) dclv.n(parcel, i, RemoteDevice.CREATOR);
            } else if (iD == 2) {
                roleArr = (Role[]) dclv.J(parcel, i, Role.CREATOR);
            } else if (iD == 3) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 4) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 1000) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ConnectionInfo(iF, remoteDevice, roleArr, iF2, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionInfo[i];
    }
}
