package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdaf {
    public final dzzf a;
    public final String b;

    public cdaf(dzzf dzzfVar, String str) {
        ejwl.b(str.endsWith("__"), "Phenotype builder prefix should end with __ characters");
        this.a = dzzfVar;
        this.b = str;
    }

    public final cczi a(String str, int i) {
        return cdag.e(this.a, this.b.concat(str), i);
    }

    public final cczi b(String str, long j) {
        return cdag.f(this.a, this.b.concat(str), j);
    }

    public final cczi c(String str, String str2) {
        return cdag.g(this.a, this.b.concat(str), str2);
    }

    public final cczi d(String str, boolean z) {
        return cdag.h(this.a, this.b.concat(str), z);
    }
}
