package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azgp implements Supplier {
    final /* synthetic */ azgs a;

    public azgp(azgs azgsVar) {
        this.a = azgsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azgs azgsVar = this.a;
        Optional optional = azgsVar.b;
        if (optional == null || optional.equals(basg.a)) {
            return null;
        }
        return basg.b(azgsVar.b);
    }
}
