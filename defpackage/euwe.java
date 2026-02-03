package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.mediapipe.framework.GlSyncToken;
import j$.time.Duration;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwe extends euxt implements SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture a;
    public volatile SurfaceTexture b;
    public final List c;
    public volatile boolean d;
    public final Queue e;
    public int f;
    public euxs g;
    public final boolean h;
    public long i;
    public long j;
    public boolean k;
    protected int l;
    protected int m;
    public final euwc n;
    private int[] t;
    private final int u;

    public euwe(EGLContext eGLContext) {
        super(eGLContext);
        this.a = null;
        this.b = null;
        this.t = null;
        this.d = false;
        this.e = new ArrayDeque();
        this.f = 0;
        this.g = null;
        this.h = true;
        Duration duration = Duration.ZERO;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.u = 2;
        this.g = new euxs();
        this.c = new ArrayList();
        this.n = new euwc(this);
    }

    public static void g(euwy euwyVar) {
        GLES20.glDeleteTextures(1, new int[]{euwyVar.b}, 0);
    }

    public static final void h(euwy euwyVar) {
        GlSyncToken glSyncToken;
        try {
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(euwyVar.b), Integer.valueOf(euwyVar.c), Integer.valueOf(euwyVar.d), Long.valueOf(euwyVar.e)));
            }
            synchronized (euwyVar) {
                while (euwyVar.f && euwyVar.g == null) {
                    euwyVar.wait();
                }
                glSyncToken = euwyVar.g;
                if (glSyncToken != null) {
                    euwyVar.f = false;
                    euwyVar.g = null;
                } else {
                    glSyncToken = null;
                }
            }
            if (glSyncToken != null) {
                glSyncToken.waitOnGpu();
                glSyncToken.release();
            }
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Finished waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(euwyVar.b), Integer.valueOf(euwyVar.c), Integer.valueOf(euwyVar.d), Long.valueOf(euwyVar.e)));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    public final euwd a() {
        int i = this.l;
        int i2 = this.m;
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        euxv.c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        euxv.c("texture setup");
        int i3 = iArr[0];
        Log.d("ExternalTextureConv", String.format("Created output texture: %d width: %d height: %d", Integer.valueOf(i3), Integer.valueOf(this.l), Integer.valueOf(this.m)));
        j(i3, this.l, this.m);
        return new euwd(this, i3, this.l, this.m);
    }

    protected final synchronized void b(euwd euwdVar) {
        Queue queue = this.e;
        queue.offer(euwdVar);
        int i = this.f - 1;
        this.f = i;
        int iMax = Math.max(this.u - i, 0);
        while (queue.size() > iMax) {
            final euwd euwdVar2 = (euwd) queue.remove();
            this.q.post(new Runnable() { // from class: euwa
                @Override // java.lang.Runnable
                public final void run() {
                    euwe.g(euwdVar2);
                }
            });
        }
    }

    @Override // defpackage.euxt
    public final void c() {
        super.c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        euxs euxsVar = this.g;
        HashMap map = new HashMap();
        map.put("position", 1);
        map.put("texture_coordinate", 2);
        int iD = euxv.d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", map);
        euxsVar.c = iD;
        euxsVar.d = GLES20.glGetUniformLocation(iD, "video_frame");
        euxsVar.e = GLES20.glGetUniformLocation(euxsVar.c, "texture_transform");
        euxv.c("glGetUniformLocation");
        int[] iArr = new int[1];
        this.t = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.b = new SurfaceTexture(this.t[0]);
        f(this.b, 0, 0);
    }

    @Override // defpackage.euxt
    public final void d() {
        f(null, 0, 0);
        while (true) {
            Queue queue = this.e;
            if (queue.isEmpty()) {
                break;
            } else {
                g((euwy) queue.remove());
            }
        }
        this.b.release();
        int[] iArr = this.t;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glDeleteProgram(this.g.c);
        super.d();
    }

    public final void e(int i, int i2) {
        this.l = i;
        this.m = i2;
    }

    public final void f(SurfaceTexture surfaceTexture, int i, int i2) {
        this.d = false;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(null);
        }
        this.a = surfaceTexture;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(this);
        }
        e(i, i2);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.q.post(new Runnable() { // from class: euwb
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r5v6 */
            @Override // java.lang.Runnable
            public final void run() {
                euwd euwdVarA;
                char c;
                euwj euwjVar;
                long j;
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                euwe euweVar = this.a;
                if (surfaceTexture2 != euweVar.a) {
                    return;
                }
                euweVar.d = true;
                List<euwj> list = euweVar.c;
                synchronized (list) {
                    ?? r5 = 0;
                    boolean z = false;
                    for (euwj euwjVar2 : list) {
                        synchronized (euweVar) {
                            euwdVarA = (euwd) euweVar.e.poll();
                            euweVar.f++;
                        }
                        if (euwdVarA == null) {
                            euwdVarA = euweVar.a();
                        } else if (euwdVarA.c == euweVar.l && euwdVarA.d == euweVar.m) {
                            euwe.h(euwdVarA);
                        } else {
                            euwe.h(euwdVarA);
                            euwe.g(euwdVarA);
                            euwdVarA = euweVar.a();
                        }
                        int i = euwdVarA.b;
                        euweVar.j(i, euweVar.l, euweVar.m);
                        euxs euxsVar = euweVar.g;
                        SurfaceTexture surfaceTexture3 = euweVar.a;
                        GLES20.glClear(16384);
                        GLES20.glActiveTexture(33984);
                        euxv.c("glActiveTexture");
                        surfaceTexture3.updateTexImage();
                        float[] fArr = euxsVar.f;
                        surfaceTexture3.getTransformMatrix(fArr);
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        euxv.c("glTexParameteri");
                        GLES20.glUseProgram(euxsVar.c);
                        euxv.c("glUseProgram");
                        GLES20.glUniform1i(euxsVar.d, r5);
                        euxv.c("glUniform1i");
                        GLES20.glUniformMatrix4fv(euxsVar.e, 1, r5, fArr, r5);
                        euxv.c("glUniformMatrix4fv");
                        GLES20.glEnableVertexAttribArray(1);
                        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) euxs.b);
                        GLES20.glEnableVertexAttribArray(2);
                        GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) euxs.a);
                        euxv.c("program setup");
                        GLES20.glDrawArrays(5, r5, 4);
                        euxv.c("glDrawArrays");
                        GLES20.glBindTexture(36197, r5);
                        euxv.c("glBindTexture");
                        boolean z2 = euxsVar.g;
                        GLES20.glFinish();
                        euwc euwcVar = euweVar.n;
                        Duration durationOfNanos = Duration.ofNanos(euweVar.a.getTimestamp());
                        euwe euweVar2 = euwcVar.a;
                        long nanos = durationOfNanos.toNanos() / 1000;
                        if (euweVar2.h && euweVar2.k) {
                            j = 1000;
                            long j2 = euweVar2.i + nanos;
                            c = r5;
                            euwjVar = euwjVar2;
                            long j3 = euweVar2.j;
                            if (j2 <= j3) {
                                euweVar2.i = (j3 + 1) - nanos;
                            }
                        } else {
                            c = r5;
                            euwjVar = euwjVar2;
                            j = 1000;
                        }
                        long nanos2 = Duration.ofNanos((nanos + euweVar2.i) * j).toNanos() / j;
                        euwdVarA.e = nanos2;
                        euweVar.j = nanos2;
                        euweVar.k = true;
                        if (euwjVar != null) {
                            if (Log.isLoggable("ExternalTextureConv", 2)) {
                                Integer numValueOf = Integer.valueOf(i);
                                Integer numValueOf2 = Integer.valueOf(euwdVarA.c);
                                Integer numValueOf3 = Integer.valueOf(euwdVarA.d);
                                Object[] objArr = new Object[3];
                                objArr[c] = numValueOf;
                                objArr[1] = numValueOf2;
                                objArr[2] = numValueOf3;
                                Log.v("ExternalTextureConv", String.format("Locking tex: %d width: %d height: %d", objArr));
                            }
                            synchronized (euwdVarA) {
                                GlSyncToken glSyncToken = euwdVarA.g;
                                if (glSyncToken != null) {
                                    glSyncToken.release();
                                    euwdVarA.g = null;
                                }
                                euwdVarA.f = true;
                            }
                            euwjVar.ht(euwdVarA);
                        }
                        z = true;
                        r5 = c;
                    }
                    if (!z) {
                        euweVar.a.updateTexImage();
                    }
                }
            }
        });
    }
}
