package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtu implements qto {
    public final String a;
    public final qsz b;
    public final qtk c;
    public final qsz d;
    public final qsz e;
    public final qsz f;
    public final qsz g;
    public final qsz h;
    public final boolean i;
    public final boolean j;
    public final int k;

    public qtu(String str, int i, qsz qszVar, qtk qtkVar, qsz qszVar2, qsz qszVar3, qsz qszVar4, qsz qszVar5, qsz qszVar6, boolean z, boolean z2) {
        this.a = str;
        this.k = i;
        this.b = qszVar;
        this.c = qtkVar;
        this.d = qszVar2;
        this.e = qszVar3;
        this.f = qszVar4;
        this.g = qszVar5;
        this.h = qszVar6;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpj(qofVar, quhVar, this);
    }
}
