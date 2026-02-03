package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvn extends ejvp implements Serializable {
    public static final ejvn a = new ejvn();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ejvp
    public final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.ejvp
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
