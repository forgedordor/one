package defpackage;

import j$.time.Instant;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmas extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmaw b;
    final /* synthetic */ Instant c;
    final /* synthetic */ ByteBuffer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmas(dmaw dmawVar, Instant instant, ByteBuffer byteBuffer, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmawVar;
        this.c = instant;
        this.d = byteBuffer;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmas) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmaw dmawVar = this.b;
            dlyo dlyoVar = new dlyo(this.c, this.d.slice());
            this.a = 1;
            if (dmawVar.d.fO(dlyoVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmas(this.b, this.c, this.d, fcxyVar);
    }
}
