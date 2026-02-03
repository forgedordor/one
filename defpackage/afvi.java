package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvi extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ afvn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvi(fcxy fcxyVar, String str, afvn afvnVar) {
        super(2, fcxyVar);
        this.b = str;
        this.c = afvnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afvi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017e A[RETURN] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afvi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afvi afviVar = new afvi(fcxyVar, this.b, this.c);
        afviVar.d = obj;
        return afviVar;
    }
}
