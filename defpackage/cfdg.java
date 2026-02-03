package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfdg extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cfdh c;
    final /* synthetic */ boolean d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfdg(cfdh cfdhVar, boolean z, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cfdhVar;
        this.d = z;
        this.e = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfdg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object it;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            it = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cfdh cfdhVar = this.c;
            if (((Optional) cfdhVar.c.b()).isEmpty()) {
                ekrw ekrwVarH = cfdh.a.h();
                ekrwVarH.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 40, "GaiaPairingInfoUpdateHandler.kt")).q("DittoRetryExecutor not present, skip send Gaia pairing info");
                return fctx.a;
            }
            if (!this.d) {
                int iB = ((bvkr) cfdhVar.d.b()).b(true);
                ekrw ekrwVarE = cfdh.a.e();
                ekrwVarE.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 45, "GaiaPairingInfoUpdateHandler.kt")).r("Enabled [%s] QR clients", iB);
            }
            it = ((bvkr) cfdhVar.d.b()).l().iterator();
            it.getClass();
        }
        while (true) {
            ekqg ekqgVar = (ekqg) it;
            if (!ekqgVar.hasNext()) {
                if (this.d) {
                    int iB2 = ((bvkr) this.c.d.b()).b(false);
                    ekrw ekrwVarE2 = cfdh.a.e();
                    ekrwVarE2.X(eksq.a, "BugleGDitto");
                    ((ekrd) ekrwVarE2.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler$processOnAllActiveDesktops$1", "invokeSuspend", 56, "GaiaPairingInfoUpdateHandler.kt")).r("Disabled [%s] QR clients", iB2);
                }
                return fctx.a;
            }
            bvix bvixVar = (bvix) ekqgVar.next();
            if (fdbq.f(bvixVar.c().a.d, "Bugle")) {
                cfdh cfdhVar2 = this.c;
                bvixVar.getClass();
                String str = this.e;
                boolean z = this.d;
                ekrw ekrwVarE3 = cfdh.a.e();
                ekrwVarE3.X(eksq.a, "BugleGDitto");
                ((ekrd) ekrwVarE3.h("com/google/android/apps/messaging/shared/net/handler/GaiaPairingInfoUpdateHandler", "sendGaiaPairingInfoRpc", 67, "GaiaPairingInfoUpdateHandler.kt")).t("send GaiaPairingInfo to desktop with requestId: %s", bvixVar.e());
                cfef cfefVarA = ((cfeh) cfdhVar2.b.b()).a(bvixVar.c(), epby.GET_UPDATES);
                cfefVarA.c = bvixVar.e();
                eozc eozcVar = (eozc) eoze.a.createBuilder();
                eozcVar.getClass();
                eoxs eoxsVar = (eoxs) eoxt.a.createBuilder();
                eoxsVar.getClass();
                eoxsVar.copyOnWrite();
                ((eoxt) eoxsVar.instance).b = str;
                eoxsVar.copyOnWrite();
                ((eoxt) eoxsVar.instance).c = z;
                evsn evsnVarBuild = eoxsVar.build();
                evsnVarBuild.getClass();
                eozcVar.copyOnWrite();
                eoze eozeVar = (eoze) eozcVar.instance;
                eozeVar.c = (eoxt) evsnVarBuild;
                eozeVar.b = 15;
                evsn evsnVarBuild2 = eozcVar.build();
                evsnVarBuild2.getClass();
                cfefVarA.b((eoze) evsnVarBuild2);
                eiju eijuVarA = ((cfya) ((Optional) cfdhVar2.c.b()).get()).a(cfefVarA.a());
                eijuVarA.getClass();
                this.a = it;
                this.b = 1;
                if (fdxs.c(eijuVarA, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfdg(this.c, this.d, this.e, fcxyVar);
    }
}
