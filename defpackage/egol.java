package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egol {
    final Notification a;
    final int b;
    final String c;

    public egol(Notification notification, int i, String str) {
        this.a = notification;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        return "Trace=[" + this.c + "], importance=[" + this.b + "]" + (", notification=[" + this.a.getChannelId() + "]");
    }
}
