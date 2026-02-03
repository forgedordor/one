package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efbr efbrVar = new efbr();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efbrVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efbrVar.b(dclv.t(parcel, i));
            } else if (iD == 3) {
                efbrVar.f(dclv.t(parcel, i));
            } else if (iD == 4) {
                efbrVar.d(dclv.z(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD != 5) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efbrVar.e(evqs.x(bArrE));
                }
            }
        }
        return efbrVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateGroupRequest[i];
    }
}
