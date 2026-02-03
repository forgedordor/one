package defpackage;

import android.database.SQLException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecmd {
    public final ecng a;

    public ecmd(ecng ecngVar) {
        this.a = ecngVar;
    }

    public final eopy a(final ecnv ecnvVar) {
        return this.a.c().f(eiid.e(new eopl() { // from class: ecly
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                ecmp ecmpVar = (ecmp) obj;
                ecmpVar.c();
                ecnv ecnvVar2 = ecnvVar;
                ecml ecmlVar = new ecml(ecmpVar, ecnvVar2.b, ecnvVar2.a);
                int i = ecnj.a;
                ecnh ecnhVar = new ecnh(ecmlVar);
                ecnhVar.e(ecmpVar.b);
                return eopy.b(ecnhVar, eoqg.a);
            }
        }), eoqg.a);
    }

    public final ListenableFuture b(final ecnv ecnvVar) {
        return this.a.c().f(eiid.e(new eopl() { // from class: eclz
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                final ecmp ecmpVar = (ecmp) obj;
                ecnv ecnvVar2 = ecnvVar;
                final String str = ecnvVar2.a;
                eieu eieuVarK = eiiy.k("ExecSQL: ".concat(str));
                final Object[] objArr = ecnvVar2.b;
                try {
                    ListenableFuture listenableFutureA = ecmpVar.a(new Callable() { // from class: ecmh
                        @Override // java.util.concurrent.Callable
                        public final Object call() throws SQLException {
                            ecmpVar.a.execSQL(str, objArr);
                            return null;
                        }
                    });
                    eieuVarK.b(listenableFutureA);
                    eieuVarK.close();
                    return new eopy(listenableFutureA);
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }), eoqg.a).g();
    }

    public final ListenableFuture c(final ecny ecnyVar) {
        return this.a.c().f(eiid.e(new eopl() { // from class: ecma
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                return new eopy(((ecmp) obj).b(ecnyVar));
            }
        }), eoqg.a).g();
    }

    public final ListenableFuture d(final ecnz ecnzVar) {
        return this.a.c().f(eiid.e(new eopl() { // from class: ecmc
            @Override // defpackage.eopl
            public final eopy a(eopt eoptVar, Object obj) {
                final ecnz ecnzVar2 = ecnzVar;
                return new eopy(((ecmp) obj).b(new ecny() { // from class: ecmj
                    @Override // defpackage.ecny
                    public final Object a(ecoa ecoaVar) {
                        ecnzVar2.a(ecoaVar);
                        return null;
                    }
                }));
            }
        }), eoqg.a).g();
    }
}
