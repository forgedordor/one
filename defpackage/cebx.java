package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebx implements cebp {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RenumberingsConfigConfigurationListener");
    public final fcsu a;
    public final fcsu b;
    public final eosc c;
    private final fcsu e;

    public cebx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosc eoscVar) {
        this.e = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.c = eoscVar;
    }

    @Override // defpackage.cebp
    public final eiju a(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: cebt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cebg) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ((ekrd) ((ekrd) d.e()).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/RenumberingsConfigConfigurationListener", "onNewConfig", 49, "RenumberingsConfigConfigurationListener.java")).t("Renumberings config configuration ids updated: %s", (ekgb) map.collect(ekcv.a));
        final long j = ((cebq) this.e.b()).e().b;
        return eiju.g(((clfo) this.a.b()).a.a()).h(new ejvr() { // from class: clfn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((aiit) obj).c);
            }
        }, eoqg.a).i(new eooz() { // from class: cebu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                long jLongValue = ((Long) obj).longValue();
                final long j2 = j;
                if (jLongValue == j2) {
                    return eorv.a;
                }
                final cebx cebxVar = this.a;
                return ((awlc) cebxVar.b.b()).a(new Function() { // from class: cebv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((clfp) obj2).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).i(new eooz() { // from class: cebw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ecjh ecjhVar = ((clfo) cebxVar.a.b()).a;
                        final long j3 = j2;
                        return eiju.g(ecjhVar.b(new ejvr() { // from class: clfm
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                aiis aiisVar = (aiis) ((aiit) obj3).toBuilder();
                                aiisVar.copyOnWrite();
                                aiit aiitVar = (aiit) aiisVar.instance;
                                aiitVar.b |= 1;
                                aiitVar.c = j3;
                                return (aiit) aiisVar.build();
                            }
                        }, eoqg.a));
                    }
                }, cebxVar.c);
            }
        }, this.c);
    }
}
