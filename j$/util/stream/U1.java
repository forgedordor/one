package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public abstract class U1 implements InterfaceC0128p2 {
    public Object a;

    public U1(InterfaceC0128p2 interfaceC0128p2) {
        interfaceC0128p2.getClass();
        this.a = interfaceC0128p2;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public void end() {
        ((InterfaceC0128p2) this.a).end();
    }

    public Object get() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public void k(long j) {
        ((InterfaceC0128p2) this.a).k(j);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public boolean q() {
        return ((InterfaceC0128p2) this.a).q();
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(int i) {
        AbstractC0171y1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(long j) {
        AbstractC0171y1.l();
        throw null;
    }
}
