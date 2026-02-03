package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejvi extends ejvj implements Serializable {
    private static final long serialVersionUID = 0;
    final ejvj a;

    public ejvi(ejvj ejvjVar) {
        this.a = ejvjVar;
    }

    @Override // defpackage.ejvj
    protected final Object a(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ejvj
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.ejvr
    public final boolean equals(Object obj) {
        if (obj instanceof ejvi) {
            return this.a.equals(((ejvi) obj).a);
        }
        return false;
    }

    @Override // defpackage.ejvj
    public final ejvj fH() {
        return this.a;
    }

    @Override // defpackage.ejvj
    public final Object fL(Object obj) {
        return this.a.fM(obj);
    }

    @Override // defpackage.ejvj
    public final Object fM(Object obj) {
        return this.a.fL(obj);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
