package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlyy implements fdpm {
    final /* synthetic */ dlzc a;

    public dlyy(dlzc dlzcVar) {
        this.a = dlzcVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        dlyp dlypVar = (dlyp) obj;
        if (dlypVar instanceof dlyo) {
            dlzc dlzcVar = this.a;
            int i = dlzcVar.j;
            dlyo dlyoVar = (dlyo) dlypVar;
            ByteBuffer byteBuffer = (ByteBuffer) dlyoVar.b;
            dlzcVar.j = i + byteBuffer.remaining();
            exkx exkxVar = dlzcVar.h;
            if (exkxVar == null) {
                fdbq.c("processor");
                exkxVar = null;
            }
            exkxVar.a(byteBuffer, eonu.a(dlyoVar.a), dlzcVar.d.c);
        }
        return fctx.a;
    }
}
