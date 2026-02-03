package defpackage;

import j$.util.Optional;
import java.net.URI;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdc extends eqdq {
    private ezol a;
    private Optional b = Optional.empty();
    private byte c;

    @Override // defpackage.eqdq
    public final eqdr a() {
        int i = ~this.c;
        if ((i & 1) == 0) {
            return new eqdr(this.a, this.b, i & 2);
        }
        throw new IllegalStateException("Missing required properties: id");
    }

    @Override // defpackage.eqdq
    public final void b(URI uri) {
        this.b = Optional.of(uri);
        this.c = (byte) (this.c | 2);
    }

    @Override // defpackage.eqdq
    public final void c(ezol ezolVar) {
        if (ezolVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = ezolVar;
        this.c = (byte) (this.c | 1);
    }
}
