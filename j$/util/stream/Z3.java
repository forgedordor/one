package j$.util.stream;

import java.util.function.IntPredicate;

/* loaded from: classes9.dex */
public final class Z3 extends AbstractC0103k2 implements c4 {
    public long b;
    public boolean c;
    public final /* synthetic */ IntPredicate d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(InterfaceC0128p2 interfaceC0128p2, IntPredicate intPredicate, boolean z) {
        super(interfaceC0128p2);
        this.d = intPredicate;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    @Override // j$.util.stream.InterfaceC0118n2, j$.util.stream.InterfaceC0128p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(int r7) {
        /*
            r6 = this;
            boolean r0 = r6.c
            if (r0 != 0) goto L13
            java.util.function.IntPredicate r0 = r6.d
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.c = r1
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            boolean r1 = r6.e
            if (r1 == 0) goto L21
            if (r0 != 0) goto L21
            long r2 = r6.b
            r4 = 1
            long r2 = r2 + r4
            r6.b = r2
        L21:
            if (r1 != 0) goto L27
            if (r0 == 0) goto L26
            goto L27
        L26:
            return
        L27:
            j$.util.stream.p2 r0 = r6.a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.Z3.accept(int):void");
    }

    @Override // j$.util.stream.c4
    public final long s() {
        return this.b;
    }
}
