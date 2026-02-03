package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxc extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlxf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxc(dlxf dlxfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlxfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlxc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dlxf dlxfVar = this.b;
            this.a = 1;
            obj = dlxfVar.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        dlxf dlxfVar2 = this.b;
        MediaCodec mediaCodec = dlxfVar2.d;
        if (mediaCodec == null) {
            fdbq.c("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.queueInputBuffer(iIntValue, 0, 0, dlxfVar2.a(), 4);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlxc(this.b, fcxyVar);
    }
}
