package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class met {
    public final Map a;
    public boolean b;
    private final int c;
    private final mer[] d;
    private final mes[] e;
    private final Map f;

    public met(Context context, String str, String str2) {
        this(mgb.P(context, str), mgb.P(context, str2));
    }

    public static int b(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static void l(int i, int i2, String str) throws meu {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        mev.n(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        mev.m();
    }

    public final int a(String str) {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        mev.m();
        return iGlGetAttribLocation;
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.c, str);
    }

    public final void d() {
        int i = 0;
        while (true) {
            mer[] merVarArr = this.d;
            if (i >= merVarArr.length) {
                for (mes mesVar : this.e) {
                    boolean z = this.b;
                    int i2 = mesVar.c;
                    if (i2 == 5124) {
                        GLES20.glUniform1iv(mesVar.b, 1, mesVar.e, 0);
                        mev.m();
                    } else if (i2 == 5126) {
                        GLES20.glUniform1fv(mesVar.b, 1, mesVar.d, 0);
                        mev.m();
                    } else if (i2 == 35678 || i2 == 35815 || i2 == 36198) {
                        if (mesVar.f == 0) {
                            throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                        }
                        GLES20.glActiveTexture(mesVar.g + 33984);
                        mev.m();
                        int i3 = i2 == 35678 ? 3553 : 36197;
                        int i4 = mesVar.f;
                        int i5 = 9729;
                        if (i2 != 35678 && z) {
                            i5 = 9728;
                        }
                        mev.l(i3, i4, i5);
                        if (i2 == 35678) {
                            if (mesVar.h == 9987) {
                                GLES20.glGenerateMipmap(3553);
                                mev.m();
                            }
                            GLES20.glTexParameteri(3553, 10241, mesVar.h);
                            mev.m();
                        }
                        GLES20.glUniform1i(mesVar.b, mesVar.g);
                        mev.m();
                    } else {
                        switch (i2) {
                            case 35664:
                                GLES20.glUniform2fv(mesVar.b, 1, mesVar.d, 0);
                                mev.m();
                                break;
                            case 35665:
                                GLES20.glUniform3fv(mesVar.b, 1, mesVar.d, 0);
                                mev.m();
                                break;
                            case 35666:
                                GLES20.glUniform4fv(mesVar.b, 1, mesVar.d, 0);
                                mev.m();
                                break;
                            case 35667:
                                GLES20.glUniform2iv(mesVar.b, 1, mesVar.e, 0);
                                mev.m();
                                break;
                            case 35668:
                                GLES20.glUniform3iv(mesVar.b, 1, mesVar.e, 0);
                                mev.m();
                                break;
                            case 35669:
                                GLES20.glUniform4iv(mesVar.b, 1, mesVar.e, 0);
                                mev.m();
                                break;
                            default:
                                switch (i2) {
                                    case 35675:
                                        GLES20.glUniformMatrix3fv(mesVar.b, 1, false, mesVar.d, 0);
                                        mev.m();
                                        break;
                                    case 35676:
                                        GLES20.glUniformMatrix4fv(mesVar.b, 1, false, mesVar.d, 0);
                                        mev.m();
                                        break;
                                    default:
                                        throw new IllegalStateException(a.g(i2, "Unexpected uniform type: "));
                                }
                        }
                    }
                }
                return;
            }
            mer merVar = merVarArr[i];
            Buffer buffer = merVar.c;
            if (buffer == null) {
                throw new NullPointerException("call setBuffer before bind");
            }
            GLES20.glBindBuffer(34962, 0);
            int i6 = merVar.b;
            GLES20.glVertexAttribPointer(i6, merVar.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(i6);
            mev.m();
            i++;
        }
    }

    public final void e() {
        GLES20.glDeleteProgram(this.c);
        mev.m();
    }

    public final void f(String str, float f) {
        mes mesVar = (mes) this.a.get(str);
        mee.f(mesVar);
        mesVar.d[0] = f;
    }

    public final void g(String str, float[] fArr) {
        mes mesVar = (mes) this.a.get(str);
        mee.f(mesVar);
        mesVar.a(fArr);
    }

    public final void h(String str, int i) {
        mes mesVar = (mes) this.a.get(str);
        mee.f(mesVar);
        mesVar.e[0] = i;
    }

    public final void i(String str, int i, int i2) {
        mes mesVar = (mes) this.a.get(str);
        mee.f(mesVar);
        mesVar.b(i, i2);
    }

    public final void j() {
        GLES20.glUseProgram(this.c);
        mev.m();
    }

    public final void k(float[] fArr) {
        mer merVar = (mer) this.f.get("aFramePosition");
        mee.f(merVar);
        merVar.c = mev.k(fArr);
        merVar.d = 4;
    }

    public met(String str, String str2) throws meu {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.c = iGlCreateProgram;
        mev.m();
        l(iGlCreateProgram, 35633, str);
        l(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        mev.n(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(iGlCreateProgram))));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.d = new mer[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.c;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, b(bArr));
            mer merVar = new mer(str3, GLES20.glGetAttribLocation(i2, str3));
            this.d[i] = merVar;
            this.f.put(merVar.a, merVar);
        }
        this.a = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.c, 35718, iArr4, 0);
        this.e = new mes[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.c;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, b(bArr2));
            mes mesVar = new mes(str4, GLES20.glGetUniformLocation(i5, str4), iArr6[0]);
            this.e[i4] = mesVar;
            this.a.put(mesVar.a, mesVar);
        }
        mev.m();
    }
}
