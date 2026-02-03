package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexw extends eeyz {
    public eexw(Context context) {
        super(new eeza("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }

    @Override // defpackage.eeyz
    protected final void a(Context context, Intent intent) {
        if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            this.a.a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
            return;
        }
        eeza eezaVar = this.a;
        eezaVar.a("List of extras in received intent:", new Object[0]);
        for (String str : intent.getExtras().keySet()) {
            eezaVar.a("Key: %s; value: %s", str, intent.getExtras().get(str));
        }
        eezaVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        eezaVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        eezaVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        eeyu eeyuVar = new eeyu(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
        eezaVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", eeyuVar);
        b(eeyuVar);
    }
}
