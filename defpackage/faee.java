package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class faee implements esoa {
    private final dzfh b = dzfh.a(faeg.a, new dzfh("UploadKeyPackages"));
    private final ekhx c = ekon.a;

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? faeg.d.f : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
