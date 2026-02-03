package org.chromium.net;

import defpackage.ffxq;
import defpackage.ffyf;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class RegistrationPolicyApplicationStatus extends NetworkChangeNotifierAutoDetect.RegistrationPolicy implements ffxq {
    private boolean mDestroyed;

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void destroy() {
        if (this.mDestroyed) {
            return;
        }
        ffyf ffyfVar = ApplicationStatus.c;
        if (ffyfVar != null) {
            ffyfVar.c(this);
        }
        this.mDestroyed = true;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.RegistrationPolicy
    protected void init(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.init(networkChangeNotifierAutoDetect);
        ApplicationStatus.a(this);
        onApplicationStateChange(0);
    }

    public void onApplicationStateChange(int i) {
        ApplicationStatus.getStateForApplication();
        unregister();
    }
}
