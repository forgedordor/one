package defpackage;

import android.app.Notification;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwq {
    public static kvn a(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT < 29 || (bubbleMetadata = notification.getBubbleMetadata()) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return kvl.b(bubbleMetadata);
        }
        if (Build.VERSION.SDK_INT != 29) {
            return null;
        }
        return kvk.b(bubbleMetadata);
    }

    public static boolean b(Notification notification) {
        return (notification.flags & 512) != 0;
    }
}
