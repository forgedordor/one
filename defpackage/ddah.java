package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PendingIntent pendingIntent = null;
        byte[] bArrE = null;
        long jI = 0;
        int iF = 0;
        boolean zD = false;
        boolean zD2 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    iF = dclv.f(parcel, i);
                    break;
                case 2:
                    zD = dclv.D(parcel, i);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
                    break;
                case 4:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 5:
                    jI = dclv.i(parcel, i);
                    break;
                case 6:
                    bArrE = dclv.E(parcel, i);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new GmsDeviceComplianceResponse(iF, zD, pendingIntent, zD2, jI, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GmsDeviceComplianceResponse[i];
    }
}
