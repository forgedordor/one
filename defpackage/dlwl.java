package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlwl extends fcyz implements fdat {
    int a;
    final /* synthetic */ dlwo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlwl(dlwo dlwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dlwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlwl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dlwo dlwoVar = this.b;
            this.a = 1;
            obj = dlwoVar.b(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        dlwo dlwoVar2 = this.b;
        MediaCodec mediaCodec = dlwoVar2.e;
        if (mediaCodec == null) {
            fdbq.c("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.queueInputBuffer(iIntValue, 0, 0, dlwoVar2.a(), 4);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlwl(this.b, fcxyVar);
    }
}
