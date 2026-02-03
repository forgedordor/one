package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efhn extends efiv {
    private final ContentType a;
    private final Uri b;

    public efhn(ContentType contentType, Uri uri) {
        this.a = contentType;
        this.b = uri;
    }

    @Override // defpackage.efiv
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.efiv
    public final ContentType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efiv) {
            efiv efivVar = (efiv) obj;
            if (this.a.equals(efivVar.b()) && this.b.equals(efivVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
