package defpackage;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atjj extends fcyz implements fdat {
    int a;
    final /* synthetic */ atjl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atjj(atjl atjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atjj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atjl atjlVar = this.b;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        atjlVar.d = fdiuVar;
        atji atjiVar = new atji(fdiuVar, atjlVar);
        fdiuVar.d(new atjh(atjlVar));
        final fdap fdapVar = new fdap() { // from class: athc
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                return new LinkedHashSet();
            }
        };
        ((Set) ConcurrentMap.EL.computeIfAbsent(atjlVar.b.a, atjlVar.c, new Function() { // from class: athd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).add(atjiVar);
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atjj(this.b, fcxyVar);
    }
}
