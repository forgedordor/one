package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvfj {
    public final bvkr a;
    public final fcsu b;
    public final fcsu c;
    public final cogw d;
    private final eosc e;

    public bvfj(bvkr bvkrVar, fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, eosc eoscVar) {
        this.a = bvkrVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = cogwVar;
        this.e = eoscVar;
    }

    public final eiju a(final ezol ezolVar) {
        return eijx.g(new Callable() { // from class: bvfh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.a.x(ezolVar));
            }
        }, this.e).i(new eooz() { // from class: bvfi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bvfj bvfjVar = this.a;
                return zBooleanValue ? ((cevm) bvfjVar.c.b()).m() : ((ceuk) bvfjVar.b.b()).f();
            }
        }, eoqg.a);
    }

    public final eiju b(final ezol ezolVar) {
        return eijx.g(new Callable() { // from class: bvff
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.a.x(ezolVar));
            }
        }, this.e).i(new eooz() { // from class: bvfg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bvfj bvfjVar = this.a;
                if (zBooleanValue) {
                    final cevm cevmVar = (cevm) bvfjVar.c.b();
                    final long epochMilli = bvfjVar.d.f().toEpochMilli();
                    return cevmVar.m().i(new eooz() { // from class: ceva
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            long jLongValue = ((Long) obj2).longValue();
                            final long j = epochMilli;
                            if (j <= jLongValue) {
                                return eijx.e(null);
                            }
                            cevm cevmVar2 = cevmVar;
                            return cevmVar2.a.j(new ejvr() { // from class: cevi
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    cesw ceswVar = (cesw) ((cesx) obj3).toBuilder();
                                    ceswVar.copyOnWrite();
                                    ((cesx) ceswVar.instance).h = j;
                                    return (cesx) ceswVar.build();
                                }
                            }).h(new ejvr() { // from class: cevj
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    return null;
                                }
                            }, eoqg.a);
                        }
                    }, eoqg.a);
                }
                final ceuk ceukVar = (ceuk) bvfjVar.b.b();
                final long epochMilli2 = bvfjVar.d.f().toEpochMilli();
                return ceukVar.f().i(new eooz() { // from class: cety
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        long jLongValue = ((Long) obj2).longValue();
                        final long j = epochMilli2;
                        if (j <= jLongValue) {
                            return eijx.e(null);
                        }
                        ceuk ceukVar2 = ceukVar;
                        return ceukVar2.a.j(new ejvr() { // from class: cetu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cetb cetbVar = (cetb) ((cetc) obj3).toBuilder();
                                cetbVar.copyOnWrite();
                                ((cetc) cetbVar.instance).g = j;
                                return (cetc) cetbVar.build();
                            }
                        }).h(new ejvr() { // from class: cetv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return null;
                            }
                        }, eoqg.a);
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }
}
