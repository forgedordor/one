package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.os.Process;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwi {
    public final int a;
    public final int b;
    public final int c;
    public AudioRecord e;
    public AudioFormat f;
    private final int i;
    private final int j;
    private final int k;
    private Thread l;
    public long d = Long.MIN_VALUE;
    public boolean g = false;
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public euwi(int i, int i2) {
        this.a = i;
        this.i = i2;
        int i3 = i2 == 12 ? 2 : 1;
        int i4 = i3 + i3;
        this.b = i4;
        int minBufferSize = AudioRecord.getMinBufferSize(i, i2, 2);
        this.j = minBufferSize;
        int iCeil = (int) Math.ceil(((i4 * i) * 10000.0d) / 1000000.0d);
        this.c = iCeil;
        int iMax = Math.max(iCeil, minBufferSize);
        this.k = iMax + iMax;
    }

    public final void a(euvx euvxVar) {
        CopyOnWriteArraySet copyOnWriteArraySet = this.h;
        copyOnWriteArraySet.clear();
        copyOnWriteArraySet.add(euvxVar);
    }

    public final void b() throws UnsupportedOperationException, IllegalStateException {
        if (this.g) {
            return;
        }
        int i = this.a;
        int i2 = this.k;
        Log.d("MicrophoneHelper", a.z(i2, i, "AudioRecord(", ", ", ")"));
        this.f = new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(this.i).build();
        AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioSource(1).setAudioFormat(this.f).setBufferSizeInBytes(i2).build();
        this.e = audioRecordBuild;
        if (audioRecordBuild.getState() != 1) {
            this.e.release();
            Log.e("MicrophoneHelper", "AudioRecord could not open.");
        } else {
            this.l = new Thread(new Runnable() { // from class: euwh
                @Override // java.lang.Runnable
                public final void run() throws SecurityException, IOException, IllegalArgumentException {
                    long j;
                    Process.setThreadPriority(-16);
                    euwi euwiVar = this.a;
                    euwiVar.d = System.nanoTime();
                    int iLimit = 0;
                    while (euwiVar.g && euwiVar.e != null) {
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(euwiVar.c);
                        int i3 = 0;
                        while (i3 < byteBufferAllocateDirect.capacity()) {
                            try {
                                int i4 = euwiVar.e.read(byteBufferAllocateDirect, byteBufferAllocateDirect.capacity() - i3, 0);
                                if (i4 <= 0) {
                                    String str = "ERROR";
                                    if (i4 == -3) {
                                        str = "ERROR_INVALID_OPERATION";
                                    } else if (i4 == -2) {
                                        str = "ERROR_BAD_VALUE";
                                    } else if (i4 == -6) {
                                        str = "ERROR_DEAD_OBJECT";
                                    }
                                    throw new IOException("AudioRecord.read(...) failed due to ".concat(str));
                                }
                                i3 += i4;
                                byteBufferAllocateDirect.position(i3);
                            } catch (IOException e) {
                                Log.e("MicrophoneHelper", e.getMessage());
                            }
                        }
                        byteBufferAllocateDirect.position(0);
                        long j2 = iLimit;
                        long j3 = euwiVar.d;
                        euwiVar.e.getClass();
                        AudioTimestamp audioTimestamp = new AudioTimestamp();
                        int timestamp = euwiVar.e.getTimestamp(audioTimestamp, 0);
                        if (timestamp != 0) {
                            Log.e("MicrophoneHelper", a.g(timestamp, "audioRecord.getTimestamp failed with status: "));
                            audioTimestamp = null;
                        }
                        if (audioTimestamp != null) {
                            long j4 = audioTimestamp.framePosition;
                            long j5 = audioTimestamp.nanoTime;
                            j = j4;
                            j3 = j5;
                        } else {
                            j = 0;
                        }
                        long j6 = j3 + (((j2 - j) * 1000000000) / euwiVar.a);
                        if (iLimit == 0) {
                            iLimit = 0;
                        }
                        long j7 = j6 / 1000;
                        iLimit += byteBufferAllocateDirect.limit() / euwiVar.b;
                        if (euwiVar.g) {
                            Iterator it = euwiVar.h.iterator();
                            while (it.hasNext()) {
                                ((euvx) it.next()).a(byteBufferAllocateDirect, j7, euwiVar.f);
                            }
                        }
                    }
                }
            }, "microphoneHelperRecordingThread");
        }
        this.e.startRecording();
        if (this.e.getRecordingState() != 3) {
            Log.e("MicrophoneHelper", "AudioRecord couldn't start recording.");
            this.e.release();
        } else {
            this.g = true;
            this.l.start();
            Log.d("MicrophoneHelper", "AudioRecord is recording audio.");
        }
    }

    public final void c() throws IllegalStateException, InterruptedException {
        this.e.getClass();
        if (this.g) {
            this.g = false;
            try {
                Thread thread = this.l;
                if (thread != null) {
                    thread.join();
                }
            } catch (InterruptedException e) {
                Log.e("MicrophoneHelper", "Exception: ", e);
            }
            this.e.stop();
            if (this.e.getRecordingState() != 1) {
                Log.e("MicrophoneHelper", "AudioRecord.stop() didn't run properly.");
            }
        }
        AudioRecord audioRecord = this.e;
        audioRecord.getClass();
        if (!this.g) {
            audioRecord.release();
        }
        Log.d("MicrophoneHelper", "AudioRecord stopped recording audio.");
    }
}
