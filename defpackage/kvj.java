package defpackage;

import android.app.Notification;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvj extends kwk {
    private CharSequence a;

    public kvj() {
    }

    @Override // defpackage.kwk
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // defpackage.kwk
    public final void b(kux kuxVar) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(((kwr) kuxVar).b).setBigContentTitle(this.h).bigText(this.a);
        if (this.j) {
            bigTextStyleBigText.setSummaryText(this.i);
        }
    }

    @Override // defpackage.kwk
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.bigText");
    }

    @Override // defpackage.kwk
    protected final void d(Bundle bundle) {
        super.d(bundle);
        this.a = bundle.getCharSequence("android.bigText");
    }

    public final void e(CharSequence charSequence) {
        this.a = kvq.c(charSequence);
    }

    public kvj(kvq kvqVar) {
        i(kvqVar);
    }
}
