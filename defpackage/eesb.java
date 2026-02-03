package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesb extends lnx {
    private final int a;

    public eesb(int i) {
        this.a = i;
    }

    @Override // defpackage.lnx
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = eesc.B;
        float[] fArr = ((eesc) obj).z;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.lnx
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        eesc eescVar = (eesc) obj;
        int i = eesc.B;
        float[] fArr = eescVar.z;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                eefe eefeVar = eescVar.A;
                if (eefeVar != null) {
                    float fU = eescVar.u() * 0.11f;
                    MaterialButton materialButton = eefeVar.a;
                    int i3 = (int) fU;
                    if (materialButton.h != i3) {
                        materialButton.h = i3;
                        materialButton.m();
                        materialButton.invalidate();
                    }
                }
                eescVar.invalidateSelf();
            }
        }
    }
}
