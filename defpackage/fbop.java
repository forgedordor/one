package defpackage;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbop {
    public static final fbmv a = new fbmv("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");
    public final List b;
    public final fbmw c;
    private final int d;

    public fbop(SocketAddress socketAddress) {
        this(socketAddress, fbmw.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbop)) {
            return false;
        }
        fbop fbopVar = (fbop) obj;
        List list = this.b;
        int size = list.size();
        List list2 = fbopVar.b;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!((SocketAddress) list.get(i)).equals(list2.get(i))) {
                return false;
            }
        }
        return this.c.equals(fbopVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        fbmw fbmwVar = this.c;
        return "[" + String.valueOf(this.b) + "/" + fbmwVar.toString() + "]";
    }

    public fbop(SocketAddress socketAddress, fbmw fbmwVar) {
        this(Collections.singletonList(socketAddress), fbmwVar);
    }

    public fbop(List list, fbmw fbmwVar) {
        ejwl.b(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = listUnmodifiableList;
        fbmwVar.getClass();
        this.c = fbmwVar;
        this.d = listUnmodifiableList.hashCode();
    }
}
