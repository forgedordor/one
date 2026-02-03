package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aohn implements Function {
    final /* synthetic */ axcm a;

    public aohn(axcm axcmVar) {
        this.a = axcmVar;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String[] strArr = buat.a;
        btzg btzgVar = new btzg();
        btzgVar.e(this.a);
        return new aogl(btzgVar.a(), true);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
