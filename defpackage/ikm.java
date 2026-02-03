package defpackage;

import android.graphics.Shader;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ikm extends iiy {
    private Shader a;
    private long b = 9205357640488583168L;

    @Override // defpackage.iiy
    public final void a(long j, ikb ikbVar, float f) {
        Shader shaderB = this.a;
        if (shaderB == null || !ihz.f(this.b, j)) {
            if (ihz.g(j)) {
                shaderB = null;
                this.a = null;
                this.b = 9205357640488583168L;
            } else {
                shaderB = b(j);
                this.a = shaderB;
                this.b = j;
            }
        }
        long jG = ikbVar.g();
        long j2 = ije.a;
        if (!fcts.a(jG, j2)) {
            ikbVar.k(j2);
        }
        if (!fdbq.f(((iii) ikbVar).c, shaderB)) {
            ikbVar.n(shaderB);
        }
        if (ikbVar.a() == f) {
            return;
        }
        ikbVar.i(f);
    }

    public abstract Shader b(long j);
}
