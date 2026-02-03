package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfu implements qcg {
    public static final String a = qas.d("SystemAlarmDispatcher");
    final Context b;
    public final qme c;
    public final qcu d;
    public final qee e;
    final qfk f;
    final List g;
    Intent h;
    public qfs i;
    final qmg j;
    public final qec k;
    private final qdd l;

    public qfu(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        qdd qddVarB = qdb.b();
        this.l = qddVarB;
        qee qeeVarM = qee.m(context);
        this.e = qeeVarM;
        qbj qbjVar = qeeVarM.d.l;
        this.f = new qfk(applicationContext, qddVarB);
        this.c = new qme(qeeVarM.d.e);
        qcu qcuVar = qeeVarM.g;
        this.d = qcuVar;
        qmg qmgVar = qeeVarM.m;
        this.j = qmgVar;
        this.k = new qec(qcuVar, qmgVar);
        qcuVar.c(this);
        this.g = new ArrayList();
        this.h = null;
    }

    public static final void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.qcg
    public final void a(qiw qiwVar, boolean z) {
        String str = qfk.a;
        Intent intent = new Intent(this.b, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        qfk.f(intent, qiwVar);
        this.j.d.execute(new qfr(this, intent, 0));
    }

    public final void b() {
        qas.c().a(a, "Destroying SystemAlarmDispatcher");
        this.d.d(this);
        this.i = null;
    }

    public final void c() {
        e();
        PowerManager.WakeLock wakeLockA = qlv.a(this.b, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.e.m.a(new qfq(this));
        } finally {
            wakeLockA.release();
        }
    }

    public final void d(Intent intent, int i) {
        qas qasVarC = qas.c();
        String str = a;
        qasVarC.a(str, "Adding command " + intent + " (" + i + ")");
        e();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            qas.c();
            Log.w(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            e();
            List list = this.g;
            synchronized (list) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        return;
                    }
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        List list2 = this.g;
        synchronized (list2) {
            boolean zIsEmpty = list2.isEmpty();
            list2.add(intent);
            if (zIsEmpty) {
                c();
            }
        }
    }
}
