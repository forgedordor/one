package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes9.dex */
public final class H1 extends AbstractC0171y1 {
    public final /* synthetic */ DoubleBinaryOperator h;
    public final /* synthetic */ double i;

    public H1(EnumC0099j3 enumC0099j3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC0171y1
    public final T1 O() {
        return new C1(this.i, this.h);
    }
}
