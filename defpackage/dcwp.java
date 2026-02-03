package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        ServiceDumpRequest serviceDumpRequest = null;
        byte[] bArrE = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 2) {
                serviceDumpRequest = (ServiceDumpRequest) dclv.n(parcel, i, ServiceDumpRequest.CREATOR);
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                bArrE = dclv.E(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ServiceDump(serviceDumpRequest, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDump[i];
    }
}
