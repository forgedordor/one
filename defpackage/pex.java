package defpackage;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class pex {
    public volatile pjo a;
    public fdjx b;
    public fcyh c;
    public Executor d;
    public Executor e;
    public pep f;
    public pdz g;
    public boolean i;
    public final pgp h = new pgp();
    private final ThreadLocal l = new ThreadLocal();
    public final Map j = new LinkedHashMap();
    public boolean k = true;

    private final Object x(final fdae fdaeVar) {
        if (!r()) {
            return phx.b(this, false, true, new fdap() { // from class: pes
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    ((pgz) obj).getClass();
                    return fdaeVar.invoke();
                }
            });
        }
        n();
        try {
            Object objInvoke = fdaeVar.invoke();
            q();
            return objInvoke;
        } finally {
            o();
        }
    }

    protected abstract pdz a();

    public final pdz b() {
        pdz pdzVar = this.g;
        if (pdzVar != null) {
            return pdzVar;
        }
        fdbq.c("internalTracker");
        return null;
    }

    protected pfb c() {
        throw new fcth((byte[]) null);
    }

    @fcsv
    protected pjt d(pdi pdiVar) {
        throw new fcth((byte[]) null);
    }

    public final pjt e() {
        pep pepVar = this.f;
        if (pepVar == null) {
            fdbq.c("connectionManager");
            pepVar = null;
        }
        pjt pjtVarC = pepVar.c();
        if (pjtVarC != null) {
            return pjtVarC;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final Object f(final Callable callable) {
        return x(new fdae() { // from class: per
            @Override // defpackage.fdae
            public final Object invoke() {
                return callable.call();
            }
        });
    }

    protected Map g() {
        return fcvp.a;
    }

    @fcsv
    public Set h() {
        return fcvq.a;
    }

    public final fcyh i() {
        fdjx fdjxVar = this.b;
        if (fdjxVar == null) {
            fdbq.c("coroutineScope");
            fdjxVar = null;
        }
        return ((fdxz) fdjxVar).a;
    }

    public final fcyh j() {
        fcyh fcyhVar = this.c;
        if (fcyhVar != null) {
            return fcyhVar;
        }
        fdbq.c("transactionContext");
        return null;
    }

    public final fdjx k() {
        fdjx fdjxVar = this.b;
        if (fdjxVar != null) {
            return fdjxVar;
        }
        fdbq.c("coroutineScope");
        return null;
    }

    public final void l() {
        if (!this.i && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void m() {
        if (r() && !s() && this.l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @fcsv
    public final void n() {
        l();
        l();
        pjo pjoVarB = e().b();
        if (!pjoVarB.i()) {
            pgy.a(new pdy(b(), null));
        }
        if (((pkb) pjoVarB).d.isWriteAheadLoggingEnabled()) {
            pjoVarB.e();
        } else {
            pjoVarB.d();
        }
    }

    public final void o() {
        e().b().f();
        if (s()) {
            return;
        }
        pdz pdzVarB = b();
        pdzVarB.b.g(pdzVarB.e, pdzVarB.f);
    }

    public final void p(final Runnable runnable) {
        x(new fdae() { // from class: peq
            @Override // defpackage.fdae
            public final Object invoke() {
                runnable.run();
                return fctx.a;
            }
        });
    }

    @fcsv
    public final void q() {
        e().b().h();
    }

    public final boolean r() {
        pep pepVar = this.f;
        if (pepVar == null) {
            fdbq.c("connectionManager");
            pepVar = null;
        }
        return pepVar.c() != null;
    }

    public final boolean s() {
        return t() && e().b().i();
    }

    public final boolean t() {
        pep pepVar = this.f;
        if (pepVar == null) {
            fdbq.c("connectionManager");
            pepVar = null;
        }
        pjo pjoVar = pepVar.d;
        if (pjoVar != null) {
            return pjoVar.j();
        }
        return false;
    }

    public final void u(pgz pgzVar) throws Exception {
        pdz pdzVarB = b();
        pgn pgnVar = pdzVarB.b;
        phi phiVarA = pgzVar.a("PRAGMA query_only");
        try {
            phiVarA.j();
            boolean zL = phiVarA.l();
            fdaa.a(phiVarA, null);
            if (!zL) {
                pjk.a(pgzVar, "PRAGMA temp_store = MEMORY");
                pjk.a(pgzVar, "PRAGMA recursive_triggers = 1");
                pjk.a(pgzVar, "DROP TABLE IF EXISTS room_table_modification_log");
                if (pgnVar.b) {
                    pjk.a(pgzVar, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    pjk.a(pgzVar, fdgn.q("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                pee peeVar = pgnVar.c;
                ReentrantLock reentrantLock = peeVar.a;
                reentrantLock.lock();
                try {
                    peeVar.d = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (pdzVarB.i) {
                peb pebVar = pdzVarB.h;
            }
        } finally {
        }
    }

    @fcsv
    public List v() {
        return fcvo.a;
    }

    public final Object w(fdat fdatVar, fcxy fcxyVar) {
        pep pepVar = this.f;
        if (pepVar == null) {
            fdbq.c("connectionManager");
            pepVar = null;
        }
        return fdatVar.a(new phe(new pgz(pepVar.e.a.a.b())), fcxyVar);
    }
}
