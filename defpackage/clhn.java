package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhn extends fcyz implements fdat {
    int a;
    final /* synthetic */ clhq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clhn(fcxy fcxyVar, clhq clhqVar) {
        super(2, fcxyVar);
        this.b = clhqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clhn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0099, code lost:
    
        if (defpackage.fdxs.c(r7, r6) == r0) goto L15;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r6.a
            r2 = 1
            defpackage.fctl.b(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L27
            goto L9c
        Le:
            java.lang.Object r7 = r6.c
            fdjx r7 = (defpackage.fdjx) r7
            clhq r7 = r6.b
            avpc r7 = r7.b
            java.lang.String r1 = "EMERGENCY+SERVICE+PROVIDER+DEMO"
            eiju r7 = r7.f(r1)
            r7.getClass()
            r6.a = r2
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 == r0) goto L9f
        L27:
            j$.util.Optional r7 = (j$.util.Optional) r7
            boolean r1 = r7.isPresent()
            if (r1 == 0) goto L9c
            ekrg r1 = defpackage.clhq.a
            ekrw r1 = r1.h()
            ekrz r2 = defpackage.eksq.a
            java.lang.String r3 = "BugleSatellite"
            r1.X(r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            ekrz r2 = defpackage.cqnc.s
            java.lang.Object r3 = r7.get()
            bojh r3 = (defpackage.bojh) r3
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r3 = r3.C()
            r1.X(r2, r3)
            r2 = 158(0x9e, float:2.21E-43)
            java.lang.String r3 = "EmergencyConversationOperations.kt"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations$deleteEmergencyConversationDemoIfPresent$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r5 = "invokeSuspend"
            ekrw r1 = r1.h(r4, r5, r2, r3)
            ekrd r1 = (defpackage.ekrd) r1
            java.lang.String r2 = "Deleting emergency conversation demo"
            r1.q(r2)
            clhq r1 = r6.b
            avnk r2 = defpackage.avnl.f()
            java.lang.Object r7 = r7.get()
            bojh r7 = (defpackage.bojh) r7
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r7.C()
            r2.b(r7)
            cogw r7 = r1.e
            j$.time.Instant r7 = r7.f()
            long r3 = r7.toEpochMilli()
            r2.c(r3)
            elka r7 = defpackage.elka.UNKNOWN_BUGLE_CONVERSATION_ORIGIN
            r2.f(r7)
            avnl r7 = r2.a()
            avnh r1 = r1.d
            eiju r7 = r1.a(r7)
            r7.getClass()
            r1 = 2
            r6.a = r1
            java.lang.Object r7 = defpackage.fdxs.c(r7, r6)
            if (r7 != r0) goto L9c
            goto L9f
        L9c:
            fctx r7 = defpackage.fctx.a
            return r7
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clhn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        clhn clhnVar = new clhn(fcxyVar, this.b);
        clhnVar.c = obj;
        return clhnVar;
    }
}
