package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cahy implements caaq {
    public static final cqce a = cqce.g("BugleCms", "BlockOnTelephonySyncWorkItemProcessor");
    public final fcsu b;
    public final aukz c;
    public final cbaz d;
    private final eosc e;

    public cahy(eosc eoscVar, fcsu fcsuVar, aukz aukzVar, cbaz cbazVar) {
        this.e = eoscVar;
        this.b = fcsuVar;
        this.c = aukzVar;
        this.d = cbazVar;
    }

    @Override // defpackage.caas
    public final /* synthetic */ int a(Object obj) {
        return ((caaa) obj).c;
    }

    @Override // defpackage.caaq
    public final /* bridge */ /* synthetic */ eiju c(cayy cayyVar, Object obj, Object obj2) {
        final caaa caaaVar = (caaa) obj2;
        eooy eooyVar = new eooy() { // from class: cahw
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return ((cmqf) this.a.b.b()).e();
            }
        };
        eosc eoscVar = this.e;
        return eijx.h(eooyVar, eoscVar).h(new ejvr() { // from class: cahx
            @Override // defpackage.ejvr
            public final Object apply(Object obj3) {
                Boolean bool = (Boolean) obj3;
                boolean zBooleanValue = bool.booleanValue();
                boolean zBooleanValue2 = bool.booleanValue();
                emed emedVar = (emed) emee.a.createBuilder();
                emedVar.copyOnWrite();
                emee emeeVar = (emee) emedVar.instance;
                emeeVar.b |= 1;
                emeeVar.c = zBooleanValue2;
                emedVar.copyOnWrite();
                emee emeeVar2 = (emee) emedVar.instance;
                emeeVar2.b |= 2;
                emeeVar2.d = false;
                emedVar.copyOnWrite();
                emee emeeVar3 = (emee) emedVar.instance;
                emeeVar3.b |= 4;
                emeeVar3.e = zBooleanValue;
                emee emeeVar4 = (emee) emedVar.build();
                emce emceVar = (emce) emek.a.createBuilder();
                emceVar.copyOnWrite();
                emek emekVar = (emek) emceVar.instance;
                emeeVar4.getClass();
                emekVar.h = emeeVar4;
                emekVar.b |= 32;
                emek emekVar2 = (emek) emceVar.build();
                cahy cahyVar = this.a;
                cahyVar.c.r(emekVar2);
                boolean zBooleanValue3 = bool.booleanValue();
                caaa caaaVar2 = caaaVar;
                if (zBooleanValue3) {
                    cahy.a.p("Waiting for telephony full sync to complete.");
                    return cbcw.m();
                }
                cahy.a.p("Not blocked by telephony full sync.");
                try {
                    cayp caypVar = caaaVar2.e;
                    if (caypVar == null) {
                        caypVar = cayp.a;
                    }
                    cbcu cbcuVarE = cbcu.e(caypVar, cahyVar.d);
                    cbcv cbcvVarH = cbcw.h();
                    cbcvVarH.b(true);
                    cbcvVarH.c(false);
                    ((caxp) cbcvVarH).a = ekgb.r(cbcuVarE);
                    return cbcvVarH.a();
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
        }, eoscVar);
    }
}
