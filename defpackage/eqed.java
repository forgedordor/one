package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqed {
    public final String a;
    public final eqef b;
    public final Map c;
    public final eqdp d;
    public final eqdw e;

    public eqed(String str, eqef eqefVar, Map map, eqdp eqdpVar, eqdw eqdwVar) {
        str.getClass();
        eqefVar.getClass();
        map.getClass();
        eqdpVar.getClass();
        this.a = str;
        this.b = eqefVar;
        this.c = map;
        this.d = eqdpVar;
        this.e = eqdwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqed)) {
            return false;
        }
        eqed eqedVar = (eqed) obj;
        return fdbq.f(this.a, eqedVar.a) && this.b == eqedVar.b && fdbq.f(this.c, eqedVar.c) && fdbq.f(this.d, eqedVar.d) && fdbq.f(this.e, eqedVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "GroupProperties(name=" + this.a + ", type=" + this.b + ", metadata=" + this.c + ", icon=" + this.d + ", inviteLink=" + this.e + ")";
    }
}
