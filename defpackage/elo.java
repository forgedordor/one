package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class elo implements eox {
    private final eos a;
    private final int b;
    public final ekt f;

    public elo(ekt ektVar, eos eosVar, int i) {
        this.f = ektVar;
        this.a = eosVar;
        this.b = i;
    }

    public abstract eln a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5);

    @Override // defpackage.eox
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final eln c(int i, int i2, int i3, long j) {
        return d(i, j, i2, i3, this.b);
    }

    public final eln d(int i, long j, int i2, int i3, int i4) {
        int iC;
        ekt ektVar = this.f;
        Object objD = ektVar.d(i);
        ektVar.c(i);
        boolean zK = kil.k(j);
        List listA = this.a.a(i, j);
        if (zK) {
            iC = kil.d(j);
        } else {
            if (!kil.j(j)) {
                ebs.c("does not have fixed height");
            }
            iC = kil.c(j);
        }
        return a(i, objD, iC, i4, listA, j, i2, i3);
    }

    public final eqr e() {
        return this.f.b;
    }
}
