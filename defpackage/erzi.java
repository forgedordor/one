package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erzi extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public erzi(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (erzj.a) {
            Iterator it = erzj.b.values().iterator();
            while (it.hasNext()) {
                ((erzj) it.next()).j();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
