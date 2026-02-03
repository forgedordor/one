package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahpt extends ahpm {
    private final Optional r;

    public ahpt(Context context, cgaz cgazVar, cqzr cqzrVar, crac cracVar, crab crabVar, fcsu fcsuVar, cssf cssfVar, Optional optional, Optional optional2, Optional optional3, cgbn cgbnVar, cuhf cuhfVar, List list) {
        super(context, cqzrVar, cgbnVar, cracVar, crabVar, fcsuVar, optional, optional2, list, cgazVar, cuhfVar, "Single Reminder Notification");
        ejwl.b(list.size() == 1, "SingleReminderNotification should have exactly 1 ReminderNotificationInfo.");
        ahpl ahplVar = (ahpl) list.get(0);
        this.m = context.getResources().getString(R.string.reminder_notification_title_prefix, cssfVar.d(ahplVar.d()));
        String string = ahplVar.i() ? context.getResources().getString(R.string.reminder_notification_self_sender_name) : ahplVar.h() ? ahplVar.f() : null;
        String strG = ahplVar.g();
        String strC = ahplVar.c();
        if (!TextUtils.isEmpty(strG)) {
            this.n = TextUtils.isEmpty(string) ? strG : context.getResources().getString(R.string.reminder_notification_body, string, strG);
        } else if (!TextUtils.isEmpty(strC)) {
            this.n = cracVar.b(string, strC);
        }
        this.o = ahplVar.e();
        this.r = optional3;
    }

    @Override // defpackage.cgan, defpackage.cgbf
    public final String d() {
        return (String) this.r.map(new Function() { // from class: ahpo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ahpt ahptVar = this.a;
                return czwe.a(ahptVar.b, ahptVar.o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    @Override // defpackage.ahpm
    protected final List e() {
        ArrayList arrayList = new ArrayList();
        String str = this.o;
        if (str != null) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // defpackage.ahpm
    protected final void f() {
        Consumer consumer = new Consumer() { // from class: ahpq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ahpt ahptVar = this.a;
                kve kveVar = new kve(R.drawable.ic_check_circle_gray, ahptVar.b.getString(R.string.reminder_notification_action_done), ((clfb) obj).l(((ahpl) ahptVar.k.get(0)).e()));
                kveVar.d = false;
                ahptVar.l.e(kveVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        Optional optional = this.h;
        optional.ifPresent(consumer);
        optional.ifPresent(new Consumer() { // from class: ahps
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ahpt ahptVar = this.a;
                List list = ahptVar.k;
                ConversationIdType conversationIdTypeB = ((ahpl) list.get(0)).b();
                String strE = ((ahpl) list.get(0)).e();
                Context context = ahptVar.b;
                PendingIntent pendingIntentN = ((clfb) obj).n(context, conversationIdTypeB, strE);
                if (pendingIntentN != null) {
                    kve kveVar = new kve(R.drawable.quantum_ic_comment_grey600_24, context.getString(R.string.reminder_notification_action_view), pendingIntentN);
                    kveVar.d = false;
                    ahptVar.l.e(kveVar.a());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
        optional.ifPresent(new Consumer() { // from class: ahpp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ahpt ahptVar = this.a;
                List list = ahptVar.k;
                kve kveVar = new kve(R.drawable.quantum_ic_alarm_grey600_24, ahptVar.b.getString(R.string.reminder_notification_action_reminder_in_predefined_time), ((clfb) obj).m(((ahpl) list.get(0)).b(), ((ahpl) list.get(0)).e()));
                kveVar.d = false;
                ahptVar.l.e(kveVar.a());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        });
    }

    @Override // defpackage.ahpm
    protected final void g() {
        final ahpl ahplVar = (ahpl) this.k.get(0);
        this.h.ifPresent(new Consumer() { // from class: ahpr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ahpt ahptVar = this.a;
                Context context = ahptVar.b;
                ahpl ahplVar2 = ahplVar;
                ahptVar.l.g = ((clfb) obj).n(context, ahplVar2.b(), ahplVar2.e());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ahpm
    protected final void h() {
        this.l.l();
        this.l.u = "reminder_notification_group_key";
    }

    @Override // defpackage.ahpm
    protected final void i() {
        ahpl ahplVar = (ahpl) this.k.get(0);
        CharSequence charSequenceA = this.d.a(this.m, ahplVar.g(), ahplVar.c());
        kvq kvqVar = this.l;
        kvqVar.i(this.m);
        kvqVar.h(this.n);
        kvqVar.w(charSequenceA);
        kvqVar.y(ahplVar.a());
        kvqVar.u(new kvj());
    }

    @Override // defpackage.ahpm
    protected final boolean j() {
        return ((bwwe) this.g.b()).f(((ahpl) this.k.get(0)).b());
    }
}
