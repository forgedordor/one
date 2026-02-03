package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        effc effcVarE = MessagingOperationResult.e();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                effcVarE.e((MessagingResult) dclv.n(parcel, i, MessagingResult.CREATOR));
            } else if (iD == 2) {
                effcVarE.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 3) {
                effcVarE.d(dclv.t(parcel, i));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else {
                effcVarE.c(dclv.D(parcel, i));
            }
        }
        return effcVarE.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessagingOperationResult[i];
    }
}
