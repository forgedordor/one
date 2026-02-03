package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atbe extends atbt {
    public final UrlResponseInfo a;
    private final evqs b;

    public atbe(UrlResponseInfo urlResponseInfo, evqs evqsVar) {
        if (urlResponseInfo == null) {
            throw new NullPointerException("Null urlResponseInfo");
        }
        this.a = urlResponseInfo;
        if (evqsVar == null) {
            throw new NullPointerException("Null responseBody");
        }
        this.b = evqsVar;
    }

    @Override // defpackage.atbt
    public final evqs a() {
        return this.b;
    }

    @Override // defpackage.atbt
    public final UrlResponseInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atbt) {
            atbt atbtVar = (atbt) obj;
            if (this.a.equals(atbtVar.b()) && this.b.equals(atbtVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.b;
        return "HttpResponse{urlResponseInfo=" + this.a.toString() + ", responseBody=" + evqsVar.toString() + "}";
    }
}
