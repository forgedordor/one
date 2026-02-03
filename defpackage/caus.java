package defpackage;

import j$.time.Duration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caus extends cayv {
    public final cogw a;
    public final caut b;
    private final eosc c;
    private final eosc d;
    private final axno e;

    public caus(cogw cogwVar, eosc eoscVar, eosc eoscVar2, caut cautVar, axno axnoVar) {
        this.a = cogwVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.b = cautVar;
        this.e = axnoVar;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("ExpireWapPushSiMessageHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final axno axnoVar = this.e;
        axnoVar.getClass();
        return eijx.g(new Callable() { // from class: cauq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(axnoVar.a());
            }
        }, this.c).h(new ejvr() { // from class: caur
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() <= 0) {
                    return cbcw.i();
                }
                caus causVar = this.a;
                long jLongValue = l.longValue() - causVar.a.f().toEpochMilli();
                long j = jLongValue >= 0 ? jLongValue : 0L;
                caxr caxrVar = new caxr();
                caxrVar.c = Duration.ofMillis(j);
                return cbcw.j(ekgb.r(cbcu.g("expire_wap_push_si_message", caxy.a, caxrVar.a())));
            }
        }, this.d);
    }
}
