package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class crec implements Consumer {
    public final /* synthetic */ ejiq a;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.a.b((ejip) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
