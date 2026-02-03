package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edwc extends fcyz implements fdat {
    int a;
    final /* synthetic */ edwi b;
    final /* synthetic */ Account c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edwc(edwi edwiVar, Account account, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = edwiVar;
        this.c = account;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((edwc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r3.b(r5, r7, r18) != r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f7, code lost:
    
        if (r3.b(r4, r0, r18) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fa  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edwc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        edwc edwcVar = new edwc(this.b, this.c, fcxyVar);
        edwcVar.d = obj;
        return edwcVar;
    }
}
