package defpackage;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrj {
    public static final cczv a = cdag.q(184724319, "add_badge_count");
    public static final ejxr b = cdag.w(175614877, "support_satellite_notification_reply");
    public final cgbg c;
    public final abgl d;
    public final csu e = new csu(7);
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    private final Context h;
    private final cqzr i;
    private final String j;
    private final epqj k;
    private final Intent l;
    private final kxa m;

    public abrj(cgbg cgbgVar, Context context, cqzr cqzrVar, abgl abglVar, String str, epqj epqjVar, kxa kxaVar) {
        this.c = cgbgVar;
        this.h = context;
        this.j = str;
        this.k = epqjVar;
        this.d = abglVar;
        this.i = cqzrVar;
        this.m = kxaVar;
        Intent intentA = aiiw.c(context, DittoWebActivity.class, "android.intent.action.VIEW").a();
        this.l = intentA;
        intentA.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        intentA.putExtra("conversation_id_for_launch", abglVar.toString());
        intentA.setData(abmt.c(abglVar));
    }

    private final String c() {
        return this.d.a();
    }

    public final cgbf a() {
        abgl abglVar = this.d;
        NotificationChannel notificationChannelE = this.i.e(barn.b(abglVar.a()), c(), true);
        String id = notificationChannelE != null ? notificationChannelE.getId() : "";
        Context context = this.h;
        kvq kvqVar = new kvq(context, id);
        kvqVar.g = ebsn.a(context, 0, this.l, crag.a(0));
        kwf kwfVar = new kwf(this.m);
        epqj epqjVar = this.k;
        if (epqjVar.b) {
            kwfVar.a = this.j;
            kwfVar.h(true);
        }
        int i = 0;
        while (true) {
            csu csuVar = this.e;
            if (i >= csuVar.a()) {
                break;
            }
            kwfVar.g((kwe) csuVar.b(i));
            i++;
        }
        kvqVar.u(kwfVar);
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.H = c();
        Bundle bundle = new Bundle();
        if (!epqjVar.b) {
            bundle.putString("android.conversationTitle", this.j);
        }
        kvqVar.B = bundle;
        if (((Boolean) a.e()).booleanValue()) {
            kvqVar.k = this.f.get();
        }
        if (((Boolean) ((cczi) b.get()).e()).booleanValue()) {
            Intent intentA = aiiw.c(context, abrt.class, "android.intent.action.VIEW").a();
            intentA.setAction("com.google.android.apps.messaging.SATELLITE_MESSAGE_REPLY");
            intentA.putExtra("bugle_dittosatellite_reply_conversation_id", abglVar.toString());
            intentA.putExtra("bugle_dittosatellite_reply_conversation_name", this.j);
            intentA.putExtra("bugle_dittosatellite_conversation_proto", epqjVar.toByteArray());
            kve kveVar = new kve(R.drawable.notification_icon, context.getString(R.string.reply_button_label), PendingIntent.getBroadcast(context, 0, intentA, crag.a | 1207959552));
            kveVar.c(new kxb("bugle_dittosatellite_reply_text", context.getString(R.string.reply_button_label), null, true, 0, new Bundle(), new HashSet()));
            kvqVar.e(kveVar.a());
        }
        return new abri(this, kvqVar.a());
    }

    public final void b() {
        this.g = false;
        csu csuVar = this.e;
        int iA = csuVar.a();
        if (iA > 0) {
            if (iA > csuVar.a()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int length = csuVar.a.length;
            int i = csuVar.b;
            if (iA < length - i) {
                length = i + iA;
            }
            while (i < length) {
                csuVar.a[i] = null;
                i++;
            }
            int i2 = csuVar.b;
            int i3 = length - i2;
            int i4 = iA - i3;
            csuVar.b = csuVar.d & (i2 + i3);
            if (i4 > 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    csuVar.a[i5] = null;
                }
                csuVar.b = i4;
            }
        }
        this.f.set(0);
        this.c.b(this.d.toString(), cgbe.SATELLITE_INCOMING_MESSAGE);
    }
}
