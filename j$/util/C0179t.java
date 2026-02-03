package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0179t extends C0046o implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0046o(this.b);
    }

    @Override // j$.util.C0046o, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0179t(this.b.subList(i, i2));
    }
}
