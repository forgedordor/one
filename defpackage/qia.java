package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qia implements qgk, qcg {
    public static final String a = qas.d("SystemFgDispatcher");
    public static final /* synthetic */ int k = 0;
    public final qee b;
    final Object c = new Object();
    qiw d;
    final Map e;
    final Map f;
    final Map g;
    final qgr h;
    public qhz i;
    public final qmg j;
    private final Context l;

    public qia(Context context) {
        this.l = context;
        qee qeeVarM = qee.m(context);
        this.b = qeeVarM;
        this.j = qeeVarM.m;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashMap();
        this.f = new HashMap();
        this.h = new qgr(qeeVarM.l);
        qeeVarM.g.c(this);
    }

    @Override // defpackage.qcg
    public final void a(qiw qiwVar, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            fdlr fdlrVar = ((qjn) this.f.remove(qiwVar)) != null ? (fdlr) this.g.remove(qiwVar) : null;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
        }
        Map map = this.e;
        qaa qaaVar = (qaa) map.remove(qiwVar);
        if (qiwVar.equals(this.d)) {
            if (map.size() > 0) {
                Iterator it = map.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (qiw) entry.getKey();
                if (this.i != null) {
                    qaa qaaVar2 = (qaa) entry.getValue();
                    qhz qhzVar = this.i;
                    int i = qaaVar2.a;
                    qhzVar.c(i, qaaVar2.b, qaaVar2.c);
                    this.i.a(i);
                }
            } else {
                this.d = null;
            }
        }
        qhz qhzVar2 = this.i;
        if (qaaVar == null || qhzVar2 == null) {
            return;
        }
        qas qasVarC = qas.c();
        String str = a;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        int i2 = qaaVar.a;
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(qiwVar);
        sb.append(", notificationType: ");
        sb.append(qaaVar.b);
        qasVarC.a(str, sb.toString());
        qhzVar2.a(i2);
    }

    public final void b(Intent intent) {
        if (this.i == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        qiw qiwVar = new qiw(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        qas.c().a(a, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        qaa qaaVar = new qaa(intExtra, notification, intExtra2);
        Map map = this.e;
        map.put(qiwVar, qaaVar);
        qaa qaaVar2 = (qaa) map.get(this.d);
        if (qaaVar2 == null) {
            this.d = qiwVar;
        } else {
            this.i.b(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((qaa) ((Map.Entry) it.next()).getValue()).b;
                }
                qaaVar = new qaa(qaaVar2.a, qaaVar2.c, i);
            } else {
                qaaVar = qaaVar2;
            }
        }
        this.i.c(qaaVar.a, qaaVar.b, qaaVar.c);
    }

    public final void c() {
        this.i = null;
        synchronized (this.c) {
            Iterator it = this.g.values().iterator();
            while (it.hasNext()) {
                ((fdlr) it.next()).t(null);
            }
        }
        this.b.g.d(this);
    }

    public final void d(int i) {
        qas.c();
        Log.i(a, a.g(i, "Foreground service timed out, FGS type: "));
        for (Map.Entry entry : this.e.entrySet()) {
            if (((qaa) entry.getValue()).b == i) {
                this.b.q((qiw) entry.getKey(), -128);
            }
        }
        qhz qhzVar = this.i;
        if (qhzVar != null) {
            qhzVar.d();
        }
    }

    @Override // defpackage.qgk
    public final void e(qjn qjnVar, qga qgaVar) {
        if (qgaVar instanceof qfz) {
            qas.c().a(a, "Constraints unmet for WorkSpec ".concat(qjnVar.c));
            this.b.q(qkl.a(qjnVar), ((qfz) qgaVar).a);
        }
    }
}
