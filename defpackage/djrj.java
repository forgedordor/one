package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrj implements dkgq {
    public final List a;
    public final djri b;
    public final boolean c;
    private final fdae d;
    private final String e = null;
    private final fdae f = new fdae() { // from class: djrg
        @Override // defpackage.fdae
        public final Object invoke() {
            return false;
        }
    };

    public djrj(List list, djri djriVar, boolean z, fdae fdaeVar) {
        this.a = list;
        this.b = djriVar;
        this.c = z;
        this.d = fdaeVar;
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.f;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djrj)) {
            return false;
        }
        djrj djrjVar = (djrj) obj;
        if (!fdbq.f(this.a, djrjVar.a) || !fdbq.f(this.b, djrjVar.b) || this.c != djrjVar.c || !fdbq.f(this.d, djrjVar.d)) {
            return false;
        }
        String str = djrjVar.e;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "GalleryBubbleUiData(mediaItems=" + this.a + ", flags=" + this.b + ", isHighlighted=" + this.c + ", onLayout=" + this.d + ", contentDescription=null)";
    }
}
