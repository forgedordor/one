package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampk implements anpj {
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier");
    public final fdjx a;
    public final anpj b;
    public cquc d;
    public final cqtq f;
    private final akfb h;
    public final feav c = new feaz();
    public final AtomicReference e = new AtomicReference(null);

    public ampk(fdjx fdjxVar, cqtp cqtpVar, akfb akfbVar, anpj anpjVar) {
        this.a = fdjxVar;
        this.h = akfbVar;
        this.b = anpjVar;
        this.f = cqtpVar.a(new amph(this));
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.f.a(new cqtk() { // from class: ampc
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                return anpiVar.a();
            }
        }, "GeofilterDbSupplier::Register", "GeofilterDbSupplier::Callback", "GeofilterDbSupplier::Unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.a, fcyi.a, fdjz.a, new ampe(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r10 != r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ampd
            if (r0 == 0) goto L13
            r0 = r10
            ampd r0 = (defpackage.ampd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ampd r0 = new ampd
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            java.lang.String r3 = "fetchAndSaveGeofilterDb"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier"
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.String r8 = "GeofilterDbSupplier.kt"
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            defpackage.fctl.b(r10)
            goto L7c
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L39:
            defpackage.fctl.b(r10)
            goto L48
        L3d:
            defpackage.fctl.b(r10)
            r0.c = r6
            java.lang.Object r10 = r9.e(r0)
            if (r10 == r1) goto L9a
        L48:
            famt r10 = (defpackage.famt) r10
            if (r10 != 0) goto L60
            ekrg r10 = defpackage.ampk.g
            ekrw r10 = r10.h()
            r0 = 82
            ekrw r10 = r10.h(r4, r3, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "ERCSConfig not available"
            r10.q(r0)
            return r7
        L60:
            akfb r2 = r9.h
            java.net.URL r6 = new java.net.URL
            java.lang.String r10 = r10.d
            r6.<init>(r10)
            r0.c = r5
            fcyh r10 = r2.b
            fcyh r10 = defpackage.eicg.a(r10)
            akfa r5 = new akfa
            r5.<init>(r7, r6, r2)
            java.lang.Object r10 = defpackage.fdin.a(r10, r5, r0)
            if (r10 == r1) goto L9a
        L7c:
            eupd r10 = (defpackage.eupd) r10
            if (r10 != 0) goto L94
            ekrg r10 = defpackage.ampk.g
            ekrw r10 = r10.j()
            r0 = 87
            ekrw r10 = r10.h(r4, r3, r0, r8)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r0 = "Failed to fetch geofilterdb"
            r10.q(r0)
            return r7
        L94:
            java.util.concurrent.atomic.AtomicReference r0 = r9.e
            r0.set(r10)
            return r10
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampk.d(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fcxy r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ampf
            if (r0 == 0) goto L13
            r0 = r6
            ampf r0 = (defpackage.ampf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ampf r0 = new ampf
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.fctl.b(r6)
            anpj r6 = r5.b
            eiju r6 = r6.b()
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fdxs.c(r6, r0)
            if (r6 == r1) goto L92
        L43:
            r6.getClass()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = defpackage.fcva.Y(r6)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
            r0 = 0
            java.lang.String r1 = "getERCSConfigOrNull"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/geofilter/GeofilterDbSupplier"
            java.lang.String r3 = "GeofilterDbSupplier.kt"
            if (r6 != 0) goto L6b
            ekrg r6 = defpackage.ampk.g
            ekrw r6 = r6.j()
            r4 = 98
            ekrw r6 = r6.h(r2, r1, r4, r3)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r1 = "No recipient or too many recipients found for emergency rcs"
            r6.q(r1)
            return r0
        L6b:
            alqm r6 = r6.g()
            j$.util.Optional r6 = r6.b()
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L8d
            ekrg r6 = defpackage.ampk.g
            ekrw r6 = r6.h()
            r4 = 103(0x67, float:1.44E-43)
            ekrw r6 = r6.h(r2, r1, r4, r3)
            ekrd r6 = (defpackage.ekrd) r6
            java.lang.String r1 = "ERCSConfig not available for conversation"
            r6.q(r1)
            return r0
        L8d:
            java.lang.Object r6 = r6.get()
            return r6
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampk.e(fcxy):java.lang.Object");
    }
}
