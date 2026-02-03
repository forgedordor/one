package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class quf implements qto {
    public final qsz a;
    public final qsz b;
    public final qsz c;
    public final boolean d;
    public final int e;

    public quf(int i, qsz qszVar, qsz qszVar2, qsz qszVar3, boolean z) {
        this.e = i;
        this.a = qszVar;
        this.b = qszVar2;
        this.c = qszVar3;
        this.d = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpp(quhVar, this);
    }

    public final String toString() {
        qsz qszVar = this.c;
        qsz qszVar2 = this.b;
        return "Trim Path: {start: " + String.valueOf(this.a) + ", end: " + String.valueOf(qszVar2) + ", offset: " + String.valueOf(qszVar) + "}";
    }
}
