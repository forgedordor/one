package defpackage;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgio {
    private final Context a;
    private final cgkb b;

    public cgio(Context context, cgkb cgkbVar) {
        this.a = context;
        this.b = cgkbVar;
    }

    public final Notification a() {
        String id = this.b.f().getId();
        Context context = this.a;
        kvq kvqVar = new kvq(context, id);
        String string = context.getString(R.string.notification2o_foreground_service_notification_generic_text);
        kvqVar.h(string);
        kvqVar.w(string);
        kvj kvjVar = new kvj(kvqVar);
        kvjVar.e(string);
        kvqVar.u(kvjVar);
        kvqVar.C = context.getColor(R.color.primary_brand_icon_color);
        kvqVar.r(R.drawable.quantum_gm_ic_sms_white_24);
        return kvqVar.a();
    }
}
