package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.audit.LogAuditRecordsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbls implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        byte[][] bArrL = null;
        byte[] bArrE = null;
        byte[] bArrE2 = null;
        int iF = 0;
        int iF2 = 0;
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
                    strT = dclv.t(parcel, i);
                    break;
                case 4:
                    bArrL = dclv.L(parcel, i);
                    break;
                case 5:
                    bArrE = dclv.E(parcel, i);
                    break;
                case 6:
                    bArrE2 = dclv.E(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LogAuditRecordsRequest(iF, iF2, strT, bArrL, bArrE, bArrE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogAuditRecordsRequest[i];
    }
}
