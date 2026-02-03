package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eueu implements esoa {
    private final dzfh b = dzfh.a(eufq.a, new dzfh("RecordPeopleInteraction"));
    private final ekhx c = ekhx.s("https://www.googleapis.com/auth/peopleapi.legacy.readwrite", "https://www.googleapis.com/auth/peopleapi.readwrite", "https://www.googleapis.com/auth/plus.peopleapi.readwrite");

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
