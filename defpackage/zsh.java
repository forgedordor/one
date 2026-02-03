package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zsh extends fcyz implements fdat {
    int a;
    final /* synthetic */ ztv b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ aaab e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsh(ztv ztvVar, String str, String str2, aaab aaabVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ztvVar;
        this.c = str;
        this.d = str2;
        this.e = aaabVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zsh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r1.i(r6, r2, r3, r5) == r0) goto L13;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r5.a
            r2 = 1
            defpackage.fctl.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L24
            goto L40
        Ld:
            ztv r6 = r5.b
            com.google.android.apps.messaging.shared.api.messaging.Conversation r6 = r6.h
            anpj r6 = r6.h()
            eiju r6 = r6.b()
            r6.getClass()
            r5.a = r2
            java.lang.Object r6 = defpackage.fdxs.c(r6, r5)
            if (r6 == r0) goto L43
        L24:
            ajlk r6 = (defpackage.ajlk) r6
            aoer r6 = r6.h()
            ztv r1 = r5.b
            java.lang.String r2 = r5.c
            java.lang.String r3 = r5.d
            aaab r4 = r5.e
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r3 = defpackage.ztv.o(r3, r4)
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.i(r6, r2, r3, r5)
            if (r6 != r0) goto L40
            goto L43
        L40:
            fctx r6 = defpackage.fctx.a
            return r6
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zsh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zsh(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
