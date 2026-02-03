package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqy implements fdat {
    final /* synthetic */ ics a;
    final /* synthetic */ dqb b;
    final /* synthetic */ fdap c;

    public dqy(ics icsVar, dqb dqbVar, fdap fdapVar) {
        this.a = icsVar;
        this.b = dqbVar;
        this.c = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            dqz.d(this.a, this.b, this.c, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
