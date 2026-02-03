package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnmh extends dnmj {
    public final dnjs a;

    public dnmh(dnjs dnjsVar) {
        this.a = dnjsVar;
    }

    @Override // defpackage.dnmj
    public final dnjs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnmh) && fdbq.f(this.a, ((dnmh) obj).a);
    }

    @Override // defpackage.dnmj
    public final Set f() {
        return fcvq.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleEmoji(base=" + this.a + ")";
    }
}
