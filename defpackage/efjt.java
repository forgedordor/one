package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.AutoOneOf_Message_MessageContent;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.android.rcs.client.messaging.data.Message;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efjt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iH = dclv.h(parcel);
        efju efjuVar = efju.CHAT;
        while (parcel.dataPosition() < iH) {
            int i = parcel.readInt();
            int iD = dclv.d(i);
            if (iD == 1) {
                efjuVar = (efju) efkv.b(parcel, i, efju.class);
            } else {
                if (iD == 2) {
                    int iOrdinal = efjuVar.ordinal();
                    if (iOrdinal == 0) {
                        return AutoOneOf_Message_MessageContent.a((ChatMessage) dclv.n(parcel, i, ChatMessage.CREATOR));
                    }
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("No valid content type found.");
                    }
                    IsComposingMessage isComposingMessage = (IsComposingMessage) dclv.n(parcel, i, IsComposingMessage.CREATOR);
                    isComposingMessage.getClass();
                    return new AutoOneOf_Message_MessageContent.Impl_isComposing(isComposingMessage);
                }
                dclv.C(parcel, i);
            }
        }
        throw new IllegalArgumentException("Invalid contentType");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message.MessageContent[i];
    }
}
