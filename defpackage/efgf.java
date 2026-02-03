package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efgf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcz efczVar = new efcz();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                efczVar.b((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            }
        }
        return efczVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TriggerGroupNotificationResponse[i];
    }
}
