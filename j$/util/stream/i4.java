package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* loaded from: classes9.dex */
public final class i4 extends j4 implements Consumer {
    public final Predicate e;
    public Object f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Spliterator spliterator, Predicate predicate, int i) {
        super(spliterator);
        this.g = i;
        this.e = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d = (this.d + 1) & 63;
        this.f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j4
    public final Spliterator b(Spliterator spliterator) {
        switch (this.g) {
            case 0:
                return new i4(spliterator, this, 0);
            default:
                return new i4(spliterator, this, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.g) {
            case 0:
                boolean z = this.c;
                Spliterator spliterator = this.a;
                if (!z) {
                    return spliterator.tryAdvance(consumer);
                }
                boolean z2 = false;
                this.c = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    if (zTryAdvance && a() && this.e.test(this.f)) {
                        z2 = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z2) {
                    this.b.set(true);
                }
                consumer.accept(this.f);
                return zTryAdvance;
            default:
                if (this.c && a() && this.a.tryAdvance(this)) {
                    zTest = this.e.test(this.f);
                    if (zTest) {
                        consumer.accept(this.f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.c = false;
                if (!zTest) {
                    this.b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.g) {
            case 1:
                if (!this.b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(Spliterator spliterator, i4 i4Var, int i) {
        super(spliterator, i4Var);
        this.g = i;
        this.e = i4Var.e;
    }
}
