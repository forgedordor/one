package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtn implements qto {
    public final String a;
    public final qtk b;
    public final qtd c;
    public final boolean d;
    public final boolean e;

    public qtn(String str, qtk qtkVar, qtd qtdVar, boolean z, boolean z2) {
        this.a = str;
        this.b = qtkVar;
        this.c = qtdVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpb(qofVar, quhVar, this);
    }
}
