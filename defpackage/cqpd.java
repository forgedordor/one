package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cqpd extends cqps {
    private final String a;
    private final String b;
    private final List c;

    public cqpd(String str, String str2, List list) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str2;
        if (list == null) {
            throw new NullPointerException("Null media");
        }
        this.c = list;
    }

    @Override // defpackage.cqps
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cqps
    public final String b() {
        return this.b;
    }

    @Override // defpackage.cqps
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqps) {
            cqps cqpsVar = (cqps) obj;
            if (this.a.equals(cqpsVar.a()) && this.b.equals(cqpsVar.b()) && this.c.equals(cqpsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "TenorGif{id=" + this.a + ", url=" + this.b + ", media=" + this.c.toString() + "}";
    }
}
