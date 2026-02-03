package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cphz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/avatar/AvatarMonogramCreator");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public cphz(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
    }

    public final dkpf a(Uri uri, boolean z) {
        uri.getClass();
        String queryParameter = uri.getQueryParameter("m");
        if (queryParameter == null) {
            queryParameter = uri.toString();
            queryParameter.getClass();
        }
        fcsu fcsuVar = this.e;
        boolean zA = true;
        if (((arec) fcsuVar.b()).a()) {
            Uri uriO = cpbr.o(uri);
            Uri uri2 = uriO == null ? uri : uriO;
            if (cqmz.v(uri2)) {
                return new dkpf(uri2, true, null, 0, cpbr.n(uri), 12);
            }
        } else if (cqmz.w(queryParameter)) {
            Uri uri3 = Uri.parse(queryParameter);
            uri3.getClass();
            return new dkpf(uri3, true, null, 0, cpbr.n(uri), 12);
        }
        boolean zF = ((ardc) this.c.b()).a() ? fdbq.f(cpbr.t(uri), "g") : !z;
        if (((arec) fcsuVar.b()).a()) {
            zA = cpbr.A(uri);
        } else if (zF) {
            zA = false;
        }
        fcsu fcsuVar2 = this.b;
        Boolean boolValueOf = Boolean.valueOf(zA);
        cphv cphvVar = (cphv) fcsuVar2.b();
        return new dkpf(uri, boolValueOf, cphvVar.a(cphvVar.a.g()), 0, null, 24);
    }

    public final dkpf b(ajlk ajlkVar, ekgb ekgbVar) {
        ajlkVar.getClass();
        ekgbVar.getClass();
        boolean z = true;
        if (((aquo) this.d.b()).a()) {
            Uri uri = ccwh.a;
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.P(ekgbVar);
            if (ccwg.a(resolvedRecipient != null ? resolvedRecipient.g() : null, ajlkVar.a())) {
                return a(ccwh.a, true);
            }
        }
        Uri uriA = ajlkVar.a();
        if (uriA == null) {
            return null;
        }
        if (ajlkVar.c() == ajlj.GROUP && ekgbVar.size() != 1) {
            z = false;
        }
        return a(uriA, z);
    }

    public final dkpf c(ResolvedRecipient resolvedRecipient) {
        if (!((aquo) this.d.b()).a()) {
            Uri uriB = resolvedRecipient.b();
            uriB.getClass();
            return a(uriB, true);
        }
        Uri uri = ccwh.a;
        Uri uriB2 = ccwg.a(resolvedRecipient.g(), resolvedRecipient.b()) ? ccwh.a : resolvedRecipient.b();
        uriB2.getClass();
        return a(uriB2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(j$.util.Optional r5, defpackage.aoer r6, int r7, defpackage.fcxy r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.cphy
            if (r0 == 0) goto L13
            r0 = r8
            cphy r0 = (defpackage.cphy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cphy r0 = new cphy
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r8)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.fctl.b(r8)
            eiju r5 = r6.A(r7, r5)
            r0.c = r3
            java.lang.Object r8 = defpackage.fdxs.c(r5, r0)
            if (r8 == r1) goto L92
        L3e:
            j$.util.Optional r8 = (j$.util.Optional) r8
            r8.getClass()
            cphw r5 = new cphw
            r5.<init>()
            cphx r6 = new cphx
            r6.<init>()
            j$.util.Optional r5 = r8.filter(r6)
            boolean r5 = r5.isPresent()
            if (r5 != 0) goto L72
            ekrg r5 = defpackage.cphz.a
            ekrw r5 = r5.h()
            r6 = 57
            java.lang.String r7 = "AvatarMonogramCreator.kt"
            java.lang.String r8 = "com/google/android/apps/messaging/shared/util/avatar/AvatarMonogramCreator"
            java.lang.String r0 = "createMonogramUiDataForSelf"
            ekrw r5 = r5.h(r8, r0, r6, r7)
            ekrd r5 = (defpackage.ekrd) r5
            java.lang.String r6 = "No people profile for current gaia"
            r5.q(r6)
            r5 = 0
            return r5
        L72:
            java.lang.Object r5 = defpackage.fdct.b(r8)
            aofd r5 = (defpackage.aofd) r5
            if (r5 == 0) goto L88
            j$.util.Optional r5 = r5.c()
            android.net.Uri r6 = android.net.Uri.EMPTY
            java.lang.Object r5 = r5.orElse(r6)
            android.net.Uri r5 = (android.net.Uri) r5
            if (r5 != 0) goto L8a
        L88:
            android.net.Uri r5 = android.net.Uri.EMPTY
        L8a:
            r5.getClass()
            dkpf r5 = r4.a(r5, r3)
            return r5
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cphz.d(j$.util.Optional, aoer, int, fcxy):java.lang.Object");
    }
}
