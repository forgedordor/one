package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aohk implements Function {
    final /* synthetic */ axcm a;

    public aohk(axcm axcmVar) {
        this.a = axcmVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        buas buasVar = (buas) obj;
        buasVar.ap(new dqpj("self_profiles.my_identity_token", 1, axcn.b(this.a)));
        return buasVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
