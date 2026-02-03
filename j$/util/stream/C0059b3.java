package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0059b3 extends Spliterators.AbstractSpliterator {
    public Object d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ UnaryOperator g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Predicate i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0059b3(Object obj, Predicate predicate, UnaryOperator unaryOperator) {
        super(Long.MAX_VALUE, 1040);
        this.g = unaryOperator;
        this.h = obj;
        this.i = predicate;
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        if (this.f) {
            return;
        }
        this.f = true;
        boolean z = this.e;
        UnaryOperator unaryOperator = this.g;
        this.d = null;
        for (Object objApply = z ? unaryOperator.apply(this.d) : this.h; this.i.test(objApply); objApply = unaryOperator.apply(objApply)) {
            consumer.accept(objApply);
        }
    }

    @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object objApply;
        consumer.getClass();
        if (this.f) {
            return false;
        }
        if (this.e) {
            objApply = this.g.apply(this.d);
        } else {
            this.e = true;
            objApply = this.h;
        }
        if (this.i.test(objApply)) {
            this.d = objApply;
            consumer.accept(objApply);
            return true;
        }
        this.d = null;
        this.f = true;
        return false;
    }
}
