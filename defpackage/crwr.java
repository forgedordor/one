package defpackage;

import j$.time.Instant;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crwr {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/util/spam/a2p/data/A2pConversationSubscriptionsDatabaseOperations");
    public final dqsn a;
    public final fcsu b;
    private final fcyh d;

    public crwr(fcyh fcyhVar, dqsn dqsnVar, fcsu fcsuVar) {
        fcyhVar.getClass();
        dqsnVar.getClass();
        this.d = fcyhVar;
        this.a = dqsnVar;
        this.b = fcsuVar;
    }

    public final crwh a(long j) {
        Function function = new Function() { // from class: crwj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmgn bmgnVar = (bmgn) obj;
                bmgnVar.aA(0, "participant_id");
                long j2 = bmgnVar.a;
                bmgnVar.aA(1, "conversation_toolstone_state");
                crws crwsVar = bmgnVar.b;
                crwsVar.getClass();
                bmgnVar.aA(3, "conversation_subscription_state");
                crwi crwiVar = bmgnVar.d;
                crwiVar.getClass();
                bmgnVar.aA(4, "last_action_timestamp");
                Instant instant = bmgnVar.e;
                instant.getClass();
                return new crwh(j2, crwsVar, crwiVar, instant);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        bmhr bmhrVarA = bmhw.a();
        bmhrVarA.A("a2p_conversation_subscriptions.queryOnParticipantId");
        bmhrVarA.q();
        bmhv bmhvVar = new bmhv();
        bmhvVar.b(j);
        bmhrVarA.k(new bmhu(bmhvVar));
        bmgn bmgnVar = (bmgn) dqru.c(bmhrVarA.b());
        return (crwh) (bmgnVar != null ? function.apply(bmgnVar) : null);
    }

    public final Object b(long j, fcxy fcxyVar) {
        return eicj.a(this.d, new crwm(this, j, null), fcxyVar);
    }

    public final Object c(long j, crws crwsVar, crwi crwiVar, fcxy fcxyVar) {
        return eicj.a(this.d, new crwq(this, j, crwsVar, crwiVar, null), fcxyVar);
    }

    public final Object d(anue anueVar, fcxy fcxyVar) {
        String str = anueVar.a;
        str.getClass();
        Object objA = eicj.a(this.d, new crwl(Long.parseLong(str), null), fcxyVar);
        fcyl fcylVar = fcyl.a;
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        return objA == fcylVar ? objA : fctx.a;
    }

    public final Object e(anue anueVar, fcxy fcxyVar) {
        String str = anueVar.a;
        str.getClass();
        return b(Long.parseLong(str), fcxyVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.anue r8, defpackage.crws r9, defpackage.crwi r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.crwn
            if (r0 == 0) goto L13
            r0 = r11
            crwn r0 = (defpackage.crwn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            crwn r0 = new crwn
            r0.<init>(r7, r11)
        L18:
            r6 = r0
            java.lang.Object r11 = r6.a
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            anue r8 = r6.d
            defpackage.fctl.b(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            return r11
        L2a:
            r0 = move-exception
            r9 = r0
            goto L51
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            defpackage.fctl.b(r11)
            java.lang.String r11 = r8.a     // Catch: android.database.sqlite.SQLiteException -> L2a
            r11.getClass()     // Catch: android.database.sqlite.SQLiteException -> L2a
            long r3 = java.lang.Long.parseLong(r11)     // Catch: android.database.sqlite.SQLiteException -> L2a
            r6.d = r8     // Catch: android.database.sqlite.SQLiteException -> L2a
            r6.c = r2     // Catch: android.database.sqlite.SQLiteException -> L2a
            r1 = r7
            r5 = r10
            r2 = r3
            r4 = r9
            java.lang.Object r8 = r1.c(r2, r4, r5, r6)     // Catch: android.database.sqlite.SQLiteException -> L2a
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        L51:
            ekrg r10 = defpackage.crwr.c
            ekrw r10 = r10.j()
            ekrz r11 = defpackage.eksq.a
            java.lang.String r0 = "BugleSpam"
            r10.X(r11, r0)
            ekrd r10 = (defpackage.ekrd) r10
            ekrw r9 = r10.g(r9)
            r10 = 58
            java.lang.String r11 = "A2pConversationSubscriptionsDatabaseOperations.kt"
            java.lang.String r0 = "com/google/android/apps/messaging/shared/util/spam/a2p/data/A2pConversationSubscriptionsDatabaseOperations"
            java.lang.String r1 = "updateSubscription"
            ekrw r9 = r9.h(r0, r1, r10, r11)
            ekrd r9 = (defpackage.ekrd) r9
            java.lang.String r10 = "Error updating subscription for recipientId: %s"
            java.lang.String r8 = r8.a
            r9.t(r10, r8)
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crwr.f(anue, crws, crwi, fcxy):java.lang.Object");
    }
}
