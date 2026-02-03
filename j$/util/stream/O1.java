package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes9.dex */
public final class O1 extends AbstractC0171y1 {
    public final /* synthetic */ IntBinaryOperator h;
    public final /* synthetic */ int i;

    public O1(EnumC0099j3 enumC0099j3, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC0171y1
    public final T1 O() {
        return new N1(this.i, this.h);
    }
}
