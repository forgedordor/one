package defpackage;

import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqj extends ppj {
    private final JsReplyProxyBoundaryInterface a;

    public pqj(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    @Override // defpackage.ppj
    public final void a(String str) {
        if (!pqx.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        this.a.postMessage(str);
    }
}
