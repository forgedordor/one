package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0115n extends U1 {
    public final /* synthetic */ int b = 0;
    public boolean c;
    public Object d;

    public /* synthetic */ C0115n(InterfaceC0128p2 interfaceC0128p2) {
        super(interfaceC0128p2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                InterfaceC0128p2 interfaceC0128p2 = (InterfaceC0128p2) this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC0128p2.accept((InterfaceC0128p2) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC0128p2.accept((InterfaceC0128p2) obj);
                    return;
                }
                return;
            case 1:
                InterfaceC0128p2 interfaceC0128p22 = (InterfaceC0128p2) this.a;
                Stream stream = (Stream) ((Function) this.d).apply(obj);
                if (stream != null) {
                    try {
                        if (this.c) {
                            Spliterator<T> spliteratorSpliterator2 = ((Stream) stream.sequential()).spliterator2();
                            while (!interfaceC0128p22.q() && spliteratorSpliterator2.tryAdvance(interfaceC0128p22)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC0128p22);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((Predicate) this.d).test(obj);
                    this.c = zTest;
                    if (zTest) {
                        ((InterfaceC0128p2) this.a).accept((InterfaceC0128p2) obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public void end() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((InterfaceC0128p2) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public final void k(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                ((InterfaceC0128p2) this.a).k(-1L);
                break;
            case 1:
                ((InterfaceC0128p2) this.a).k(-1L);
                break;
            default:
                ((InterfaceC0128p2) this.a).k(-1L);
                break;
        }
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public boolean q() {
        switch (this.b) {
            case 1:
                this.c = true;
                return ((InterfaceC0128p2) this.a).q();
            case 2:
                return !this.c || ((InterfaceC0128p2) this.a).q();
            default:
                return super.q();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115n(InterfaceC0128p2 interfaceC0128p2, Predicate predicate) {
        super(interfaceC0128p2);
        this.d = predicate;
        this.c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115n(InterfaceC0128p2 interfaceC0128p2, Function function) {
        super(interfaceC0128p2);
        this.d = function;
    }
}
