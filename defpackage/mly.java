package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
class mly extends mjg {
    private final met d;

    public mly(Context context, boolean z) throws mcw {
        super(z, 2);
        try {
            met metVar = new met(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_transformation_es2.glsl");
            this.d = metVar;
            float[] fArrB = mev.B();
            metVar.g("uTexTransformationMatrix", fArrB);
            metVar.g("uTransformationMatrix", fArrB);
            metVar.g("uRgbMatrix", fArrB);
            metVar.k(mev.C());
        } catch (IOException | meu e) {
            throw mcw.a(e);
        }
    }

    @Override // defpackage.mjg
    public final mft a(int i, int i2) {
        return new mft(i, i2);
    }

    @Override // defpackage.mjg
    public final void b(int i, long j) throws mcw {
        try {
            met metVar = this.d;
            metVar.j();
            metVar.i("uTexSampler", i, 0);
            metVar.d();
            GLES20.glDrawArrays(5, 0, 4);
        } catch (meu e) {
            throw mcw.a(e);
        }
    }

    @Override // defpackage.mjg, defpackage.mmk
    public final void e() throws mcw {
        super.e();
        try {
            this.d.e();
        } catch (meu e) {
            throw new mcw(e);
        }
    }
}
