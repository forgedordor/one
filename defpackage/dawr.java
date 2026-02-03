package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dawr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dawu b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dawr(dawu dawuVar, WorkerParameters workerParameters, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dawuVar;
        this.c = workerParameters;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dawr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                dawu dawuVar = this.b;
                this.a = 1;
                obj = dawuVar.h(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return new qao();
            }
            dawo.b("Marking phone verification for retry");
            return this.b.d(this.c);
        } catch (Throwable th) {
            dawo.c("Error thrown. Retrying", th);
            return this.b.d(this.c);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dawr(this.b, this.c, fcxyVar);
    }
}
