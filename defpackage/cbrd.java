package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbrd implements Supplier {
    final /* synthetic */ cbre a;

    public cbrd(cbre cbreVar) {
        this.a = cbreVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        cbre cbreVar = this.a;
        awjl awjlVar = cbreVar.b;
        if (awjlVar == null || awjlVar.equals(null)) {
            return null;
        }
        return awjm.b(cbreVar.b);
    }
}
