package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.w3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0163w3 implements InterfaceC0123o2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LongConsumer b;

    public /* synthetic */ C0163w3(LongConsumer longConsumer, int i) {
        this.a = i;
        this.b = longConsumer;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC0171y1.d();
                throw null;
            default:
                AbstractC0171y1.d();
                throw null;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void end() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void k(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ boolean q() {
        switch (this.a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC0123o2
    public final /* synthetic */ void z(Long l) {
        switch (this.a) {
            case 0:
                AbstractC0171y1.i(this, l);
                break;
            default:
                AbstractC0171y1.i(this, l);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC0128p2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC0171y1.k();
                throw null;
            default:
                AbstractC0171y1.k();
                throw null;
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0123o2, j$.util.stream.InterfaceC0128p2
    public final void accept(long j) {
        switch (this.a) {
            case 0:
                this.b.accept(j);
                break;
            default:
                ((X2) this.b).accept(j);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void z(Object obj) {
        switch (this.a) {
            case 0:
                z((Long) obj);
                break;
            default:
                z((Long) obj);
                break;
        }
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }
}
