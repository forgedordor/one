package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbvv extends SocketAddress {
    private static final long serialVersionUID = 0;
    private final int a;

    public fbvv(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fbvv) && this.a == ((fbvv) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "BoundClientAddress[" + this.a + "]";
    }
}
