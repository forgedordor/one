package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ajhk implements Consumer {
    public final /* synthetic */ elof a;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        elof elofVar = this.a;
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.ah = ((elol) obj).d;
        elpgVar.d |= Integer.MIN_VALUE;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
