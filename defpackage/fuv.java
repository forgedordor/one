package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuv implements fdau {
    final /* synthetic */ boolean a;
    final /* synthetic */ foz b;
    final /* synthetic */ ebk c;

    public fuv(foz fozVar, boolean z, ebk ebkVar) {
        this.b = fozVar;
        this.a = z;
        this.c = ebkVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(1423138213);
        hmlVar.v(727091888);
        hsf hsfVarA = ebg.a(this.c, hmlVar, 0);
        foz fozVar = this.b;
        hsf hsfVarA2 = hsc.a(new ije(!this.a ? fozVar.k : ((Boolean) hsfVarA.a()).booleanValue() ? fozVar.i : fozVar.j), hmlVar);
        hmlVar.o();
        long j = ((ije) hsfVarA2.a()).i;
        hmlVar.o();
        return new ije(j);
    }
}
