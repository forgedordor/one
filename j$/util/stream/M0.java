package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* loaded from: classes9.dex */
public class M0 extends AbstractC0065d {
    public final AbstractC0050a h;
    public final LongFunction i;
    public final BinaryOperator j;

    public M0(AbstractC0050a abstractC0050a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0050a, spliterator);
        this.h = abstractC0050a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        InterfaceC0170y0 interfaceC0170y0 = (InterfaceC0170y0) this.i.apply(this.h.t(this.b));
        this.h.M(this.b, interfaceC0170y0);
        return interfaceC0170y0.build();
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new M0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0065d abstractC0065d = this.d;
        if (abstractC0065d != null) {
            this.f = (G0) this.j.apply((G0) ((M0) abstractC0065d).f, (G0) ((M0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public M0(M0 m0, Spliterator spliterator) {
        super(m0, spliterator);
        this.h = m0.h;
        this.i = m0.i;
        this.j = m0.j;
    }
}
