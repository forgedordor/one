package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cteb {
    private static final cqce d = cqce.g("Bugle", "ConversationXmsLatchUpdater");
    public final fcsu a;
    public final cogw b;
    public final eosc c;
    private final ajhd e;
    private final bxlc f;
    private final dqsn g;

    public cteb(fcsu fcsuVar, ajhd ajhdVar, bxlc bxlcVar, dqsn dqsnVar, cogw cogwVar, eosc eoscVar) {
        this.a = fcsuVar;
        this.e = ajhdVar;
        this.f = bxlcVar;
        this.g = dqsnVar;
        this.b = cogwVar;
        this.c = eoscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(boolean r7, final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r8) {
        /*
            r6 = this;
            boolean r0 = r8.b()
            java.lang.String r1 = "unlatch from"
            java.lang.String r2 = "latch to"
            java.lang.String r3 = "xMS."
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L27
            cqce r8 = defpackage.cteb.d
            cqbd r8 = r8.d()
            java.lang.String r0 = "Conversation ID empty, Failed to "
            r8.I(r0)
            if (r4 == r7) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            r8.I(r1)
            r8.I(r3)
            r8.r()
            return r5
        L27:
            fcsu r0 = r6.a
            java.lang.Object r0 = r0.b()
            bakt r0 = (defpackage.bakt) r0
            bojh r0 = r0.r(r8)
            if (r0 != 0) goto L4e
            cqce r8 = defpackage.cteb.d
            cqbd r8 = r8.e()
            java.lang.String r0 = "Found conversation is null, failed to "
            r8.I(r0)
            if (r4 == r7) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            r8.I(r1)
            r8.I(r3)
            r8.r()
            return r5
        L4e:
            int r1 = r0.k()
            if (r1 != 0) goto L9c
            r1 = 2
            if (r4 == r7) goto L59
            r2 = r5
            goto L5a
        L59:
            r2 = r1
        L5a:
            int r0 = r0.r()
            if (r0 == r1) goto L63
            if (r0 != 0) goto L9b
            r0 = r5
        L63:
            if (r0 == r2) goto L9b
            dqsn r0 = r6.g
            ctdz r1 = new ctdz
            r1.<init>()
            java.lang.String r2 = "UpdateConversationXmsLatchAction#executeAction"
            java.lang.Object r0 = r0.c(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L9b
            cqce r0 = defpackage.cteb.d
            cqbd r0 = r0.c()
            java.lang.String r1 = "Conversation"
            r0.I(r1)
            if (r4 == r7) goto L8a
            java.lang.String r7 = "unlatched from"
            goto L8c
        L8a:
            java.lang.String r7 = "latched to"
        L8c:
            r0.I(r7)
            r0.I(r3)
            r0.r()
            bxlc r7 = r6.f
            r7.d(r8)
            return r4
        L9b:
            return r5
        L9c:
            cqce r7 = defpackage.cteb.d
            java.lang.String r8 = "xMS latching disabled for group conversations."
            r7.q(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cteb.d(boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):boolean");
    }

    public final eiju a(final ConversationIdType conversationIdType, final eljx eljxVar) {
        return eijx.g(new Callable() { // from class: ctdy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(this.a.b(conversationIdType, eljxVar));
            }
        }, this.c);
    }

    public final boolean b(ConversationIdType conversationIdType, eljx eljxVar) {
        ecem.b();
        cqbd cqbdVarD = d.d();
        cqbdVarD.I("Attempting to latch the conversation to XMS.");
        cqbdVarD.A("conversationId", conversationIdType);
        cqbdVarD.r();
        boolean zD = d(true, conversationIdType);
        if (zD) {
            this.e.p(conversationIdType, eljxVar);
        }
        return zD;
    }

    public final boolean c(ConversationIdType conversationIdType, int i) {
        ecem.b();
        cqbd cqbdVarD = d.d();
        cqbdVarD.I("Attempting to unlatch the XMS conversation.");
        cqbdVarD.A("conversationId", conversationIdType);
        cqbdVarD.r();
        boolean zD = d(false, conversationIdType);
        if (zD) {
            this.e.af(conversationIdType, i);
        }
        return zD;
    }
}
