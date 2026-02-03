package defpackage;

import android.util.Pair;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysy {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/datamodel/backup/database/BackupDatabaseAttacher");
    public final fcsu a;
    public final fcsu b;
    public final cogw c;
    public final ahzu d;

    public aysy(fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ahzv ahzvVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        cogwVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = cogwVar;
        this.d = ahzvVar.a(e, null, null);
    }

    private static final String g(dqsy dqsyVar) {
        return dqsyVar.h().getPath();
    }

    private static final boolean h(dqsy dqsyVar, String str) {
        List<Pair<String, String>> attachedDbs = dqsyVar.h().getAttachedDbs();
        attachedDbs.getClass();
        if (attachedDbs.isEmpty()) {
            return false;
        }
        Iterator<T> it = attachedDbs.iterator();
        while (it.hasNext()) {
            if (fdbq.f(((Pair) it.next()).first, str)) {
                return true;
            }
        }
        return false;
    }

    public final dqsy a() {
        dqsy dqsyVarE = dqru.e(((dqom) ayta.a()).b);
        dqsyVarE.getClass();
        return dqsyVarE;
    }

    public final dqsy b() {
        dqsy dqsyVarE = dqru.e(((dqom) bsrj.a()).b);
        dqsyVarE.getClass();
        return dqsyVarE;
    }

    public final File c() {
        return new File(g(a()));
    }

    public final void d(final dqsy dqsyVar, dqsy dqsyVar2, final String str) {
        String strG = g(dqsyVar);
        final String strG2 = g(dqsyVar2);
        if (h(dqsyVar, str)) {
            this.d.j("Skipping SQL execution: Database [%s](alias: [%s]) is already attached to [%s]", strG2, str, strG);
            return;
        }
        ahzu ahzuVar = this.d;
        ahzuVar.j("Attempting to attach database [%s](alias: [%s]) to [%s]", strG2, str, strG);
        dqsb dqsbVar = new dqsb("backup-database-attacher-attach-db");
        ejxr ejxrVar = new ejxr() { // from class: ayst
            @Override // defpackage.ejxr
            public final Object get() throws TimeoutException {
                aysy aysyVar = this.a;
                fcsu fcsuVar = aysyVar.b;
                cogw cogwVar = aysyVar.c;
                Instant instantF = cogwVar.f();
                Object objB = fcsuVar.b();
                objB.getClass();
                Instant instantPlus = instantF.plus(Duration.ofSeconds(((Number) objB).longValue()));
                dqsy dqsyVar3 = dqsyVar;
                int i = 0;
                while (cogwVar.f().compareTo(instantPlus) < 0) {
                    i++;
                    try {
                        dqsyVar3.h().disableWriteAheadLogging();
                        aysyVar.d.j("Time spent trying to disable WAL for database [%s]: [%s] attempts in [%s]ms", ((dqom) dqsyVar3.j()).b, Integer.valueOf(i), Long.valueOf(Duration.between(instantF, cogwVar.f()).toMillis()));
                        String str2 = str;
                        dqsyVar3.v("ATTACH DATABASE \"" + strG2 + "\" AS " + str2);
                        return fctx.a;
                    } catch (IllegalStateException e2) {
                        String message = e2.getMessage();
                        message.getClass();
                        if (!fdgn.G(message, "Write Ahead Logging", false)) {
                            throw e2;
                        }
                    }
                }
                throw new TimeoutException("Failed to disable WAL mode within the timeout");
            }
        };
        dqsw dqswVarC = dqsx.c();
        dqswVarC.c(true);
        dqsyVar.q(dqsbVar, ejxrVar, dqswVarC.a());
        ahzuVar.j("Successfully attached database [%s](alias: [%s]) to [%s]", strG2, str, strG);
    }

    public final void e() {
        f(b(), a(), "backupDb");
    }

    public final void f(dqsy dqsyVar, dqsy dqsyVar2, String str) {
        String strG = g(dqsyVar);
        String strG2 = g(dqsyVar2);
        if (!h(dqsyVar, str)) {
            this.d.j("Skipping SQL execution: Database [%s](alias: [%s]) is already detached from [%s].", strG2, str, strG);
            return;
        }
        ahzu ahzuVar = this.d;
        ahzuVar.j("Attempting to detach database [%s](alias: [%s]) from [%s]", strG2, str, strG);
        dqsyVar.v("DETACH DATABASE ".concat(str));
        ahzuVar.j("Successfully detached database [%s](alias: [%s]) from [%s]", strG2, str, strG);
    }
}
