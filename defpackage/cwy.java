package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwy extends fdbr implements fdap {
    final /* synthetic */ iyl[] a;
    final /* synthetic */ cwz b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwy(iyl[] iylVarArr, cwz cwzVar, int i, int i2) {
        super(1);
        this.a = iylVarArr;
        this.b = cwzVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iyk iykVar = (iyk) obj;
        int i = 0;
        while (true) {
            iyl[] iylVarArr = this.a;
            if (i >= iylVarArr.length) {
                return fctx.a;
            }
            iyl iylVar = iylVarArr[i];
            if (iylVar != null) {
                long jA = this.b.a.b.a((iylVar.a << 32) | (iylVar.b & 4294967295L), (this.d & 4294967295L) | (this.c << 32), kji.a);
                iykVar.s(iylVar, kjb.a(jA), kjb.b(jA), 0.0f);
            }
            i++;
        }
    }
}
