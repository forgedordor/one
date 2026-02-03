package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyet extends dygj {
    private final String a;
    private final ejwi b;

    public dyet(String str, ejwi ejwiVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (ejwiVar == null) {
            throw new NullPointerException("Null titleContentDescription");
        }
        this.b = ejwiVar;
    }

    @Override // defpackage.dygj
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dygj
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dygj) {
            dygj dygjVar = (dygj) obj;
            if (this.a.equals(dygjVar.b()) && this.b.equals(dygjVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TextViewData{title=" + this.a + ", titleContentDescription=" + this.b.toString() + "}";
    }
}
