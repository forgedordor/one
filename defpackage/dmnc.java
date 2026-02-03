package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmnc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dmng c;
    final /* synthetic */ Uri d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmnc(dmng dmngVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dmngVar;
        this.d = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmnc) c((fdos) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(1:(1:(1:(3:7|41|42)(2:8|52))(4:9|54|10|38))(1:14))(3:15|(0)|53)|17|56|18|(10:20|(1:22)(1:23)|24|(1:26)|27|(1:29)|30|(1:32)|33|(3:35|(2:37|38)|53)(2:43|44))(2:45|46)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (defpackage.fdin.a(r0, r5, r16) != r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmnc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmnc dmncVar = new dmnc(this.c, this.d, fcxyVar);
        dmncVar.e = obj;
        return dmncVar;
    }
}
