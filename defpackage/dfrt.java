package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfrt {
    static final dfny a = dfnv.b("enable_receive_message_producer_module_2");
    private final Context b;
    private final Executor c;
    private final dfvk d;
    private final diep e;
    private final efof f;
    private final eosc g;
    private final crmx h;
    private final dgwa i;
    private final eblg j;
    private final dfdd k;
    private final dfvy l;
    private final dfrs m;
    private final dfrq n;
    private final dfwc o;
    private final cjim p;
    private final eosd q;

    public dfrt(Context context, Executor executor, dfvk dfvkVar, diep diepVar, efof efofVar, eosc eoscVar, crmx crmxVar, dgwa dgwaVar, eblg eblgVar, dfdd dfddVar, dfvy dfvyVar, dfrs dfrsVar, dfrq dfrqVar, dfwc dfwcVar, cjim cjimVar, eosd eosdVar) {
        this.b = context;
        this.c = executor;
        this.d = dfvkVar;
        this.e = diepVar;
        this.f = efofVar;
        this.g = eoscVar;
        this.h = crmxVar;
        this.i = dgwaVar;
        this.j = eblgVar;
        this.k = dfddVar;
        this.l = dfvyVar;
        this.m = dfrsVar;
        this.n = dfrqVar;
        this.o = dfwcVar;
        this.p = cjimVar;
        this.q = eosdVar;
    }

    public final ListenableFuture a(dftb dftbVar) {
        dfvk dfvkVar = this.d;
        dfvkVar.getClass();
        dgwa dgwaVar = this.i;
        dgwaVar.getClass();
        eblg eblgVar = this.j;
        eblgVar.getClass();
        dfrs dfrsVar = this.m;
        dfrsVar.getClass();
        dfwc dfwcVar = this.o;
        dfwcVar.getClass();
        dfqr dfqrVar = new dfqr(dftbVar, this.b, this.c, dfvkVar, this.e, this.f, this.g, this.h, dgwaVar, eblgVar, this.k, dfrsVar, this.n, dfwcVar, this.q, this.p);
        return ((Boolean) a.a()).booleanValue() ? dfqrVar.P.d() : dfqrVar.f.d();
    }
}
