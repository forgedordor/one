package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlwn extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dlwo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlwn(dlwo dlwoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dlwoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlwn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            fcyl r0 = defpackage.fcyl.a
            int r1 = r14.b
            r2 = 1
            if (r1 == 0) goto Ld
            java.lang.Object r0 = r14.a
            defpackage.fctl.b(r15)
            goto L23
        Ld:
            defpackage.fctl.b(r15)
            android.media.MediaCodec$BufferInfo r15 = new android.media.MediaCodec$BufferInfo
            r15.<init>()
            dlwo r1 = r14.c
            r14.a = r15
            r14.b = r2
            java.lang.Object r1 = r1.c(r15, r14)
            if (r1 == r0) goto Lc9
            r0 = r15
            r15 = r1
        L23:
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            java.lang.String r1 = "outputStream"
            r3 = -2
            r4 = 0
            if (r15 != r3) goto L67
            dlwo r15 = r14.c
            android.content.res.AssetFileDescriptor$AutoCloseOutputStream r5 = r15.f
            if (r5 != 0) goto L66
            android.content.Context r5 = r15.c
            dlwp r6 = r15.d
            android.net.Uri r7 = r6.a
            android.content.res.AssetFileDescriptor$AutoCloseOutputStream r8 = new android.content.res.AssetFileDescriptor$AutoCloseOutputStream
            java.lang.String r9 = "wt"
            ebsu r6 = r6.b
            android.content.res.AssetFileDescriptor r5 = defpackage.ebsv.a(r5, r7, r9, r6)
            r8.<init>(r5)
            r15.f = r8
            long r5 = r15.h
            r7 = 6
            long r5 = r5 + r7
            r15.h = r5
            android.content.res.AssetFileDescriptor$AutoCloseOutputStream r15 = r15.f
            if (r15 != 0) goto L59
            defpackage.fdbq.c(r1)
            r15 = r4
        L59:
            java.nio.channels.FileChannel r15 = r15.getChannel()
            byte[] r5 = defpackage.dlwo.b
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)
            r15.write(r5)
        L66:
            r15 = r3
        L67:
            if (r15 >= 0) goto L6a
            return r0
        L6a:
            dlwo r3 = r14.c
            android.media.MediaCodec r5 = r3.e
            java.lang.String r6 = "mediaCodec"
            if (r5 != 0) goto L76
            defpackage.fdbq.c(r6)
            r5 = r4
        L76:
            java.nio.ByteBuffer r5 = r5.getOutputBuffer(r15)
            if (r5 == 0) goto Lc1
            boolean r7 = r3.i
            if (r7 == 0) goto L81
            goto Lb3
        L81:
            r7 = r0
            android.media.MediaCodec$BufferInfo r7 = (android.media.MediaCodec.BufferInfo) r7
            int r8 = r7.size
            dlwp r9 = r3.d
            java.lang.Integer r9 = r9.f
            if (r9 == 0) goto L9c
            int r9 = r9.intValue()
            long r10 = r3.h
            long r12 = (long) r8
            long r10 = r10 + r12
            long r8 = (long) r9
            int r8 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r8 <= 0) goto L9c
            r3.i = r2
            goto Lb3
        L9c:
            long r8 = r3.h
            int r2 = r7.size
            long r10 = (long) r2
            long r8 = r8 + r10
            r3.h = r8
            android.content.res.AssetFileDescriptor$AutoCloseOutputStream r2 = r3.f
            if (r2 != 0) goto Lac
            defpackage.fdbq.c(r1)
            r2 = r4
        Lac:
            java.nio.channels.FileChannel r1 = r2.getChannel()
            r1.write(r5)
        Lb3:
            android.media.MediaCodec r1 = r3.e
            if (r1 != 0) goto Lbb
            defpackage.fdbq.c(r6)
            goto Lbc
        Lbb:
            r4 = r1
        Lbc:
            r1 = 0
            r4.releaseOutputBuffer(r15, r1)
            return r0
        Lc1:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "Output buffer should have been dequeued"
            r15.<init>(r0)
            throw r15
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlwn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlwn(this.c, fcxyVar);
    }
}
