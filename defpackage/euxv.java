package defpackage;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxv {
    private static final ekrg a = ekrg.c("com/google/mediapipe/glutil/ShaderUtil");

    public static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        ((ekrd) ((ekrd) a.i()).h("com/google/mediapipe/glutil/ShaderUtil", "loadShader", 46, "ShaderUtil.java")).w("Could not compile shader %d: %s", i, GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public static FloatBuffer b(float... fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static void c(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new euxu(str + ": GL error: 0x" + Integer.toHexString(iGlGetError), null);
    }

    public static int d(String str, Map map) {
        int iA;
        int iA2 = a(35633, "uniform mat4 texture_transform;\nattribute vec4 position;\nattribute mediump vec4 texture_coordinate;\nvarying mediump vec2 sample_coordinate;\n\nvoid main() {\n  gl_Position = position;\n  sample_coordinate = (texture_transform * texture_coordinate).xy;\n}");
        if (iA2 == 0 || (iA = a(35632, str)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            ((ekrd) ((ekrd) a.i()).h("com/google/mediapipe/glutil/ShaderUtil", "createProgram", 77, "ShaderUtil.java")).q("Could not create program");
            iGlCreateProgram = 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glAttachShader(iGlCreateProgram, iA);
        for (Map.Entry entry : map.entrySet()) {
            GLES20.glBindAttribLocation(iGlCreateProgram, ((Integer) entry.getValue()).intValue(), (String) entry.getKey());
        }
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        ((ekrd) ((ekrd) a.i()).h("com/google/mediapipe/glutil/ShaderUtil", "createProgram", 92, "ShaderUtil.java")).t("Could not link program: %s", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }
}
