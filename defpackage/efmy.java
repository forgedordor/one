package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmy extends efnd {
    public final evqs a;
    public final ContentType b;

    public efmy(evqs evqsVar, ContentType contentType) {
        this.a = evqsVar;
        this.b = contentType;
    }

    @Override // defpackage.efnd
    public final ContentType a() {
        return this.b;
    }

    @Override // defpackage.efnd
    public final evqs b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efnd) {
            efnd efndVar = (efnd) obj;
            if (this.a.equals(efndVar.b()) && this.b.equals(efndVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ContentType contentType = this.b;
        return "Content{content=" + this.a.toString() + ", contentType=" + contentType.toString() + "}";
    }
}
