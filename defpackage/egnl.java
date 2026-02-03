package defpackage;

import android.database.SQLException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egnl implements ehwh {
    private final fcsu a;

    public egnl(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        final egnk egnkVar = (egnk) this.a.b();
        ejwl.l(true);
        return eiju.g(egnkVar.c.d(new ecnz() { // from class: egni
            @Override // defpackage.ecnz
            public final void a(ecoa ecoaVar) throws InterruptedException {
                egnk egnkVar2 = egnkVar;
                ecoaVar.b("cache_table", "write_ms<?", Long.toString(egnkVar2.d.f().toEpochMilli() - egnkVar2.f));
            }
        })).i(new eooz() { // from class: egnj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return egnkVar.c.a.c().f(eiid.e(new eopl() { // from class: ecmb
                    @Override // defpackage.eopl
                    public final eopy a(eopt eoptVar, Object obj2) {
                        final ecmp ecmpVar = (ecmp) obj2;
                        eieu eieuVarK = eiiy.k("ExecSQL: VACUUM");
                        try {
                            ListenableFuture listenableFutureA = ecmpVar.a(new Callable() { // from class: ecmg
                                public final /* synthetic */ String b = "VACUUM";

                                @Override // java.util.concurrent.Callable
                                public final Object call() throws SQLException {
                                    ecmpVar.a.execSQL(this.b);
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
        }, egnkVar.b);
    }
}
