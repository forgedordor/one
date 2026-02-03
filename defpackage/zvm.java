package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ckmc b;
    final /* synthetic */ ajmh c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ anhj e;
    final /* synthetic */ ckmn f;
    final /* synthetic */ fhaz g;
    final /* synthetic */ zvn h;
    final /* synthetic */ angn i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvm(ckmc ckmcVar, ajmh ajmhVar, MessageId messageId, anhj anhjVar, ckmn ckmnVar, fhaz fhazVar, angn angnVar, zvn zvnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ckmcVar;
        this.c = ajmhVar;
        this.d = messageId;
        this.e = anhjVar;
        this.f = ckmnVar;
        this.g = fhazVar;
        this.i = angnVar;
        this.h = zvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r12 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (defpackage.ajmi.a(r4, r5, r6, r7, r8, r9) == r0) goto L25;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            defpackage.fctl.b(r12)
            if (r1 == 0) goto L10
            r9 = r11
            if (r1 == r3) goto L32
            goto L7e
        L10:
            ckmc r12 = r11.b
            ckmc r1 = defpackage.ckmc.REMOVE_REACTION
            if (r12 != r1) goto L64
            ajmh r4 = r11.c
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r11.d
            anhj r6 = r11.e
            ckmn r7 = r11.f
            fhaz r8 = r11.g
            r8.getClass()
            angn r9 = r11.i
            r11.a = r3
            r10 = r11
            java.lang.Object r12 = defpackage.ajmi.b(r4, r5, r6, r7, r8, r9, r10)
            r9 = r10
            if (r12 == r0) goto L7d
        L32:
            anhj r12 = r9.e
            boolean r12 = r12 instanceof defpackage.angp
            if (r12 == 0) goto L7e
            zvn r12 = r9.h
            dnwx r12 = r12.b
            if (r12 == 0) goto L7e
            ckmn r0 = r9.f
            int r1 = r0.ordinal()
            if (r1 == r3) goto L5e
            if (r1 != r2) goto L4b
            dnwy r0 = defpackage.dnwy.b
            goto L60
        L4b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Reaction surface not supported as emotify entry point: "
            java.lang.String r0 = r1.concat(r0)
            r12.<init>(r0)
            throw r12
        L5e:
            dnwy r0 = defpackage.dnwy.a
        L60:
            r12.b(r0)
            goto L7e
        L64:
            r9 = r11
            ajmh r4 = r9.c
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r9.d
            anhj r6 = r9.e
            ckmn r7 = r9.f
            fhaz r8 = r9.g
            r8.getClass()
            r9.a = r2
            java.lang.Object r12 = defpackage.ajmi.a(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L7e
        L7d:
            return r0
        L7e:
            zvn r12 = r9.h
            ckmc r0 = r9.b
            ckmn r1 = r9.f
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r9.d
            zvo r12 = r12.a
            r12.c(r0, r1, r2)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zvm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zvm(this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.h, fcxyVar);
    }
}
