package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykf {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final fdae d;

    public ykf(boolean z, boolean z2, boolean z3, fdae fdaeVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykf)) {
            return false;
        }
        ykf ykfVar = (ykf) obj;
        return this.a == ykfVar.a && this.b == ykfVar.b && this.c == ykfVar.c && fdbq.f(this.d, ykfVar.d);
    }

    public final int hashCode() {
        int iA = ykd.a(this.a);
        fdae fdaeVar = this.d;
        return (((((iA * 31) + ykd.a(this.b)) * 31) + ykd.a(this.c)) * 31) + fdaeVar.hashCode();
    }

    public final String toString() {
        return "AnimateParameters(includeMetatextPadding=" + this.a + ", isGroupedWithMessage=" + this.b + ", isExpressiveAnimationOriginStartAligned=" + this.c + ", onAnimationFinished=" + this.d + ")";
    }

    public ykf() {
        this(true, false, false, new fdae() { // from class: yke
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
