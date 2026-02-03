package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.MessageNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efdw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efby efbyVar = new efby();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efbyVar.c((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efbyVar.b(dclv.z(parcel, i, MessageNotification.CREATOR));
            }
        }
        return efbyVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetMessagesResponse[i];
    }
}
