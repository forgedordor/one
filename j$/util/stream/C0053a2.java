package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0053a2 extends AbstractC0065d {
    public final AbstractC0171y1 h;

    public C0053a2(AbstractC0171y1 abstractC0171y1, AbstractC0050a abstractC0050a, Spliterator spliterator) {
        super(abstractC0050a, spliterator);
        this.h = abstractC0171y1;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final Object a() {
        AbstractC0050a abstractC0050a = this.a;
        T1 t1O = this.h.O();
        abstractC0050a.M(this.b, t1O);
        return t1O;
    }

    @Override // j$.util.stream.AbstractC0065d
    public final AbstractC0065d c(Spliterator spliterator) {
        return new C0053a2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0065d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0065d abstractC0065d = this.d;
        if (abstractC0065d != null) {
            T1 t1 = (T1) ((C0053a2) abstractC0065d).f;
            t1.u((T1) ((C0053a2) this.e).f);
            this.f = t1;
        }
        super.onCompletion(countedCompleter);
    }

    public C0053a2(C0053a2 c0053a2, Spliterator spliterator) {
        super(c0053a2, spliterator);
        this.h = c0053a2.h;
    }
}
