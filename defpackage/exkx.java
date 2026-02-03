package defpackage;

import android.media.AudioFormat;
import android.util.Log;
import android.util.Size;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.TextureFrame;
import com.google.research.xeno.effect.Callbacks$StatusCallback;
import com.google.research.xeno.effect.Effect;
import com.google.research.xeno.effect.EventManager;
import com.google.research.xeno.effect.FilterProcessorBase;
import com.google.research.xeno.effect.InputFrameSource;
import com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback;
import com.google.research.xeno.effect.NativeCallbacks$PacketCallback;
import com.google.research.xeno.effect.UserInteractionManager;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exkx extends FilterProcessorBase implements euwj, euvx {
    public static final String b = "exkx";
    public static final Size c = new Size(-1, -1);

    public exkx(exkb exkbVar) {
        super(exkbVar);
        long jA = this.g.a();
        exiz exizVar = (exiz) exkbVar;
        long[] jArrE = eonh.e(exizVar.b);
        long j = exizVar.a;
        String str = exld.a;
        byte[] bArr = (byte[]) Optional.ofNullable(null).map(new Function() { // from class: exlc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((exkg) obj).toByteArray();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new byte[0]);
        final CopyOnWriteArraySet copyOnWriteArraySet = this.j;
        final CopyOnWriteArraySet copyOnWriteArraySet2 = this.h;
        NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback = new NativeCallbacks$PacketCallback() { // from class: exlb
            @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
            public final void process(Packet packet) {
                String str2 = exld.a;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    exkk exkkVar = (exkk) it.next();
                    packet.a();
                    exkkVar.c();
                }
                CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
                GraphTextureFrame graphTextureFrameA = PacketGetter.a(packet);
                Iterator it2 = copyOnWriteArraySet3.iterator();
                while (it2.hasNext()) {
                    euwj euwjVar = (euwj) it2.next();
                    GraphTextureFrame graphTextureFrameA2 = PacketGetter.a(packet);
                    euwjVar.ht(graphTextureFrameA2);
                    String str3 = exld.a;
                    if (Log.isLoggable(str3, 2)) {
                        Log.v(str3, String.format("Output tex: %d width: %d height: %d to consumer %h", Integer.valueOf(graphTextureFrameA2.getTextureName()), Integer.valueOf(graphTextureFrameA2.a), Integer.valueOf(graphTextureFrameA2.b), euwjVar));
                    }
                }
                graphTextureFrameA.release();
            }
        };
        final CopyOnWriteArraySet copyOnWriteArraySet3 = this.i;
        NativeCallbacks$PacketCallback nativeCallbacks$PacketCallback2 = new NativeCallbacks$PacketCallback() { // from class: exkz
            @Override // com.google.research.xeno.effect.NativeCallbacks$PacketCallback
            public final void process(Packet packet) {
                String str2 = exld.a;
                Iterator it = copyOnWriteArraySet3.iterator();
                while (it.hasNext()) {
                    ((euvx) it.next()).a(ByteBuffer.wrap(PacketGetter.nativeGetAudioData(packet.getNativeHandle())), packet.a(), new AudioFormat.Builder().setEncoding(2).setChannelMask(PacketGetter.nativeGetMatrixRows(packet.getNativeHandle()) == 2 ? 12 : 16).build());
                }
            }
        };
        final CopyOnWriteArraySet copyOnWriteArraySet4 = this.k;
        final exmr exmrVar = Effect.a;
        long jNativeNewVideoProcessor = nativeNewVideoProcessor(0, jA, 0L, jArrE, j, bArr, nativeCallbacks$PacketCallback, nativeCallbacks$PacketCallback2, new NativeCallbacks$AuxOutputCallback() { // from class: exla
            @Override // com.google.research.xeno.effect.NativeCallbacks$AuxOutputCallback
            public final void onOutput(Packet packet, String str2, long j2) {
                String str3 = exld.a;
                exmrVar.b(j2);
                Iterator it = copyOnWriteArraySet4.iterator();
                while (it.hasNext()) {
                    ((exkj) it.next()).a();
                }
            }
        });
        long jNativeGetUserInteractionManager = FilterProcessorBase.nativeGetUserInteractionManager(jNativeNewVideoProcessor);
        UserInteractionManager userInteractionManager = new UserInteractionManager();
        userInteractionManager.c = this;
        userInteractionManager.b = jNativeGetUserInteractionManager;
        FilterProcessorBase.nativeGetEventManager(jNativeNewVideoProcessor);
        int i = EventManager.a;
        this.d.writeLock().lock();
        try {
            this.f = jNativeNewVideoProcessor;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    @Override // defpackage.euvx
    public final void a(ByteBuffer byteBuffer, final long j, AudioFormat audioFormat) {
        final Packet packetCreate;
        if (audioFormat.getChannelCount() == 0) {
            Log.e(b, "Current AudioFormat's channel count is 0");
            return;
        }
        int iLimit = (byteBuffer.limit() / 2) / audioFormat.getChannelCount();
        AndroidPacketCreator androidPacketCreator = this.e;
        int channelCount = audioFormat.getChannelCount();
        int iRemaining = byteBuffer.remaining();
        int i = channelCount * iLimit;
        int i2 = i + i;
        if (i2 != iRemaining) {
            throw new IllegalArgumentException(a.s(iRemaining, i2, "Please check the audio data size, has to be num_channels * num_samples * 2 = ", " but was "));
        }
        if (byteBuffer.isDirect()) {
            packetCreate = Packet.create(androidPacketCreator.nativeCreateAudioPacketDirect(androidPacketCreator.a.a(), byteBuffer.slice(), channelCount, iLimit));
        } else {
            if (!byteBuffer.hasArray()) {
                throw new IllegalArgumentException("Data must be either a direct byte buffer or be backed by a byte array.");
            }
            packetCreate = Packet.create(androidPacketCreator.nativeCreateAudioPacket(androidPacketCreator.a.a(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), channelCount, iLimit));
        }
        hv(new exkn() { // from class: exkv
            @Override // defpackage.exkn
            public final void a(long j2) {
                String str = exkx.b;
                exkx.nativeSendVideoProcessorAudioPacket(j2, packetCreate.getNativeHandle(), j, new Callbacks$StatusCallback() { // from class: exkt
                    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
                    public final void onCompletion(boolean z, String str2) {
                        String str3 = exkx.b;
                        if (z) {
                            return;
                        }
                        Log.e(exkx.b, "Error sending video processor audio packet: ".concat(String.valueOf(str2)));
                    }
                });
            }
        });
        packetCreate.release();
    }

    public final void c(final InputFrameSource inputFrameSource, final Size size, final AudioFormat audioFormat, final Callbacks$StatusCallback callbacks$StatusCallback) {
        hv(new exkn() { // from class: exku
            @Override // defpackage.exkn
            public final void a(long j) {
                String str = exkx.b;
                Size size2 = size;
                long width = size2.getWidth();
                long height = size2.getHeight();
                AudioFormat audioFormat2 = audioFormat;
                int sampleRate = audioFormat2 == null ? 0 : audioFormat2.getSampleRate();
                int channelCount = audioFormat2 != null ? audioFormat2.getChannelCount() : 0;
                exkx.nativeStartVideoProcessing(j, inputFrameSource.e, width, height, sampleRate, channelCount, callbacks$StatusCallback);
            }
        });
    }

    public final void d() {
        e(null);
    }

    public final void e(final Callbacks$StatusCallback callbacks$StatusCallback) {
        hv(new exkn() { // from class: exkr
            @Override // defpackage.exkn
            public final void a(long j) {
                exkx.nativeStopVideoProcessing(j, callbacks$StatusCallback);
            }
        });
    }

    @Override // defpackage.euwj
    public final void ht(TextureFrame textureFrame) {
        final long timestamp = textureFrame.getTimestamp();
        AndroidPacketCreator androidPacketCreator = this.e;
        final Packet packetCreate = Packet.create(androidPacketCreator.nativeCreateGpuBuffer(androidPacketCreator.a.a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((exkk) it.next()).b();
        }
        hv(new exkn() { // from class: exkw
            @Override // defpackage.exkn
            public final void a(long j) {
                long nativeHandle = packetCreate.getNativeHandle();
                final exkx exkxVar = this.a;
                exkx.nativeSendVideoProcessorFramePacket(j, nativeHandle, timestamp, new Callbacks$StatusCallback() { // from class: exks
                    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
                    public final void onCompletion(boolean z, String str) {
                        if (z) {
                            return;
                        }
                        Iterator it2 = exkxVar.j.iterator();
                        while (it2.hasNext()) {
                            ((exkk) it2.next()).a();
                        }
                        Log.e(exkx.b, "Error sending video processor frame packet: ".concat(String.valueOf(str)));
                    }
                });
            }
        });
        packetCreate.release();
    }
}
