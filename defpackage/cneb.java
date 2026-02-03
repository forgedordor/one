package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cneb extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ ezol g;
    final /* synthetic */ ezol h;
    final /* synthetic */ cnef i;
    final /* synthetic */ Instant j;
    final /* synthetic */ eqfu k;
    final /* synthetic */ Iterable l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cneb(ezol ezolVar, ezol ezolVar2, cnef cnefVar, Instant instant, eqfu eqfuVar, Iterable iterable, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = ezolVar;
        this.h = ezolVar2;
        this.i = cnefVar;
        this.j = instant;
        this.k = eqfuVar;
        this.l = iterable;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cneb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
    
        if (((defpackage.cnef) r8).i(r0, "handleOthersRemovedFromGroup", r10) != r6) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cneb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cneb(this.g, this.h, this.i, this.j, this.k, this.l, fcxyVar);
    }
}
