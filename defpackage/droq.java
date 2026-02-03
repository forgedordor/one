package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class droq {
    public static ListenableFuture a(dror drorVar) {
        return eooq.f(drorVar.a(), new ejvr() { // from class: drop
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Stream map = Collection.EL.stream((ekgb) obj).map(new Function() { // from class: droo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return drsy.a((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        }, eoqg.a);
    }

    public static void b(dror drorVar, drto drtoVar) {
        drorVar.e(((drsu) drtoVar).a);
    }
}
