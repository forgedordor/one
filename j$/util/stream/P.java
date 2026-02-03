package j$.util.stream;

import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final class P extends Q {
    public final Consumer b;

    public P(Consumer consumer, boolean z) {
        super(z);
        this.b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.b.accept(obj);
    }
}
