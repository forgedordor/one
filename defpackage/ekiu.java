package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekiu extends ekao {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ejwm b;

    public ekiu(Iterator it, ejwm ejwmVar) {
        this.a = it;
        this.b = ejwmVar;
    }

    @Override // defpackage.ekao
    protected final Object a() {
        ejwm ejwmVar;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            ejwmVar = this.b;
            next = it.next();
        } while (!ejwmVar.a(next));
        return next;
    }
}
