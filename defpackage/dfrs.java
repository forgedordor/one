package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfrs {
    private final Context a;
    private final Executor b;
    private final dfvk c;
    private final dfvj d;
    private final diep e;
    private final efof f;
    private final eosc g;
    private final crmx h;
    private final dgwa i;
    private final eblg j;
    private final dfdd k;
    private final dfvy l;
    private final cjim m;
    private final eosd n;

    public dfrs(Context context, Executor executor, dfvk dfvkVar, dfvj dfvjVar, diep diepVar, efof efofVar, eosc eoscVar, crmx crmxVar, dgwa dgwaVar, eblg eblgVar, dfdd dfddVar, dfvy dfvyVar, cjim cjimVar, eosd eosdVar) {
        this.a = context;
        this.b = executor;
        this.c = dfvkVar;
        this.d = dfvjVar;
        this.e = diepVar;
        this.f = efofVar;
        this.g = eoscVar;
        this.h = crmxVar;
        this.i = dgwaVar;
        this.j = eblgVar;
        this.k = dfddVar;
        this.l = dfvyVar;
        this.m = cjimVar;
        this.n = eosdVar;
    }

    public final ListenableFuture a(dfvb dfvbVar) {
        this.c.getClass();
        dfvj dfvjVar = this.d;
        dfvjVar.getClass();
        this.i.getClass();
        this.j.getClass();
        diep diepVar = this.e;
        return new dfqp(dfvbVar, this.a, this.b, dfvjVar, diepVar, this.n, this.m).d.d();
    }
}
