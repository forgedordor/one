package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dczk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ArrayList arrayListZ = null;
        String strT = null;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                zD = dclv.D(parcel, i);
            } else if (iD == 3) {
                arrayListZ = dclv.z(parcel, i, Account.CREATOR);
            } else if (iD == 4) {
                zD2 = dclv.D(parcel, i);
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                strT = dclv.t(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SourceStartDirectTransferOptions(iF, zD, arrayListZ, zD2, strT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SourceStartDirectTransferOptions[i];
    }
}
