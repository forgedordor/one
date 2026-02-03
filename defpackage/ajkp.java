package defpackage;

import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ajkp implements Consumer {
    public final /* synthetic */ Set a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.add((elsl) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
