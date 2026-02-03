package defpackage;

import com.google.mediapipe.framework.TextureFrame;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqzd implements euwj {
    public euwj a;
    long b = Long.MAX_VALUE;

    @Override // defpackage.euwj
    public final void ht(TextureFrame textureFrame) {
        euwj euwjVar = this.a;
        if (euwjVar == null) {
            textureFrame.release();
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        long timestamp = textureFrame.getTimestamp();
        long jMin = Math.min(this.b, jNanoTime - timestamp);
        this.b = jMin;
        euwjVar.ht(new dqze(textureFrame, timestamp + jMin));
    }
}
