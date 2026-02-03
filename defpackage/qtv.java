package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtv implements qto {
    public final String a;
    public final qtk b;
    public final qtk c;
    public final qsz d;
    public final boolean e;

    public qtv(String str, qtk qtkVar, qtk qtkVar2, qsz qszVar, boolean z) {
        this.a = str;
        this.b = qtkVar;
        this.c = qtkVar2;
        this.d = qszVar;
        this.e = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpk(qofVar, quhVar, this);
    }

    public final String toString() {
        qtk qtkVar = this.c;
        return "RectangleShape{position=" + String.valueOf(this.b) + ", size=" + String.valueOf(qtkVar) + "}";
    }
}
