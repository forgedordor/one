package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.SendMessageResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efcv efcvVar = new efcv();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                efcvVar.b((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            }
        }
        return efcvVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendMessageResponse[0];
    }
}
