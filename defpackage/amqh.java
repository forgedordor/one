package defpackage;

import android.location.Location;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amqh implements anpj {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier");
    public final eosc b;
    public final fdjx c;
    public final ddnn d;
    public final anpj e;
    public final evrj f;
    public final evrj g;
    public final long h;
    public final eigp i;
    public final AtomicReference j = new AtomicReference(null);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final ddnu l = new ddnu() { // from class: ampx
        @Override // defpackage.ddnu
        public final void h(Location location) throws IOException {
            location.getClass();
            amqh amqhVar = this.a;
            eieh eiehVarA = amqhVar.i.a("EmergencyLocationSupplier#onLocationChanged");
            try {
                auvw.m(amqhVar.c, null, new amqd(location, amqhVar, null), 3);
                fczl.a(eiehVarA, null);
            } finally {
            }
        }
    };
    public cquc m;
    public final cqtq n;
    private final boolean o;
    private final anpj p;
    private final anpj q;

    public amqh(eosc eoscVar, fdjx fdjxVar, cqtp cqtpVar, ddnn ddnnVar, anpj anpjVar, evrj evrjVar, evrj evrjVar2, long j, boolean z, eigp eigpVar, anpj anpjVar2, anpj anpjVar3) {
        this.b = eoscVar;
        this.c = fdjxVar;
        this.d = ddnnVar;
        this.e = anpjVar;
        this.f = evrjVar;
        this.g = evrjVar2;
        this.h = j;
        this.o = z;
        this.i = eigpVar;
        this.p = anpjVar2;
        this.q = anpjVar3;
        this.n = cqtpVar.a(new amqa(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.n.a(new cqtk() { // from class: ampw
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "EmergencyLocationSupplier:register", "EmergencyLocationSupplier:callback", "EmergencyLocationSupplier:unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new ampy(this, null));
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
    public final java.lang.Object d(defpackage.fcxy r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.amqb
            if (r0 == 0) goto L13
            r0 = r7
            amqb r0 = (defpackage.amqb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amqb r0 = new amqb
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.fctl.b(r7)
            anpj r7 = r6.q
            eiju r7 = r7.b()
            r7.getClass()
            r0.c = r3
            java.lang.Object r7 = defpackage.fdxs.c(r7, r0)
            if (r7 == r1) goto Laa
        L43:
            r7.getClass()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = defpackage.fcva.Y(r7)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
            java.lang.String r0 = "isMockedLocationAllowed"
            java.lang.String r1 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/location/EmergencyLocationSupplier"
            r2 = 0
            java.lang.String r4 = "EmergencyLocationSupplier.kt"
            if (r7 != 0) goto L6f
            ekrg r7 = defpackage.amqh.a
            ekrw r7 = r7.j()
            r3 = 174(0xae, float:2.44E-43)
            ekrw r7 = r7.h(r1, r0, r3, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "No recipient or too many recipients found for emergency rcs"
            r7.q(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L6f:
            alqm r7 = r7.g()
            j$.util.Optional r7 = r7.b()
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L95
            ekrg r7 = defpackage.amqh.a
            ekrw r7 = r7.h()
            r3 = 179(0xb3, float:2.51E-43)
            ekrw r7 = r7.h(r1, r0, r3, r4)
            ekrd r7 = (defpackage.ekrd) r7
            java.lang.String r0 = "ERCSConfig not available for conversation"
            r7.q(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L95:
            java.lang.Object r7 = r7.get()
            famt r7 = (defpackage.famt) r7
            boolean r7 = r7.e
            if (r7 != 0) goto La5
            boolean r7 = r6.o
            if (r7 == 0) goto La4
            goto La5
        La4:
            r3 = r2
        La5:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqh.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.amqg
            if (r0 == 0) goto L13
            r0 = r5
            amqg r0 = (defpackage.amqg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            amqg r0 = new amqg
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            anpj r5 = r4.p
            eiju r5 = r5.b()
            r5.getClass()
            r0.c = r3
            java.lang.Object r5 = defpackage.fdxs.c(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.util.Map r5 = (java.util.Map) r5
            boolean r5 = r5.isEmpty()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqh.e(fcxy):java.lang.Object");
    }
}
