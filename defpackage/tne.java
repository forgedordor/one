package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tne extends fcyz implements fdat {
    final /* synthetic */ tnp a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ byte[] c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tne(fcxy fcxyVar, tnp tnpVar, byte[] bArr, byte[] bArr2) {
        super(2, fcxyVar);
        this.a = tnpVar;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tne) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        try {
            return cpob.b(this.b, this.c);
        } catch (Exception e) {
            throw new cpoa("Unable to encrypt content", e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tne tneVar = new tne(fcxyVar, this.a, this.b, this.c);
        tneVar.d = obj;
        return tneVar;
    }
}
