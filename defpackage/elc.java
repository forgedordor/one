package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elc extends elo {
    final /* synthetic */ eos a;
    final /* synthetic */ emi b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elc(ekt ektVar, eos eosVar, int i, emi emiVar, int i2, int i3, long j) {
        super(ektVar, eosVar, i);
        this.a = eosVar;
        this.b = emiVar;
        this.c = i2;
        this.d = i3;
        this.e = j;
    }

    @Override // defpackage.elo
    public final eln a(int i, Object obj, int i2, int i3, List list, long j, int i4, int i5) {
        kji kjiVarQ = this.a.q();
        int i6 = this.c;
        emi emiVar = this.b;
        return new eln(i, obj, i2, i3, kjiVarQ, i6, this.d, list, this.e, emiVar.j, j, i4, i5);
    }
}
