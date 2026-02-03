package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.core.app.RemoteActionCompat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugr {
    public static Pair a(euib euibVar) {
        RemoteActionCompat remoteActionCompat = euibVar.b;
        if (remoteActionCompat == null) {
            return null;
        }
        Intent intent = (Intent) euibVar.c.getParcelable("action-intent");
        ComponentName component = (intent != null ? new Intent(intent) : null).getComponent();
        return new Pair(remoteActionCompat.b.toString(), component != null ? component.getPackageName() : null);
    }

    public static String b(ParcelFileDescriptor parcelFileDescriptor) {
        return ((Uri) ecfj.a(parcelFileDescriptor).first).toString();
    }
}
