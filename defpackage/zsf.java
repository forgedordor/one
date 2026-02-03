package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsf extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ alff c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsf(ztv ztvVar, alff alffVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = alffVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdap zsyVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ztv ztvVar = this.b;
            alff alffVar = this.c;
            if (alffVar instanceof bbeg) {
                zsyVar = new ztg(alffVar, ztvVar, null);
            } else if (alffVar instanceof bbeh) {
                zsyVar = new zth(ztvVar, null);
            } else if (alffVar instanceof bbea) {
                zsyVar = new zti(ztvVar, alffVar, null);
            } else if (alffVar instanceof alfb) {
                zsyVar = new ztk(ztvVar, alffVar, null);
            } else if (alffVar instanceof alfa) {
                zsyVar = new ztl(ztvVar, alffVar, null);
            } else if (alffVar instanceof bbeb) {
                zsyVar = new ztm(ztvVar, alffVar, null);
            } else if (alffVar instanceof bbei) {
                zsyVar = new ztn(ztvVar, alffVar, null);
            } else if (alffVar instanceof bbdq) {
                zsyVar = new zto(alffVar, ztvVar, null);
            } else if (alffVar instanceof bbdt) {
                zsyVar = new ztp(ztvVar, alffVar, null);
            } else if (alffVar instanceof alfe) {
                zsyVar = new zsw(alffVar, ztvVar, null);
            } else if (alffVar instanceof bbdo) {
                zsyVar = new zsx(alffVar, ztvVar, null);
            } else {
                int iOrdinal = alffVar.a().ordinal();
                if (iOrdinal == 0) {
                    zsyVar = new zsy(null);
                } else if (iOrdinal == 2) {
                    zsyVar = new zsz(ztvVar, null);
                } else if (iOrdinal != 9) {
                    switch (iOrdinal) {
                        case 13:
                            zsyVar = new zte(ztvVar, null);
                            break;
                        case 14:
                            zsyVar = new ztd(ztvVar, null);
                            break;
                        case 15:
                            zsyVar = new ztc(ztvVar, null);
                            break;
                        case 16:
                            zsyVar = new ztb(ztvVar, null);
                            break;
                        default:
                            zsyVar = new ztf(null);
                            break;
                    }
                } else {
                    zsyVar = new zta(ztvVar, null);
                }
            }
            zst zstVar = new zst(zsyVar, alffVar, ztvVar, null);
            this.a = 1;
            if (zstVar.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsf(this.b, this.c, fcxyVar);
    }
}
