package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class effv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        effw effwVarJ = SendMessageRequest.j();
        int iH = dclv.h(parcel);
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            switch (dclv.d(i)) {
                case 1:
                    effwVarJ.c(dclv.j(parcel, i));
                    continue;
                case 2:
                    effwVarJ.b((Conversation) dclv.n(parcel, i, Conversation.CREATOR));
                    continue;
                case 3:
                    effwVarJ.d((Message) dclv.n(parcel, i, Message.CREATOR));
                    continue;
                case 4:
                    effwVarJ.e((MessageClass) dclv.n(parcel, i, MessageClass.CREATOR));
                    continue;
                case 5:
                    effwVarJ.h((TraceId) dclv.n(parcel, i, TraceId.CREATOR));
                    continue;
                case 6:
                    byte[] bArrE = dclv.E(parcel, i);
                    if (bArrE != null) {
                        effwVarJ.g(evqs.x(bArrE));
                    } else {
                        continue;
                    }
                case 7:
                    if (!dfog.E()) {
                        break;
                    } else {
                        effwVarJ.f((efkm) efkv.b(parcel, i, efkm.class));
                    }
            }
            dclv.C(parcel, i);
        }
        return effwVarJ.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendMessageRequest[0];
    }
}
