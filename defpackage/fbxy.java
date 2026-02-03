package defpackage;

import java.io.IOException;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbxy extends SocketAddress {
    private static final long serialVersionUID = -8567592561863414695L;
    private fbyc a;

    final synchronized fbyc a() {
        return this.a;
    }

    final synchronized void b(fbyc fbycVar) {
        ejwl.l(this.a == fbycVar);
        this.a = null;
    }

    final synchronized void c(fbyc fbycVar) {
        if (this.a != null) {
            throw new IOException("Server instance already registered");
        }
        this.a = fbycVar;
    }
}
