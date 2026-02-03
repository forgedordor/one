package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azxo extends fcyz implements fdat {
    int a;
    final /* synthetic */ azxr b;
    final /* synthetic */ File c;
    final /* synthetic */ azvv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxo(fcxy fcxyVar, azxr azxrVar, File file, azvv azvvVar) {
        super(2, fcxyVar);
        this.b = azxrVar;
        this.c = file;
        this.d = azvvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azxo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            feavVar = (feav) this.e;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            azxr azxrVar = this.b;
            feav feavVar2 = azxrVar.g.a() ? azxrVar.f.a : azxr.a;
            this.e = feavVar2;
            this.a = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            feavVar = feavVar2;
        }
        try {
            azxr azxrVar2 = this.b;
            long jC = ayrq.c("DatabaseRestorerImpl::runWithSpecifiedBackupDatabase", new azxq(azxrVar2, this.c, this.d));
            azxrVar2.i.h("Finished restoreFromBackupDatabase, elapsed time [%s]ms", new Long(fdhi.g(jC)));
            return new fdhi(jC);
        } finally {
            feavVar.d();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        azxo azxoVar = new azxo(fcxyVar, this.b, this.c, this.d);
        azxoVar.e = obj;
        return azxoVar;
    }
}
