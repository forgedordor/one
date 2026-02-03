package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnc extends fcyz implements fdat {
    int a;
    final /* synthetic */ tnp b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnc(fcxy fcxyVar, tnp tnpVar) {
        super(2, fcxyVar);
        this.b = tnpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tnc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        byte[] bArrQ;
        byte[] bArr;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            bArr = (byte[]) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            tnp tnpVar = this.b;
            bnar bnarVarC = ((cpqk) tnpVar.c.b()).c(2);
            if (bnarVarC == null || (bArrQ = bnarVarC.q()) == null) {
                throw new cpny("Cms backup key not found");
            }
            ceco cecoVar = (ceco) tnpVar.b.b();
            this.c = bArrQ;
            this.a = 1;
            obj = cecoVar.e(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            bArr = bArrQ;
        }
        byte[] bArr2 = ((bajj) obj).d;
        try {
            return cpob.b(bArr, bArr2);
        } catch (Exception e) {
            throw new cpoa("Unable to encrypt content", e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tnc tncVar = new tnc(fcxyVar, this.b);
        tncVar.c = obj;
        return tncVar;
    }
}
