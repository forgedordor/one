package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyd {
    public static final cqce a = cqce.g("BugleRcs", "MessagingServiceResponseReceiver");
    private final eosc b;

    public ciyd(eosc eoscVar) {
        this.b = eoscVar;
    }

    final eiju a(eiju eijuVar, final String str) {
        ejvr ejvrVar = new ejvr() { // from class: cixy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ciyd.a.e();
                cqbdVarE.I("MessagingServiceException when connecting to MessagingService");
                cqbdVarE.A("methodName", str);
                cqbdVarE.s((effg) obj);
                return null;
            }
        };
        eosc eoscVar = this.b;
        return eijuVar.e(effg.class, ejvrVar, eoscVar).e(IllegalArgumentException.class, new ejvr() { // from class: cixz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ciyd.a.e();
                cqbdVarE.I("IllegalArgumentException when connecting to MessagingService");
                cqbdVarE.A("methodName", str);
                cqbdVarE.s((IllegalArgumentException) obj);
                return null;
            }
        }, eoscVar).e(SecurityException.class, new ejvr() { // from class: ciya
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ciyd.a.e();
                cqbdVarE.I("SecurityException when connecting to MessagingService");
                cqbdVarE.A("methodName", str);
                cqbdVarE.s((SecurityException) obj);
                return null;
            }
        }, eoscVar).e(TimeoutException.class, new ejvr() { // from class: ciyb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ciyd.a.e();
                cqbdVarE.I("Timeout when initializing connection to MessagingService");
                cqbdVarE.A("methodName", str);
                cqbdVarE.s((TimeoutException) obj);
                return null;
            }
        }, eoscVar).e(crsk.class, new ejvr() { // from class: ciyc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = ciyd.a.e();
                cqbdVarE.I("RcsServiceConnectionException when connecting to MessagingService");
                cqbdVarE.A("methodName", str);
                cqbdVarE.s((crsk) obj);
                return null;
            }
        }, eoscVar);
    }
}
