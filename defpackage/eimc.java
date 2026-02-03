package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eimc implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        eiim eiimVar = (eiim) obj;
        eimn eimnVarE = eimo.e();
        eimnVarE.c(eiimVar.c());
        ((eily) eimnVarE).a = eiimVar.b();
        eimnVarE.b(true);
        return ((eilx) eimp.a(eimnVarE.a())).a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
