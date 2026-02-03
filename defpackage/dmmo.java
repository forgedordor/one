package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmo extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dmng c;
    final /* synthetic */ fdci d;
    final /* synthetic */ Uri e;
    final /* synthetic */ dmbx f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmo(dmng dmngVar, fdci fdciVar, Uri uri, dmbx dmbxVar, boolean z, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dmngVar;
        this.d = fdciVar;
        this.e = uri;
        this.f = dmbxVar;
        this.g = z;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmo) c((dmri) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r10.k.fO(r1, r9) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r10.fO(r2, r9) == r0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5 A[PHI: r10
      0x00c5: PHI (r10v18 java.lang.Object) = (r10v15 java.lang.Object), (r10v0 java.lang.Object) binds: [B:40:0x00c3, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmmo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dmmo dmmoVar = new dmmo(this.c, this.d, this.e, this.f, this.g, fcxyVar);
        dmmoVar.b = obj;
        return dmmoVar;
    }
}
