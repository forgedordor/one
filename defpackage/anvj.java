package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anvj extends fcyz implements fdat {
    int a;
    final /* synthetic */ Set b;
    final /* synthetic */ anvq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvj(fcxy fcxyVar, Set set, anvq anvqVar) {
        super(2, fcxyVar);
        this.b = set;
        this.c = anvqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anvj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[LOOP:1: B:40:0x010d->B:42:0x0113, LOOP_END] */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anvj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        anvj anvjVar = new anvj(fcxyVar, this.b, this.c);
        anvjVar.d = obj;
        return anvjVar;
    }
}
