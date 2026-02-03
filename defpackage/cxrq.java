package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.google.android.libraries.subscriptions.restore.IG1Restore;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxrq implements ServiceConnection {
    final /* synthetic */ Activity a;

    public cxrq(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            ((IG1Restore.Stub) iBinder).requestRestore(Uri.EMPTY, Uri.EMPTY, Uri.EMPTY);
        } catch (Exception e) {
            ekrw ekrwVarJ = cxsa.c.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$6", "onServiceConnected", (char) 5871, "DebugUtilsImpl.java")).q("Failed IG1 Request restore");
        }
        this.a.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
