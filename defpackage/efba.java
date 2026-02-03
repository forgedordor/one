package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efbl efblVar = new efbl();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efblVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efblVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 3) {
                efblVar.e((RcsDestinationId) dclv.n(parcel, i, RcsDestinationId.CREATOR));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efblVar.d(evqs.x(bArrE));
                }
            }
        }
        return efblVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddUserToGroupRequest[i];
    }
}
