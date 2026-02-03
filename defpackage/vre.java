package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vre implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        boolean z;
        parcel.getClass();
        ConversationId conversationId = (ConversationId) parcel.readParcelable(OpenConversation2Arguments.class.getClassLoader());
        MessageId messageId = (MessageId) parcel.readParcelable(OpenConversation2Arguments.class.getClassLoader());
        String string = parcel.readString();
        boolean z2 = false;
        if (parcel.readInt() == 0) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
        }
        if (parcel.readInt() != 0) {
            z = false;
            z2 = true;
        } else {
            z = false;
        }
        if (parcel.readInt() != 0) {
            z = true;
        }
        return new OpenConversation2Arguments(conversationId, messageId, string, boolValueOf, z2, z, (ajlm) Enum.valueOf(ajlm.class, parcel.readString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OpenConversation2Arguments[i];
    }
}
