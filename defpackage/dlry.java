package defpackage;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlry {
    private final WebResourceRequest a;
    private final WebResourceError b;

    public dlry(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlry)) {
            return false;
        }
        dlry dlryVar = (dlry) obj;
        return fdbq.f(this.a, dlryVar.a) && fdbq.f(this.b, dlryVar.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.a;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WebViewError(request=" + this.a + ", error=" + this.b + ")";
    }
}
