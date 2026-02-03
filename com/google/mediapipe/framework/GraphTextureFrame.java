package com.google.mediapipe.framework;

import defpackage.ekrd;
import defpackage.ekrg;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class GraphTextureFrame implements TextureFrame {
    private static final ekrg c = ekrg.c("com/google/mediapipe/framework/GraphTextureFrame");
    public final int a;
    public final int b;
    private long d;
    private final int e;
    private long f;
    private final Set g = new HashSet();
    private int h = 1;

    public GraphTextureFrame(long j, long j2) {
        this.f = Long.MIN_VALUE;
        this.d = j;
        this.e = nativeGetTextureName(j);
        this.a = nativeGetWidth(this.d);
        this.b = nativeGetHeight(this.d);
        this.f = j2;
    }

    private native long nativeCreateSyncTokenForCurrentExternalContext(long j);

    private native void nativeDidRead(long j, long j2);

    private native long nativeGetCurrentExternalContextHandle();

    private native int nativeGetHeight(long j);

    private native int nativeGetTextureName(long j);

    private native int nativeGetWidth(long j);

    private native void nativeReleaseBuffer(long j);

    protected final void finalize() {
        if (this.h > 0 || this.d != 0) {
            ((ekrd) ((ekrd) c.j()).h("com/google/mediapipe/framework/GraphTextureFrame", "finalize", 179, "GraphTextureFrame.java")).q("release was not called before finalize");
        }
        if (this.g.isEmpty()) {
            return;
        }
        ((ekrd) ((ekrd) c.j()).h("com/google/mediapipe/framework/GraphTextureFrame", "finalize", 182, "GraphTextureFrame.java")).q("active consumers did not release with sync before finalize");
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.b;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized int getTextureName() {
        if (this.d == 0) {
            return 0;
        }
        long jNativeGetCurrentExternalContextHandle = nativeGetCurrentExternalContextHandle();
        if (jNativeGetCurrentExternalContextHandle != 0) {
            this.g.add(Long.valueOf(jNativeGetCurrentExternalContextHandle));
        }
        return this.e;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.f;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void release() {
        long jNativeGetCurrentExternalContextHandle = nativeGetCurrentExternalContextHandle();
        if (jNativeGetCurrentExternalContextHandle == 0) {
            if (!this.g.isEmpty()) {
                ((ekrd) ((ekrd) c.j()).h("com/google/mediapipe/framework/GraphTextureFrame", "release", 130, "GraphTextureFrame.java")).q("GraphTextureFrame is being released on non GL thread while having active consumers, which may lead to external / internal GL contexts synchronization issues.");
            }
            jNativeGetCurrentExternalContextHandle = 0;
        }
        GraphGlSyncToken graphGlSyncToken = null;
        if (jNativeGetCurrentExternalContextHandle != 0 && this.g.remove(Long.valueOf(jNativeGetCurrentExternalContextHandle))) {
            graphGlSyncToken = new GraphGlSyncToken(nativeCreateSyncTokenForCurrentExternalContext(this.d));
        }
        release(graphGlSyncToken);
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final synchronized void retain() {
        this.h++;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final boolean supportsRetain() {
        return true;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final synchronized void release(GlSyncToken glSyncToken) {
        if (this.d != 0) {
            if (glSyncToken != null) {
                nativeDidRead(this.d, glSyncToken.nativeToken());
                glSyncToken.release();
            }
            int i = this.h - 1;
            this.h = i;
            if (i <= 0) {
                nativeReleaseBuffer(this.d);
                this.d = 0L;
            }
        } else if (glSyncToken != null) {
            ((ekrd) ((ekrd) c.j()).h("com/google/mediapipe/framework/GraphTextureFrame", "release", 155, "GraphTextureFrame.java")).q("release with sync token, but handle is 0");
        }
    }
}
