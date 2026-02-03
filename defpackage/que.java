package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class que implements qto {
    public final String a;
    public final qsz b;
    public final List c;
    public final qsy d;
    public final qtb e;
    public final qsz f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public que(String str, qsz qszVar, List list, qsy qsyVar, qtb qtbVar, qsz qszVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = qszVar;
        this.c = list;
        this.d = qsyVar;
        this.e = qtbVar;
        this.f = qszVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.qto
    public final qoy a(qof qofVar, qnm qnmVar, quh quhVar) {
        return new qpo(qofVar, quhVar, this);
    }
}
