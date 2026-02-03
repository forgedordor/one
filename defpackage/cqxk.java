package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqxk {
    private static final double n = TimeUnit.SECONDS.toMicros(1);
    public MediaExtractor a;
    public MediaExtractor b;
    public cqwm c;
    public cqwq d;
    public MediaCodec e;
    public MediaCodec f;
    public MediaCodec g;
    public MediaCodec h;
    public MediaMuxer i;
    public volatile boolean j;
    public long k;
    public final Context l;
    public final cqxn m;
    private MediaCodecInfo q;
    private MediaCodecInfo r;
    private MediaFormat s;
    private MediaFormat t;
    private dzub v;
    private final cogw w;
    private final fcsu x;
    private double o = 0.03d;
    private double p = 0.9d;
    private int u = 0;

    public cqxk(Context context, cqxn cqxnVar, cogw cogwVar, fcsu fcsuVar) {
        this.l = context;
        this.m = cqxnVar;
        this.w = cogwVar;
        this.x = fcsuVar;
    }

    static Optional a(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (ejuf.e(str2, str)) {
                        return Optional.of(codecInfoAt);
                    }
                }
            }
        }
        return Optional.empty();
    }

    public static void b(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (IllegalStateException e) {
                ((eksl) ((eksl) ((eksl) cqxo.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoder", "release", (char) 896, "VideoTranscoder.java")).q("Error releasing codec");
            }
        }
    }

    public static void c(MediaExtractor mediaExtractor) {
        if (mediaExtractor != null) {
            mediaExtractor.release();
        }
    }

    private final int e(MediaFormat mediaFormat, String str) throws cqxm {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        this.m.r(9);
        throw new cqxm("Required key " + str + " not found in " + String.valueOf(mediaFormat));
    }

    private final MediaExtractor f(Uri uri) throws IOException {
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(this.l, uri, (Map<String, String>) null);
        return mediaExtractor;
    }

    private final MediaMuxer g(File file) throws cqxm {
        try {
            return new MediaMuxer(file.getAbsolutePath(), 0);
        } catch (IOException | NoClassDefFoundError e) {
            this.m.r(6);
            throw new cqxm("Failed to create muxer", e);
        }
    }

    private final void h(cqwp cqwpVar) throws MediaCodec.CryptoException {
        eksp ekspVar;
        MediaCodec mediaCodec;
        long j;
        cqwq cqwqVar;
        cqwo cqwoVar;
        MediaCodec mediaCodec2;
        int iDequeueInputBuffer;
        if (!cqwpVar.g && ((cqwpVar.h == null || cqwpVar.m) && (iDequeueInputBuffer = (mediaCodec2 = (cqwoVar = cqwpVar.e).a).dequeueInputBuffer(10000L)) != -1)) {
            ByteBuffer byteBuffer = cqwoVar.c[iDequeueInputBuffer];
            MediaExtractor mediaExtractor = cqwpVar.a;
            int sampleData = mediaExtractor.readSampleData(byteBuffer, 0);
            long sampleTime = mediaExtractor.getSampleTime();
            if (sampleData >= 0) {
                mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, sampleTime, mediaExtractor.getSampleFlags());
            }
            cqwpVar.g = !mediaExtractor.advance();
            ((eksl) cqxo.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "extract", 111, "MediaTrackPipeline.java")).J("extract(track= %s, size= %s, presentationTime: %s (%s)", Integer.valueOf(cqwpVar.f), Integer.valueOf(sampleData), Long.valueOf(sampleTime), Long.valueOf(mediaExtractor.getSampleTime() - sampleTime));
            if (cqwpVar.g) {
                mediaCodec2.queueInputBuffer(mediaCodec2.dequeueInputBuffer(10000L), 0, 0, 0L, 4);
            }
        }
        if (cqwpVar.b == null || (cqwqVar = cqwpVar.c) == null) {
            cqwo cqwoVar2 = cqwpVar.e;
            if (!cqwoVar2.e && cqwpVar.i == -1 && (cqwpVar.h == null || cqwpVar.m)) {
                MediaCodec mediaCodec3 = cqwoVar2.a;
                MediaCodec.BufferInfo bufferInfo = cqwoVar2.b;
                int iDequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 10000L);
                eksp ekspVar2 = cqxo.a;
                ((eksl) ekspVar2.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 141, "MediaTrackPipeline.java")).I("dequeOutputBuffer(track= %s, size=%s...):%s", Integer.valueOf(cqwpVar.f), Integer.valueOf(bufferInfo.size), Integer.valueOf(iDequeueOutputBuffer));
                if (iDequeueOutputBuffer == -1) {
                    ((eksl) ekspVar2.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 145, "MediaTrackPipeline.java")).q("MediaCodec.INFO_TRY_AGAIN_LATER");
                } else if (iDequeueOutputBuffer == -3) {
                    cqwoVar2.d = mediaCodec3.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = mediaCodec3.getOutputFormat();
                    if (outputFormat.containsKey("sample-rate")) {
                        cqwpVar.n = outputFormat.getInteger("sample-rate");
                    }
                    if (outputFormat.containsKey("channel-count")) {
                        cqwpVar.o = outputFormat.getInteger("channel-count");
                    }
                    ((eksl) ekspVar2.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 158, "MediaTrackPipeline.java")).w("transcodeViaBuffers: track %s decoder output format changed to %s", cqwpVar.f, outputFormat);
                } else if ((bufferInfo.flags & 2) != 0) {
                    mediaCodec3.releaseOutputBuffer(iDequeueOutputBuffer, false);
                } else {
                    cqwpVar.i = iDequeueOutputBuffer;
                }
            }
            if (cqwpVar.i != -1) {
                cqwo cqwoVar3 = cqwpVar.d;
                MediaCodec mediaCodec4 = cqwoVar3.a;
                int iDequeueInputBuffer2 = mediaCodec4.dequeueInputBuffer(10000L);
                cqwpVar.j = iDequeueInputBuffer2;
                if (iDequeueInputBuffer2 != -1) {
                    MediaCodec.BufferInfo bufferInfo2 = cqwoVar2.b;
                    int i = bufferInfo2.size - bufferInfo2.offset;
                    eksp ekspVar3 = cqxo.a;
                    ((eksl) ekspVar3.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 177, "MediaTrackPipeline.java")).I("bytesQueued=%s, size= %s, offset=%s", Integer.valueOf(i), Integer.valueOf(bufferInfo2.size), Integer.valueOf(bufferInfo2.offset));
                    ejwl.b(cqwpVar.o > 0, "audioChannelCount can't smaller than 1");
                    ejwl.b(cqwpVar.n > 0, "audioSampleRate can't be smaller than 1");
                    long j2 = bufferInfo2.presentationTimeUs;
                    if (cqwpVar.n <= 0 || cqwpVar.o <= 0) {
                        ekspVar = ekspVar3;
                        mediaCodec = mediaCodec4;
                    } else {
                        ekspVar = ekspVar3;
                        mediaCodec = mediaCodec4;
                        double d = cqwpVar.n * cqwpVar.o;
                        long micros = (long) (bufferInfo2.offset * (TimeUnit.SECONDS.toMicros(1L) / (d + d)));
                        ((eksl) ekspVar.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 190, "MediaTrackPipeline.java")).z("presentationTime=%s, delta=%s", j2, micros);
                        j2 += micros;
                    }
                    long j3 = j2;
                    ByteBuffer byteBuffer2 = cqwoVar3.c[cqwpVar.j];
                    ByteBuffer byteBufferDuplicate = cqwoVar2.d[cqwpVar.i].duplicate();
                    byteBufferDuplicate.position(bufferInfo2.offset);
                    int iMin = Math.min(byteBuffer2.capacity(), i);
                    byteBufferDuplicate.limit(bufferInfo2.offset + iMin);
                    byteBuffer2.position(0);
                    byteBuffer2.put(byteBufferDuplicate);
                    ((eksl) ekspVar.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "MediaTrackPipeline.java")).I("queueInputBuffer( %s): size=%s, presentationTime=%s", Integer.valueOf(cqwpVar.f), Integer.valueOf(iMin), Long.valueOf(j3));
                    if (j3 <= 0 || j3 >= cqwpVar.k) {
                        j = j3;
                    } else {
                        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 207, "MediaTrackPipeline.java")).z("presentationTime out of sequence? %s < %s", j3, cqwpVar.k);
                        j = cqwpVar.k;
                    }
                    cqwpVar.k = Math.max(j, cqwpVar.k);
                    if (iMin > 0) {
                        mediaCodec.queueInputBuffer(cqwpVar.j, 0, iMin, j, bufferInfo2.flags);
                        cqwpVar.j = -1;
                        ((eksl) ekspVar.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 225, "MediaTrackPipeline.java")).v("track %s queueinput %s s", cqwpVar.f, TimeUnit.MICROSECONDS.toSeconds(j));
                    } else {
                        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaBuffers", 229, "MediaTrackPipeline.java")).r("track %s defer EOS", cqwpVar.f);
                    }
                    if (bufferInfo2.offset + iMin < bufferInfo2.size) {
                        bufferInfo2.offset += iMin;
                    } else {
                        cqwoVar2.a.releaseOutputBuffer(cqwpVar.i, false);
                        cqwpVar.i = -1;
                        if ((bufferInfo2.flags & 4) != 0) {
                            cqwoVar2.e = true;
                        }
                    }
                }
            }
        } else {
            cqwo cqwoVar4 = cqwpVar.e;
            if (!cqwoVar4.e && (cqwpVar.h == null || cqwpVar.m)) {
                MediaCodec mediaCodec5 = cqwoVar4.a;
                MediaCodec.BufferInfo bufferInfo3 = cqwoVar4.b;
                int iDequeueOutputBuffer2 = mediaCodec5.dequeueOutputBuffer(bufferInfo3, 10000L);
                ((eksl) cqxo.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 268, "MediaTrackPipeline.java")).I("dequeOutputBuffer(track= %s, size=%s...): %s", Integer.valueOf(cqwpVar.f), Integer.valueOf(bufferInfo3.size), Integer.valueOf(iDequeueOutputBuffer2));
                if (iDequeueOutputBuffer2 >= 0) {
                    if ((bufferInfo3.flags & 2) != 0) {
                        mediaCodec5.releaseOutputBuffer(iDequeueOutputBuffer2, false);
                    } else {
                        boolean z = bufferInfo3.size != 0;
                        mediaCodec5.releaseOutputBuffer(iDequeueOutputBuffer2, z);
                        if (z) {
                            Object obj = cqwqVar.d;
                            synchronized (obj) {
                                while (!cqwqVar.f) {
                                    try {
                                        obj.wait(cqwq.a);
                                    } catch (InterruptedException e) {
                                        ((eksl) ((eksl) ((eksl) cqxo.a.i()).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/OutputSurface", "awaitNewImage", 78, "OutputSurface.java")).q("Unexpected exception");
                                    }
                                    if (!cqwqVar.f) {
                                        throw new RuntimeException("Surface frame wait timed out");
                                    }
                                }
                                cqwqVar.f = false;
                            }
                            cqwqVar.b.updateTexImage();
                            cqwq cqwqVar2 = cqwpVar.c;
                            cqwr cqwrVar = cqwqVar2.e;
                            float[] fArr = cqwrVar.c;
                            cqwqVar2.b.getTransformMatrix(fArr);
                            GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
                            GLES20.glClear(16640);
                            GLES20.glUseProgram(cqwrVar.d);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, cqwrVar.e);
                            FloatBuffer floatBuffer = cqwrVar.a;
                            floatBuffer.position(0);
                            GLES20.glVertexAttribPointer(cqwrVar.h, 3, 5126, false, 20, (Buffer) floatBuffer);
                            GLES20.glEnableVertexAttribArray(cqwrVar.h);
                            floatBuffer.position(3);
                            GLES20.glVertexAttribPointer(cqwrVar.i, 2, 5126, false, 20, (Buffer) floatBuffer);
                            GLES20.glEnableVertexAttribArray(cqwrVar.i);
                            float[] fArr2 = cqwrVar.b;
                            Matrix.setIdentityM(fArr2, 0);
                            GLES20.glUniformMatrix4fv(cqwrVar.f, 1, false, fArr2, 0);
                            GLES20.glUniformMatrix4fv(cqwrVar.g, 1, false, fArr, 0);
                            if (!cqwrVar.n) {
                                GLES20.glUniform1f(cqwrVar.j, cqwrVar.l);
                                GLES20.glUniform1f(cqwrVar.k, cqwrVar.m);
                            }
                            GLES20.glDrawArrays(5, 0, 4);
                            GLES20.glFinish();
                            cqwm cqwmVar = cqwpVar.b;
                            MediaCodec.BufferInfo bufferInfo4 = cqwpVar.e.b;
                            EGLExt.eglPresentationTimeANDROID(cqwmVar.a, cqwmVar.c, bufferInfo4.presentationTimeUs * 1000);
                            EGL14.eglSwapBuffers(cqwmVar.a, cqwmVar.c);
                            ((eksl) cqxo.a.o().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 290, "MediaTrackPipeline.java")).v("track %s queueinput %s s", cqwpVar.f, TimeUnit.MICROSECONDS.toSeconds(bufferInfo4.presentationTimeUs));
                        }
                        cqwo cqwoVar5 = cqwpVar.e;
                        if ((cqwoVar5.b.flags & 4) != 0) {
                            cqwoVar5.e = true;
                            ((eksl) cqxo.a.n().h("com/google/android/apps/messaging/shared/util/media/video/MediaTrackPipeline", "transcodeViaSurfaces", 297, "MediaTrackPipeline.java")).r("track %s signaling EOS", cqwpVar.f);
                            cqwpVar.d.a.signalEndOfInputStream();
                        }
                    }
                }
            }
        }
        if (cqwpVar.c()) {
            return;
        }
        cqwpVar.b(this.i);
    }

    private static int i(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("rotation-degrees")) {
            return mediaFormat.getInteger("rotation-degrees");
        }
        return 0;
    }

    private static int j(MediaExtractor mediaExtractor) {
        int i = 0;
        while (i < 5 && mediaExtractor.advance()) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:59|(1:61)(18:62|(3:64|595|65)|67|(1:69)(1:70)|71|(1:76)(1:75)|77|78|586|79|(1:81)(1:82)|83|84|521|(16:97|98|(1:100)(1:102)|103|(2:105|(2:107|(2:109|115)(3:110|114|115))(3:111|(1:113)(1:114)|115))(1:116)|117|(2:119|120)(1:122)|123|124|(2:126|(6:128|132|133|(1:137)|138|(35:140|561|141|142|(3:144|543|145)(2:149|150)|151|152|(1:159)(1:158)|(1:161)|162|163|(1:165)(1:166)|167|(1:171)|172|173|(1:175)(29:554|177|597|178|519|179|180|572|181|(3:182|(9:184|185|590|186|187|593|188|189|(2:613|191)(13:192|537|193|194|541|195|196|533|197|198|527|199|(1:612)(2:206|(3:208|209|616)(1:615))))(2:227|614)|228)|(1:203)|204|250|(8:252|253|497|254|255|575|256|257)(1:273)|274|(5:552|277|(7:281|(1:283)(2:284|(1:286)(4:287|(1:289)|290|(1:292)))|293|(1:297)|298|(1:611)(2:302|609)|303)(1:608)|275|517)|607|306|505|307|308|(2:310|(1:315)(1:314))(0)|316|(1:318)(1:(1:320))|321|(1:325)|326|327|328)|176|250|(0)(0)|274|(2:275|517)|607|306|505|307|308|(0)(0)|316|(0)(0)|321|(2:323|325)|326|327|328)(4:369|582|370|371))(1:129))(1:131)|130|132|133|(2:135|137)|138|(0)(0))(1:(17:87|(1:89)(1:90)|91|(0)(0)|103|(0)(0)|117|(0)(0)|123|124|(0)(0)|130|132|133|(0)|138|(0)(0))(17:92|(1:94)(0)|98|(0)(0)|103|(0)(0)|117|(0)(0)|123|124|(0)(0)|130|132|133|(0)|138|(0)(0)))|503|377|623)|66|67|(0)(0)|71|(2:73|76)(0)|77|78|586|79|(0)(0)|83|84|521|(0)(0)|503|377|623) */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05c8, code lost:
    
        r7.releaseOutputBuffer(r12, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x091f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02cf, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02de A[Catch: all -> 0x02ce, TRY_LEAVE, TryCatch #24 {all -> 0x02ce, blocks: (B:87:0x02b6, B:100:0x02de, B:120:0x035a, B:137:0x03fe, B:92:0x02c6), top: B:521:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e5 A[Catch: all -> 0x091f, TRY_ENTER, TryCatch #69 {all -> 0x091f, blocks: (B:79:0x028e, B:83:0x02a8, B:103:0x02eb, B:124:0x0375, B:132:0x03dd, B:138:0x0404, B:129:0x03d0, B:130:0x03d6, B:131:0x03d9, B:114:0x031f, B:116:0x0328, B:102:0x02e5), top: B:586:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0328 A[Catch: all -> 0x091f, TRY_LEAVE, TryCatch #69 {all -> 0x091f, blocks: (B:79:0x028e, B:83:0x02a8, B:103:0x02eb, B:124:0x0375, B:132:0x03dd, B:138:0x0404, B:129:0x03d0, B:130:0x03d6, B:131:0x03d9, B:114:0x031f, B:116:0x0328, B:102:0x02e5), top: B:586:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[Catch: all -> 0x0ad0, TRY_ENTER, TryCatch #25 {all -> 0x0ad0, blocks: (B:3:0x001e, B:14:0x0070, B:11:0x0040), top: B:523:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d9 A[Catch: all -> 0x091f, TryCatch #69 {all -> 0x091f, blocks: (B:79:0x028e, B:83:0x02a8, B:103:0x02eb, B:124:0x0375, B:132:0x03dd, B:138:0x0404, B:129:0x03d0, B:130:0x03d6, B:131:0x03d9, B:114:0x031f, B:116:0x0328, B:102:0x02e5), top: B:586:0x028e }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0435 A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TRY_ENTER, TRY_LEAVE, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x069a A[Catch: all -> 0x069e, TRY_ENTER, TRY_LEAVE, TryCatch #67 {all -> 0x069e, blocks: (B:203:0x05ce, B:204:0x05d1, B:244:0x069a), top: B:554:0x0504 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x06cc A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TRY_LEAVE, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x072f A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x081c A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0835 A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0874 A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0a4c A[Catch: all -> 0x0a6e, TryCatch #49 {all -> 0x0a6e, blocks: (B:335:0x08c4, B:334:0x08c1, B:472:0x0a42, B:474:0x0a4c, B:475:0x0a4f, B:477:0x0a53, B:478:0x0a66, B:479:0x0a6d, B:342:0x08d5, B:341:0x08d2, B:361:0x08fd, B:360:0x08fa, B:368:0x090e, B:367:0x090b, B:381:0x092f, B:380:0x092c, B:388:0x0944, B:389:0x0974, B:408:0x09a8, B:407:0x09a5, B:443:0x09f8, B:442:0x09f5, B:444:0x09f9, B:445:0x0a0e, B:452:0x0a1e, B:451:0x0a1b, B:459:0x0a2e, B:458:0x0a2b), top: B:556:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0a53 A[Catch: all -> 0x0a6e, TryCatch #49 {all -> 0x0a6e, blocks: (B:335:0x08c4, B:334:0x08c1, B:472:0x0a42, B:474:0x0a4c, B:475:0x0a4f, B:477:0x0a53, B:478:0x0a66, B:479:0x0a6d, B:342:0x08d5, B:341:0x08d2, B:361:0x08fd, B:360:0x08fa, B:368:0x090e, B:367:0x090b, B:381:0x092f, B:380:0x092c, B:388:0x0944, B:389:0x0974, B:408:0x09a8, B:407:0x09a5, B:443:0x09f8, B:442:0x09f5, B:444:0x09f9, B:445:0x0a0e, B:452:0x0a1e, B:451:0x0a1b, B:459:0x0a2e, B:458:0x0a2b), top: B:556:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x08dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0767 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0256 A[Catch: all -> 0x0930, IOException -> 0x0939, IllegalStateException -> 0x093b, TryCatch #64 {IOException -> 0x0939, IllegalStateException -> 0x093b, all -> 0x0930, blocks: (B:67:0x0250, B:71:0x025e, B:77:0x0282, B:140:0x0435, B:173:0x04d1, B:250:0x06b2, B:252:0x06cc, B:255:0x06e8, B:257:0x0715, B:274:0x074c, B:306:0x07f4, B:308:0x0802, B:310:0x081c, B:312:0x0824, B:316:0x0831, B:318:0x0835, B:321:0x0844, B:323:0x0874, B:325:0x0878, B:320:0x083e, B:265:0x0723, B:264:0x0720, B:272:0x072e, B:271:0x072b, B:273:0x072f, B:70:0x0256, B:65:0x0247), top: B:595:0x0247 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d8  */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v5, types: [eieu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(final defpackage.cqwt r53) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqxk.d(cqwt):boolean");
    }
}
