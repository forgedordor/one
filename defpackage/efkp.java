package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efid efidVar = new efid();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efidVar.c(new int[]{1, 2}[dclv.f(parcel, i)]);
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efidVar.b(dclv.t(parcel, i));
            }
        }
        return efidVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RcsDestinationId[i];
    }
}
