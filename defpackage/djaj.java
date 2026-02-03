package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djaj {
    public final boolean a;
    public final fdae b;
    public final fdae c;

    public djaj() {
        this(true, new fdae() { // from class: djai
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djaj)) {
            return false;
        }
        djaj djajVar = (djaj) obj;
        return this.a == djajVar.a && fdbq.f(this.b, djajVar.b) && fdbq.f(this.c, djajVar.c);
    }

    public final int hashCode() {
        int iHashCode = ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
        fdae fdaeVar = this.c;
        return (iHashCode * 31) + (fdaeVar == null ? 0 : fdaeVar.hashCode());
    }

    public final String toString() {
        return "CameraGalleryInputUiData(isEnabled=" + this.a + ", onLongPress=" + this.b + ", onShowCameraGalleryButton=" + this.c + ")";
    }

    public djaj(boolean z, fdae fdaeVar, fdae fdaeVar2) {
        fdaeVar.getClass();
        this.a = z;
        this.b = fdaeVar;
        this.c = fdaeVar2;
    }
}
