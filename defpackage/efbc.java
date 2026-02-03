package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AddUserToGroupResponse;
import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efbm efbmVar = new efbm();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                efbmVar.b((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            }
        }
        return efbmVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddUserToGroupResponse[i];
    }
}
