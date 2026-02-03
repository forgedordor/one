package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyn implements fdpm {
    final /* synthetic */ fdcg a;
    final /* synthetic */ gyp b;

    public gyn(fdcg fdcgVar, gyp gypVar) {
        this.a = fdcgVar;
        this.b = gypVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ebj ebjVar = (ebj) obj;
        if (ebjVar instanceof ebm) {
            this.a.a++;
        } else if ((ebjVar instanceof ebn) || (ebjVar instanceof ebl)) {
            fdcg fdcgVar = this.a;
            fdcgVar.a--;
        }
        boolean z = this.a.a > 0;
        gyp gypVar = this.b;
        if (gypVar.c != z) {
            gypVar.c = z;
            jci.b(gypVar);
        }
        return fctx.a;
    }
}
