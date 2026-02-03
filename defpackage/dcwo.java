package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        String strT = null;
        ServiceDumpRequest[] serviceDumpRequestArr = null;
        boolean zD = false;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 2:
                    strT = dclv.t(parcel, i);
                    break;
                case 3:
                    zD = dclv.D(parcel, i);
                    break;
                case 4:
                    zD2 = dclv.D(parcel, i);
                    break;
                case 5:
                    zD3 = dclv.D(parcel, i);
                    break;
                case 6:
                    zD4 = dclv.D(parcel, i);
                    break;
                case 7:
                    serviceDumpRequestArr = (ServiceDumpRequest[]) dclv.J(parcel, i, ServiceDumpRequest.CREATOR);
                    break;
                default:
                    dclv.C(parcel, i);
                    break;
            }
        }
        dclv.B(parcel, iH);
        return new LogOptions(strT, zD, zD2, zD3, zD4, serviceDumpRequestArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogOptions[i];
    }
}
