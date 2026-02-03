package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabx implements caaq {
    public static final eksp a = eksp.c("BugleCms");
    public final cpmi b;
    public final aurx c;
    private final eosc d;
    private final eosc e;

    /* compiled from: PG */
    public interface a {
        cabs cm();
    }

    public cabx(eosc eoscVar, cpmi cpmiVar, aurx aurxVar, eosc eoscVar2) {
        this.d = eoscVar;
        this.b = cpmiVar;
        this.c = aurxVar;
        this.e = eoscVar2;
    }

    @Override // defpackage.caas
    public final /* synthetic */ int a(Object obj) {
        return ((cabo) obj).c;
    }

    @Override // defpackage.caaq
    public final /* bridge */ /* synthetic */ eiju c(cayy cayyVar, Object obj, Object obj2) {
        final cabo caboVar = (cabo) obj2;
        eiju eijuVarA = ((a) obj).cm().a(((caxm) cayyVar.a()).c, cabo.a);
        eooz eoozVar = new eooz() { // from class: cabu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj3) {
                return this.a.c.y(true);
            }
        };
        eosc eoscVar = this.e;
        return eijuVarA.i(eoozVar, eoscVar).h(new ejvr() { // from class: cabv
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                this.a.b.b();
                bzzw bzzwVar = (bzzw) bzzx.a.createBuilder();
                int i = caboVar.c;
                bzzwVar.copyOnWrite();
                bzzx bzzxVar = (bzzx) bzzwVar.instance;
                bzzxVar.b |= 1;
                bzzxVar.c = i;
                if (cpyl.a()) {
                    cpyo cpyoVar = cpyo.CMS_FEATURE_MULTI_DEVICE;
                    bzzwVar.copyOnWrite();
                    bzzx bzzxVar2 = (bzzx) bzzwVar.instance;
                    bzzxVar2.d = cpyoVar.d;
                    bzzxVar2.b |= 2;
                }
                return cbcw.j(ekgb.r(byhe.a((bzzx) bzzwVar.build())));
            }
        }, this.d).e(fbtf.class, new ejvr() { // from class: cabw
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                ((eksl) ((eksl) ((eksl) cabx.a.j()).g((fbtf) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerWorkItemProcessor", "processCmsWorkItemAsync", 87, "CmsSetFeatureEnabledOnServerWorkItemProcessor.java")).q("CMS Server failed when setting feature_enabled_status");
                return cbcw.m();
            }
        }, eoscVar);
    }
}
