package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvl {
    static Notification.BubbleMetadata a(kvn kvnVar) {
        String str = kvnVar.g;
        Notification.BubbleMetadata.Builder builder = str != null ? new Notification.BubbleMetadata.Builder(str) : new Notification.BubbleMetadata.Builder(kvnVar.a, kvnVar.c.c());
        builder.setDeleteIntent(kvnVar.b).setAutoExpandBubble(kvnVar.a()).setSuppressNotification(kvnVar.b());
        int i = kvnVar.d;
        if (i != 0) {
            builder.setDesiredHeight(i);
        }
        int i2 = kvnVar.e;
        if (i2 != 0) {
            builder.setDesiredHeightResId(i2);
        }
        return builder.build();
    }

    static kvn b(Notification.BubbleMetadata bubbleMetadata) {
        kvm kvmVar = bubbleMetadata.getShortcutId() != null ? new kvm(bubbleMetadata.getShortcutId()) : new kvm(bubbleMetadata.getIntent(), kzt.e(bubbleMetadata.getIcon()));
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
