package defpackage;

import j$.util.Optional;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdta implements Closeable {
    private static final cqce a = cqce.g("BugleMDD", "MddFileProvider");
    private final Optional b;
    private final Optional c;

    public cdta(echb echbVar) {
        this.b = Optional.of(echbVar);
        this.c = Optional.empty();
    }

    public final String a() {
        Optional optional = this.b;
        return optional.isPresent() ? ((echb) optional.get()).a.toString() : "file:".concat((String) this.c.get());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Optional optional = this.b;
        if (optional.isEmpty()) {
            return;
        }
        try {
            ((echb) optional.get()).close();
        } catch (IOException e) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("Couldn't close the CloseableUri");
            cqbdVarB.A("Uri", ((echb) this.b.get()).toString());
            cqbdVarB.s(e);
        }
    }

    public cdta(String str) {
        this.c = Optional.of(str);
        this.b = Optional.empty();
    }
}
