package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface AsyncShouldInterceptRequestCallbackBoundaryInterface {

    /* compiled from: PG */
    public interface WebResponseCallbackBoundaryInterface {
        void doNotIntercept();

        void intercept(WebResourceResponse webResourceResponse);
    }

    void shouldInterceptRequestAsync(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler);
}
