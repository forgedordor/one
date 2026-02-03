package defpackage;

import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coeg extends cayv {
    public final codx a;
    private final eosc b;

    public coeg(codx codxVar, eosc eoscVar) {
        this.a = codxVar;
        this.b = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WAKELOCK);
        caxzVarL.c(5);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CopyFileTelephonyPartsWorkItemHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return cnls.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final cnls cnlsVar = (cnls) evuhVar;
        return !this.a.e() ? eijx.e(cbcw.i()) : eijx.g(new Callable() { // from class: coef
            @Override // java.util.concurrent.Callable
            public final Object call() {
                for (cnlr cnlrVar : cnlsVar.b) {
                    coeg coegVar = this.a;
                    coegVar.a.c(cnlrVar.b, Uri.parse(cnlrVar.c));
                }
                return cbcw.i();
            }
        }, this.b);
    }
}
