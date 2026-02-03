package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwiu extends dwpr {
    private static final long serialVersionUID = 0;
    public final String a;
    public final String b;

    public dwiu(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null appName");
        }
        this.b = str2;
    }

    @Override // defpackage.dwpr
    public final String a() {
        return this.b;
    }

    @Override // defpackage.dwpr
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpr) {
            dwpr dwprVar = (dwpr) obj;
            if (this.a.equals(dwprVar.b()) && this.b.equals(dwprVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GroupId{id=" + this.a + ", appName=" + this.b + "}";
    }
}
