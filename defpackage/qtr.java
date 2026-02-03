package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtr implements qto {
    public final String a;
    public final qta b;
    public final qtb c;
    public final qtd d;
    public final qtd e;
    public final qsz f;
    public final float g;
    public final List h;
    public final qsz i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public qtr(String str, int i, qta qtaVar, qtb qtbVar, qtd qtdVar, qtd qtdVar2, qsz qszVar, int i2, int i3, float f, List list, qsz qszVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = qtaVar;
        this.c = qtbVar;
        this.d = qtdVar;
        this.e = qtdVar2;
        this.f = qszVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = qszVar2;
        this.j = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpe(qofVar, quhVar, this);
    }
}
