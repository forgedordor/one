package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.Arrays;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drrn extends drrx {
    static final int a = 3092298;
    public static final /* synthetic */ int g = 0;
    final int b;
    final int c;
    final String d;
    final ekgb e;
    final boolean f;

    public drrn(int i, int i2, String str, ekgb ekgbVar, boolean z) {
        super(c(a, i, i2));
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = ekgbVar;
        this.f = z;
    }

    @Override // defpackage.drrx
    public final int a() {
        return a;
    }

    public final boolean b(final CharSequence charSequence) {
        if (charSequence != null) {
            return this.d.contentEquals(charSequence) || Collection.EL.stream(this.e).anyMatch(new Predicate() { // from class: drrm
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    int i = drrn.g;
                    return ((String) obj).contentEquals(charSequence);
                }
            });
        }
        return false;
    }

    @Override // defpackage.drrx
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drrn)) {
            return false;
        }
        drrn drrnVar = (drrn) obj;
        return super.equals(obj) && this.b == drrnVar.b && this.c == drrnVar.c && this.d.equals(drrnVar.d) && ekjz.h(this.e, drrnVar.e) && this.f == drrnVar.f;
    }

    @Override // defpackage.drrx
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e.hashCode()), Boolean.valueOf(this.f)});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.g("id", this.h);
        ejwfVarB.f("categoryIndex", this.b);
        ejwfVarB.f("idInCategory", this.c);
        ejwfVarB.b("primary", this.d);
        ejwfVarB.b("secondaries", this.e);
        ejwfVarB.h("useStickyVariant", this.f);
        return ejwfVarB.toString();
    }
}
