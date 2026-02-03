package org.chromium.net;

import defpackage.ffzz;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1 implements Runnable {
    public /* synthetic */ NetworkChangeNotifierAutoDetect f$0;
    public /* synthetic */ ffzz f$1;

    public /* synthetic */ NetworkChangeNotifierAutoDetect$$ExternalSyntheticLambda1(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect, ffzz ffzzVar) {
        this.f$0 = networkChangeNotifierAutoDetect;
        this.f$1 = ffzzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f$0.lambda$setWifiManagerDelegateForTests$2(this.f$1);
    }
}
