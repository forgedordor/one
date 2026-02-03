package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqp implements WebMessageListenerBoundaryInterface {
    private final ppr a;

    public pqp(ppr pprVar) {
        this.a = pprVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        ppk ppkVarA = pqn.a((WebMessageBoundaryInterface) fgho.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (ppkVarA != null) {
            final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) fgho.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            this.a.a(ppkVarA, z, (pqj) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: pqi
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new pqj(jsReplyProxyBoundaryInterface);
                }
            }));
        }
    }
}
