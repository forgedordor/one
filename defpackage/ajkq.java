package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ajkq implements Consumer {
    public final /* synthetic */ ajku a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.c((elsl) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
