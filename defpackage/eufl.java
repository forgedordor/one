package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eufl implements esoa {
    private final dzfh b = dzfh.a(eufq.a, new dzfh("ListTrashedContactPeople"));
    private final ekhx c = ekon.a;

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? eufq.ac.ae : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
