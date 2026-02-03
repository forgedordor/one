package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class faec implements esoa {
    private final dzfh b = dzfh.a(faed.a, new dzfh("CreateCertificate"));
    private final ekhx c = ekon.a;

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? faed.c.e : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
