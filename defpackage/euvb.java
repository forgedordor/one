package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euvb implements esoa {
    private final dzfh b = dzfh.a(euvd.a, new dzfh("GetPlace"));
    private final ekhx c = ekhx.s("https://www.googleapis.com/auth/maps-platform.places.details", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? euvd.g.i : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
