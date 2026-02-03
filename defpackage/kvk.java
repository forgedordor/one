package defpackage;

import android.app.Notification;
import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvk {
    static Notification.BubbleMetadata a(kvn kvnVar) {
        PendingIntent pendingIntent = kvnVar.a;
        if (pendingIntent == null) {
            return null;
        }
        Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(kvnVar.c.c()).setIntent(pendingIntent).setDeleteIntent(kvnVar.b).setAutoExpandBubble(kvnVar.a()).setSuppressNotification(kvnVar.b());
        int i = kvnVar.d;
        if (i != 0) {
            suppressNotification.setDesiredHeight(i);
        }
        int i2 = kvnVar.e;
        if (i2 != 0) {
            suppressNotification.setDesiredHeightResId(i2);
        }
        return suppressNotification.build();
    }

    static kvn b(Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata.getIntent() == null) {
            return null;
        }
        kvm kvmVar = new kvm(bubbleMetadata.getIntent(), kzt.e(bubbleMetadata.getIcon()));
        kvmVar.b(bubbleMetadata.getAutoExpandBubble());
        kvmVar.a = bubbleMetadata.getDeleteIntent();
        kvmVar.e(bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            kvmVar.c(bubbleMetadata.getDesiredHeight());
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            kvmVar.d(bubbleMetadata.getDesiredHeightResId());
        }
        return kvmVar.a();
    }
}
