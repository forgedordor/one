package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cgbl {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public cgbl(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.m = fcsuVar4;
        this.d = fcsuVar5;
        this.e = fcsuVar6;
        this.n = fcsuVar7;
        this.f = fcsuVar8;
        this.g = fcsuVar9;
        this.o = fcsuVar10;
        this.h = fcsuVar11;
        this.i = fcsuVar12;
        this.j = fcsuVar13;
        this.p = fcsuVar14;
        this.k = fcsuVar15;
        this.q = fcsuVar16;
        this.r = fcsuVar17;
        this.l = fcsuVar18;
    }

    final cgbf a(final String str) {
        final cgcf cgcfVar = (cgcf) this.p.b();
        return ((cgei) cgcfVar.b.b()).b(new cgeg() { // from class: cgcd
            @Override // defpackage.cgeg
            public final Notification a(String str2) {
                cgcf cgcfVar2 = cgcfVar;
                Context context = cgcfVar2.a;
                kvq kvqVar = new kvq(context, str2);
                String str3 = str;
                kvqVar.h(str3);
                kvqVar.r(R.drawable.quantum_gm_ic_sync_white_24);
                kvqVar.l = 0;
                kvqVar.w(str3);
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(str3);
                kvqVar.u(kvjVar);
                kvqVar.C = context.getColor(R.color.silent_notification_icon_color);
                Intent intentE = ((avmp) cgcfVar2.d.b()).e(context);
                intentE.setAction("android.intent.action.VIEW");
                TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(context);
                taskStackBuilderCreate.addNextIntentWithParentStack(intentE);
                PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(0, crag.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
                kvqVar.g(true);
                kvqVar.g = pendingIntent;
                return kvqVar.a();
            }
        }, cgbe.CMS_SYNC_FOREGROUND_SERVICE, new cgda() { // from class: cgce
            @Override // defpackage.cgda
            public final NotificationChannel a() {
                return ((cqzr) cgcfVar.c.b()).c();
            }
        });
    }

    final cgbf b(final String str) {
        final cgck cgckVar = (cgck) this.n.b();
        return ((cgei) cgckVar.d.b()).b(new cgeg() { // from class: cgci
            @Override // defpackage.cgeg
            public final Notification a(String str2) {
                cgck cgckVar2 = cgckVar;
                Context context = cgckVar2.c;
                kvq kvqVar = new kvq(context, str2);
                String str3 = str;
                kvqVar.h(str3);
                kvqVar.l = 0;
                kvqVar.w(str3);
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(str3);
                kvqVar.u(kvjVar);
                kvqVar.C = context.getColor(R.color.silent_notification_icon_color);
                kvqVar.r(true != ((Boolean) cgck.b.e()).booleanValue() ? R.drawable.notification_icon : R.drawable.quantum_gm_ic_sms_white_24);
                if (((Boolean) cgck.a.e()).booleanValue() && cgckVar2.g.isEmpty()) {
                    kvqVar.e(((cgcz) cgckVar2.e.b()).a(emgm.PERSISTENT_FOREGROUND_NOTIFICATION));
                }
                return kvqVar.a();
            }
        }, cgbe.FOREGROUND_SERVICE, new cgda() { // from class: cgcj
            @Override // defpackage.cgda
            public final NotificationChannel a() {
                return ((cqzr) cgckVar.f.b()).c();
            }
        });
    }

    final cgbf c(final avmp avmpVar, final ConversationIdType conversationIdType, final String str) {
        final cgdk cgdkVar = (cgdk) this.m.b();
        cgei cgeiVar = cgdkVar.b;
        cgeg cgegVar = new cgeg() { // from class: cgdi
            @Override // defpackage.cgeg
            public final Notification a(String str2) {
                String str3 = str;
                Context context = cgdkVar.a;
                String string = context.getString(R.string.notification_emergency_send_failure_line1, str3);
                String string2 = context.getString(R.string.notification_emergency_send_failure_line2, str3);
                PendingIntent pendingIntentR = avmpVar.r(context, new BugleConversationId(conversationIdType));
                kvq kvqVar = new kvq(context, str2);
                kvqVar.w(string);
                kvqVar.i(string);
                kvqVar.h(string2);
                kvj kvjVar = new kvj(kvqVar);
                kvjVar.e(string2);
                kvqVar.u(kvjVar);
                kvqVar.r(R.drawable.ic_warning_light);
                kvqVar.g = pendingIntentR;
                kvqVar.t(cqmz.x(context));
                return kvqVar.a();
            }
        };
        cgbe cgbeVar = cgbe.MESSAGE_FAILURE;
        cgda cgdaVar = new cgda() { // from class: cgdj
            @Override // defpackage.cgda
            public final NotificationChannel a() {
                return cgdkVar.c.e(conversationIdType, null, false);
            }
        };
        cgaz cgazVar = (cgaz) cgeiVar.a.b();
        cgazVar.getClass();
        cgbeVar.getClass();
        return new cgeh(cgazVar, cgegVar, cgbeVar, "Outgoing Emergency Message Failure", cgdaVar);
    }

    final cgbf d(emgm emgmVar, String str, ekgp ekgpVar) {
        cgdw cgdwVarE = cgdx.e();
        cgdwVarE.b(emgmVar);
        Optional optionalOf = Optional.of(str);
        cgau cgauVar = (cgau) cgdwVarE;
        cgauVar.a = optionalOf;
        if (ekgpVar != null) {
            cgauVar.c = Optional.of(ekgpVar);
        }
        return ((cgea) this.f.b()).a(cgdwVarE.a());
    }

    final cgdp e(cgbn cgbnVar) {
        cgdq cgdqVar = (cgdq) this.q.b();
        Context context = (Context) cgdqVar.a.b();
        context.getClass();
        cgaz cgazVar = (cgaz) cgdqVar.b.b();
        cgazVar.getClass();
        avmp avmpVar = (avmp) cgdqVar.c.b();
        avmpVar.getClass();
        fcsu fcsuVar = cgdqVar.d;
        cqzr cqzrVar = (cqzr) cgdqVar.e.b();
        cqzrVar.getClass();
        ains ainsVar = (ains) cgdqVar.f.b();
        ainsVar.getClass();
        cgdh cgdhVar = (cgdh) cgdqVar.g.b();
        cgdhVar.getClass();
        return new cgdp(context, cgazVar, avmpVar, fcsuVar, cqzrVar, ainsVar, cgdhVar, cgdqVar.h, cgdqVar.i, cgdqVar.j, cgdqVar.k, cgbnVar);
    }

    final cgds f(cgbn cgbnVar) {
        cgdt cgdtVar = (cgdt) this.r.b();
        Context context = (Context) cgdtVar.a.b();
        context.getClass();
        cgaz cgazVar = (cgaz) cgdtVar.b.b();
        cgazVar.getClass();
        avmp avmpVar = (avmp) cgdtVar.c.b();
        avmpVar.getClass();
        fcsu fcsuVar = cgdtVar.d;
        ains ainsVar = (ains) cgdtVar.e.b();
        ainsVar.getClass();
        cgdh cgdhVar = (cgdh) cgdtVar.f.b();
        cgdhVar.getClass();
        return new cgds(context, cgazVar, avmpVar, fcsuVar, ainsVar, cgdhVar, cgbnVar, cgdtVar.g, cgdtVar.h);
    }

    final cger g(cgbn cgbnVar) {
        cges cgesVar = (cges) this.o.b();
        Context context = (Context) cgesVar.a.b();
        context.getClass();
        cgaz cgazVar = (cgaz) cgesVar.b.b();
        cgazVar.getClass();
        fcsu fcsuVar = cgesVar.c;
        fcsu fcsuVar2 = cgesVar.d;
        cgcz cgczVar = (cgcz) cgesVar.e.b();
        cgczVar.getClass();
        fcsu fcsuVar3 = cgesVar.f;
        clgq clgqVar = (clgq) cgesVar.g.b();
        clgqVar.getClass();
        cqzr cqzrVar = (cqzr) cgesVar.h.b();
        cqzrVar.getClass();
        return new cger(context, cgazVar, fcsuVar, fcsuVar2, cgczVar, fcsuVar3, clgqVar, cqzrVar, cgbnVar, cgesVar.i, cgesVar.j);
    }
}
