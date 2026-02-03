package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaExtractor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svy {
    public final Context a;
    public final fcyh b;
    public MediaExtractor c;
    public MediaCodec d;
    public final elee e;
    private final eygg f;

    public svy(Context context, fcyh fcyhVar, eygg eyggVar) {
        context.getClass();
        fcyhVar.getClass();
        eyggVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.f = eyggVar;
        this.e = new elee();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0052 -> B:36:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007c -> B:32:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.media.MediaCodec.BufferInfo r9, java.nio.channels.FileChannel r10, defpackage.fcxy r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.svv
            if (r0 == 0) goto L13
            r0 = r11
            svv r0 = (defpackage.svv) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            svv r0 = new svv
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.d
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.f
            r3 = 1
            r4 = 0
            java.lang.String r5 = "mediaCodec"
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r9 = r0.c
            java.lang.Object r10 = r0.b
            java.lang.Object r2 = r0.a
            android.media.MediaCodec$BufferInfo r6 = r0.g
            defpackage.fctl.b(r11)
            goto L81
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            defpackage.fctl.b(r11)
        L3d:
            android.media.MediaCodec r11 = r8.d
            if (r11 != 0) goto L45
            defpackage.fdbq.c(r5)
            r11 = r4
        L45:
            r6 = 0
            int r11 = r11.dequeueOutputBuffer(r9, r6)
            if (r11 >= 0) goto L50
            fctx r9 = defpackage.fctx.a
            return r9
        L50:
            int r2 = r9.size
            if (r2 <= 0) goto L96
            android.media.MediaCodec r2 = r8.d
            if (r2 != 0) goto L5c
            defpackage.fdbq.c(r5)
            r2 = r4
        L5c:
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r11)
            if (r2 == 0) goto L8e
            eygg r6 = r8.f
            java.lang.Object r6 = r6.b()
            avbh r6 = (defpackage.avbh) r6
            int r7 = r9.size
            r0.g = r9
            r0.a = r10
            r0.b = r2
            r0.c = r11
            r0.f = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 == r1) goto L8d
            r6 = r2
            r2 = r10
            r10 = r6
            r6 = r9
            r9 = r11
        L81:
            r11 = r2
            java.nio.channels.FileChannel r11 = (java.nio.channels.FileChannel) r11
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            r11.write(r10)
            r11 = r9
            r10 = r2
            r9 = r6
            goto L96
        L8d:
            return r1
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Output buffer should have been dequeued"
            r9.<init>(r10)
            throw r9
        L96:
            android.media.MediaCodec r2 = r8.d
            if (r2 != 0) goto L9e
            defpackage.fdbq.c(r5)
            r2 = r4
        L9e:
            r6 = 0
            r2.releaseOutputBuffer(r11, r6)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svy.a(android.media.MediaCodec$BufferInfo, java.nio.channels.FileChannel, fcxy):java.lang.Object");
    }

    public final void b() {
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            mediaCodec.stop();
            MediaCodec mediaCodec2 = this.d;
            if (mediaCodec2 == null) {
                fdbq.c("mediaCodec");
                mediaCodec2 = null;
            }
            mediaCodec2.release();
        }
        MediaExtractor mediaExtractor = this.c;
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
        this.e.close();
    }

    public final boolean c() {
        return (this.c == null || this.d == null) ? false : true;
    }
}
