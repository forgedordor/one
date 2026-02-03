package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckik extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckil b;
    final /* synthetic */ dggn c;
    final /* synthetic */ emey d;
    final /* synthetic */ String e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckik(ckil ckilVar, dggn dggnVar, emey emeyVar, String str, String str2, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckilVar;
        this.c = dggnVar;
        this.d = emeyVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckik) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objA = obj;
        } else {
            ckil ckilVar = this.b;
            dggn dggnVar = this.c;
            ahkn ahknVar = ckilVar.b.a.a;
            ahnh ahnhVar = ahknVar.a;
            ccun ccunVar = new ccun((ahmo) ahnhVar.aab.b(), (ccrj) ahnhVar.uc.b(), (crqx) ahknVar.gF.b(), ahknVar.b.eA, dggnVar);
            emey emeyVar = this.d;
            String str = this.e;
            evqs evqsVarA = evqs.A(this.f);
            epvr epvrVar = epvr.CIPHER_SUITE_P256_AES128;
            this.a = 1;
            objA = ccunVar.a(emeyVar, str, "ACS_Participant_Key_Proof", evqsVarA, 4, epvrVar, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        ccvx ccvxVar = (ccvx) objA;
        return new ccvx(ckii.a(ccvxVar.a), ckii.a(ccvxVar.b), ccvxVar.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ckik(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
