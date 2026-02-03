package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhi implements Serializable {
    final ekhj a;

    public ekhi(ekhj ekhjVar) {
        this.a = ekhjVar;
    }

    Object readResolve() {
        return this.a.j();
    }
}
