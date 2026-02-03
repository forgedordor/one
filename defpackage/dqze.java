package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqze implements TextureFrame {
    private final long a;
    private final TextureFrame b;

    public dqze(TextureFrame textureFrame, long j) {
        this.b = textureFrame;
        this.a = j;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getHeight() {
        return this.b.getHeight();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getTextureName() {
        return this.b.getTextureName();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final long getTimestamp() {
        return this.a;
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final int getWidth() {
        return this.b.getWidth();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final void release() {
        this.b.release();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ void retain() {
        euxb.a();
    }

    @Override // com.google.mediapipe.framework.TextureFrame
    public final /* synthetic */ boolean supportsRetain() {
        return false;
    }

    @Override // com.google.mediapipe.framework.TextureFrame, com.google.mediapipe.framework.TextureReleaseCallback
    public final void release(GlSyncToken glSyncToken) {
        this.b.release(glSyncToken);
    }
}
