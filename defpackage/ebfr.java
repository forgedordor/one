package defpackage;

import j$.util.Optional;
import java.net.Socket;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebfr implements ebfu {
    private final ebfs a;

    public ebfr(ebfs ebfsVar) {
        this.a = ebfsVar;
    }

    @Override // defpackage.ebfu
    public final Optional a() {
        return Optional.empty();
    }

    @Override // defpackage.ebfu
    public final Socket b() {
        return this.a.a().accept();
    }
}
