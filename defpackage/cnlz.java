package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnlz extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler");
    public final cnoc b;
    public final cogw c;
    private final fdjx d;

    public cnlz(fdjx fdjxVar, cnoc cnocVar, cogw cogwVar) {
        fdjxVar.getClass();
        cogwVar.getClass();
        this.d = fdjxVar;
        this.b = cnocVar;
        this.c = cogwVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.f(pza.b);
        ((caxk) caxzVarL).a = new pzj(true, 13);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("IncrementalReverseSyncWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cnor.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cnor cnorVar = (cnor) evuhVar;
        cnorVar.getClass();
        return auvw.c(this.d, fcyi.a, fdjz.a, new cnly(this, cnorVar, null));
    }
}
