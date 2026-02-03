package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evaa extends evad {
    public final Optional a;

    public evaa(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.evad
    public final Optional a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evad) {
            evad evadVar = (evad) obj;
            if (this.a.equals(evadVar.a())) {
                evadVar.b();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003;
    }

    public final String toString() {
        return "ImageProcessingOptions{regionOfInterest=" + this.a.toString() + ", rotationDegrees=0}";
    }

    @Override // defpackage.evad
    public final void b() {
    }
}
