package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmx extends efnc {
    private evqs a;
    private ContentType b;

    @Override // defpackage.efnc
    public final efnd a() {
        ContentType contentType;
        evqs evqsVar = this.a;
        if (evqsVar != null && (contentType = this.b) != null) {
            return new efmy(evqsVar, contentType);
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

    @Override // defpackage.efnc
    public final void b(evqs evqsVar) {
        if (evqsVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = evqsVar;
    }

    @Override // defpackage.efnc
    public final void c(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = contentType;
    }
}
