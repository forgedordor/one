package defpackage;

import androidx.car.app.model.Alert;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbon extends cayv {
    public static final cqce a = cqce.g("BugleDataModel", "EndHeavyWorkWorkHandler");
    public final Set b;
    public final cbor c;
    public final cbph d;
    private final fdjx e;

    public cbon(fdjx fdjxVar, Set set, cbor cborVar, cbph cbphVar) {
        fdjxVar.getClass();
        set.getClass();
        cborVar.getClass();
        cbphVar.getClass();
        this.e = fdjxVar;
        this.b = set;
        this.c = cborVar;
        this.d = cbphVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.e(true);
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.a("EndHeavyWorkWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        evuo parserForType = evrl.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "heavy_work";
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        return auvw.c(this.e, fcyi.a, fdjz.a, new cbom(this, null));
    }
}
