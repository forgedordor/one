package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxr implements dkxv {
    public final dkvp a;
    public final boolean b;
    public final String c;
    public final int d;
    private final String e;
    private final String f;
    private final fdae g = null;
    private final List h;
    private final fdae i;
    private final fdae j;

    public dkxr(String str, String str2, dkvp dkvpVar, List list, int i, boolean z, fdae fdaeVar, String str3) {
        this.e = str;
        this.f = str2;
        this.a = dkvpVar;
        this.h = list;
        this.d = i;
        this.b = z;
        this.i = fdaeVar;
        this.c = str3;
        if (str == null && str2 == null && dkvpVar == null) {
            throw new IllegalStateException("One of title, description, or media must be provided.");
        }
        if (dkvpVar != null && str == null && str2 == null && list.isEmpty()) {
            throw new IllegalStateException("Horizontal rich card cannot only have an attachment.");
        }
        this.j = new fdae() { // from class: dkxq
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        };
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.j;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        return this.i;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.dkxv
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxr)) {
            return false;
        }
        dkxr dkxrVar = (dkxr) obj;
        if (!fdbq.f(this.e, dkxrVar.e) || !fdbq.f(this.f, dkxrVar.f)) {
            return false;
        }
        fdae fdaeVar = dkxrVar.g;
        return fdbq.f(null, null) && fdbq.f(this.a, dkxrVar.a) && fdbq.f(this.h, dkxrVar.h) && this.d == dkxrVar.d && this.b == dkxrVar.b && fdbq.f(this.i, dkxrVar.i) && fdbq.f(this.c, dkxrVar.c);
    }

    @Override // defpackage.dkxv
    public final String f() {
        return this.e;
    }

    @Override // defpackage.dkxv
    public final List g() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.e;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        dkvp dkvpVar = this.a;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 961) + (dkvpVar != null ? dkvpVar.hashCode() : 0)) * 31) + this.h.hashCode()) * 31) + this.d) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.i.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalRichCardUiData(title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", onExpand=null, media=");
        sb.append(this.a);
        sb.append(", actions=");
        sb.append(this.h);
        sb.append(", alignment=");
        sb.append((Object) (this.d != 1 ? "End" : "Start"));
        sb.append(", isHighlighted=");
        sb.append(this.b);
        sb.append(", onLayout=");
        sb.append(this.i);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
