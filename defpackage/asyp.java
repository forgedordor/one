package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asyp implements asxy {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer");
    private final asxy b;
    private final chsn c;
    private final fcsu d;
    private final eosc e;

    public asyp(asxy asxyVar, chsn chsnVar, fcsu fcsuVar, eosc eoscVar) {
        this.b = asxyVar;
        this.c = chsnVar;
        this.d = fcsuVar;
        this.e = eoscVar;
    }

    private final boolean d(aubq aubqVar) {
        aubqVar.getClass();
        chsn chsnVar = this.c;
        try {
            dggl dgglVar = chsnVar.b;
            String str = aubqVar.d;
            str.getClass();
            return ((dggw) chsnVar.a.b()).u(dgglVar.a(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.asxy
    public final eiju a(Iterable iterable) {
        ekgi ekgiVar = new ekgi();
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aubq aubqVar = (aubq) it.next();
            if ((aubqVar.b & 2) != 0 && !aubqVar.d.isEmpty()) {
                aubp aubpVarB = aubp.b(aubqVar.c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                if (aubpVarB != aubp.GROUP) {
                    ekfwVar.h(aubqVar);
                }
            }
            ekgiVar.i(aubqVar, asts.d());
        }
        final ekgp ekgpVarC = ekgiVar.c();
        ekgb ekgbVarG = ekfwVar.g();
        ekrw ekrwVarE = a.e();
        ekrwVarE.X(eksq.a, "BugleRcsCapabilities");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer", "getBatchCapabilities", 79, "RcsCapabilitiesProviderPreconditionsLayer.java")).u("RcsCapabilitiesProviderPreconditionsLayer#getBatchCapabilities: Received %s invalid and %s valid ChatEndpoints", ((ekoj) ekgpVarC).d, ((ekoe) ekgbVarG).c);
        return this.b.a(ekgbVarG).h(new ejvr() { // from class: asyo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgi ekgiVar2 = new ekgi();
                ekgiVar2.g((Map) obj);
                ekgiVar2.g(ekgpVarC);
                return ekgiVar2.c();
            }
        }, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (d(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        if (d(r7) == false) goto L33;
     */
    @Override // defpackage.asxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eiju b(defpackage.aubq r7) {
        /*
            r6 = this;
            fcsu r0 = r6.d
            java.lang.Object r0 = r0.b()
            aqaq r0 = (defpackage.aqaq) r0
            boolean r0 = r0.a()
            java.lang.String r1 = "getCapabilities"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer"
            java.lang.String r3 = "BugleRcsCapabilities"
            java.lang.String r4 = "RcsCapabilitiesProviderPreconditionsLayer.java"
            if (r0 == 0) goto L4f
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            int r0 = r7.c
            aubp r0 = defpackage.aubp.b(r0)
            if (r0 != 0) goto L2e
            aubp r0 = defpackage.aubp.UNKNOWN_TYPE
        L2e:
            aubp r5 = defpackage.aubp.GROUP
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L9d
            int r0 = r7.c
            aubp r0 = defpackage.aubp.b(r0)
            if (r0 != 0) goto L40
            aubp r0 = defpackage.aubp.UNKNOWN_TYPE
        L40:
            aubp r5 = defpackage.aubp.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L76
            boolean r0 = r6.d(r7)
            if (r0 == 0) goto L76
            goto L9d
        L4f:
            int r0 = r7.c
            aubp r0 = defpackage.aubp.b(r0)
            if (r0 != 0) goto L59
            aubp r0 = defpackage.aubp.UNKNOWN_TYPE
        L59:
            aubp r5 = defpackage.aubp.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L9d
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            boolean r0 = r6.d(r7)
            if (r0 == 0) goto L76
            goto L9d
        L76:
            ekrg r0 = defpackage.asyp.a
            ekrw r0 = r0.e()
            ekrz r5 = defpackage.eksq.a
            r0.X(r5, r3)
            ekrd r0 = (defpackage.ekrd) r0
            r3 = 58
            ekrw r0 = r0.h(r2, r1, r3, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = r7.d
            java.lang.String r1 = defpackage.cqcv.b(r1)
            java.lang.String r2 = "RcsCapabilitiesProviderPreconditionsLayer: return downstreamProvider.getCapabilities for chatEndpoint %s"
            r0.t(r2, r1)
            asxy r0 = r6.b
            eiju r7 = r0.b(r7)
            return r7
        L9d:
            ekrg r0 = defpackage.asyp.a
            ekrw r0 = r0.e()
            ekrz r5 = defpackage.eksq.a
            r0.X(r5, r3)
            ekrd r0 = (defpackage.ekrd) r0
            r3 = 52
            ekrw r0 = r0.h(r2, r1, r3, r4)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r7 = r7.d
            java.lang.String r7 = defpackage.cqcv.b(r7)
            java.lang.String r1 = "RcsCapabilitiesProviderPreconditionsLayer: return RcsCapabilitiesWithMetadata.empty for chatEndpoint %s"
            r0.t(r1, r7)
            asts r7 = defpackage.asts.d()
            eiju r7 = defpackage.eijx.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asyp.b(aubq):eiju");
    }

    @Override // defpackage.asxy
    public final /* synthetic */ Object c(Iterable iterable, fcxy fcxyVar) {
        return asxw.a(this, iterable, fcxyVar);
    }
}
