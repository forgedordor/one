package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ezym implements esoa {
    private final dzfh b = dzfh.a(ezyu.a, new dzfh("ListMessages"));
    private final ekhx c = ekhx.r("https://www.googleapis.com/auth/tachyon", "https://www.googleapis.com/auth/android-messages");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? ezyu.k.m : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
