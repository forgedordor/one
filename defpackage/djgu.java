package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djgu implements fdat {
    final /* synthetic */ ego a;
    final /* synthetic */ dipg b;
    final /* synthetic */ hsf c;

    public djgu(ego egoVar, dipg dipgVar, hsf hsfVar) {
        this.a = egoVar;
        this.b = dipgVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ego egoVar = this.a;
            hsf hsfVar = this.c;
            djgw.c(egoVar, djgw.h(hsfVar), this.b, hmlVar, 0);
        }
        return fctx.a;
    }
}
