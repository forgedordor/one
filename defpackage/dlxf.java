package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlxf implements dlwv {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder");
    public final Context b;
    public final dlxg c;
    public MediaCodec d;
    public MediaMuxer e;
    public AssetFileDescriptor f;
    public int g = -1;
    public long h;
    public long i;
    public boolean j;
    private final fcyh k;

    public dlxf(fcyh fcyhVar, Context context, dlxg dlxgVar) {
        this.k = fcyhVar;
        this.b = context;
        this.c = dlxgVar;
    }

    public final long a() {
        return eont.a(dmba.a(this.h, this.c.c, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dlwz
            if (r0 == 0) goto L13
            r0 = r8
            dlwz r0 = (defpackage.dlwz) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlwz r0 = new dlwz
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            int r2 = r0.a
            android.media.MediaCodec r6 = r0.e
            defpackage.fctl.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.fctl.b(r8)
            android.media.MediaCodec r8 = r7.d
            if (r8 != 0) goto L42
            java.lang.String r8 = "mediaCodec"
            defpackage.fdbq.c(r8)
            r8 = 0
        L42:
            r6 = r8
            int r2 = r6.dequeueInputBuffer(r3)
        L47:
            if (r2 >= 0) goto L5a
            int r2 = r6.dequeueInputBuffer(r3)
            r0.e = r6
            r0.a = r2
            r0.d = r5
            java.lang.Object r8 = defpackage.fdnh.a(r0)
            if (r8 != r1) goto L47
            return r1
        L5a:
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxf.b(fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.media.MediaCodec.BufferInfo r8, defpackage.fcxy r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dlxa
            if (r0 == 0) goto L13
            r0 = r9
            dlxa r0 = (defpackage.dlxa) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dlxa r0 = new dlxa
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.d
            r3 = 0
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 != r5) goto L2f
            int r8 = r0.a
            android.media.MediaCodec r2 = r0.f
            android.media.MediaCodec$BufferInfo r6 = r0.e
            defpackage.fctl.b(r9)
            goto L4b
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            defpackage.fctl.b(r9)
            android.media.MediaCodec r9 = r7.d
            if (r9 != 0) goto L44
            java.lang.String r9 = "mediaCodec"
            defpackage.fdbq.c(r9)
            r9 = 0
        L44:
            r2 = r9
            int r9 = r2.dequeueOutputBuffer(r8, r3)
            r6 = r8
            r8 = r9
        L4b:
            r9 = -1
            if (r8 != r9) goto L61
            int r8 = r2.dequeueOutputBuffer(r6, r3)
            r0.e = r6
            r0.f = r2
            r0.a = r8
            r0.d = r5
            java.lang.Object r9 = defpackage.fdnh.a(r0)
            if (r9 != r1) goto L4b
            return r1
        L61:
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlxf.c(android.media.MediaCodec$BufferInfo, fcxy):java.lang.Object");
    }

    @Override // defpackage.dlwv
    public final Object d(fcxy fcxyVar) {
        Object objA = fdin.a(this.k, new dlxb(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dlwv
    public final Object e(fcxy fcxyVar) {
        Object objA = fdin.a(this.k, new dlxc(this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dlwv
    public final Object f(ByteBuffer byteBuffer, fcxy fcxyVar) {
        Object objA = fdin.a(this.k, new dlxd(byteBuffer, this, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.dlwv
    public final Object g(fcxy fcxyVar) {
        return fdin.a(this.k, new dlxe(this, null), fcxyVar);
    }

    @Override // defpackage.dlwv
    public final void h() throws IOException {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder", "release", 92, "Mpeg4Encoder.kt")).t("Releasing Mpeg4Encoder for %s", this.c.a.toString());
        MediaMuxer mediaMuxer = this.e;
        if (mediaMuxer != null) {
            mediaMuxer.release();
        }
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            mediaCodec.release();
        }
        AssetFileDescriptor assetFileDescriptor = this.f;
        if (assetFileDescriptor != null) {
            assetFileDescriptor.close();
        }
    }

    @Override // defpackage.dlwv
    public final void i() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 76, "Mpeg4Encoder.kt")).t("Starting Mpeg4Encoder for %s", this.c.a.toString());
        MediaCodec mediaCodec = this.d;
        if (mediaCodec == null) {
            fdbq.c("mediaCodec");
            mediaCodec = null;
        }
        mediaCodec.start();
    }

    @Override // defpackage.dlwv
    public final void j() {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "HugoAudio");
        ((ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/codec/Mpeg4Encoder", "stop", 81, "Mpeg4Encoder.kt")).t("Stopping Mpeg4Encoder for %s", this.c.a.toString());
        MediaMuxer mediaMuxer = this.e;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
        }
        MediaCodec mediaCodec = this.d;
        if (mediaCodec != null) {
            mediaCodec.stop();
        }
    }

    @Override // defpackage.dlwv
    public final boolean k() {
        return this.j;
    }
}
