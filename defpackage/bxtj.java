package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxtj implements ehwh {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/search/appsearch/restore/AppSearchIndexableRestoreSynclet");
    public final aqdi b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fdjx f;

    public bxtj(fdjx fdjxVar, aqdi aqdiVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fdjxVar.getClass();
        aqdiVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.f = fdjxVar;
        this.b = aqdiVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
    }

    @Override // defpackage.ehwh
    public final ListenableFuture a() {
        return auvw.c(this.f, fcyi.a, fdjz.a, new bxti(this, null));
    }
}
