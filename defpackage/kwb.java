package defpackage;

import android.app.Notification;
import android.app.Person;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwb {
    static Notification.MessagingStyle a(Person person) {
        return new Notification.MessagingStyle(person);
    }

    static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
