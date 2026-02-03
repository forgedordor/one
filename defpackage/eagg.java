package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagg implements Serializable {
    private static final long serialVersionUID = 1;
    public boolean a;
    public boolean d;
    public boolean f;
    public boolean h;
    public int b = 0;
    public long c = 0;
    public String e = "";
    public boolean g = false;
    public int i = 1;
    public final String j = "";
    private final String k = "";

    public final void a(int i) {
        this.a = true;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        eagg eaggVar;
        if (!(obj instanceof eagg) || (eaggVar = (eagg) obj) == null) {
            return false;
        }
        if (this == eaggVar) {
            return true;
        }
        return this.b == eaggVar.b && this.c == eaggVar.c && this.e.equals(eaggVar.e) && this.g == eaggVar.g && this.i == eaggVar.i && this.j.equals(eaggVar.j) && this.k.equals(eaggVar.k);
    }

    public final int hashCode() {
        return ((((((((((((((((this.b + 2173) * 53) + Long.valueOf(this.c).hashCode()) * 53) + this.e.hashCode()) * 53) + (true != this.g ? 1237 : 1231)) * 53) + this.i) * 53) + this.j.hashCode()) * 53) + 5) * 53) + this.k.hashCode()) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.b);
        sb.append(" National Number: ");
        sb.append(this.c);
        if (this.f && this.g) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.h) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.i);
        }
        if (this.d) {
            sb.append(" Extension: ");
            sb.append(this.e);
        }
        return sb.toString();
    }
}
