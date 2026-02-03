package defpackage;

import com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService;
import com.google.android.gms.clearcut.sampler.SamplerConfigParcelable;
import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcbn extends dbye {
    public static final WeakHashMap b = new WeakHashMap();
    public final SamplerConfigParcelable c;
    private final dcbp d;

    public dcbn(eyfb eyfbVar, dbyp dbypVar, dcbp dcbpVar) {
        int i = dbypVar.d;
        int i2 = i <= 0 ? 35 : i;
        int i3 = dbypVar.e;
        this.c = new SamplerConfigParcelable(eyfbVar.l, dbypVar.c, i2, i3 <= 0 ? i2 : i3, dbypVar.f);
        this.d = dcbpVar;
    }

    @Override // defpackage.dbye
    public final ListenableFuture a(dbzx dbzxVar) {
        SamplerDecisionParcelable samplerDecisionParcelable;
        ListenableFuture listenableFutureF;
        SamplerConfigParcelable samplerConfigParcelable = this.c;
        if (samplerConfigParcelable.b <= 0.0d) {
            return eork.i(dbzy.a);
        }
        Instant instant = ((dbyg) dbzxVar).a;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            samplerDecisionParcelable = (SamplerDecisionParcelable) weakHashMap.get(Integer.valueOf(samplerConfigParcelable.hashCode()));
        }
        if (samplerDecisionParcelable == null || !instant.isBefore(samplerDecisionParcelable.a())) {
            Object obj = this.d;
            final SamplerConfigParcelable samplerConfigParcelable2 = this.c;
            dciz dcizVar = new dciz();
            dcizVar.b = new Feature[]{dbzu.b};
            dcizVar.b();
            dcizVar.a = new dcir() { // from class: dcbq
                @Override // defpackage.dcir
                public final void a(Object obj2, Object obj3) {
                    int i = dcbt.a;
                    ((IClearcutLoggerSamplingService) ((dcbu) obj2).w()).getDeviceSamplerDecision(samplerConfigParcelable2, new dcbs((defr) obj3));
                }
            };
            ListenableFuture listenableFutureA = drgi.a(((dcfm) obj).j(dcizVar.a()));
            dcbm dcbmVar = new dcbm(this);
            eoqg eoqgVar = eoqg.a;
            eork.r(listenableFutureA, dcbmVar, eoqgVar);
            listenableFutureF = eooq.f(listenableFutureA, new ejvr() { // from class: dcbk
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    boolean z = ((SamplerDecisionParcelable) obj2).a;
                    WeakHashMap weakHashMap2 = dcbn.b;
                    return Boolean.valueOf(z);
                }
            }, eoqgVar);
        } else {
            listenableFutureF = eork.i(Boolean.valueOf(samplerDecisionParcelable.a));
        }
        return eooq.f(listenableFutureF, new ejvr() { // from class: dcbl
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return dbzy.c(((Boolean) obj2).booleanValue(), this.a.c.b);
            }
        }, eoqg.a);
    }

    @Override // defpackage.dbye
    public final eyeg b() {
        SamplerDecisionParcelable samplerDecisionParcelable;
        eyec eyecVar = (eyec) eyed.a.createBuilder();
        eyecVar.copyOnWrite();
        eyed eyedVar = (eyed) eyecVar.instance;
        eyedVar.b |= 1;
        SamplerConfigParcelable samplerConfigParcelable = this.c;
        eyedVar.c = (float) samplerConfigParcelable.b;
        eyecVar.copyOnWrite();
        eyed eyedVar2 = (eyed) eyecVar.instance;
        eyedVar2.b |= 2;
        eyedVar2.d = samplerConfigParcelable.c;
        eyecVar.copyOnWrite();
        eyed eyedVar3 = (eyed) eyecVar.instance;
        eyedVar3.b |= 8;
        eyedVar3.f = samplerConfigParcelable.d;
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            samplerDecisionParcelable = (SamplerDecisionParcelable) weakHashMap.get(Integer.valueOf(samplerConfigParcelable.hashCode()));
        }
        if (samplerDecisionParcelable != null) {
            int iF = eonc.f(ChronoUnit.DAYS.between(samplerDecisionParcelable.a().minus(Duration.ofDays(this.c.c)), Instant.now()));
            eyecVar.copyOnWrite();
            eyed eyedVar4 = (eyed) eyecVar.instance;
            eyedVar4.b |= 4;
            eyedVar4.e = iF;
        }
        int i = this.c.a;
        eyfb eyfbVarA = eyez.a(i) != null ? eyez.a(i) : null;
        if (eyfbVarA == null) {
            eyfbVarA = eyfb.a;
        }
        eyeb eyebVar = (eyeb) eyeg.a.createBuilder();
        eyebVar.copyOnWrite();
        eyeg eyegVar = (eyeg) eyebVar.instance;
        eyegVar.c = eyfbVarA.a();
        eyegVar.b |= 1;
        eyebVar.copyOnWrite();
        eyeg eyegVar2 = (eyeg) eyebVar.instance;
        eyed eyedVar5 = (eyed) eyecVar.build();
        eyedVar5.getClass();
        eyegVar2.d = eyedVar5;
        eyegVar2.b |= 2;
        return (eyeg) eyebVar.build();
    }
}
