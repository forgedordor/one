package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public abstract class J implements S3 {
    public boolean a;
    public Object b;

    @Override // j$.util.stream.InterfaceC0128p2
    public /* synthetic */ void accept(double d) {
        AbstractC0171y1.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void k(long j) {
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final boolean q() {
        return this.a;
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

    @Override // java.util.function.Consumer
    /* renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void z(Object obj) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.b = obj;
    }
}
