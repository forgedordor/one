package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebmg implements Cloneable {
    public ebme a;
    public int b;

    public ebmg() {
        this.a = null;
        this.b = -1;
    }

    public final String a() {
        String str;
        if (this.a == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ebme ebmeVar = this.a;
        if (ebmeVar.b != 3 || ebme.a(ebmeVar.a)) {
            str = ebmeVar.a;
        } else {
            str = "[" + ebmeVar.a + "]";
        }
        sb.append(str);
        if (this.b > 0) {
            sb.append(':');
            sb.append(this.b);
        }
        return sb.toString();
    }

    public final Object clone() {
        return new ebmg(this);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebmg)) {
            return false;
        }
        ebmg ebmgVar = (ebmg) obj;
        if (this.b != ebmgVar.b) {
            return false;
        }
        ebme ebmeVar = this.a;
        if (ebmeVar != null || ebmgVar.a == null) {
            return ebmeVar == null || ebmeVar.equals(ebmgVar.a);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 37;
        ebme ebmeVar = this.a;
        ebmeVar.getClass();
        return i + ebmeVar.hashCode();
    }

    public ebmg(ebmg ebmgVar) {
        this.a = null;
        this.b = -1;
        this.a = ebmgVar.a;
        this.b = ebmgVar.b;
    }
}
