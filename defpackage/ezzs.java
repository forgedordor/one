package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ezzs implements esoa {
    private final dzfh b = dzfh.a(ezzw.a, new dzfh("PullMessages"));
    private final ekhx c = ekhx.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? ezzw.n.p : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
