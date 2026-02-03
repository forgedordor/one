package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mox extends BroadcastReceiver {
    private final mew a;

    public mox(mew mewVar) {
        this.a = mewVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.b(new Runnable() { // from class: mow
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }
}
