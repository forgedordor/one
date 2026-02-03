package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;
import com.google.android.apps.messaging.shared.notification.receiver.DismissNotificationReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasd implements aasc {
    private final fcsu b;

    public aasd(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.aasc
    public final void a() {
        ejwl.l(b());
        ((aasi) this.b.b()).a.j(cgbe.DATA_DONATION);
    }

    @Override // defpackage.aasc
    public final boolean b() {
        return ((Boolean) aasc.a.e()).booleanValue();
    }

    @Override // defpackage.aasc
    public final boolean c() {
        ejwl.l(b());
        aasi aasiVar = (aasi) this.b.b();
        cgbn cgbnVar = aasiVar.a;
        if (!cgbnVar.J()) {
            return false;
        }
        final aash aashVar = aasiVar.b;
        cgbnVar.H(aashVar.b.a(new cgeg() { // from class: aasg
            @Override // defpackage.cgeg
            public final Notification a(String str) {
                Context context = aashVar.a;
                kvq kvqVar = new kvq(context, str);
                PendingIntent pendingIntentF = DismissNotificationReceiver.f(context, cgbe.DATA_DONATION);
                Intent intent = new Intent(context, (Class<?>) DataDonationActivity.class);
                intent.putExtra("DATA_DONATION_OPEN_SOURCE", 2);
                intent.putExtra("EXTRA_COLLECTOR_KEY", "AllMessagesDonationConversationCollector");
                kxg kxgVar = new kxg(context);
                kxgVar.e(intent);
                PendingIntent pendingIntentA = kxgVar.a(0, 201326592);
                pendingIntentA.getClass();
                kvqVar.i(context.getString(R.string.donation_notification_title));
                kvqVar.h(context.getString(R.string.donation_notification_body));
                kvqVar.l = 3;
                kvqVar.r(R.drawable.notification_icon);
                kvqVar.d(R.drawable.ic_check_circle_gray, context.getString(R.string.automoved_spam_notification_action_dismiss), pendingIntentF);
                kvqVar.d(R.drawable.quantum_ic_googleplus_reshare_googblue_24, context.getString(R.string.automoved_spam_notification_action_view), pendingIntentA);
                kvqVar.g = pendingIntentA;
                kvqVar.g(true);
                kvqVar.p(true);
                kvqVar.C = context.getColor(R.color.primary_color);
                return kvqVar.a();
            }
        }, cgbe.DATA_DONATION));
        aasf aasfVar = aasiVar.c;
        elwr elwrVar = (elwr) elxh.a.createBuilder();
        elwz elwzVar = (elwz) elxb.a.createBuilder();
        elwzVar.copyOnWrite();
        elxb elxbVar = (elxb) elwzVar.instance;
        elxbVar.c = 1;
        elxbVar.b |= 1;
        elwrVar.copyOnWrite();
        elxh elxhVar = (elxh) elwrVar.instance;
        elxb elxbVar2 = (elxb) elwzVar.build();
        elxbVar2.getClass();
        elxhVar.c = elxbVar2;
        elxhVar.b = 5;
        aasfVar.a(elwrVar);
        return true;
    }
}
