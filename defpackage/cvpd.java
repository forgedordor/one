package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpd extends fcyz implements fdau {
    boolean a;
    int b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cvph e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvpd(cvph cvphVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.e = cvphVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvpd cvpdVar = new cvpd(this.e, (fcxy) obj3);
        cvpdVar.c = (ekgb) obj;
        cvpdVar.d = (ajlk) obj2;
        return cvpdVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r1v1, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r9.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r2) goto L16
            boolean r0 = r9.a
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.fctl.b(r10)
            goto L60
        L16:
            java.lang.Object r1 = r9.c
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            defpackage.fctl.b(r10)
            goto L49
        L1e:
            defpackage.fctl.b(r10)
            goto L38
        L22:
            defpackage.fctl.b(r10)
            java.lang.Object r10 = r9.c
            ekgb r10 = (defpackage.ekgb) r10
            java.lang.Object r1 = r9.d
            cvph r4 = r9.e
            r5 = 0
            r9.c = r5
            r9.b = r3
            java.lang.Object r10 = r4.b(r10, r1, r9)
            if (r10 == r0) goto Lb2
        L38:
            cvph r1 = r9.e
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r10 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r10
            r9.c = r10
            r9.b = r2
            java.lang.Object r1 = r1.d(r9)
            if (r1 == r0) goto Lb2
            r8 = r1
            r1 = r10
            r10 = r8
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            cvph r2 = r9.e
            r9.c = r1
            r9.a = r10
            r4 = 3
            r9.b = r4
            java.lang.Object r2 = r2.c(r9)
            if (r2 == r0) goto Lb2
            r0 = r10
            r10 = r2
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r2 = r10.booleanValue()
            ekrg r4 = defpackage.cvph.a
            ekrw r4 = r4.h()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "BugleBanners"
            r4.X(r5, r6)
            ekrd r4 = (defpackage.ekrd) r4
            r5 = r0 ^ 1
            ekrz r6 = defpackage.cvoy.f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.X(r6, r5)
            ekrz r5 = defpackage.cvoy.g
            r4.X(r5, r10)
            r10 = 75
            java.lang.String r5 = "AddContactBanner2DataServiceImpl.kt"
            java.lang.String r6 = "com/google/android/apps/messaging/ui/conversation/banners2o/addcontact/dataservice2/AddContactBanner2DataServiceImpl$getAddContactBanner2LoadedDataFlow$1$1"
            java.lang.String r7 = "invokeSuspend"
            ekrw r10 = r4.h(r6, r7, r10, r5)
            ekrd r10 = (defpackage.ekrd) r10
            java.lang.String r4 = "Add contact banner is dismissed and first incoming"
            r10.q(r4)
            r10 = 0
            if (r1 == 0) goto La1
            if (r0 == 0) goto La1
            if (r2 == 0) goto La1
            r0 = r3
            goto La2
        La1:
            r0 = r10
        La2:
            cvpk r2 = new cvpk
            if (r0 == 0) goto Lad
            boolean r4 = defpackage.cvph.e(r1)
            if (r4 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r10
        Lae:
            r2.<init>(r1, r0, r3)
            return r2
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpd.b(java.lang.Object):java.lang.Object");
    }
}
