package defpackage;

import java.io.Serializable;
import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekfr implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumSet a;

    public ekfr(EnumSet enumSet) {
        this.a = enumSet;
    }

    Object readResolve() {
        return new ekfs(this.a.clone());
    }
}
