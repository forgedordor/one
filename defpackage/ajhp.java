package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ajhp implements Consumer {
    public final /* synthetic */ elof a;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void z(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        elof elofVar = this.a;
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.e |= 131072;
        elpgVar.az = jLongValue;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
