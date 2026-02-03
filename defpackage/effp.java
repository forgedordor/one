package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcr efcrVar = new efcr();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efcrVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efcrVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 3) {
                efcrVar.d(dclv.t(parcel, i));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efcrVar.e(evqs.x(bArrE));
                }
            }
        }
        return efcrVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RevokeMessageRequest[0];
    }
}
