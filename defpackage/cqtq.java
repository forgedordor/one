package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqtq {
    public final cqto a;
    public final Object b = new Object();
    public final IdentityHashMap c = new IdentityHashMap();
    private final eosc d;

    public cqtq(eosc eoscVar, cqto cqtoVar) {
        this.d = eoscVar;
        this.a = cqtoVar;
    }

    public final cquc a(final cqtk cqtkVar, String str, String str2, final String str3) {
        eieu eieuVarK = eiiy.k(str);
        try {
            cqtkVar.getClass();
            cohf cohfVar = new cohf(str2);
            synchronized (this.b) {
                IdentityHashMap identityHashMap = this.c;
                if (identityHashMap.isEmpty()) {
                    this.a.fJ();
                }
                ejwl.m(identityHashMap.put(cqtkVar, cohfVar) == null, "Callback was double-registered");
            }
            cquc cqucVar = new cquc() { // from class: cqtl
                @Override // defpackage.cquc
                public final void a() {
                    eieu eieuVarK2 = eiiy.k(str3);
                    cqtk cqtkVar2 = cqtkVar;
                    cqtq cqtqVar = this.a;
                    try {
                        eiiy.e();
                        synchronized (cqtqVar.b) {
                            IdentityHashMap identityHashMap2 = cqtqVar.c;
                            ejwl.m(identityHashMap2.remove(cqtkVar2) != null, "Callback was double-unregistered");
                            if (identityHashMap2.isEmpty()) {
                                cqtqVar.a.fK();
                            }
                        }
                        eieuVarK2.close();
                    } catch (Throwable th) {
                        try {
                            eieuVarK2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    cqub.a(this);
                }
            };
            eieuVarK.close();
            return cqucVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void b(final Object obj, eieu eieuVar) {
        final ekgb ekgbVar;
        eiiy.e();
        synchronized (this.b) {
            IdentityHashMap identityHashMap = this.c;
            if (identityHashMap.isEmpty()) {
                int i = ekgb.d;
                ekgbVar = ekoe.a;
            } else {
                Stream map = Collection.EL.stream(ekgp.j(identityHashMap).entrySet()).map(new Function() { // from class: cqtn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        eieu eieuVarA = ((cohg) entry.getValue()).a();
                        try {
                            eiju eijuVarA = ((cqtk) entry.getKey()).a(obj);
                            eieuVarA.b(eijuVarA);
                            eieuVarA.close();
                            return eijuVarA;
                        } catch (Throwable th) {
                            try {
                                eieuVarA.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i2 = ekgb.d;
                ekgbVar = (ekgb) map.collect(ekcv.a);
            }
        }
        if (ekgbVar.isEmpty()) {
            return;
        }
        eiju eijuVarH = eijx.h(new eooy() { // from class: cqtm
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return eijx.a(ekgbVar);
            }
        }, this.d);
        eieuVar.b(eijuVarH);
        auvh.h(eijuVarH);
    }

    public final void c(Supplier supplier, String str) {
        eieu eieuVarK = eiiy.k(str);
        try {
            b(supplier.get(), eieuVarK);
            eieuVarK.close();
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
