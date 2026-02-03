package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.graphics.drawable.Icon;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvu {
    static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
        return Notification.CallStyle.forOngoingCall(person, pendingIntent);
    }

    static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
    }

    static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
        return callStyle.setAnswerButtonColorHint(i);
    }

    static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
        return callStyle.setDeclineButtonColorHint(i);
    }

    static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
        return callStyle.setIsVideo(z);
    }

    static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
        return callStyle.setVerificationIcon(icon);
    }

    static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
        return callStyle.setVerificationText(charSequence);
    }
}
