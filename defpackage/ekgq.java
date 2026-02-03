package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgq implements Serializable {
    private static final long serialVersionUID = 0;
    final ekgp a;

    public ekgq(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
