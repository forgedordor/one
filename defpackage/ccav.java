package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccav extends fcyz implements fdat {
    int a;
    final /* synthetic */ basd b;
    final /* synthetic */ basd c;
    final /* synthetic */ ccay d;
    final /* synthetic */ ccep e;
    final /* synthetic */ ccpl f;
    final /* synthetic */ aubx g;
    final /* synthetic */ asrg h;
    final /* synthetic */ eyga i;
    final /* synthetic */ athh j;
    final /* synthetic */ fdap k;
    private /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccav(fcxy fcxyVar, basd basdVar, basd basdVar2, ccay ccayVar, ccep ccepVar, ccpl ccplVar, aubx aubxVar, asrg asrgVar, eyga eygaVar, athh athhVar, fdap fdapVar) {
        super(2, fcxyVar);
        this.b = basdVar;
        this.c = basdVar2;
        this.d = ccayVar;
        this.e = ccepVar;
        this.f = ccplVar;
        this.g = aubxVar;
        this.h = asrgVar;
        this.i = eygaVar;
        this.j = athhVar;
        this.k = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.a;
        try {
            if (r1 != 0) {
                Closeable closeable = (Closeable) this.l;
                fctl.b(obj);
                r1 = closeable;
            } else {
                fctl.b(obj);
                if (!eicg.b(u())) {
                    throw new IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                eieu eieuVarH = eiiy.h("ZinniaMlsRcsMessageEncryptor.encrypt");
                basd basdVar = this.b;
                basd basdVar2 = this.c;
                if (basdVar.equals(basdVar2)) {
                    basdVar = basd.a;
                }
                basd basdVar3 = basdVar;
                ccay ccayVar = this.d;
                ccep ccepVar = this.e;
                ccpl ccplVar = this.f;
                aubx aubxVar = this.g;
                asrg asrgVar = this.h;
                eyga eygaVarB = this.i;
                if (eygaVarB == null) {
                    eyfy eyfyVar = (eyfy) eyga.a.createBuilder();
                    eyfyVar.getClass();
                    eygaVarB = eygb.b(eyfyVar);
                }
                athh athhVar = this.j;
                fdap fdapVar = this.k;
                this.l = eieuVarH;
                this.a = 1;
                obj = ccayVar.d(ccepVar, ccplVar, basdVar2, basdVar3, aubxVar, asrgVar, eygaVarB, athhVar, fdapVar, this);
                r1 = eieuVarH;
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            ccad ccadVar = (ccad) obj;
            fczl.a(r1, null);
            return ccadVar;
        } finally {
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccav ccavVar = new ccav(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        ccavVar.l = obj;
        return ccavVar;
    }
}
