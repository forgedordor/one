package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czvx implements clfb {
    public static final cqce a = cqce.g("Bugle", "ReminderApiImpl");
    public static final ejxr b = cdag.w(196695273, "enable_skip_send_broadcast_to_close_system_dialog_in_reminder");
    public static final ConversationIdType c = barn.a;
    public final Context d;
    public final fcsu e;
    public final eosc f;
    public final fcsu g;
    public final eygg h;
    public final fcsu i;
    private final fcsu j;
    private final eosc k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final Optional s;

    public czvx(Context context, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, eygg eyggVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, Optional optional) {
        this.d = context;
        this.j = fcsuVar;
        this.e = fcsuVar2;
        this.f = eoscVar;
        this.k = eoscVar2;
        this.g = fcsuVar3;
        this.h = eyggVar;
        this.l = fcsuVar4;
        this.m = fcsuVar5;
        this.n = fcsuVar6;
        this.i = fcsuVar7;
        this.o = fcsuVar8;
        this.p = fcsuVar9;
        this.q = fcsuVar10;
        this.r = fcsuVar11;
        this.s = optional;
    }

    public static boolean A(String[] strArr) {
        String[] strArr2 = btin.a;
        btik btikVar = new btik();
        btikVar.ap("markReminderAsNotified");
        btikVar.c(bvdw.NOTIFIED);
        btim btimVar = new btim();
        btimVar.ap(new dqpm("reminders._id", 3, btim.au(strArr), false));
        btikVar.d(btimVar);
        return btikVar.b().e() > 0;
    }

    public static boolean G(String str, long j) {
        String[] strArr = btin.a;
        btik btikVar = new btik();
        btikVar.ap("updateReminderTriggerTimeAndResetNotified");
        btikVar.a.put("trigger_time", Long.valueOf(j));
        btikVar.c(bvdw.SET);
        btim btimVar = new btim();
        btimVar.c(str);
        btikVar.d(btimVar);
        return btikVar.b().e() > 0;
    }

    private static int J(int i) {
        return i | VCardConfig.FLAG_APPEND_TYPE_PARAM;
    }

    private final long K() {
        long jLongValue = ((Long) czwc.f.e()).longValue();
        return ((cogw) this.g.b()).f().toEpochMilli() + (jLongValue > 0 ? TimeUnit.SECONDS.toMillis(jLongValue) : TimeUnit.MINUTES.toMillis(60L));
    }

    private final void L(elsm elsmVar) {
        if (!((ajhd) this.l.b()).Y()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_REMINDER;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elsn elsnVar = (elsn) elsmVar.build();
        elsnVar.getClass();
        ellhVar2.Q = elsnVar;
        ellhVar2.c |= 32768;
        ((aill) this.m.b()).j(ellgVar);
    }

    public static boolean y(final String str) {
        String[] strArr = btin.a;
        btib btibVar = new btib();
        btibVar.f("ReminderApiImpl#deleteReminder");
        btibVar.a(new Function() { // from class: czvq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btim btimVar = (btim) obj;
                cqce cqceVar = czvx.a;
                btimVar.c(str);
                return btimVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return btibVar.d() > 0;
    }

    public final boolean B(final ConversationIdType conversationIdType, boolean z) {
        if (!conversationIdType.b()) {
            this.s.ifPresent(new Consumer() { // from class: czvh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    adbt adbtVar = (adbt) ((fcsu) obj).b();
                    fcsu fcsuVar = this.a.g;
                    adbtVar.d = Optional.of(new acvu(conversationIdType, adar.REMINDER, ((cogw) fcsuVar.b()).f().toEpochMilli()));
                    adbtVar.b.a(eijx.e(null), "HOME_CONVERSATION_REFRESH_KEY");
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (z) {
            return false;
        }
        return E();
    }

    public final boolean C(ConversationIdType conversationIdType) {
        return D(conversationIdType, false);
    }

    public final boolean D(ConversationIdType conversationIdType, boolean z) {
        if (!conversationIdType.b()) {
            czwp czwpVar = (czwp) this.q.b();
            czwpVar.a.a(eork.i(null), "reminders_key".concat(String.valueOf(String.valueOf(conversationIdType))));
            if (czwc.b()) {
                return B(conversationIdType, z);
            }
        }
        if (z) {
            return false;
        }
        return E();
    }

    public final boolean E() {
        Collection collection = ((czwg) this.o.b()).a;
        synchronized (collection) {
            Collection.EL.stream(collection).forEach(new Consumer() { // from class: czwf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    throw null;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((bxlc) this.p.b()).c();
        return ((cgbn) this.h.b()).I();
    }

    final boolean F(String str, long j) {
        if (str == null) {
            a.r("Cannot set reminder. Reminder ID is null.");
            return false;
        }
        AlarmManager alarmManager = (AlarmManager) this.d.getSystemService("alarm");
        if (alarmManager == null) {
            a.r("Cannot set reminder. Alarm Manager is null.");
            return false;
        }
        alarmManager.setExactAndAllowWhileIdle(0, j, w(str));
        cqbd cqbdVarC = a.c();
        cqbdVarC.I(String.format(Locale.US, "Reminder scheduled for %d min later.", 60));
        cqbdVarC.r();
        return true;
    }

    public final void H(int i, int i2, String str) {
        bthb bthbVarA = btin.a(str);
        if (bthbVarA != null) {
            I(i, i2, bthbVarA.k(), bthbVarA.n());
        }
    }

    public final void I(int i, int i2, long j, MessageIdType messageIdType) {
        MessageCoreData messageCoreDataA = ((baxe) this.j.b()).A(messageIdType);
        elsm elsmVar = (elsm) elsn.a.createBuilder();
        emgb emgbVar = (emgb) emgf.a.createBuilder();
        emgbVar.copyOnWrite();
        emgf emgfVar = (emgf) emgbVar.instance;
        emgfVar.c = i - 1;
        emgfVar.b |= 1;
        emgbVar.copyOnWrite();
        emgf emgfVar2 = (emgf) emgbVar.instance;
        emgfVar2.d = i2 - 1;
        emgfVar2.b |= 2;
        emgbVar.copyOnWrite();
        emgf emgfVar3 = (emgf) emgbVar.instance;
        emgfVar3.b |= 4;
        emgfVar3.e = j;
        long jD = messageCoreDataA == null ? 0L : ((aika) this.n.b()).d(messageCoreDataA);
        emgbVar.copyOnWrite();
        emgf emgfVar4 = (emgf) emgbVar.instance;
        emgfVar4.b |= 8;
        emgfVar4.f = jD;
        elsmVar.copyOnWrite();
        elsn elsnVar = (elsn) elsmVar.instance;
        emgf emgfVar5 = (emgf) emgbVar.build();
        emgfVar5.getClass();
        elsnVar.c = emgfVar5;
        elsnVar.b |= 1;
        L(elsmVar);
    }

    @Override // defpackage.clfb
    public final kvf a(ConversationIdType conversationIdType, MessageIdType messageIdType) {
        Context context = this.d;
        String string = context.getString(R.string.notification_set_reminder);
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.set_reminder");
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("message_id", messageIdType.b());
        intent.setData(bace.c(context, conversationIdType, messageIdType, new String[0]));
        kve kveVar = new kve(R.drawable.quantum_ic_alarm_grey600_24, string, PendingIntent.getBroadcast(context, 129, intent, J(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES)));
        kveVar.d = false;
        return kveVar.a();
    }

    @Override // defpackage.clfb
    public final eiju b(final String[] strArr) {
        return eijx.g(eiid.l(new Callable() { // from class: czvi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean zA = czvx.A(strArr);
                boolean z = false;
                if (((cgbn) this.a.h.b()).I() && zA) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), this.f);
    }

    @Override // defpackage.clfb
    public final eiju c() {
        Callable callable = new Callable() { // from class: czuw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                btii btiiVarC = btin.c();
                btiiVarC.A("getTriggeredReminders");
                btim btimVar = new btim();
                btimVar.e(((cogw) this.a.g.b()).f().toEpochMilli());
                btimVar.d(bvdw.SET);
                btiiVarC.d(btimVar);
                btht bthtVar = (btht) btiiVarC.b().q(btin.c.a);
                try {
                    ekgb ekgbVarC = bthtVar.c();
                    bthtVar.close();
                    return ekgbVarC;
                } catch (Throwable th) {
                    try {
                        bthtVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: czux
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.b((String[]) ((List) obj).toArray(new String[0]));
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final eiju d() {
        return eijx.g(new Callable() { // from class: czuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                czvx czvxVar = this.a;
                boolean zE = czvxVar.E();
                if (czwc.b()) {
                    czvxVar.x();
                }
                return Boolean.valueOf(zE);
            }
        }, this.f);
    }

    @Override // defpackage.clfb
    public final eiju e(final String str) {
        Callable callableL = eiid.l(new Callable() { // from class: czvd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = czvx.a;
                bthb bthbVarA = btin.a(str);
                return bthbVarA == null ? czvx.c : bthbVarA.m();
            }
        });
        eosc eoscVar = this.f;
        return eiju.g(eoscVar.submit(callableL)).h(new ejvr() { // from class: czve
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                czvx czvxVar = this.a;
                boolean zB = czvxVar.B((ConversationIdType) obj, false);
                if (czwc.b()) {
                    czvxVar.x();
                }
                return Boolean.valueOf(zB);
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final eiju f() {
        Callable callable = new Callable() { // from class: czvn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                long jLongValue = ((Long) czwc.d.e()).longValue();
                cczi ccziVar = czwc.g;
                if (((Long) ccziVar.e()).longValue() >= 0) {
                    jLongValue = ((Long) ccziVar.e()).longValue() * 1000;
                }
                long epochMilli = ((cogw) this.a.g.b()).f().toEpochMilli() - jLongValue;
                btii btiiVarC = btin.c();
                btiiVarC.A("getExpiredReminders");
                btim btimVar = new btim();
                btimVar.e(epochMilli);
                btiiVarC.k(new btil(btimVar));
                return btiiVarC.b().z();
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: czvo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final ekgb ekgbVar = (ekgb) obj;
                final czvx czvxVar = this.a;
                return eijx.g(eiid.l(new Callable() { // from class: czvp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        czvx czvxVar2;
                        HashSet hashSet = new HashSet();
                        final ArrayList arrayList = new ArrayList();
                        Iterator it = ekgbVar.iterator();
                        while (true) {
                            czvxVar2 = czvxVar;
                            if (!it.hasNext()) {
                                break;
                            }
                            bthb bthbVar = (bthb) it.next();
                            hashSet.add(bthbVar.m());
                            arrayList.add(bthbVar.o());
                            czvxVar2.I(12, 11, bthbVar.k(), bthbVar.n());
                            czvxVar2.z(bthbVar.o());
                        }
                        String[] strArr = btin.a;
                        btib btibVar = new btib();
                        btibVar.f("ReminderApiImpl#deleteReminders");
                        btibVar.a(new Function() { // from class: czvu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                btim btimVar = (btim) obj2;
                                cqce cqceVar = czvx.a;
                                btimVar.ap(new dqpm("reminders._id", 3, btim.as(arrayList), false));
                                return btimVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int iD = btibVar.d();
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            czvxVar2.D((ConversationIdType) it2.next(), true);
                        }
                        czvxVar2.E();
                        return Integer.valueOf(iD);
                    }
                }), czvxVar.f);
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final eiju g(final MessageIdType messageIdType, final ConversationIdType conversationIdType) {
        return eijx.g(new Callable() { // from class: czvg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                MessageIdType messageIdType2 = messageIdType;
                bthb bthbVarB = btin.b(messageIdType2);
                boolean z = false;
                if (bthbVarB == null) {
                    return false;
                }
                czvx czvxVar = this.a;
                czvxVar.I(6, 4, bthbVarB.k(), messageIdType2);
                if (czvxVar.z(bthbVarB.o()) && czvx.y(bthbVarB.o()) && czvxVar.C(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.clfb
    public final ListenableFuture h(final ConversationId conversationId, final String str) {
        if (czwc.b()) {
            return eijx.g(new Callable() { // from class: czvr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    boolean zA = czvx.A(new String[]{str});
                    czvx czvxVar = this.a;
                    if (!craf.e || !((Boolean) ((cczi) czvx.b.get()).e()).booleanValue()) {
                        czvxVar.d.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                    }
                    boolean z = false;
                    if (zA && czvxVar.E()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, this.f);
        }
        Callable callable = new Callable() { // from class: czvs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = czvx.a;
                bthb bthbVarA = btin.a(str);
                return bthbVarA == null ? bary.a : bthbVarA.n();
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: czvt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                MessageIdType messageIdType = (MessageIdType) obj;
                boolean z = false;
                if (messageIdType.c()) {
                    return false;
                }
                String str2 = str;
                ConversationId conversationId2 = conversationId;
                czvx czvxVar = this.a;
                avmp avmpVar = (avmp) czvxVar.i.b();
                Context context = czvxVar.d;
                avmpVar.g(context, conversationId2, messageIdType);
                boolean zA = czvx.A(new String[]{str2});
                if (!craf.e || !((Boolean) ((cczi) czvx.b.get()).e()).booleanValue()) {
                    context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                }
                if (zA && czvxVar.E()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final void i() {
        Runnable runnableK = eiid.k(new Runnable() { // from class: czuv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                btii btiiVarC = btin.c();
                btiiVarC.A("getFutureReminders");
                btim btimVar = new btim();
                czvx czvxVar = this.a;
                btimVar.ap(new dqty("reminders.trigger_time", 7, Long.valueOf(((cogw) czvxVar.g.b()).f().toEpochMilli())));
                btimVar.d(bvdw.SET);
                btiiVarC.d(btimVar);
                ekgb ekgbVarZ = btiiVarC.b().z();
                int size = ekgbVarZ.size();
                for (int i = 0; i < size; i++) {
                    bthb bthbVar = (bthb) ekgbVarZ.get(i);
                    czvxVar.F(bthbVar.o(), bthbVar.k());
                }
            }
        });
        eosc eoscVar = this.f;
        cqnx.c(eoscVar.submit(runnableK), "Bugle", "Failed to reschedule future reminders.");
        final cgbn cgbnVar = (cgbn) this.h.b();
        cgbnVar.getClass();
        cqnx.c(eoscVar.submit(eiid.k(new Runnable() { // from class: czvf
            @Override // java.lang.Runnable
            public final void run() {
                cgbnVar.I();
            }
        })), "Bugle", "Failed to refresh reminder notifications.");
    }

    @Override // defpackage.clfb
    public final void j(acxn acxnVar) {
        if (acxnVar != null) {
            ((czws) this.r.b()).a.add(acxnVar);
        }
    }

    @Override // defpackage.clfb
    public final PendingIntent k(String[] strArr) {
        Context context = this.d;
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.dismiss_reminder_notifications");
        intent.putExtra("reminder_ids", strArr);
        intent.setData(Uri.parse(TextUtils.join(",", strArr)));
        return PendingIntent.getBroadcast(context, 132, intent, J(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.clfb
    public final PendingIntent l(String str) {
        Context context = this.d;
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.mark_as_done");
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 133, intent, J(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.clfb
    public final PendingIntent m(ConversationIdType conversationIdType, String str) {
        Context context = this.d;
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.snooze_reminder");
        intent.putExtra("reminder_id", str);
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 134, intent, J(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.clfb
    public final PendingIntent n(Context context, ConversationIdType conversationIdType, String str) {
        if (czwc.b()) {
            bthb bthbVarA = btin.a(str);
            return ((avmp) this.i.b()).b(context, new BugleConversationId(conversationIdType), bthbVarA == null ? bary.a : bthbVarA.n(), str);
        }
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.view_reminder");
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 135, intent, J(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
    }

    @Override // defpackage.clfb
    public final void o(acxn acxnVar) {
        if (acxnVar == null) {
            return;
        }
        ((czws) this.r.b()).a.remove(acxnVar);
    }

    @Override // defpackage.clfb
    public final eiju p(final MessageIdType messageIdType, final ConversationIdType conversationIdType, final long j, final int i) {
        Callable callable = new Callable() { // from class: czvv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = czvx.a;
                return Optional.ofNullable(btin.b(messageIdType));
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: czvw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bthb bthbVar = (bthb) ((Optional) obj).orElse(null);
                boolean z = false;
                if (bthbVar == null) {
                    czvx.a.r("Cannot update reminder. Reminder is not found by messageId.");
                    return false;
                }
                long j2 = j;
                int i2 = i;
                czvx czvxVar = this.a;
                czvxVar.H(i2, 3, bthbVar.o());
                if (czvxVar.F(bthbVar.o(), j2) && czvx.G(bthbVar.o(), j2) && czvxVar.C(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final ListenableFuture q(final MessageIdType messageIdType, final ConversationIdType conversationIdType, final long j, final int i) {
        Callable callable = new Callable() { // from class: czvj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = czvx.a;
                ConversationIdType conversationIdType2 = conversationIdType;
                final MessageIdType messageIdType2 = messageIdType;
                final long j2 = j;
                if (!conversationIdType2.b()) {
                    return clfe.a(conversationIdType2, messageIdType2, j2);
                }
                if (messageIdType2.c()) {
                    return null;
                }
                return (String) MessagesTable.i(messageIdType2, new Function() { // from class: clfc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ConversationIdType conversationIdTypeD = ((MessagesTable.BindData) obj).D();
                        if (conversationIdTypeD.b()) {
                            return null;
                        }
                        return clfe.a(conversationIdTypeD, messageIdType2, j2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        };
        eosc eoscVar = this.f;
        return eijx.g(callable, eoscVar).h(new ejvr() { // from class: czvk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                czvx czvxVar = this.a;
                ConversationIdType conversationIdType2 = conversationIdType;
                String str = (String) obj;
                if (!conversationIdType2.b()) {
                    cgfk cgfkVar = (cgfk) czvxVar.e.b();
                    cgfi cgfiVar = (cgfi) cgfj.a.createBuilder();
                    String strA = conversationIdType2.a();
                    cgfiVar.copyOnWrite();
                    cgfj cgfjVar = (cgfj) cgfiVar.instance;
                    strA.getClass();
                    cgfjVar.a();
                    cgfjVar.b.add(strA);
                    ((cazj) cgfkVar.a.b()).a(cbcu.f("mark_as_notified", (cgfj) cgfiVar.build()));
                }
                return Boolean.valueOf(czvxVar.F(str, j));
            }
        }, eoscVar).h(new ejvr() { // from class: czvl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                czvx czvxVar = this.a;
                czvxVar.I(i, 2, j, messageIdType);
                boolean z = false;
                if (((Boolean) obj).booleanValue() && czvxVar.C(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, eoscVar);
    }

    @Override // defpackage.clfb
    public final void r(int i) {
        if (!((ajhd) this.l.b()).Y()) {
            a.m("Clearcut loggings are disabled.");
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_REMINDER;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elsm elsmVar = (elsm) elsn.a.createBuilder();
        emgg emggVar = (emgg) emgi.a.createBuilder();
        emggVar.copyOnWrite();
        emgi emgiVar = (emgi) emggVar.instance;
        emgiVar.c = i - 1;
        emgiVar.b |= 1;
        elsmVar.copyOnWrite();
        elsn elsnVar = (elsn) elsmVar.instance;
        emgi emgiVar2 = (emgi) emggVar.build();
        emgiVar2.getClass();
        elsnVar.d = emgiVar2;
        elsnVar.b |= 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elsn elsnVar2 = (elsn) elsmVar.build();
        elsnVar2.getClass();
        ellhVar2.Q = elsnVar2;
        ellhVar2.c |= 32768;
        ((aill) this.m.b()).j(ellgVar);
    }

    @Override // defpackage.clfb
    public final void s(int i) {
        elsm elsmVar = (elsm) elsn.a.createBuilder();
        emgb emgbVar = (emgb) emgf.a.createBuilder();
        emgbVar.copyOnWrite();
        emgf emgfVar = (emgf) emgbVar.instance;
        emgfVar.c = 10;
        emgfVar.b |= 1;
        emgbVar.copyOnWrite();
        emgf emgfVar2 = (emgf) emgbVar.instance;
        emgfVar2.d = i - 1;
        emgfVar2.b |= 2;
        elsmVar.copyOnWrite();
        elsn elsnVar = (elsn) elsmVar.instance;
        emgf emgfVar3 = (emgf) emgbVar.build();
        emgfVar3.getClass();
        elsnVar.c = emgfVar3;
        elsnVar.b |= 1;
        L(elsmVar);
    }

    @Override // defpackage.clfb
    public final eiju t(final String str, final ConversationIdType conversationIdType) {
        return eijx.g(new Callable() { // from class: czvm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                czvx czvxVar = this.a;
                String str2 = str;
                czvxVar.H(3, 6, str2);
                boolean z = false;
                if (czvx.y(str2) && czvxVar.C(conversationIdType)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.clfb
    public final eiju u(MessageIdType messageIdType, ConversationIdType conversationIdType) {
        final long jK = K();
        return eiju.g(q(messageIdType, conversationIdType, jK, 4)).h(new ejvr() { // from class: czvc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                cqce cqceVar = czvx.a;
                if (bool == null || !bool.booleanValue()) {
                    return 0L;
                }
                return Long.valueOf(jK);
            }
        }, this.k);
    }

    @Override // defpackage.clfb
    public final eiju v(final ConversationIdType conversationIdType, final String str) {
        final long jK = K();
        eiju eijuVarG = eijx.g(new Callable() { // from class: czuz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.F(str, jK));
            }
        }, this.k);
        ejvr ejvrVar = new ejvr() { // from class: czva
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = czvx.a;
                boolean z = false;
                if (((Boolean) obj).booleanValue()) {
                    if (czvx.G(str, jK)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        eosc eoscVar = this.f;
        return eijuVarG.h(ejvrVar, eoscVar).h(new ejvr() { // from class: czvb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                czvx czvxVar = this.a;
                czvxVar.H(3, 5, str);
                if (((Boolean) obj).booleanValue() && czvxVar.C(conversationIdType)) {
                    return Long.valueOf(jK);
                }
                return 0L;
            }
        }, eoscVar);
    }

    final PendingIntent w(String str) {
        Context context = this.d;
        Intent intent = new Intent(context, (Class<?>) ReminderReceiver.class);
        intent.setAction("com.google.android.apps.messaging.trigger_reminder");
        intent.putExtra("reminder_id", str);
        intent.setData(Uri.parse(str));
        return PendingIntent.getBroadcast(context, 130, intent, J(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        ekgb ekgbVarN = ekgb.n(((czws) this.r.b()).a);
        int size = ekgbVarN.size();
        for (int i = 0; i < size; i++) {
            acxn acxnVar = (acxn) ekgbVarN.get(i);
            acxo.a.p("Invalidating current data source since a reminder has triggered.");
            acwx acwxVar = acxnVar.a.b;
            if (acwxVar != null) {
                acwxVar.c();
            }
        }
    }

    final boolean z(String str) {
        AlarmManager alarmManager = (AlarmManager) this.d.getSystemService("alarm");
        if (alarmManager == null) {
            a.r("Cannot delete reminder. Alarm Manager is null");
            return false;
        }
        alarmManager.cancel(w(str));
        a.p("Reminder is removed from AlarmManager");
        return true;
    }
}
