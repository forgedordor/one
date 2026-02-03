package defpackage;

import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dhqo extends fcyz implements fdat {
    int a;
    final /* synthetic */ dhqq b;
    final /* synthetic */ etpy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhqo(dhqq dhqqVar, etpy etpyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dhqqVar;
        this.c = etpyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhqo) c((etqt) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                etqt etqtVar = (etqt) this.d;
                ekrd ekrdVar = (ekrd) this.b.a.h().h("com/google/android/libraries/abuse/hades/moirai/download/PersephoneGrpcBlobFetcher$fetch$downloadBlobResponse$1", "invokeSuspend", 121, "PersephoneGrpcBlobFetcher.kt");
                etpy etpyVar = this.c;
                ekrdVar.t("PersephoneGrpcBlobFetcher starts downloading: %s", etpyVar);
                this.a = 1;
                obj = etqtVar.b(etpyVar, new fbrg(), this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return (etqc) obj;
        } catch (StatusException e) {
            throw new dhqx("DownloadBlob request failed: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dhqo dhqoVar = new dhqo(this.b, this.c, fcxyVar);
        dhqoVar.d = obj;
        return dhqoVar;
    }
}
