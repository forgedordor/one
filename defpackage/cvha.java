package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvha {
    public final fdae a;
    public final fdae b;

    public cvha(fdae fdaeVar, fdae fdaeVar2) {
        this.a = fdaeVar;
        this.b = fdaeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvha)) {
            return false;
        }
        cvha cvhaVar = (cvha) obj;
        return fdbq.f(this.a, cvhaVar.a) && fdbq.f(this.b, cvhaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TurnOffRcsScreenUiData(onPositiveClick=" + this.a + ", onNegativeClick=" + this.b + ")";
    }

    public cvha() {
        this(new fdae() { // from class: cvgy
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, new fdae() { // from class: cvgz
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        });
    }
}
