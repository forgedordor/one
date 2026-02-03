package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpyl implements dpyt {
    public final dpzi a;
    private final dpyr b;
    private final int c;

    public dpyl(dpyr dpyrVar, int i, dpzi dpziVar) {
        dpyrVar.getClass();
        this.b = dpyrVar;
        this.c = i;
        this.a = dpziVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpyl)) {
            return false;
        }
        dpyl dpylVar = (dpyl) obj;
        return fdbq.f(this.b, dpylVar.b) && this.c == dpylVar.c && fdbq.f(this.a, dpylVar.a);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Input(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ")";
    }
}
