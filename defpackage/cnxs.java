package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnxs extends cayv {
    public static final cqce a = cqce.g("Bugle", "PwqForwardSyncEngineWorkItemHandler");
    public final fcsu b;
    public final fcsu c;
    private final fcsu d;
    private final fdjx e;
    private final Context f;

    public cnxs(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cogw cogwVar, cnxm cnxmVar, fdjx fdjxVar, Context context) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        cogwVar.getClass();
        cnxmVar.getClass();
        fdjxVar.getClass();
        context.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fdjxVar;
        this.f = context;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caze cazeVarA = cnrt.a();
        caxz caxzVarL = caya.l();
        Object objE = cnrt.a.e();
        objE.getClass();
        caxzVarL.c(((Number) objE).intValue());
        caxzVarL.b(cazeVarA);
        ((caxk) caxzVarL).b = ((cgbn) this.d.b()).c(this.f.getString(R.string.forward_sync_foreground_notification_text));
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("PwqForwardSyncEngineWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = cnxo.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        cnxo cnxoVar = (cnxo) evuhVar;
        cnxoVar.getClass();
        fcyi fcyiVar = fcyi.a;
        fdjz fdjzVar = fdjz.a;
        return auvw.a(fdin.b(this.e, eicg.a(fcyiVar), fdjzVar, new cnxr(null, this, cnxoVar)));
    }
}
