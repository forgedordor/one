package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxw {
    private static final FloatBuffer a = euxv.b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    private int c;
    private int d;
    private int b = 0;
    private final float[] e = new float[16];

    static {
        euxv.b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    }

    public final void a() {
        GLES20.glDeleteProgram(this.b);
    }

    public final void b(int i) {
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        euxv.c("glActiveTexture");
        GLES20.glBindTexture(3553, i);
        euxv.c("glBindTexture");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        euxv.c("glTexParameteri");
        GLES20.glUseProgram(this.b);
        euxv.c("glUseProgram");
        GLES20.glUniform1i(this.c, 0);
        euxv.c("glUniform1i");
        GLES20.glUniformMatrix4fv(this.d, 1, false, this.e, 0);
        euxv.c("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) euxp.a);
        GLES20.glEnableVertexAttribArray(2);
        GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) a);
        euxv.c("program setup");
        GLES20.glDrawArrays(5, 0, 4);
        euxv.c("glDrawArrays");
        GLES20.glBindTexture(3553, 0);
        euxv.c("glBindTexture");
        GLES20.glFlush();
    }

    public final void c() {
        HashMap map = new HashMap();
        map.put("position", 1);
        map.put("texture_coordinate", 2);
        int iD = euxv.d("varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", map);
        this.b = iD;
        this.c = GLES20.glGetUniformLocation(iD, "video_frame");
        this.d = GLES20.glGetUniformLocation(this.b, "texture_transform");
        euxv.c("glGetUniformLocation");
        Matrix.setIdentityM(this.e, 0);
    }
}
