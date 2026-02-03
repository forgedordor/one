package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvm extends ejvp implements Serializable {
    public static final ejvm a = new ejvm();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ejvp
    public final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.ejvp
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
