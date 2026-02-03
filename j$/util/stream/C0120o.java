package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0120o extends U1 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0120o(InterfaceC0128p2 interfaceC0128p2) {
        super(interfaceC0128p2);
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    ((InterfaceC0128p2) this.a).accept((InterfaceC0128p2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) this.c).accept(obj);
                ((InterfaceC0128p2) this.a).accept((InterfaceC0128p2) obj);
                break;
            case 2:
                if (((Predicate) this.c).test(obj)) {
                    ((InterfaceC0128p2) this.a).accept((InterfaceC0128p2) obj);
                    break;
                }
                break;
            case 3:
                ((InterfaceC0128p2) this.a).accept((InterfaceC0128p2) ((Function) this.c).apply(obj));
                break;
            case 4:
                ((InterfaceC0128p2) this.a).accept(((ToIntFunction) this.c).applyAsInt(obj));
                break;
            case 5:
                ((InterfaceC0128p2) this.a).accept(((ToLongFunction) this.c).applyAsLong(obj));
                break;
            default:
                ((InterfaceC0128p2) this.a).accept(((ToDoubleFunction) this.c).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public void end() {
        switch (this.b) {
            case 0:
                this.c = null;
                ((InterfaceC0128p2) this.a).end();
                break;
            default:
                super.end();
                break;
        }
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC0128p2
    public void k(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                ((InterfaceC0128p2) this.a).k(-1L);
                break;
            case 1:
            default:
                super.k(j);
                break;
            case 2:
                ((InterfaceC0128p2) this.a).k(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0120o(InterfaceC0128p2 interfaceC0128p2, Object obj, int i) {
        super(interfaceC0128p2);
        this.b = i;
        this.c = obj;
    }
}
