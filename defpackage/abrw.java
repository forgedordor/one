package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrw implements cgbf {
    public final cgbg a;
    private final Notification b;
    private final String c;

    public abrw(cgbg cgbgVar, Context context, cqzr cqzrVar, String str, String str2, String str3) throws Resources.NotFoundException {
        this.a = cgbgVar;
        this.c = str;
        NotificationChannel notificationChannelG = cqzrVar.g();
        kvq kvqVar = new kvq(context, notificationChannelG != null ? notificationChannelG.getId() : "");
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.g = ebsn.a(context, 0, new Intent(context, (Class<?>) DittoWebActivity.class).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES), crag.a(1073741824));
        kvqVar.i(str2);
        kvqVar.h(str3);
        this.b = kvqVar.a();
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
        return cgbe.SATELLITE_STATUS;
    }

    @Override // defpackage.cgbf
    public final String d() {
        return this.c;
    }

    public final void e() {
        this.a.b(this.c, cgbe.SATELLITE_STATUS);
    }

    public final String toString() {
        String str = this.c;
        return String.format(Locale.US, "%s (id: %s, tag: %s)", String.format("Satellite Status Notification with tag %s", str), cgbe.SATELLITE_STATUS, str);
    }
}
