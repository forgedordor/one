package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundleK = null;
        byte[] bArrE = null;
        int iF = 0;
        int iF2 = 0;
        int iF3 = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF2 = dclv.f(parcel, i);
            } else if (iD == 2) {
                pendingIntent = (PendingIntent) dclv.n(parcel, i, PendingIntent.CREATOR);
            } else if (iD == 3) {
                iF3 = dclv.f(parcel, i);
            } else if (iD == 4) {
                bundleK = dclv.k(parcel, i);
            } else if (iD == 5) {
                bArrE = dclv.E(parcel, i);
            } else if (iD != 1000) {
                dclv.C(parcel, i);
            } else {
                iF = dclv.f(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new ProxyResponse(iF, iF2, pendingIntent, iF3, bundleK, bArrE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
