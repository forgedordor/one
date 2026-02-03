package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domc extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ fdap c;
    final /* synthetic */ domd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public domc(fdap fdapVar, domd domdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdapVar;
        this.d = domdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((domc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:(6:5|25|104|26|(1:28)(1:29)|(8:31|32|33|38|(2:40|(1:42)(4:43|96|44|(4:49|(3:51|52|(3:60|(1:62)|63))|(5:106|65|(1:67)|108|69)|70)(2:48|42)))(1:72)|(1:74)(1:75)|76|77)(2:78|79))(1:6))(3:7|(0)|92)|9|98|10|11|102|12|(3:14|(1:16)|(1:18)(2:19|20))|32|33|38|(0)(0)|(0)(0)|76|77|(4:(0)|(1:101)|(0)|(1:95))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        ((defpackage.ekrd) ((defpackage.ekrd) defpackage.domd.a.j()).g(r0).h("com/google/android/libraries/compose/media/metadata/ImageMetadataResolver$resolve$2", "invokeSuspend", 30, "ImageMetadataResolver.kt")).q("Failed to resolve size from EXIF, retrying with BitmapFactory");
        r0 = r16.c;
        r16.a = r7;
        r16.b = 2;
        r0 = r0.invoke(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
    
        if (r0 != r2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.domc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new domc(this.c, this.d, fcxyVar);
    }
}
