package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptm implements ptj {
    final /* synthetic */ pto a;

    public ptm(pto ptoVar) {
        this.a = ptoVar;
    }

    @Override // defpackage.ptj
    public final void a() {
        Iterator it = this.a.d.iterator();
        it.getClass();
        if (it.hasNext()) {
            throw null;
        }
    }
}
