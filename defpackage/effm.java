package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RemoveUserFromGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcq efcqVar = new efcq();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                efcqVar.b((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            }
        }
        return efcqVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoveUserFromGroupResponse[i];
    }
}
