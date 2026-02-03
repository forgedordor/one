package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dssg extends ea {
    public static final eksp a = eksp.c("GnpSdk");
    public dsmu ag;
    private adj ah;
    public fcsu b;
    public dsah c;
    public String d;
    public etgd e = etgd.ANDROID_PERMISSION_TYPE_UNSPECIFIED;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            Object obj = dxkg.a(context).fL().get(dssg.class);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Object objB = ((fcsu) obj).b();
            objB.getClass();
            ((drzh) objB).a(this);
            final dsbi dsbiVar = laa.b() ? (dsbi) C().getParcelable("promo_context", dsbi.class) : (dsbi) C().getParcelable("promo_context");
            if (dsbiVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            etnj etnjVar = dsbiVar.c().f;
            if (etnjVar == null) {
                etnjVar = etnj.a;
            }
            if (etnjVar.c == 6) {
                etnj etnjVar2 = dsbiVar.c().f;
                if (etnjVar2 == null) {
                    etnjVar2 = etnj.a;
                }
                etna etnaVar = etnjVar2.c == 6 ? (etna) etnjVar2.d : etna.a;
                etnaVar.getClass();
                etmy etmyVar = etnaVar.e;
                if (etmyVar == null) {
                    etmyVar = etmy.b;
                }
                T t = new evsz(etmyVar.c, etmy.a).get(0);
                t.getClass();
                etgd etgdVar = (etgd) t;
                this.e = etgdVar;
                this.d = dsbf.a(etgdVar);
                this.ah = O(new aen(), new adi() { // from class: dssd
                    @Override // defpackage.adi
                    public final void a(Object obj2) {
                        Boolean bool = (Boolean) obj2;
                        bool.getClass();
                        boolean zBooleanValue = bool.booleanValue();
                        dssg dssgVar = this.a;
                        final String str = dssgVar.d;
                        if (str == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        dssg.a.o().E("%s permission request user response is %s", str, zBooleanValue);
                        dsmu dsmuVar = dssgVar.ag;
                        dsah dsahVar = null;
                        if (dsmuVar == null) {
                            fdbq.c("permissionRequestsStateDataService");
                            dsmuVar = null;
                        }
                        final fdap fdapVar = new fdap() { // from class: dsmq
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj3) {
                                dsmp dsmpVar = (dsmp) obj3;
                                dsmpVar.getClass();
                                dsmn dsmnVar = (dsmn) dsmpVar.toBuilder();
                                dsmnVar.getClass();
                                dsmv.a(dsmnVar);
                                evwo evwoVarA = dsmv.a(dsmnVar);
                                String str2 = str;
                                Integer num = (Integer) evwoVarA.get(str2);
                                int iIntValue = num != null ? num.intValue() : 0;
                                dsmnVar.copyOnWrite();
                                dsmp dsmpVar2 = (dsmp) dsmnVar.instance;
                                evub evubVar = dsmpVar2.b;
                                if (!evubVar.b) {
                                    dsmpVar2.b = evubVar.a();
                                }
                                dsmpVar2.b.put(str2, Integer.valueOf(iIntValue + 1));
                                evsn evsnVarBuild = dsmnVar.build();
                                evsnVarBuild.getClass();
                                return (dsmp) evsnVarBuild;
                            }
                        };
                        dxlc.a(dsmuVar.a.b(new ejvr() { // from class: dsmr
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return fdapVar.invoke(obj3);
                            }
                        }, eoqg.a), null, new ejwy() { // from class: dsse
                            @Override // defpackage.ejwy
                            public final void a(Object obj3) {
                                ((eksl) dssg.a.i()).t("Failed to increase permission request count", (Throwable) obj3);
                            }
                        });
                        fcsu fcsuVar = dssgVar.b;
                        if (fcsuVar == null) {
                            fdbq.c("callbacksManagerProvider");
                            fcsuVar = null;
                        }
                        dsah dsahVar2 = dssgVar.c;
                        if (dsahVar2 == null) {
                            fdbq.c("clearcutLogger");
                        } else {
                            dsahVar = dsahVar2;
                        }
                        dsahVar.a(dsbiVar, zBooleanValue, dssgVar.e);
                        if (dssgVar.G() != null) {
                            eg egVarG = dssgVar.G();
                            if (egVarG == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (egVarG.isFinishing() || !dssgVar.aF() || dssgVar.s) {
                                return;
                            }
                            cg cgVar = new cg(dssgVar.J());
                            cgVar.o(dssgVar);
                            cgVar.k();
                        }
                    }
                });
            }
        } catch (RuntimeException e) {
            ((eksl) ((eksl) a.j()).g(e)).q("Failed to inject members.");
        }
    }

    @Override // defpackage.ea
    public final void l() {
        adj adjVar;
        super.l();
        String str = this.d;
        if (str == null || (adjVar = this.ah) == null) {
            return;
        }
        adjVar.c(str);
    }
}
