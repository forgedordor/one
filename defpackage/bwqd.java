package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwqd implements bwuv {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "E2eeInfoDataService");
    public final fcsu b;
    public final egyt c;
    public final fcsu d;
    private final fdjx e;
    private final fcsu f;

    public bwqd(fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, egyt egytVar, fcsu fcsuVar3) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        egytVar.getClass();
        fcsuVar3.getClass();
        this.e = fdjxVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.c = egytVar;
        this.d = fcsuVar3;
    }

    @Override // defpackage.bwuv
    public final egyi a(DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        bwpt bwptVar = (bwpt) this.f.b();
        fdjx fdjxVar = (fdjx) bwptVar.a.b();
        fdjxVar.getClass();
        fcyh fcyhVar = (fcyh) bwptVar.b.b();
        fcyhVar.getClass();
        fcyh fcyhVar2 = (fcyh) bwptVar.c.b();
        fcyhVar2.getClass();
        fcsu fcsuVar = bwptVar.d;
        fcsu fcsuVar2 = bwptVar.e;
        fcsu fcsuVar3 = bwptVar.f;
        fcsu fcsuVar4 = bwptVar.g;
        cogw cogwVar = (cogw) bwptVar.h.b();
        cogwVar.getClass();
        return new bwps(fdjxVar, fcyhVar, fcyhVar2, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, cogwVar, bwptVar.i, detailsPageE2eeInfoRequest);
    }

    @Override // defpackage.bwuv
    public final eiju b(bwvf bwvfVar) {
        bwvfVar.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new bwqb(this, bwvfVar, null));
    }

    @Override // defpackage.bwuv
    public final eiju c(Iterable iterable) {
        iterable.getClass();
        return auvw.c(this.e, fcyi.a, fdjz.a, new bwqc(iterable, this, null));
    }
}
