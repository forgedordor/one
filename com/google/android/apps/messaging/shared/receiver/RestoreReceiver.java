package com.google.android.apps.messaging.shared.receiver;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aikm;
import defpackage.aill;
import defpackage.auvh;
import defpackage.ayjj;
import defpackage.brdr;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cgeb;
import defpackage.ckzx;
import defpackage.cmrp;
import defpackage.cnod;
import defpackage.cnpw;
import defpackage.cogw;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ekgi;
import defpackage.ellf;
import defpackage.ellg;
import defpackage.ellh;
import defpackage.emgm;
import defpackage.emgw;
import defpackage.emgy;
import defpackage.emjd;
import defpackage.emjg;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.evwz;
import defpackage.eygg;
import defpackage.fcsu;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RestoreReceiver extends ckzx {
    public fcsu A;
    public fcsu B;
    public fcsu C;
    public eygg m;
    public eygg n;
    public eygg o;
    public eygg p;
    public eygg q;
    public eigp r;
    public fcsu s;
    public fcsu t;
    public fcsu u;
    public fcsu v;
    public fcsu w;
    public fcsu x;
    public fcsu y;
    public fcsu z;
    public static final cqce a = cqce.g("Bugle", "RestoreReceiver");
    static final cczv b = cdag.e(cdag.b, "telephony_db_recreated_notification", 0);
    static final cczv c = cdag.f(cdag.b, "telephony_db_recreated_notification_back_off_ms", TimeUnit.DAYS.toMillis(7));
    public static final cczv d = cdag.h(cdag.b, "restore_receiver_run_wipeout_detector", true);
    public static final cczv e = cdag.h(cdag.b, "restore_receiver_run_wipeout_detector_on_telephony_db_initial_creation", false);
    public static final cczv f = cdag.h(cdag.b, "reverse_sync_instead_of_wipeout", false);
    static final cczv g = cdag.f(cdag.b, "reverse_sync_delay", 5000);
    public static final cczv h = cdag.q(174024787, "wipeout_when_no_sms_permissions");
    static final cczv i = cdag.h(cdag.b, "use_sync_telephony_threads_action_instead_of_wipeout", false);
    public static final cczv j = cdag.h(cdag.b, "reverse_sync_when_inconclusive_db_recreated", false);
    public static final cczv k = cdag.h(cdag.b, "reverse_sync_when_inconclusive_db_initial_creation", false);
    public static final cczv l = cdag.h(cdag.b, "reverse_sync_check_throttle", true);
    private static final cczv P = cdag.e(cdag.b, "restore_receiver_sync_telephony_threads_action_delay_ms", 5000);

    public static int m() {
        return ((Boolean) i.e()).booleanValue() ? 3 : 4;
    }

    private final eiju u(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        long jLongValue = ((Long) c.e()).longValue();
        cgeb cgebVar = (cgeb) this.t.b();
        emgm emgmVar = emgm.TELEPHONY_DB_RECREATED;
        String string = resources.getString(R.string.report_telephone_db_recreation_message);
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("TelephonyRecreatedTelephonySmsCountBucket", v(((cmrp) this.w.b()).ao()));
        ekgiVar.i("TelephonyRecreatedTelephonyMmsCountBucket", v(((cmrp) this.w.b()).an()));
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("createPsdMap-messages1");
        brdrVarD.s();
        brdrVarD.h(new Function() { // from class: claw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = RestoreReceiver.a;
                brecVar.K(0);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgiVar.i("TelephonyRecreatedBugleSmsCountBucket", v(brdrVarD.b().h()));
        brdr brdrVarD2 = MessagesTable.d();
        brdrVarD2.A("createPsdMap-messages2");
        brdrVarD2.s();
        brdrVarD2.h(new Function() { // from class: clax
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = RestoreReceiver.a;
                brecVar.K(1);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgiVar.i("TelephonyRecreatedBugleMmsCountBucket", v(brdrVarD2.b().h()));
        return cgebVar.R(emgmVar, string, jLongValue, ekgiVar.c());
    }

    private static String v(int i2) {
        return i2 == -1 ? "unknown" : i2 == 0 ? "zero" : i2 <= 10 ? "one_to_ten" : i2 <= 50 ? "eleven_to_fifty" : "more_than_fifty";
    }

    @Override // defpackage.cldb
    protected final int a() {
        return 5;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.r.c("RestoreReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/RestoreReceiver", "beginRootTrace", 262);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.Restore.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    public final eiju j(final Context context, final Intent intent) {
        return eijx.g(new Callable() { // from class: clba
            /* JADX WARN: Removed duplicated region for block: B:100:0x0307  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0315  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x0323 A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:5:0x0012, B:8:0x002f, B:10:0x0037, B:12:0x004b, B:13:0x0053, B:14:0x0060, B:17:0x006a, B:19:0x0072, B:20:0x009a, B:22:0x00a2, B:24:0x00b6, B:25:0x00be, B:26:0x00cd, B:28:0x00d5, B:30:0x00e9, B:31:0x00f1, B:32:0x0100, B:34:0x0109, B:36:0x0114, B:38:0x013a, B:40:0x014e, B:42:0x015a, B:54:0x0191, B:43:0x0160, B:45:0x0166, B:47:0x0174, B:48:0x017a, B:52:0x0184, B:53:0x018a, B:55:0x019d, B:57:0x01ec, B:59:0x01fa, B:109:0x033b, B:60:0x0208, B:62:0x0216, B:64:0x0233, B:66:0x0247, B:69:0x026f, B:70:0x027d, B:72:0x0283, B:76:0x0294, B:78:0x029a, B:82:0x02ab, B:84:0x02bb, B:88:0x02cc, B:92:0x02d6, B:93:0x02dc, B:95:0x02ea, B:98:0x02f9, B:104:0x030e, B:107:0x0323, B:106:0x0317, B:108:0x0330, B:110:0x0346, B:112:0x034e), top: B:122:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x027d A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:5:0x0012, B:8:0x002f, B:10:0x0037, B:12:0x004b, B:13:0x0053, B:14:0x0060, B:17:0x006a, B:19:0x0072, B:20:0x009a, B:22:0x00a2, B:24:0x00b6, B:25:0x00be, B:26:0x00cd, B:28:0x00d5, B:30:0x00e9, B:31:0x00f1, B:32:0x0100, B:34:0x0109, B:36:0x0114, B:38:0x013a, B:40:0x014e, B:42:0x015a, B:54:0x0191, B:43:0x0160, B:45:0x0166, B:47:0x0174, B:48:0x017a, B:52:0x0184, B:53:0x018a, B:55:0x019d, B:57:0x01ec, B:59:0x01fa, B:109:0x033b, B:60:0x0208, B:62:0x0216, B:64:0x0233, B:66:0x0247, B:69:0x026f, B:70:0x027d, B:72:0x0283, B:76:0x0294, B:78:0x029a, B:82:0x02ab, B:84:0x02bb, B:88:0x02cc, B:92:0x02d6, B:93:0x02dc, B:95:0x02ea, B:98:0x02f9, B:104:0x030e, B:107:0x0323, B:106:0x0317, B:108:0x0330, B:110:0x0346, B:112:0x034e), top: B:122:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x0293  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x02aa  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x02bb A[Catch: all -> 0x0360, TryCatch #0 {all -> 0x0360, blocks: (B:5:0x0012, B:8:0x002f, B:10:0x0037, B:12:0x004b, B:13:0x0053, B:14:0x0060, B:17:0x006a, B:19:0x0072, B:20:0x009a, B:22:0x00a2, B:24:0x00b6, B:25:0x00be, B:26:0x00cd, B:28:0x00d5, B:30:0x00e9, B:31:0x00f1, B:32:0x0100, B:34:0x0109, B:36:0x0114, B:38:0x013a, B:40:0x014e, B:42:0x015a, B:54:0x0191, B:43:0x0160, B:45:0x0166, B:47:0x0174, B:48:0x017a, B:52:0x0184, B:53:0x018a, B:55:0x019d, B:57:0x01ec, B:59:0x01fa, B:109:0x033b, B:60:0x0208, B:62:0x0216, B:64:0x0233, B:66:0x0247, B:69:0x026f, B:70:0x027d, B:72:0x0283, B:76:0x0294, B:78:0x029a, B:82:0x02ab, B:84:0x02bb, B:88:0x02cc, B:92:0x02d6, B:93:0x02dc, B:95:0x02ea, B:98:0x02f9, B:104:0x030e, B:107:0x0323, B:106:0x0317, B:108:0x0330, B:110:0x0346, B:112:0x034e), top: B:122:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x02c6  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 875
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.clba.call():java.lang.Object");
            }
        }, (Executor) this.u.b()).i(new eooz() { // from class: clbb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                return (optional.isPresent() && ((Boolean) ((cczi) cmqf.a.get()).e()).booleanValue()) ? ((cmqf) this.a.o.b()).f((enqq) optional.get()).h(new ejvr() { // from class: clay
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = RestoreReceiver.a;
                        return null;
                    }
                }, eoqg.a) : eijx.e(null);
            }
        }, (Executor) this.u.b());
    }

    public final void n(int i2, int i3, int i4) {
        emjd emjdVar = (emjd) emjg.a.createBuilder();
        emjdVar.copyOnWrite();
        emjg emjgVar = (emjg) emjdVar.instance;
        emjgVar.c = i2 - 1;
        emjgVar.b |= 1;
        emjdVar.copyOnWrite();
        emjg emjgVar2 = (emjg) emjdVar.instance;
        emjgVar2.d = i3 - 1;
        emjgVar2.b |= 2;
        emjdVar.copyOnWrite();
        emjg emjgVar3 = (emjg) emjdVar.instance;
        emjgVar3.e = i4 - 1;
        emjgVar3.b |= 4;
        emjg emjgVar4 = (emjg) emjdVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.TELEPHONY_DATABASE_ACTION_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emjgVar4.getClass();
        ellhVar2.ag = emjgVar4;
        ellhVar2.d |= 4;
        ((aill) this.x.b()).j(ellgVar);
    }

    public final void o(int i2) {
        aill aillVar = (aill) this.x.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        emgw emgwVar = (emgw) emgy.a.createBuilder();
        emgwVar.copyOnWrite();
        emgy emgyVar = (emgy) emgwVar.instance;
        emgyVar.c = i2 - 1;
        emgyVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emgy emgyVar2 = (emgy) emgwVar.build();
        emgyVar2.getClass();
        ellhVar2.aw = emgyVar2;
        ellhVar2.d |= 1048576;
        aillVar.j(ellgVar);
    }

    public final void p(Context context, int i2) throws Resources.NotFoundException {
        int i3 = i2 - 1;
        if (i3 == 2) {
            ((ayjj) this.C.b()).a(true).w(((Integer) P.e()).intValue());
            return;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                return;
            }
            ((cnpw) this.z.b()).f(evwz.b(((cogw) this.A.b()).f()));
            ((cnod) this.y.b()).b(Duration.ofMillis(((Long) g.e()).longValue()));
            return;
        }
        int iIntValue = ((Integer) b.e()).intValue();
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("Telephony DB recreated");
        cqbdVarE.y("DB_RECREATED_NOTIFICATION", iIntValue);
        cqbdVarE.r();
        eiju eijuVarE = eijx.e(null);
        if (iIntValue == 1) {
            ((aikm) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
        } else if (iIntValue == 2) {
            eijuVarE = u(context);
        } else if (iIntValue == 3) {
            ((aikm) this.q.b()).a("android.provider.action.SMS_MMS_DB_CREATED");
            eijuVarE = u(context);
        }
        eijuVarE.k(auvh.c(new Consumer() { // from class: clav
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                RestoreReceiver restoreReceiver = this.a;
                fcsu fcsuVar = restoreReceiver.x;
                if (fcsuVar != null && fcsuVar.b() != null) {
                    ((aill) restoreReceiver.x.b()).b();
                }
                ((ActivityManager) ((cmvy) restoreReceiver.m.b()).c.getSystemService("activity")).clearApplicationUserData();
                cmvy.a.q("force exit.");
                System.exit(0);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }), eoqg.a);
    }
}
