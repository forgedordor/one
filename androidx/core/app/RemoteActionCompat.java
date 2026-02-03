package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.kzt;
import defpackage.lcg;
import defpackage.pot;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RemoteActionCompat implements pot {
    public IconCompat a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public boolean e;
    public boolean f;

    public RemoteActionCompat() {
    }

    public static RemoteActionCompat a(RemoteAction remoteAction) {
        lcg.i(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(kzt.e(remoteAction.getIcon()), remoteAction.getTitle(), remoteAction.getContentDescription(), remoteAction.getActionIntent());
        remoteActionCompat.e = remoteAction.isEnabled();
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.f = remoteAction.shouldShowIcon();
        }
        return remoteActionCompat;
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.a = iconCompat;
        lcg.i(charSequence);
        this.b = charSequence;
        lcg.i(charSequence2);
        this.c = charSequence2;
        lcg.i(pendingIntent);
        this.d = pendingIntent;
        this.e = true;
        this.f = true;
    }
}
