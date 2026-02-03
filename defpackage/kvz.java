package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvz {
    static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    static Notification.MessagingStyle b(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
