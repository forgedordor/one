package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjq extends dnjs {
    public final CharSequence a;
    public final Set b;
    private final fctc e;

    public dnjq(CharSequence charSequence, Set set) {
        set.getClass();
        this.a = charSequence;
        this.b = set;
        this.e = fctd.a(new fdae() { // from class: dnjp
            @Override // defpackage.fdae
            public final Object invoke() {
                dnjq dnjqVar = this.a;
                Set set2 = dnjqVar.b;
                if (set2.isEmpty()) {
                    return dnjqVar.a;
                }
                dnmm dnmmVar = dnmn.a;
                StringBuilder sb = dnmn.a.get();
                sb.append(((dnjw) fcva.M(set2)).f.a());
                sb.append(dnkf.c.a());
                sb.append(dnjqVar.a);
                sb.append(dnkf.d.a());
                return sb.toString();
            }
        });
    }

    @Override // defpackage.dnkf
    public final CharSequence a() {
        return (CharSequence) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnjq)) {
            return false;
        }
        dnjq dnjqVar = (dnjq) obj;
        return fdbq.f(this.a, dnjqVar.a) && fdbq.f(this.b, dnjqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PersonComposed(plainLiteral=" + ((Object) this.a) + ", supportedGenders=" + this.b + ")";
    }
}
