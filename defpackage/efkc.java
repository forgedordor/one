package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efkc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        efkd efkdVarE = MessageNotification.e();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efkdVarE.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
            } else if (iD == 2) {
                efkdVarE.d((Message) dclv.n(parcel, i, Message.CREATOR));
            } else if (iD == 3) {
                efkdVarE.e((TraceId) dclv.n(parcel, i, TraceId.CREATOR));
            } else if (iD != 4) {
                dclv.C(parcel, i);
            } else if (dfog.v()) {
                efkdVarE.c(efkv.a(parcel, i));
            } else {
                dclv.C(parcel, i);
            }
        }
        return efkdVarE.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageNotification[i];
    }
}
