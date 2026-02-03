package defpackage;

import android.app.Notification;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abri implements cgbf {
    final /* synthetic */ abrj a;
    private final Notification b;

    public abri(abrj abrjVar, Notification notification) {
        this.a = abrjVar;
        this.b = notification;
    }

    @Override // defpackage.cgbf
    public final /* synthetic */ int a() {
        return cgbd.a(this);
    }

    @Override // defpackage.cgbf
    public final Notification b() {
        return this.b;
    }

    @Override // defpackage.cgbf
    public final cgbe c() {
        return cgbe.SATELLITE_INCOMING_MESSAGE;
    }

    @Override // defpackage.cgbf
    public final String d() {
        return this.a.d.toString();
    }

    public final String toString() {
        return String.format(Locale.US, "%s (id: %s, tag: %s)", String.format("Incoming Message Notification for Satellite Conversation %s", this.a.d), cgbe.SATELLITE_INCOMING_MESSAGE, d());
    }
}
