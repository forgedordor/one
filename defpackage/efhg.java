package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ChatMessage;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhg extends efij {
    private evqs a;
    private ContentType b;

    @Override // defpackage.efij
    public final ChatMessage a() {
        ContentType contentType;
        evqs evqsVar = this.a;
        if (evqsVar != null && (contentType = this.b) != null) {
            return new AutoValue_ChatMessage(evqsVar, contentType);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.efij
    public final void b(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = evqsVar;
    }

    @Override // defpackage.efij
    public final void c(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = contentType;
    }
}
