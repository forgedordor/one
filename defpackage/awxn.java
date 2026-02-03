package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class awxn {
    public abstract awxl a();

    public abstract axcm b();

    public abstract ekhx c();

    public abstract Optional d();

    public abstract Optional e();

    @Deprecated
    public abstract Optional f();

    public abstract Optional g();

    public abstract String h();

    public abstract boolean i();

    final ekhx j() {
        return (ekhx) Collection.EL.stream(c()).map(new Function() { // from class: awxk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((axcw) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b);
    }
}
