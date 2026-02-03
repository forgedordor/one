package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgdp extends cgan {
    public final cgbn a;
    public final fcsu b;
    public final ains c;
    public final cgdh d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public Optional h;
    public ConversationIdType i;
    ConversationId j;
    public int k;
    public int l;
    public boolean m;
    public alqm n;
    private final Context o;
    private final avmp r;
    private final fcsu s;

    public cgdp(Context context, cgaz cgazVar, avmp avmpVar, fcsu fcsuVar, final cqzr cqzrVar, ains ainsVar, cgdh cgdhVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, cgbn cgbnVar) {
        super(cgazVar.b(cgbe.RCS_NOT_DELIVERED, "RCS Not Delivered Notification", new cgda() { // from class: cgdl
            @Override // defpackage.cgda
            public final NotificationChannel a() throws Resources.NotFoundException {
                cqzr cqzrVar2 = cqzrVar;
                String string = cqzrVar2.b.getResources().getString(R.string.rcs_not_delivered_notification_channel_name);
                NotificationChannel notificationChannel = ((NotificationManager) cqzrVar2.a.b()).getNotificationChannel("bugle_rcs_not_delivered_channel");
                if (notificationChannel != null && notificationChannel.getGroup() != null && TextUtils.equals(notificationChannel.getName(), string)) {
                    return notificationChannel;
                }
                cqzp cqzpVar = new cqzp("bugle_rcs_not_delivered_channel", string, 3);
                cqzpVar.c(cqzq.DEFAULT_SETTINGS.e);
                NotificationChannel notificationChannel2 = cqzpVar.a;
                cqzrVar2.n(notificationChannel2);
                return notificationChannel2;
            }
        }));
        this.i = barn.a;
        this.j = InvalidConversationId.a;
        this.m = false;
        this.n = null;
        this.o = context;
        this.a = cgbnVar;
        this.r = avmpVar;
        this.b = fcsuVar;
        this.c = ainsVar;
        this.d = cgdhVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.s = fcsuVar5;
    }

    private final boolean e() {
        alqm alqmVar;
        return ((aquo) this.f.b()).a() && (alqmVar = this.n) != null && alqmVar.v();
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final Notification b() throws Resources.NotFoundException {
        String quantityString;
        PendingIntent pendingIntentA;
        if (e()) {
            Context context = this.o;
            alqm alqmVar = this.n;
            alqmVar.getClass();
            quantityString = context.getString(R.string.emergency_rcs_not_delivered_notification_title, alqmVar.j());
        } else {
            quantityString = this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_title, this.l);
        }
        kvf kvfVarA = null;
        String quantityString2 = (e() && this.k == 1) ? null : this.k == 1 ? this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.k, this.h.get()) : this.o.getResources().getQuantityString(R.plurals.rcs_not_delivered_notification_text, this.k);
        Context context2 = this.o;
        kvq kvqVar = new kvq(context2, o());
        if (this.k == 1) {
            Intent intentO = this.r.o(context2, this.j, null, true);
            intentO.putExtra("via_notification", true);
            intentO.putExtra("via_rcs_not_delivered_notification", true);
            intentO.setData(bace.e(context2, this.i));
            pendingIntentA = avmo.a(context2, intentO, 0);
            pendingIntentA.getClass();
        } else {
            Intent intentE = this.r.e(context2);
            intentE.putExtra("via_notification", true);
            intentE.putExtra("via_rcs_not_delivered_notification", true);
            pendingIntentA = avmo.a(context2, intentE, 0);
            pendingIntentA.getClass();
        }
        kvqVar.g = pendingIntentA;
        kvqVar.i(quantityString);
        kvqVar.h(quantityString2);
        kvqVar.w(quantityString);
        kvj kvjVar = new kvj();
        kvjVar.e(quantityString2);
        kvqVar.u(kvjVar);
        kvqVar.r(R.drawable.notification_icon);
        kvqVar.C = context2.getColor(R.color.primary_brand_non_icon_color);
        kvqVar.g(true);
        kvqVar.p(true);
        if (e()) {
            fcsu fcsuVar = this.s;
            cgcz cgczVar = (cgcz) fcsuVar.b();
            alqm alqmVar2 = this.n;
            alqmVar2.getClass();
            cpbz cpbzVar = cgczVar.b;
            String strJ = alqmVar2.j();
            Intent intentAddFlags = cpbzVar.a(strJ).addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            Context context3 = cgczVar.a;
            ResolveInfo resolveInfoResolveActivity = context3.getPackageManager().resolveActivity(intentAddFlags, 65536);
            if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
                intentAddFlags.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
                kvfVarA = new kve((IconCompat) null, context3.getString(R.string.emergency_rcs_not_delivered_call_button, strJ), ebsn.a(context3, 0, intentAddFlags, 201326592)).a();
            }
            if (kvfVarA != null) {
                kvqVar.e(kvfVarA);
            }
            kvqVar.e(((cgcz) fcsuVar.b()).b(this.l, this.i, this.j));
        }
        return kvqVar.a();
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final String d() {
        return "rcs_not_delivered_notification_tag";
    }
}
