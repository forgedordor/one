package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csfr extends fcyz implements fdat {
    final /* synthetic */ csfs a;
    final /* synthetic */ byte[] b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csfr(fcxy fcxyVar, csfs csfsVar, byte[] bArr) {
        super(2, fcxyVar);
        this.a = csfsVar;
        this.b = bArr;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csfr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        csft csftVar = (csft) this.a.a.b();
        byte[] bArr = this.b;
        eieu eieuVarH = eiiy.h("TemplatesProtoCipher#decrypt");
        try {
            if (bArr.length == 0) {
                ezba ezbaVar = ezba.a;
                ezbaVar.getClass();
                fczl.a(eieuVarH, null);
                return ezbaVar;
            }
            ezba ezbaVar2 = (ezba) evsn.parseFrom(ezba.a, csftVar.a(bArr), evrr.a());
            ezbaVar2.getClass();
            fczl.a(eieuVarH, null);
            return ezbaVar2;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csfr csfrVar = new csfr(fcxyVar, this.a, this.b);
        csfrVar.c = obj;
        return csfrVar;
    }
}
