package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtw implements qto {
    public final String a;
    public final qsz b;
    public final qsz c;
    public final qtj d;
    public final boolean e;

    public qtw(String str, qsz qszVar, qsz qszVar2, qtj qtjVar, boolean z) {
        this.a = str;
        this.b = qszVar;
        this.c = qszVar2;
        this.d = qtjVar;
        this.e = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpl(qofVar, quhVar, this);
    }
}
