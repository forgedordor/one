package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class awd {
    public final InputConfiguration a;

    public awd(Object obj) {
        this.a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awd) {
            return Objects.equals(this.a, ((awd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
