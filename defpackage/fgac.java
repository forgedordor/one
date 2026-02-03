package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.chromium.net.ProxyChangeListener;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgac extends BroadcastReceiver {
    public final /* synthetic */ ProxyChangeListener a;

    public fgac(ProxyChangeListener proxyChangeListener) {
        this.a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
            this.a.runOnThread(new Runnable() { // from class: org.chromium.net.ProxyChangeListener$ProxyReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.a.proxySettingsChanged(ProxyChangeListener.extractNewProxy(intent));
                }
            });
        }
    }
}
