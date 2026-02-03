package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ServiceWorkerControllerBoundaryInterface {
    void clearAsyncInterceptRequestCallback();

    InvocationHandler getServiceWorkerWebSettings();

    void setAsyncInterceptRequestCallback(InvocationHandler invocationHandler);

    void setServiceWorkerClient(InvocationHandler invocationHandler);
}
