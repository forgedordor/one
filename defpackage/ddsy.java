package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.SyncOptions;
import com.google.android.gms.mdisync.internal.SyncRequest;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        long epochMilli = Instant.now().toEpochMilli();
        byte[] bArrE = null;
        SyncOptions syncOptions = null;
        int iF = 0;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                iF = dclv.f(parcel, i);
            } else if (iD == 2) {
                bArrE = dclv.E(parcel, i);
            } else if (iD == 3) {
                syncOptions = (SyncOptions) dclv.n(parcel, i, SyncOptions.CREATOR);
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                epochMilli = dclv.i(parcel, i);
            }
        }
        dclv.B(parcel, iH);
        return new SyncRequest(iF, bArrE, syncOptions, epochMilli);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncRequest[i];
    }
}
