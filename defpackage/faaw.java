package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class faaw implements esoa {
    private final dzfh b = dzfh.a(fabg.a, new dzfh("RegisterSilent"));
    private final ekhx c = new ekph("https://www.googleapis.com/auth/numberer");

    @Override // defpackage.esoa
    public final dzfh a() {
        return this.b;
    }

    @Override // defpackage.esoa
    public final Set b() {
        ekhx ekhxVar = this.c;
        return ekhxVar.isEmpty() ? fabg.G.I : ekhxVar;
    }

    public final String toString() {
        return this.b.a;
    }
}
