package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yoj {
    private final MessageId a;
    private final Uri b;

    public yoj(MessageId messageId, Uri uri) {
        this.a = messageId;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yoj)) {
            return false;
        }
        yoj yojVar = (yoj) obj;
        return fdbq.f(this.a, yojVar.a) && fdbq.f(this.b, yojVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheKey(messageId=" + this.a + ", uri=" + this.b + ")";
    }
}
