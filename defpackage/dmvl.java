package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmvl implements dmvm {
    public final fdvc a;
    public final fdap b;
    public final fdae c;
    public final fdpl d;
    public final fdap e;
    public final boolean f;
    private final fdpl g;

    public dmvl(fdpl fdplVar, fdvc fdvcVar, fdap fdapVar, fdae fdaeVar, fdpl fdplVar2, fdap fdapVar2, boolean z) {
        fdplVar2.getClass();
        this.g = fdplVar;
        this.a = fdvcVar;
        this.b = fdapVar;
        this.c = fdaeVar;
        this.d = fdplVar2;
        this.e = fdapVar2;
        this.f = z;
    }

    @Override // defpackage.dmvm
    public final fdpl a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmvl)) {
            return false;
        }
        dmvl dmvlVar = (dmvl) obj;
        return fdbq.f(this.g, dmvlVar.g) && fdbq.f(this.a, dmvlVar.a) && fdbq.f(this.b, dmvlVar.b) && fdbq.f(this.c, dmvlVar.c) && fdbq.f(this.d, dmvlVar.d) && fdbq.f(this.e, dmvlVar.e) && this.f == dmvlVar.f;
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + (true != this.f ? 1237 : 1231);
    }

    public final String toString() {
        return "InApp(titleFlow=" + this.g + ", selectedMedia=" + this.a + ", prepareSystemContentPicker=" + this.b + ", launchSystemContentPicker=" + this.c + ", galleryMedia=" + this.d + ", onGalleryItemClick=" + this.e + ", shouldAskForPermission=" + this.f + ")";
    }
}
