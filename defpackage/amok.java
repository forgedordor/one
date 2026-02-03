package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amok implements anpj {
    private static final ekrg e = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/EmergencyRcsAvailabilitySupplier");
    public final fdjx a;
    public final anpj b;
    public cquc c;
    public final cqtq d;

    public amok(fdjx fdjxVar, cqtp cqtpVar, anpj anpjVar) {
        this.a = fdjxVar;
        this.b = anpjVar;
        this.d = cqtpVar.a(new amog(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.d.a(new cqtk() { // from class: amod
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyRcsAvailabilitySupplier::Register", "EmergencyRcsAvailabilitySupplier::Callback", "EmergencyRcsAvailabilitySupplier:Unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new amoe(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.amoh
            if (r0 == 0) goto L13
            r0 = r5
            amoh r0 = (defpackage.amoh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amoh r0 = new amoh
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            anpj r5 = r4.b
            eiju r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 == r1) goto L80
        L43:
            r5.getClass()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.fcva.Y(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            if (r5 != 0) goto L6f
            ekrg r5 = defpackage.amok.e
            ekrw r5 = r5.j()
            r0 = 66
            java.lang.String r1 = "EmergencyRcsAvailabilitySupplier.kt"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/EmergencyRcsAvailabilitySupplier"
            java.lang.String r3 = "hasMatchingEmergencyConfig"
            ekrw r5 = r5.h(r2, r3, r0, r1)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r0 = "No recipient or too many recipients found for emergency rcs"
            r5.q(r0)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L6f:
            alqm r5 = r5.g()
            j$.util.Optional r5 = r5.b()
            boolean r5 = r5.isPresent()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amok.d(fcxy):java.lang.Object");
    }
}
