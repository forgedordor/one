package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyt {
    public final egzj a;
    public final diep b;

    public egyt(egzj egzjVar, diep diepVar) {
        this.a = egzjVar;
        this.b = diepVar;
    }

    public static boolean b(egyh egyhVar, egzr egzrVar, Instant instant) {
        return egyhVar.e() && egyhVar.f() && egyhVar.c().isAfter(instant.minus(egzrVar.k));
    }

    public static final eopy c(egyi egyiVar, String str) {
        eieu eieuVarK = eiiy.k(str);
        try {
            eopy eopyVarA = egyiVar.a();
            eieuVarK.a(eopyVarA);
            eieuVarK.close();
            return eopyVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ListenableFuture a(final egyi egyiVar, final egzr egzrVar) {
        eieu eieuVarK = eiiy.k("getDataAsFuture");
        try {
            final Instant instantF = this.b.f();
            eopy eopyVarC = c(egyiVar, "First load");
            eopl eoplVarE = eiid.e(new eopl() { // from class: egyp
                @Override // defpackage.eopl
                public final eopy a(eopt eoptVar, Object obj) {
                    egyh egyhVar = (egyh) obj;
                    final egzr egzrVar2 = egzrVar;
                    final Instant instant = instantF;
                    boolean zB = egyt.b(egyhVar, egzrVar2, instant);
                    final egyi egyiVar2 = egyiVar;
                    if (zB) {
                        return new eopy(eork.i(egyhVar.d()));
                    }
                    eieu eieuVarK2 = eiiy.k("getDataAsFuture fetch");
                    try {
                        ListenableFuture listenableFutureB = egyiVar2.b();
                        eieuVarK2.b(listenableFutureB);
                        egyt egytVar = this.a;
                        eieuVarK2.close();
                        egytVar.a.a(listenableFutureB, egyiVar2.c());
                        eopy eopyVar = new eopy(listenableFutureB);
                        eopl eoplVarE2 = eiid.e(new eopl() { // from class: egyn
                            @Override // defpackage.eopl
                            public final eopy a(eopt eoptVar2, Object obj2) {
                                return egyt.c(egyiVar2, "Second load");
                            }
                        });
                        eoqg eoqgVar = eoqg.a;
                        return eopyVar.f(eoplVarE2, eoqgVar).e(eiid.g(new eopo() { // from class: egyo
                            @Override // defpackage.eopo
                            public final Object a(eopt eoptVar2, Object obj2) {
                                egyh egyhVar2 = (egyh) obj2;
                                if (egyt.b(egyhVar2, egzrVar2, instant)) {
                                    return egyhVar2.d();
                                }
                                throw new IllegalStateException("fetchAndStore() did not produce a cache hit");
                            }
                        }), eoqgVar);
                    } catch (Throwable th) {
                        try {
                            eieuVarK2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            eoqg eoqgVar = eoqg.a;
            eopy eopyVarF = eopyVarC.f(eoplVarE, eoqgVar);
            eieuVarK.a(eopyVarF);
            eoqt eoqtVarG = eopyVarF.e(new eopo() { // from class: egyq
                @Override // defpackage.eopo
                public final Object a(eopt eoptVar, Object obj) {
                    return eiid.a(ejvu.a).apply(obj);
                }
            }, eoqgVar).g();
            eieuVarK.close();
            return eoqtVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
