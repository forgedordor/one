package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes9.dex */
public abstract class E2 extends U1 {
    public final Comparator b;
    public boolean c;

    public E2(InterfaceC0128p2 interfaceC0128p2, Comparator comparator) {
        super(interfaceC0128p2);
        this.b = comparator;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        this.c = true;
        return false;
    }
}
