package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buv extends buu {
    private int e;
    private int f;
    private int g;

    /* JADX WARN: Illegal instructions before constructor call */
    public buv(azv azvVar, btj btjVar) {
        String str = azvVar.a() ? buw.d : buw.c;
        try {
            String strA = btjVar.a();
            if (strA == null || !strA.contains("vTextureCoord") || !strA.contains("sTexture")) {
                throw new IllegalArgumentException("Invalid fragment shader");
            }
            super(str, strA);
            this.e = -1;
            this.f = -1;
            this.g = -1;
            super.d();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.a, "sTexture");
            this.e = iGlGetUniformLocation;
            buw.i(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.a, "aTextureCoord");
            this.g = iGlGetAttribLocation;
            buw.i(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.a, "uTexMatrix");
            this.f = iGlGetUniformLocation2;
            buw.i(iGlGetUniformLocation2, "uTexMatrix");
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
            }
            throw th;
        }
    }

    @Override // defpackage.buu
    public final void c() {
        super.c();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        buw.f("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) buw.k);
        buw.f("glVertexAttribPointer");
    }

    public final void e(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f, 1, false, fArr, 0);
        buw.f("glUniformMatrix4fv");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public buv(azv azvVar, but butVar) {
        btj btjVar;
        if (azvVar.a()) {
            boolean z = butVar != but.UNKNOWN;
            Objects.toString(butVar);
            lcg.b(z, "No default sampler shader available for".concat(String.valueOf(butVar)));
            if (butVar == but.YUV) {
                btjVar = buw.g;
            } else {
                btjVar = buw.f;
            }
        } else {
            btjVar = buw.e;
        }
        this(azvVar, btjVar);
    }
}
