package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wel {
    public final fdvc a;
    public final hox b;
    public final fdvc c;
    public final fdvc d;
    public final dmvm e;
    public final wat f;
    private final boolean g = true;

    public wel(fdvc fdvcVar, hox hoxVar, fdvc fdvcVar2, wat watVar, fdvc fdvcVar3, dmvm dmvmVar) {
        this.a = fdvcVar;
        this.b = hoxVar;
        this.c = fdvcVar2;
        this.f = watVar;
        this.d = fdvcVar3;
        this.e = dmvmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wel)) {
            return false;
        }
        wel welVar = (wel) obj;
        if (!fdbq.f(this.a, welVar.a) || !fdbq.f(this.b, welVar.b) || !fdbq.f(this.c, welVar.c) || !fdbq.f(this.f, welVar.f) || !fdbq.f(this.d, welVar.d) || !fdbq.f(this.e, welVar.e)) {
            return false;
        }
        boolean z = welVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "DirectSendUiData(headerUiData=" + this.a + ", pagingState=" + this.b + ", attachedMedia=" + this.c + ", cameraUiData=" + this.f + ", directSendComposeRowHolderUiData=" + this.d + ", galleryUiData=" + this.e + ", dynamicallyOffsetPages=true)";
    }
}
