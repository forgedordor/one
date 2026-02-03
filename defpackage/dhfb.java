package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhfb implements dhep {
    public Context a;
    public volatile dheo b;
    public int c;
    private volatile Handler d;
    private final dhem e;
    private final AtomicBoolean f = new AtomicBoolean(true);
    private final Runnable g = new Runnable() { // from class: dhfa
        @Override // java.lang.Runnable
        public final void run() {
            dheo dheoVar;
            Context context;
            String str;
            dhfb dhfbVar = this.a;
            synchronized (dhfbVar) {
                dhja.k("delay time out, reset attempts %d and process SIM event", Integer.valueOf(dhfbVar.c));
                dhfbVar.c = 0;
                dheoVar = dhfbVar.b;
                context = dhfbVar.a;
            }
            if (dheoVar == null || context == null) {
                return;
            }
            Intent intent = null;
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.SIM_STATE_CHANGED"));
            if (intentRegisterReceiver == null) {
                dhja.k("No SIM state found", new Object[0]);
            } else {
                intent = intentRegisterReceiver;
            }
            if (intent != null) {
                dhip dhipVar = dhey.a;
                dhja.l(dhipVar, "process intent: %s", intent.getAction());
                ((dhey) dheoVar).i.b();
                synchronized (dheoVar) {
                    ((dhey) dheoVar).b = dhey.B(context);
                    String strB = ejwk.b(intent.getStringExtra("ss"));
                    final int intExtra = -1;
                    int intExtra2 = intent.hasExtra("android.telephony.extra.SUBSCRIPTION_INDEX") ? intent.getIntExtra("android.telephony.extra.SUBSCRIPTION_INDEX", -1) : intent.hasExtra("subscription") ? intent.getIntExtra("subscription", -1) : -1;
                    boolean zEquals = "android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction());
                    if (zEquals && dhey.B(((dhey) dheoVar).h) == 1) {
                        intExtra = 0;
                    }
                    if (intent.hasExtra("android.telephony.extra.SLOT_INDEX")) {
                        intExtra = intent.getIntExtra("android.telephony.extra.SLOT_INDEX", intExtra);
                    } else if (intent.hasExtra("slot")) {
                        intExtra = intent.getIntExtra("slot", intExtra);
                    } else if (intent.hasExtra("phone")) {
                        intExtra = intent.getIntExtra("phone", intExtra);
                        dhja.r(dhipVar, "EXTRA_SLOT_KEY is not available. use PHONE_KEY:%d", Integer.valueOf(intExtra));
                    } else if (zEquals) {
                        dhja.r(dhipVar, "Missing slot index in SIM_STATE_CHANGED event", new Object[0]);
                    }
                    ((dhey) dheoVar).i.b();
                    Handler handler = ((dhey) dheoVar).d;
                    if (handler != null) {
                        final dhey dheyVar = (dhey) dheoVar;
                        handler.post(new Runnable() { // from class: dhev
                            @Override // java.lang.Runnable
                            public final void run() {
                                dheyVar.l(intExtra);
                            }
                        });
                    } else {
                        dhja.d(dhipVar, "Received SIM state %s for subId=%d slotId=%d", strB, Integer.valueOf(intExtra2), Integer.valueOf(intExtra));
                        ((dhey) dheoVar).y(context, intExtra, intExtra2, strB);
                        ((dhey) dheoVar).v();
                        dhja.d(dhipVar, "DefaultSubId=%d", Integer.valueOf(((dhey) dheoVar).b(context)));
                        if (((dhey) dheoVar).z()) {
                            dhex dhexVarR = ((dhey) dheoVar).r(context);
                            if (dhexVarR == null) {
                                dhja.r(dhipVar, "Default SIM info not updated.", new Object[0]);
                                str = "ABSENT";
                            } else {
                                str = dhexVarR.f;
                            }
                            dhja.l(dhipVar, "Processing an intent", new Object[0]);
                            ((dhey) dheoVar).w(context, str, intExtra2, intExtra);
                        } else {
                            dhja.d(dhipVar, "SIM subscription update is not finished.", new Object[0]);
                        }
                    }
                }
                dhfbVar.d();
            }
        }
    };

    public dhfb(dhem dhemVar) {
        this.e = dhemVar;
    }

    @Override // defpackage.dhep
    public final synchronized void a(Context context, dheo dheoVar, Handler handler) {
        this.a = context;
        this.b = dheoVar;
        this.d = handler;
        this.c = 0;
    }

    @Override // defpackage.dhep
    public final synchronized void b() {
        this.a = null;
        this.d = null;
        this.b = null;
        this.c = 0;
    }

    @Override // defpackage.dhep
    public final boolean c(int i) {
        if (this.f.compareAndSet(true, false)) {
            dhja.k("do not delay first event", new Object[0]);
            return false;
        }
        Long l = (Long) dfpm.a().a.b.a();
        long jLongValue = l.longValue();
        Long l2 = (Long) dfpm.a().a.a.a();
        long jLongValue2 = l2.longValue();
        Long l3 = (Long) dfpm.a().a.c.a();
        long jLongValue3 = l3.longValue();
        if (this.a == null) {
            return false;
        }
        if (i > 1) {
            jLongValue2 = jLongValue3;
        }
        if (jLongValue2 <= 0) {
            dhja.k("SIM delay is not enabled", new Object[0]);
            return false;
        }
        synchronized (this) {
            Integer numValueOf = Integer.valueOf(this.c);
            Long lValueOf = Long.valueOf(jLongValue2);
            dhja.k("SIM state event delay enabled: attempts %d, maxAttempts %d, delaySeconds %d MSIM delayseconds %d, effective delay seconds %d", numValueOf, l, l2, l3, lValueOf);
            Handler handler = this.d;
            if (handler == null) {
                return false;
            }
            if (this.c >= jLongValue) {
                dhja.k("reached max delay attempts, do not reschedule ", new Object[0]);
                return true;
            }
            Runnable runnable = this.g;
            handler.removeCallbacks(runnable);
            this.c++;
            if (!handler.postDelayed(runnable, TimeUnit.SECONDS.toMillis(jLongValue2))) {
                dhja.g("SIM state event delay failed", new Object[0]);
                return false;
            }
            dhja.k("posted simEventProcessTask to handler with delay %d", lValueOf);
            ewkd ewkdVar = (ewkd) ewke.a.createBuilder();
            int i2 = this.c;
            ewkdVar.copyOnWrite();
            ewke ewkeVar = (ewke) ewkdVar.instance;
            ewkeVar.b |= 1;
            ewkeVar.c = i2;
            dhem dhemVar = this.e;
            if (dhemVar != null) {
                dhemVar.a((ewke) ewkdVar.build());
            }
            return true;
        }
    }

    public final synchronized void d() {
        ewkd ewkdVar = (ewkd) ewke.a.createBuilder();
        ewkdVar.copyOnWrite();
        ewke ewkeVar = (ewke) ewkdVar.instance;
        ewkeVar.b |= 2;
        ewkeVar.d = true;
        dhem dhemVar = this.e;
        if (dhemVar != null) {
            dhemVar.a((ewke) ewkdVar.build());
        }
    }
}
