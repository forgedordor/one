package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcp efcpVar = new efcp();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efcpVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efcpVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 3) {
                efcpVar.e((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efcpVar.d(evqs.x(bArrE));
                }
            }
        }
        return efcpVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoveUserFromGroupRequest[i];
    }
}
