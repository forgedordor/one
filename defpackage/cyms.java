package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyms extends fcyz implements fdat {
    int a;
    final /* synthetic */ hox b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyms(hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyms) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        long jF;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        do {
            hox hoxVar = this.b;
            Instant instantPlusSeconds = cymy.a(hoxVar).plusSeconds(1L);
            instantPlusSeconds.getClass();
            hoxVar.b(instantPlusSeconds);
            long j = fdhi.a;
            jF = fdhk.f(1, fdhl.d);
            this.a = 1;
        } while (fdkj.d(jF, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyms(this.b, fcxyVar);
    }
}
