package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgxr implements dhay {
    final /* synthetic */ dgxt a;

    public dgxr(dgxt dgxtVar) {
        this.a = dgxtVar;
    }

    @Override // defpackage.dhay
    public final void a(int i, String str) {
        dhja.c("Presence information was not published: status: %d error: %s", Integer.valueOf(i), str);
        if (i == 423) {
            dgxt dgxtVar = this.a;
            dgxtVar.w(Math.max(dgxtVar.u(), dgxtVar.i.j != null ? r6.f : 0));
            return;
        }
        if (i == 412) {
            dgxt dgxtVar2 = this.a;
            dgxtVar2.o.a();
            dgxtVar2.w(dgxtVar2.u());
        }
    }

    @Override // defpackage.dhay
    public final void b(String str, dhmb dhmbVar) {
        int seconds;
        dhja.c("Presence information was successfully published: Presence %s", dhmbVar == null ? dhmbVar : dhmbVar.toString());
        dgxt dgxtVar = this.a;
        dgxtVar.v();
        dhaw dhawVar = dgxtVar.i;
        dgvj dgvjVar = dhawVar.j;
        if (dgvjVar == null) {
            seconds = (int) TimeUnit.MILLISECONDS.toSeconds(dhawVar.m.a);
            if (seconds <= 0) {
                seconds = 3600;
            }
        } else {
            seconds = dgvjVar.e;
        }
        dgxtVar.w(Math.max((int) (seconds * 0.9d), 300));
        if (str == null || dhmbVar == null) {
            return;
        }
        dfio dfioVar = dgxtVar.o;
        synchronized (dfioVar.c) {
            dhgz dhgzVar = dfioVar.a;
            String strE = dhgzVar.e();
            dhgzVar.n(str);
            try {
                OutputStream outputStreamC = dfioVar.b.c("capabilities-pidf.xml");
                try {
                    dhme.b(dhmbVar, outputStreamC);
                    if (outputStreamC != null) {
                        outputStreamC.close();
                    }
                } catch (Throwable th) {
                    if (outputStreamC != null) {
                        try {
                            outputStreamC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (Objects.isNull(strE)) {
                    dfioVar.a.m();
                } else {
                    dfioVar.a.n(strE);
                }
                dhja.i(e, "Failed to store capabilities PIDF on disk", new Object[0]);
            }
        }
    }

    @Override // defpackage.dhay
    public final void c() {
        dhja.c("Presence service has started", new Object[0]);
    }

    @Override // defpackage.dhay
    public final void d() {
        dhja.c("Publication of presence information has terminated ", new Object[0]);
        this.a.o.a();
    }

    @Override // defpackage.dhay
    public final void e(String str, dhmb dhmbVar) {
        dhly dhlyVar;
        ekgb ekgbVarN;
        dgxt dgxtVar = this.a;
        dgwx dgwxVar = new dgwx(dgxtVar.l.a);
        for (dhmg dhmgVar : dhmbVar.b()) {
            dhmf dhmfVar = dhmgVar.b;
            if (dhmfVar != null && (dhlyVar = dhmfVar.a) != null && !dhlyVar.equals(dhly.CLOSED)) {
                dgxd dgxdVar = dgxtVar.n;
                dhlw dhlwVar = dhmgVar.c;
                dhfs dhfsVar = dgxdVar.a;
                if (dhfsVar.b.equals(dhlwVar)) {
                    dgwxVar.e(true);
                    dgwxVar.q(true);
                }
                if (dhfsVar.c.equals(dhlwVar)) {
                    dgwxVar.i(true);
                }
                if (dhfsVar.d.equals(dhlwVar)) {
                    dgwxVar.n(true);
                }
                if (dhfsVar.e.equals(dhlwVar)) {
                    dgwxVar.f(true);
                }
                if (dhfsVar.f.equals(dhlwVar)) {
                    dgwxVar.g(true);
                }
                if (dhfsVar.g.equals(dhlwVar)) {
                    dgwxVar.k(true);
                }
                if (dhfsVar.h.equals(dhlwVar)) {
                    dgwxVar.l(true);
                }
                if (dhfsVar.i.equals(dhlwVar)) {
                    dgwxVar.O();
                }
                if (dhfsVar.j.equals(dhlwVar)) {
                    dgwxVar.Q();
                }
                if (dhfsVar.l.equals(dhlwVar)) {
                    dgwxVar.S();
                }
                if (dhfsVar.k.equals(dhlwVar)) {
                    dgwxVar.R();
                }
                if (dhfsVar.m.equals(dhlwVar)) {
                    dgwxVar.p(true);
                }
                if (dhfsVar.n.equals(dhlwVar)) {
                    dgwxVar.m(true);
                    List list = dhmgVar.g;
                    if (list == null) {
                        int i = ekgb.d;
                        ekgbVarN = ekoe.a;
                    } else {
                        ekgbVarN = ekgb.n(list);
                    }
                    if (ekgbVarN.contains(dhlr.VIDEO)) {
                        dgwxVar.P();
                    }
                }
            }
        }
        if (!dgwxVar.B()) {
            dgwxVar.q(false);
        }
        dgwxVar.c = true;
        dgwxVar.d = true;
        dgwxVar.e = dhkl.a().longValue();
        dgwxVar.d = true;
        String strO = dhjv.o(str, dgxtVar.k);
        Map map = dgxtVar.j;
        dgxs dgxsVar = (dgxs) map.get(strO);
        if (dgxsVar == null) {
            dhja.q("Unexpected Presence update from %s", dhiz.USER_ID.c(str));
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = dgxtVar.g;
        long jLongValue = dgxsVar.a.longValue();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((dgxg) it.next()).k(jLongValue, strO, dgwxVar);
        }
        map.remove(strO);
    }

    @Override // defpackage.dhay
    public final void f(dhnu dhnuVar) {
        dhja.c("Presence subscription state has changed to %s", dhnuVar.d);
    }
}
