package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlxd extends fcyz implements fdat {
    int a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ dlxf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlxd(ByteBuffer byteBuffer, dlxf dlxfVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = byteBuffer;
        this.c = dlxfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlxd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0021 -> B:12:0x0023). Please report as a decompilation issue!!! */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r10.a
            r2 = 1
            if (r1 == 0) goto Le
            if (r1 == r2) goto La
            goto Le
        La:
            defpackage.fctl.b(r11)
            goto L23
        Le:
            defpackage.fctl.b(r11)
        L11:
            java.nio.ByteBuffer r11 = r10.b
            int r11 = r11.remaining()
            if (r11 <= 0) goto L79
            dlxf r11 = r10.c
            r10.a = r2
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L78
        L23:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            dlxf r11 = r10.c
            android.media.MediaCodec r1 = r11.d
            r3 = 0
            java.lang.String r5 = "mediaCodec"
            if (r1 != 0) goto L36
            defpackage.fdbq.c(r5)
            r1 = r3
        L36:
            java.nio.ByteBuffer r1 = r1.getInputBuffer(r4)
            if (r1 == 0) goto L70
            java.nio.ByteBuffer r6 = r10.b
            int r7 = r6.remaining()
            int r8 = r1.remaining()
            int r7 = java.lang.Math.min(r7, r8)
            defpackage.dlxo.a(r1, r6, r7)
            android.media.MediaCodec r1 = r11.d
            if (r1 != 0) goto L55
            defpackage.fdbq.c(r5)
            goto L56
        L55:
            r3 = r1
        L56:
            r6 = r7
            long r7 = r11.a()
            r9 = 0
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            long r3 = r11.h
            long r5 = (long) r6
            long r3 = r3 + r5
            r11.h = r3
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = defpackage.fdnh.a(r10)
            if (r11 != r0) goto L11
            goto L78
        L70:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Input buffer should have been dequeued"
            r11.<init>(r0)
            throw r11
        L78:
            return r0
        L79:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlxd(this.b, this.c, fcxyVar);
    }
}
