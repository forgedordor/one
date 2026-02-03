package org.chromium.net;

import defpackage.evqs;
import defpackage.evui;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface RequestContextConfigOptionsOrBuilder extends evui {
    boolean getBrotliEnabled();

    boolean getBypassPublicKeyPinningForLocalTrustAnchors();

    boolean getDisableCache();

    boolean getEnableNetworkQualityEstimator();

    String getExperimentalOptions();

    evqs getExperimentalOptionsBytes();

    boolean getHttp2Enabled();

    long getHttpCacheMaxSize();

    int getHttpCacheMode();

    long getMockCertVerifier();

    int getNetworkThreadPriority();

    String getQuicDefaultUserAgentId();

    evqs getQuicDefaultUserAgentIdBytes();

    boolean getQuicEnabled();

    String getStoragePath();

    evqs getStoragePathBytes();

    String getUserAgent();

    evqs getUserAgentBytes();

    boolean hasBrotliEnabled();

    boolean hasBypassPublicKeyPinningForLocalTrustAnchors();

    boolean hasDisableCache();

    boolean hasEnableNetworkQualityEstimator();

    boolean hasExperimentalOptions();

    boolean hasHttp2Enabled();

    boolean hasHttpCacheMaxSize();

    boolean hasHttpCacheMode();

    boolean hasMockCertVerifier();

    boolean hasNetworkThreadPriority();

    boolean hasQuicDefaultUserAgentId();

    boolean hasQuicEnabled();

    boolean hasStoragePath();

    boolean hasUserAgent();
}
