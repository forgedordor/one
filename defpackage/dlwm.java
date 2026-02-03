package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlwm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ByteBuffer b;
    final /* synthetic */ dlwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlwm(ByteBuffer byteBuffer, dlwo dlwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = byteBuffer;
        this.c = dlwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0023 -> B:12:0x0025). Please report as a decompilation issue!!! */
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
            goto L25
        Le:
            defpackage.fctl.b(r11)
        L11:
            java.nio.ByteBuffer r11 = r10.b
            int r11 = r11.remaining()
            if (r11 <= 0) goto L7d
            dlwo r11 = r10.c
            r10.a = r2
            ekrg r1 = defpackage.dlwo.a
            java.lang.Object r11 = r11.b(r10)
            if (r11 == r0) goto L7c
        L25:
            java.lang.Number r11 = (java.lang.Number) r11
            int r4 = r11.intValue()
            ekrg r11 = defpackage.dlwo.a
            dlwo r11 = r10.c
            android.media.MediaCodec r1 = r11.e
            r3 = 0
            java.lang.String r5 = "mediaCodec"
            if (r1 != 0) goto L3a
            defpackage.fdbq.c(r5)
            r1 = r3
        L3a:
            java.nio.ByteBuffer r1 = r1.getInputBuffer(r4)
            if (r1 == 0) goto L74
            java.nio.ByteBuffer r6 = r10.b
            int r7 = r6.remaining()
            int r8 = r1.remaining()
            int r7 = java.lang.Math.min(r7, r8)
            defpackage.dlxo.a(r1, r6, r7)
            android.media.MediaCodec r1 = r11.e
            if (r1 != 0) goto L59
            defpackage.fdbq.c(r5)
            goto L5a
        L59:
            r3 = r1
        L5a:
            r6 = r7
            long r7 = r11.a()
            r9 = 0
            r5 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            long r3 = r11.g
            long r5 = (long) r6
            long r3 = r3 + r5
            r11.g = r3
            r11 = 2
            r10.a = r11
            java.lang.Object r11 = defpackage.fdnh.a(r10)
            if (r11 != r0) goto L11
            goto L7c
        L74:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Input buffer should have been dequeued"
            r11.<init>(r0)
            throw r11
        L7c:
            return r0
        L7d:
            fctx r11 = defpackage.fctx.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlwm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlwm(this.b, this.c, fcxyVar);
    }
}
