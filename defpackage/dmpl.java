package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmpl {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    public dmpl(boolean z) {
        this.a = false;
        this.b = z;
        this.c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmpl)) {
            return false;
        }
        dmpl dmplVar = (dmpl) obj;
        boolean z = dmplVar.a;
        if (this.b != dmplVar.b) {
            return false;
        }
        boolean z2 = dmplVar.c;
        return true;
    }

    public final int hashCode() {
        return (((dmpk.a(false) * 31) + dmpk.a(this.b)) * 31) + dmpk.a(false);
    }

    public final String toString() {
        return "FullScreenCameraContentConfiguration(enableScreenFlash=false, useTopAppBarComponent=" + this.b + ", enableCameraCujLogging=false)";
    }

    public dmpl() {
        this(false);
    }
}
