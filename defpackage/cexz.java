package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cexz implements ejvr {
    public final /* synthetic */ ceyg a;

    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        Stream stream = Collection.EL.stream((ekgb) obj);
        final ceyg ceygVar = this.a;
        Stream map = stream.map(new Function() { // from class: cexs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                aoer aoerVar = (aoer) obj2;
                epci epciVarG = ceygVar.g(aoerVar.h().b(), aoerVar.t(), aoerVar.p(), aoerVar.s());
                epciVarG.copyOnWrite();
                epcj epcjVar = (epcj) epciVarG.instance;
                epcj epcjVar2 = epcj.a;
                epcjVar.g = true;
                epes epesVarA = cexp.a(aoerVar.b());
                epciVarG.copyOnWrite();
                epcj epcjVar3 = (epcj) epciVarG.instance;
                epesVarA.getClass();
                epcjVar3.h = epesVarA;
                epcjVar3.b |= 4;
                return (epcj) epciVarG.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }
}
