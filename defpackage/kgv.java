package defpackage;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgv extends CharacterStyle implements UpdateAppearance {
    public final ikm a;
    public final hox b = new hpl(new ihz(9205357640488583168L), hsi.a);
    private final float c;
    private final hsf d;

    public kgv(ikm ikmVar, float f) {
        this.a = ikmVar;
        this.c = f;
        fdae fdaeVar = new fdae() { // from class: kgu
            @Override // defpackage.fdae
            public final Object invoke() {
                kgv kgvVar = this.a;
                if (kgvVar.a() == 9205357640488583168L || ihz.g(kgvVar.a())) {
                    return null;
                }
                return kgvVar.a.b(kgvVar.a());
            }
        };
        hxn hxnVar = hrp.a;
        this.d = new hnt(fdaeVar, null);
    }

    public final long a() {
        return ((ihz) this.b.a()).a;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kgd.a(textPaint, this.c);
        textPaint.setShader((Shader) this.d.a());
    }
}
