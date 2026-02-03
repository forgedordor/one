package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byev implements dqsn {
    private static final cqce b = cqce.g("BugleDataModel", "TransactionManagerImpl");
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/datamodel/util/TransactionManagerImpl");
    public final fcsu a;

    public byev(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.dqsn
    public final Object a(String str, final dqsl dqslVar) {
        final byeu byeuVar = new byeu(this, this.a);
        try {
            return c(str, new ejxr() { // from class: byer
                @Override // defpackage.ejxr
                public final Object get() {
                    return dqslVar.a(byeuVar);
                }
            });
        } catch (byet unused) {
            return byeuVar.a;
        }
    }

    @Override // defpackage.dqsn
    public final Object b(ejxr ejxrVar) {
        return ((dqsy) this.a.b()).n(ejxrVar);
    }

    @Override // defpackage.dqsn
    public final Object c(String str, ejxr ejxrVar) {
        try {
            eieu eieuVarK = eiiy.k(str);
            try {
                cqce cqceVar = b;
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("tx: ");
                cqbdVarA.I(str);
                cqbdVarA.I(" started");
                cqbdVarA.r();
                Object objP = ((dqsy) this.a.b()).p(str, ejxrVar);
                eieuVarK.close();
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("tx: ");
                cqbdVarA2.I(str);
                cqbdVarA2.I(" ended");
                cqbdVarA2.r();
                return objP;
            } finally {
            }
        } catch (Throwable th) {
            cqbd cqbdVarA3 = b.a();
            cqbdVarA3.I("tx: ");
            cqbdVarA3.I(str);
            cqbdVarA3.I(" ended");
            cqbdVarA3.r();
            throw th;
        }
    }

    @Override // defpackage.dqsn
    public final void d(String str, Runnable runnable) {
        try {
            eieu eieuVarK = eiiy.k(str);
            try {
                cqce cqceVar = b;
                cqbd cqbdVarA = cqceVar.a();
                cqbdVarA.I("tx: ");
                cqbdVarA.I(str);
                cqbdVarA.I(" started");
                cqbdVarA.r();
                ((dqsy) this.a.b()).w(str, runnable);
                eieuVarK.close();
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("tx: ");
                cqbdVarA2.I(str);
                cqbdVarA2.I(" ended");
                cqbdVarA2.r();
            } finally {
            }
        } catch (Throwable th) {
            cqbd cqbdVarA3 = b.a();
            cqbdVarA3.I("tx: ");
            cqbdVarA3.I(str);
            cqbdVarA3.I(" ended");
            cqbdVarA3.r();
            throw th;
        }
    }

    @Override // defpackage.dqsn
    public final void e(Uri uri) {
        ((dqsy) this.a.b()).z(uri);
    }

    @Override // defpackage.dqsn
    public final void f(Uri uri, String str) {
        ((dqsy) this.a.b()).A(uri, str);
    }

    @Override // defpackage.dqsn
    public final /* synthetic */ void g(dqsm dqsmVar, String str, Runnable runnable) {
        dqsk.a(this, dqsmVar, str, runnable, dqss.NO_TXN);
    }

    @Override // defpackage.dqsn
    public final /* synthetic */ void h(dqsm dqsmVar, String str, Runnable runnable, dqss dqssVar) {
        dqsk.a(this, dqsmVar, str, runnable, dqssVar);
    }

    @Override // defpackage.dqsn
    public final boolean i() {
        return ((dqsy) this.a.b()).F();
    }

    @Override // defpackage.dqsn
    public final void j(dqsb dqsbVar, ejxr ejxrVar, dqsx dqsxVar) {
        try {
            ekrg ekrgVar = c;
            ekrw ekrwVarE = ekrgVar.e();
            ekrwVarE.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/util/TransactionManagerImpl", "executeInTransaction", 66, "TransactionManagerImpl.java")).t("tx: %s started", dqsbVar);
            ((dqsy) this.a.b()).q(dqsbVar, ejxrVar, dqsxVar);
            ekrw ekrwVarE2 = ekrgVar.e();
            ekrwVarE2.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/datamodel/util/TransactionManagerImpl", "executeInTransaction", 69, "TransactionManagerImpl.java")).t("tx: %s ended", dqsbVar);
        } catch (Throwable th) {
            ekrw ekrwVarE3 = c.e();
            ekrwVarE3.X(eksq.a, "BugleDataModel");
            ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/datamodel/util/TransactionManagerImpl", "executeInTransaction", 69, "TransactionManagerImpl.java")).t("tx: %s ended", dqsbVar);
            throw th;
        }
    }
}
