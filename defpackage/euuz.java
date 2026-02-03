package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euuz implements esoa {
    private final dzfh b = dzfh.a(euvd.a, new dzfh("SearchText"));
    private final ekhx c = ekhx.s("https://www.googleapis.com/auth/maps-platform.places.textsearch", "https://www.googleapis.com/auth/maps-platform.places", "https://www.googleapis.com/auth/cloud-platform");

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
