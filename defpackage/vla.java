package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vla extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vlc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vla(vlc vlcVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = vlcVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vla vlaVar = new vla(this.d, (fcxy) obj3);
        vlaVar.b = (ekgb) obj;
        vlaVar.c = (ajlk) obj2;
        return vlaVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [ajlk] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
            java.lang.Object r0 = r14.b
            ajlk r0 = (defpackage.ajlk) r0
            defpackage.fctl.b(r15)
            goto L46
        L10:
            defpackage.fctl.b(r15)
            java.lang.Object r15 = r14.b
            ekgb r15 = (defpackage.ekgb) r15
            java.lang.Object r1 = r14.c
            boolean r4 = r1 instanceof defpackage.ajts
            if (r4 == 0) goto L7c
            r4 = r1
            ajts r4 = (defpackage.ajts) r4
            ajlj r4 = r4.c()
            ajlj r5 = defpackage.ajlj.ONE_ON_ONE
            if (r4 != r5) goto L7c
            java.lang.Object r15 = defpackage.fcva.P(r15)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r15 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r15
            if (r15 == 0) goto L55
            r4 = 2
            anpj r15 = r15.E(r4)
            eiju r15 = r15.b()
            if (r15 == 0) goto L55
            r14.b = r1
            r14.a = r3
            java.lang.Object r15 = defpackage.fdxs.c(r15, r14)
            if (r15 == r0) goto L54
            r0 = r1
        L46:
            anyy r15 = (defpackage.anyy) r15
            if (r15 == 0) goto L52
            boolean r15 = r15.a()
            if (r15 != r3) goto L56
            r2 = r3
            goto L56
        L52:
            r1 = r0
            goto L55
        L54:
            return r0
        L55:
            r0 = r1
        L56:
            if (r2 == 0) goto L7c
            vlc r15 = r14.d
            android.content.Context r1 = r15.a
            dihq r2 = new dihq
            r3 = 2132086000(0x7f150cf0, float:1.9812215E38)
            java.lang.String r3 = r1.getString(r3)
            r3.getClass()
            djrr r4 = defpackage.djrr.dN
            vkz r12 = new vkz
            r12.<init>()
            r13 = 1020(0x3fc, float:1.43E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r2
        L7c:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vla.b(java.lang.Object):java.lang.Object");
    }
}
