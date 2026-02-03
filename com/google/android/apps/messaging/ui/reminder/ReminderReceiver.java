package com.google.android.apps.messaging.ui.reminder;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.barn;
import defpackage.bary;
import defpackage.cgkj;
import defpackage.cglf;
import defpackage.cgql;
import defpackage.cqnc;
import defpackage.czuu;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReminderReceiver extends czuu {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/ui/reminder/ReminderReceiver");
    public Optional a;
    public eigp b;
    public fcsu c;
    public fcsu d;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("ReminderReceiver Receive broadcast", "com/google/android/apps/messaging/ui/reminder/ReminderReceiver", "beginRootTrace", 75);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.apps.messaging.set_reminder".equals(action)) {
            final ConversationIdType conversationIdTypeB = barn.b(intent.getStringExtra("conversation_id"));
            final MessageIdType messageIdTypeB = bary.b(intent.getStringExtra("message_id"));
            if (!messageIdTypeB.c() && !conversationIdTypeB.b()) {
                ekrw ekrwVarH = e.h();
                ekrwVarH.X(eksq.a, "BugleNotifications");
                ekrd ekrdVar = (ekrd) ekrwVarH;
                ekrdVar.X(cqnc.r, conversationIdTypeB.toString());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/ui/reminder/ReminderReceiver", "processBroadcast", 109, "ReminderReceiver.java")).q("Setting reminder, canceling IM notification");
                ((cgkj) this.c.b()).b(cglf.NT_INCOMING_MESSAGE, ((cgql) this.d.b()).a(conversationIdTypeB));
                this.a.ifPresent(new Consumer() { // from class: czwh
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).u(messageIdTypeB, conversationIdTypeB));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else if ("com.google.android.apps.messaging.trigger_reminder".equals(action)) {
            final String stringExtra = intent.getStringExtra("reminder_id");
            if (TextUtils.isEmpty(stringExtra)) {
                this.a.ifPresent(new Consumer() { // from class: czwj
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).d());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                this.a.ifPresent(new Consumer() { // from class: czwi
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).e(stringExtra));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else if ("com.google.android.apps.messaging.dismiss_reminder_notifications".equals(action)) {
            final String[] stringArrayExtra = intent.getStringArrayExtra("reminder_ids");
            if (stringArrayExtra != null) {
                this.a.ifPresent(new Consumer() { // from class: czwk
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).b(stringArrayExtra));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else if ("com.google.android.apps.messaging.mark_as_done".equals(action)) {
            final String stringExtra2 = intent.getStringExtra("reminder_id");
            if (!TextUtils.isEmpty(stringExtra2)) {
                this.a.ifPresent(new Consumer() { // from class: czwl
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).t(stringExtra2, barn.a));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else if ("com.google.android.apps.messaging.snooze_reminder".equals(action)) {
            final String stringExtra3 = intent.getStringExtra("reminder_id");
            final ConversationIdType conversationIdTypeB2 = barn.b(intent.getStringExtra("conversation_id"));
            if (!TextUtils.isEmpty(stringExtra3)) {
                this.a.ifPresent(new Consumer() { // from class: czwm
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).v(conversationIdTypeB2, stringExtra3));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } else if ("com.google.android.apps.messaging.view_reminder".equals(action)) {
            final ConversationIdType conversationIdTypeB3 = barn.b(intent.getStringExtra("conversation_id"));
            final String stringExtra4 = intent.getStringExtra("reminder_id");
            if (!conversationIdTypeB3.b() && !TextUtils.isEmpty(stringExtra4)) {
                this.a.ifPresent(new Consumer() { // from class: czwn
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        this.a.q("ReminderReceiver", ((clfb) obj).h(new BugleConversationId(conversationIdTypeB3), stringExtra4));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.Reminder.Latency";
    }
}
