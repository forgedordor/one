package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtq implements qto {
    public final Path.FillType a;
    public final qta b;
    public final qtb c;
    public final qtd d;
    public final qtd e;
    public final String f;
    public final boolean g;
    public final int h;

    public qtq(String str, int i, Path.FillType fillType, qta qtaVar, qtb qtbVar, qtd qtdVar, qtd qtdVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = qtaVar;
        this.c = qtbVar;
        this.d = qtdVar;
        this.e = qtdVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpd(qofVar, qnmVar, quhVar, this);
    }
}
