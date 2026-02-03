package defpackage;

import j$.util.List;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgxo implements cgxk {
    private final cgxm a;
    private final List b;
    private final List c;
    private final cgxt d;

    public cgxo(cgxm cgxmVar, List list, cgxt cgxtVar) {
        list.getClass();
        this.a = cgxmVar;
        this.b = list;
        this.d = cgxtVar;
        List listAq = fcva.aq(list);
        this.c = listAq;
        List.EL.replaceAll(listAq, new UnaryOperator() { // from class: cgxn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cgxk cgxkVar = (cgxk) obj;
                cgxkVar.getClass();
                return new cgzq(cgxkVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cgxk
    public final cgxm a() {
        return this.a;
    }

    @Override // defpackage.cgxk
    public final Object c(Object obj, fcxy fcxyVar) {
        return this.d.a(obj, this.c, fcxyVar);
    }

    public /* synthetic */ cgxo(cgxm cgxmVar, java.util.List list) {
        this(cgxmVar, list, new cgxt());
    }
}
