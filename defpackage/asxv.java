package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asxv implements asxy {
    private final auwk a;
    private final asxy b;

    public asxv(auwl auwlVar, final asxy asxyVar) {
        this.a = auwlVar.a(new Function() { // from class: asxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return asxyVar.b((aubq) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.b = asxyVar;
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        return this.b.a(iterable);
    }

    @Override // defpackage.asxy
    public final eiju b(aubq aubqVar) {
        return this.a.a(aubqVar);
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
