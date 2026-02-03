package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgf implements mbs {
    public final int a;

    public mgf(int i) {
        this.a = i;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ mau a() {
        return null;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mgf) && this.a == ((mgf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }

    @Override // defpackage.mbs
    public final /* synthetic */ void b(mbq mbqVar) {
    }
}
