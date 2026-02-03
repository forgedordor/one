package defpackage;

import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzgm extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzgt c;
    final /* synthetic */ bzbz d;
    final /* synthetic */ bnar e;
    final /* synthetic */ Optional f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzgm(bzgt bzgtVar, bzbz bzbzVar, bnar bnarVar, Optional optional, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bzgtVar;
        this.d = bzbzVar;
        this.e = bnarVar;
        this.f = optional;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzgm) c((Map) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e8, code lost:
    
        if (r14 != r0) goto L27;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzgm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzgm bzgmVar = new bzgm(this.c, this.d, this.e, this.f, fcxyVar);
        bzgmVar.b = obj;
        return bzgmVar;
    }
}
