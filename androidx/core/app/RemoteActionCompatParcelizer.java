package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.por;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(por porVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) porVar.C(remoteActionCompat.a);
        remoteActionCompat.b = porVar.h(remoteActionCompat.b, 2);
        remoteActionCompat.c = porVar.h(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) porVar.d(remoteActionCompat.d, 4);
        remoteActionCompat.e = porVar.z(remoteActionCompat.e, 5);
        remoteActionCompat.f = porVar.z(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, por porVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        porVar.D(remoteActionCompat.a);
        porVar.q(remoteActionCompat.b, 2);
        porVar.q(remoteActionCompat.c, 3);
        porVar.u(remoteActionCompat.d, 4);
        porVar.n(remoteActionCompat.e, 5);
        porVar.n(remoteActionCompat.f, 6);
    }
}
