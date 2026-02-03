package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzy extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckmc b;
    final /* synthetic */ ajmh c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ anhj e;
    final /* synthetic */ ckmn f;
    final /* synthetic */ fhaz g;
    final /* synthetic */ zaa h;
    final /* synthetic */ angn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzy(ckmc ckmcVar, ajmh ajmhVar, MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar, zaa zaaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckmcVar;
        this.c = ajmhVar;
        this.d = messageId;
        this.e = anhjVar;
        this.f = ckmnVar;
        this.g = fhazVar;
        this.i = angnVar;
        this.h = zaaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r11 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (defpackage.ajmi.a(r1, r2, r3, r4, r5, r6) == r0) goto L18;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            defpackage.fctl.b(r11)
            if (r1 == 0) goto Le
            r6 = r10
            if (r1 == r2) goto L2d
            goto L57
        Le:
            ckmc r11 = r10.b
            ckmc r1 = defpackage.ckmc.REMOVE_REACTION
            if (r11 != r1) goto L3f
            ajmh r3 = r10.c
            r3.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r4 = r10.d
            anhj r5 = r10.e
            ckmn r6 = r10.f
            fhaz r7 = r10.g
            angn r8 = r10.i
            r10.a = r2
            r9 = r10
            java.lang.Object r11 = defpackage.ajmi.b(r3, r4, r5, r6, r7, r8, r9)
            r6 = r9
            if (r11 == r0) goto L56
        L2d:
            anhj r11 = r6.e
            boolean r11 = r11 instanceof defpackage.angp
            if (r11 == 0) goto L57
            zaa r11 = r6.h
            dnwx r11 = r11.o
            if (r11 == 0) goto L57
            dnwy r0 = defpackage.dnwy.a
            r11.b(r0)
            goto L57
        L3f:
            r6 = r10
            ajmh r1 = r6.c
            r1.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r6.d
            anhj r3 = r6.e
            ckmn r4 = r6.f
            fhaz r5 = r6.g
            r11 = 2
            r6.a = r11
            java.lang.Object r11 = defpackage.ajmi.a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L57
        L56:
            return r0
        L57:
            zaa r11 = r6.h
            ckmc r0 = r6.b
            ckmn r1 = r6.f
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r6.d
            zvo r11 = r11.g
            r11.c(r0, r1, r2)
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new yzy(this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.h, fcxyVar);
    }
}
