package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class febi extends fdzf {
    public final fdhv c;

    public febi(long j, febi febiVar, int i) {
        super(j, febiVar, i);
        this.c = new fdhv(febh.f);
    }

    @Override // defpackage.fdzf
    public final int a() {
        return febh.f;
    }

    @Override // defpackage.fdzf
    public final void l(int i) {
        fdhv fdhvVar = this.c;
        fdhvVar.a(i).c(febh.e);
        t();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
