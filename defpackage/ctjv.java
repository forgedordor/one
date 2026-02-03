package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjv {
    public final fdvc a;
    public final fdpl b;
    public final fdvc c;
    public final fdvc d;
    public final fdvc e;
    public final fdpl f;
    public final fdvc g;
    public final fdap h;
    public final fdat i;
    public final fdae j;
    public final ctju k;

    public ctjv(fdvc fdvcVar, fdpl fdplVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdpl fdplVar2, fdvc fdvcVar5, fdap fdapVar, fdat fdatVar, fdae fdaeVar, ctju ctjuVar) {
        fdvcVar.getClass();
        fdplVar.getClass();
        fdvcVar2.getClass();
        fdvcVar3.getClass();
        fdvcVar4.getClass();
        fdplVar2.getClass();
        fdvcVar5.getClass();
        ctjuVar.getClass();
        this.a = fdvcVar;
        this.b = fdplVar;
        this.c = fdvcVar2;
        this.d = fdvcVar3;
        this.e = fdvcVar4;
        this.f = fdplVar2;
        this.g = fdvcVar5;
        this.h = fdapVar;
        this.i = fdatVar;
        this.j = fdaeVar;
        this.k = ctjuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctjv)) {
            return false;
        }
        ctjv ctjvVar = (ctjv) obj;
        return fdbq.f(this.a, ctjvVar.a) && fdbq.f(this.b, ctjvVar.b) && fdbq.f(this.c, ctjvVar.c) && fdbq.f(this.d, ctjvVar.d) && fdbq.f(this.e, ctjvVar.e) && fdbq.f(this.f, ctjvVar.f) && fdbq.f(this.g, ctjvVar.g) && fdbq.f(this.h, ctjvVar.h) && fdbq.f(this.i, ctjvVar.i) && fdbq.f(this.j, ctjvVar.j) && fdbq.f(this.k, ctjvVar.k);
    }

    public final int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ContactListUiData(favoriteFlow=" + this.a + ", contactsFlow=" + this.b + ", headerIndexFlow=" + this.c + ", createGroupFlow=" + this.d + ", chatbotDirectoryFlow=" + this.e + ", penpalUiDataFlow=" + this.f + ", groupChatsFlow=" + this.g + ", onContactListScroll=" + this.h + ", onContactListInteractive=" + this.i + ", onActivateFastScroll=" + this.j + ", flags=" + this.k + ")";
    }
}
