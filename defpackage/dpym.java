package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpym implements dpyt {
    public final dpzi a;
    private final dpyr b;
    private final int c;
    private final dplj d;

    public dpym(dpyr dpyrVar, int i, dpzi dpziVar, dplj dpljVar) {
        dpyrVar.getClass();
        this.b = dpyrVar;
        this.c = i;
        this.a = dpziVar;
        this.d = dpljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpym)) {
            return false;
        }
        dpym dpymVar = (dpym) obj;
        return fdbq.f(this.b, dpymVar.b) && this.c == dpymVar.c && fdbq.f(this.a, dpymVar.a) && fdbq.f(this.d, dpymVar.d);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "InputOverKeyboard(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ", keyboard=" + this.d + ")";
    }
}
