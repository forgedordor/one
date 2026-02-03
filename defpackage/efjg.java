package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efhs efhsVar = new efhs();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efhsVar.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 2) {
                efhsVar.d((GroupInformation) dclv.n(parcel, i, GroupInformation.CREATOR));
            } else if (iD == 3 && dfpg.n()) {
                efhsVar.c((GroupEvent) dclv.n(parcel, i, GroupEvent.CREATOR));
            } else {
                dclv.C(parcel, i);
            }
        }
        return efhsVar.e();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupNotification[i];
    }
}
