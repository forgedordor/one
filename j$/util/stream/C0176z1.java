package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0176z1 extends AbstractC0171y1 {
    public final /* synthetic */ LongBinaryOperator h;
    public final /* synthetic */ long i;

    public C0176z1(EnumC0099j3 enumC0099j3, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC0171y1
    public final T1 O() {
        return new R1(this.i, this.h);
    }
}
