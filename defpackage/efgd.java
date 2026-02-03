package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcy efcyVar = new efcy();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efcyVar.c(dclv.j(parcel, i));
            } else if (iD == 2) {
                efcyVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD != 3) {
                dclv.C(parcel, i);
            } else {
                byte[] bArrE = dclv.E(parcel, i);
                if (bArrE != null) {
                    efcyVar.d(evqs.x(bArrE));
                }
            }
        }
        return efcyVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TriggerGroupNotificationRequest[i];
    }
}
