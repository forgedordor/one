package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzs extends fcyy implements fdat {
    float a;
    float b;
    float c;
    long d;
    int e;
    int f;
    final /* synthetic */ fdav g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzs(fdav fdavVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.g = fdavVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dzs) c((ire) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0077, code lost:
    
        if (r6 != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0077 -> B:12:0x0079). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dzs dzsVar = new dzs(this.g, fcxyVar);
        dzsVar.h = obj;
        return dzsVar;
    }
}
