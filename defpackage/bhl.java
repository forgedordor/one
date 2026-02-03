package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhl extends bmi {
    public final bjz a;
    private final List b;
    private final int c;
    private final azv d;

    public bhl(bjz bjzVar, List list, int i, azv azvVar) {
        this.a = bjzVar;
        this.b = list;
        this.c = i;
        this.d = azvVar;
    }

    @Override // defpackage.bmi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.bmi
    public final azv b() {
        return this.d;
    }

    @Override // defpackage.bmi
    public final bjz c() {
        return this.a;
    }

    @Override // defpackage.bmi
    public final List d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmi) {
            bmi bmiVar = (bmi) obj;
            if (this.a.equals(bmiVar.c()) && this.b.equals(bmiVar.d())) {
                bmiVar.e();
                if (this.c == bmiVar.a()) {
                    bmiVar.f();
                    if (this.d.equals(bmiVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((~((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=-1, dynamicRange=" + this.d + "}";
    }

    @Override // defpackage.bmi
    public final void e() {
    }

    @Override // defpackage.bmi
    public final void f() {
    }
}
