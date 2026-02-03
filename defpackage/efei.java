package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efei implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcb efcbVar = new efcb();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efcbVar.c((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efcbVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            }
        }
        return efcbVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupOperationResult[i];
    }
}
