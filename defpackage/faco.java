package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class faco implements esoa {
    private final dzfh b = dzfh.a(facq.a, new dzfh("LookupContactLite"));
    private final ekhx c = ekhx.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? facq.y.A : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
