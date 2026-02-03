package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiut extends fcyz implements fdat {
    int a;
    final /* synthetic */ aiuv b;
    final /* synthetic */ fhaz c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiut(aiuv aiuvVar, fhaz fhazVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aiuvVar;
        this.c = fhazVar;
        this.d = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aiut) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            aiuv aiuvVar = this.b;
            fhaz fhazVar = this.c;
            int i2 = this.d;
            ajlq ajlqVar = ajlq.SENT;
            this.a = 1;
            if (aiuvVar.c(fhazVar, i2, ajlqVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aiut(this.b, this.c, this.d, fcxyVar);
    }
}
