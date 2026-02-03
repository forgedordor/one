package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class Q3 extends N3 implements Stream.Builder {
    public Object b;
    public C0054a3 c;

    public Q3(Object obj) {
        this.b = obj;
        this.a = -2;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        int i = this.a;
        if (i == 0) {
            this.b = obj;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                C0054a3 c0054a3 = new C0054a3();
                this.c = c0054a3;
                c0054a3.z(this.b);
                this.a++;
            }
            this.c.z(obj);
        }
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream.Builder add(Object obj) {
        z(obj);
        return this;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream build() {
        int i = this.a;
        if (i < 0) {
            throw new IllegalStateException();
        }
        this.a = (-i) - 1;
        return i < 2 ? StreamSupport.stream(this, false) : StreamSupport.stream(this.c.spliterator(), false);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.a == -2) {
            consumer.z(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.a != -2) {
            return false;
        }
        consumer.z(this.b);
        this.a = -1;
        return true;
    }
}
