package defpackage;

import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ebdb implements Function {
    public final /* synthetic */ ebdd a;

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.a.b((OutputStream) obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
