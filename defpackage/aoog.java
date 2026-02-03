package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoog {
    public final ConversationIdType a;
    public final MessageIdType b;
    public final String c;
    public final Uri d;
    public final boolean e;

    public aoog(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, Uri uri, boolean z) {
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = str;
        this.d = uri;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoog)) {
            return false;
        }
        aoog aoogVar = (aoog) obj;
        return fdbq.f(this.a, aoogVar.a) && fdbq.f(this.b, aoogVar.b) && fdbq.f(this.c, aoogVar.c) && fdbq.f(this.d, aoogVar.d) && this.e == aoogVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "TranscriptionRequest(conversationId=" + this.a + ", messageId=" + this.b + ", partId=" + this.c + ", audioFile=" + this.d + ", isUserTriggered=" + this.e + ")";
    }
}
