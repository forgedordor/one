package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfp implements qgk, qmc {
    public static final String a = qas.d("DelayMetCommandHandler");
    public final Context b;
    public final int c;
    public final qiw d;
    public final qfu e;
    public final qgr f;
    public int g;
    public final Executor h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final qda l;
    public final fdjq m;
    public volatile fdlr n;
    private final Object o;

    public qfp(Context context, int i, qfu qfuVar, qda qdaVar) {
        this.b = context;
        this.c = i;
        this.e = qfuVar;
        this.d = qdaVar.a;
        this.l = qdaVar;
        qhw qhwVar = qfuVar.e.l;
        qmg qmgVar = qfuVar.j;
        this.h = qmgVar.a;
        this.i = qmgVar.d;
        this.m = qmgVar.b;
        this.f = new qgr(qhwVar);
        this.k = false;
        this.g = 0;
        this.o = new Object();
    }

    public final void a() {
        synchronized (this.o) {
            if (this.n != null) {
                this.n.t(null);
            }
            qme qmeVar = this.e.c;
            qiw qiwVar = this.d;
            qmeVar.a(qiwVar);
            PowerManager.WakeLock wakeLock = this.j;
            if (wakeLock != null && wakeLock.isHeld()) {
                qas.c().a(a, "Releasing wakelock " + this.j + "for WorkSpec " + qiwVar);
                this.j.release();
            }
        }
    }

    @Override // defpackage.qmc
    public final void b(qiw qiwVar) {
        qas qasVarC = qas.c();
        String str = a;
        Objects.toString(qiwVar);
        qasVarC.a(str, "Exceeded time limits on execution for ".concat(qiwVar.toString()));
        this.h.execute(new qfn(this));
    }

    @Override // defpackage.qgk
    public final void e(qjn qjnVar, qga qgaVar) {
        if (qgaVar instanceof qfy) {
            this.h.execute(new qfo(this));
        } else {
            this.h.execute(new qfn(this));
        }
    }
}
