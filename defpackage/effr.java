package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AutoValue_RevokeMessageResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RevokeMessageResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        MessagingResult messagingResult = null;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            if (dclv.d(i) != 1) {
                dclv.C(parcel, i);
            } else {
                messagingResult = (MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR);
                if (messagingResult == null) {
                    throw new NullPointerException("Null result");
                }
            }
        }
        if (messagingResult != null) {
            return new AutoValue_RevokeMessageResponse(messagingResult);
        }
        throw new IllegalStateException("Missing required properties: result");
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RevokeMessageResponse[0];
    }
}
