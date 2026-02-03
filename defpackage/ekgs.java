package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgs implements Serializable {
    private static final long serialVersionUID = 0;
    final ekgp a;

    public ekgs(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    Object readResolve() {
        return this.a.keySet();
    }
}
