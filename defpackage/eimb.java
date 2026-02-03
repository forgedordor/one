package defpackage;

import android.util.SparseArray;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eimb implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo536andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        eiim eiimVar = (eiim) obj;
        new SparseArray();
        return ((eima) eimq.a(eiimVar.c(), eiimVar.b(), 0.0f)).f;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
