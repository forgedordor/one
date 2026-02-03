package defpackage;

import android.util.Log;
import j$.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qbt {
    public boolean a;
    public UUID b;
    public qjn c;
    public final Set d;
    private final Class e;

    public qbt(Class cls) {
        this.e = cls;
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = this.b.toString();
        string.getClass();
        String name = cls.getName();
        name.getClass();
        this.c = new qjn(string, (qbo) null, name, (String) null, (pzs) null, (pzs) null, 0L, 0L, 0L, (pzj) null, 0, (pza) null, 0L, 0L, 0L, 0L, false, (qbf) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        String name2 = cls.getName();
        name2.getClass();
        this.d = fcwm.c(name2);
    }

    public abstract qbu a();

    public final qbu b() {
        qbu qbuVarA = a();
        pzj pzjVar = this.c.l;
        boolean z = pzjVar.b() || pzjVar.e || pzjVar.c || pzjVar.d;
        qjn qjnVar = this.c;
        if (qjnVar.s) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (qjnVar.i > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        String str = qjnVar.z;
        if (str == null) {
            List listS = fdgn.S(qjnVar.e, new String[]{"."}, 0, 6);
            String strZ = listS.size() == 1 ? (String) listS.get(0) : (String) fcva.S(listS);
            if (strZ.length() > 127) {
                strZ = fdgn.Z(strZ, 127);
            }
            qjnVar.z = strZ;
        } else if (str.length() > 127) {
            qjnVar.z = fdgn.Z(str, 127);
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.b = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        string.getClass();
        qjn qjnVar2 = this.c;
        qjnVar2.getClass();
        this.c = new qjn(string, qjnVar2.d, qjnVar2.e, qjnVar2.f, new pzs(qjnVar2.g), new pzs(qjnVar2.h), qjnVar2.i, qjnVar2.j, qjnVar2.k, new pzj(qjnVar2.l), qjnVar2.m, qjnVar2.n, qjnVar2.o, qjnVar2.p, qjnVar2.q, qjnVar2.r, qjnVar2.s, qjnVar2.t, qjnVar2.u, qjnVar2.w, qjnVar2.x, qjnVar2.y, qjnVar2.z, qjnVar2.A, 524288);
        return qbuVarA;
    }

    public final void c(qbf qbfVar) {
        qbfVar.getClass();
        qjn qjnVar = this.c;
        qjnVar.s = true;
        qjnVar.t = qbfVar;
    }

    public final void d(String str) {
        str.getClass();
        this.d.add(str);
    }

    public final void e(TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.q = timeUnit.toMillis(14L);
    }

    public final void f(pza pzaVar, long j, TimeUnit timeUnit) {
        pzaVar.getClass();
        timeUnit.getClass();
        this.a = true;
        qjn qjnVar = this.c;
        qjnVar.n = pzaVar;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            qas.c();
            Log.w(qjn.a, "Backoff delay duration exceeds maximum value");
        }
        if (millis < 10000) {
            qas.c();
            Log.w(qjn.a, "Backoff delay duration less than minimum value");
        }
        qjnVar.o = fddu.m(millis, 10000L, 18000000L);
    }

    public final void g(pzj pzjVar) {
        this.c.l = pzjVar;
    }

    public final void h(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.c.i = timeUnit.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void i(Duration duration) {
        duration.getClass();
        this.c.i = duration.toMillis();
        if (Long.MAX_VALUE - System.currentTimeMillis() <= this.c.i) {
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }
    }

    public final void j(pzs pzsVar) {
        pzsVar.getClass();
        this.c.g = pzsVar;
    }

    public final void k(String str) {
        this.c.z = str;
    }
}
