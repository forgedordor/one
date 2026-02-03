package defpackage;

import android.location.Location;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqd extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ Location c;
    final /* synthetic */ amqh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqd(Location location, amqh amqhVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = location;
        this.d = amqhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0087, code lost:
    
        if (r11 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0141, code lost:
    
        if (r11 != r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amqd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amqd(this.c, this.d, fcxyVar);
    }
}
