package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akax implements Function {
    final /* synthetic */ akbc a;

    public akax(akbc akbcVar) {
        this.a = akbcVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        bopp boppVar = (bopp) obj;
        boppVar.getClass();
        return this.a.e.a() ? new bopq[]{boppVar.a, boppVar.C} : new bopq[]{boppVar.a};
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
