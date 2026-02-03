package defpackage;

import android.media.AudioFormat;
import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwp implements euwj, euvx {
    private static final String c = "euwp";
    public final euwo a;
    public boolean b;
    private euwr d;
    private euxy e;
    private int f = 0;
    private int g;

    public euwp(Object obj) {
        this.a = new euwo(obj);
    }

    @Override // defpackage.euvx
    public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        euwr euwrVar;
        if (this.b && (euwrVar = this.d) != null && euwrVar.e) {
            euwrVar.a(byteBuffer, j, audioFormat);
        }
    }

    public final synchronized void b() {
        ejwl.a(this.b);
        Log.d(c, "stopRecordingVideo");
        this.b = false;
        euwr euwrVar = this.d;
        if (euwrVar != null && euwrVar.e) {
            euwrVar.e = false;
            Object obj = euwrVar.b;
            synchronized (obj) {
                while (euwrVar.c > 0) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        Log.e(euwr.a, "Exception: ", e);
                    }
                }
            }
        }
        this.a.b();
        this.e.b();
    }

    public final synchronized void c(String str, int i, int i2, int i3, boolean z) {
        try {
            this.e = new euxy(str);
            Surface surface = null;
            if (i3 > 0) {
                euwr euwrVar = new euwr(this.e, i3, z);
                this.d = euwrVar;
                if (!euwrVar.d) {
                    Log.e(c, "AudioRecorder failed to add audio track to file.");
                    this.d = null;
                }
            }
            euwo euwoVar = this.a;
            euxy euxyVar = this.e;
            euwoVar.g = euxyVar;
            euwoVar.b = i;
            euwoVar.c = i2;
            int i4 = euwoVar.o;
            ejwl.a(euxyVar.d != null);
            euya euyaVar = euxyVar.b;
            if (euyaVar != null) {
                surface = euyaVar.n;
            } else {
                try {
                    euxyVar.b = new euya(euxyVar, i, i2, i4);
                    surface = euxyVar.b.n;
                } catch (RuntimeException unused) {
                    Log.d(euxy.a, "Failed to create video track encoder");
                }
            }
            euwoVar.h = surface;
            this.f = 0;
            this.g = 0;
            euwr euwrVar2 = this.d;
            if (euwrVar2 != null) {
                euwrVar2.e = true;
                euwrVar2.c = 0;
            }
            this.a.c();
            this.b = true;
        } catch (IOException e) {
            Log.e(c, "Failed to create Mp4Encoder!", e);
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.euwj
    public final void ht(TextureFrame textureFrame) {
        if (!this.b) {
            textureFrame.release();
            return;
        }
        euwo euwoVar = this.a;
        if (!euwoVar.e) {
            textureFrame.release();
            return;
        }
        int i = this.g + 1;
        this.g = i;
        if (i <= 0) {
            textureFrame.release();
        } else {
            this.f++;
            euwoVar.ht(textureFrame);
        }
    }
}
