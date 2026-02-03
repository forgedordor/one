package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efds implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efbw efbwVar = new efbw();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efbwVar.c((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            } else if (iD != 2) {
                dclv.C(parcel, i);
            } else {
                efbwVar.b(dclv.z(parcel, i, GroupNotification.CREATOR));
            }
        }
        return efbwVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGroupNotificationsResponse[i];
    }
}
