package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.UpdateGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efda efdaVar = new efda();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efdaVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efdaVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 3) {
                efdaVar.e(dclv.t(parcel, i));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efdaVar.d(evqs.x(bArrE));
                }
            }
        }
        return efdaVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UpdateGroupRequest[0];
    }
}
