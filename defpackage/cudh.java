package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cudh {
    public final fdvc a;
    public final fdvc b;
    public final fdvc c;
    public final cudg d;
    private final boolean e;

    public cudh(fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, cudg cudgVar) {
        fdvcVar.getClass();
        fdvcVar2.getClass();
        fdvcVar3.getClass();
        this.a = fdvcVar;
        this.b = fdvcVar2;
        this.c = fdvcVar3;
        this.d = cudgVar;
        this.e = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cudh)) {
            return false;
        }
        cudh cudhVar = (cudh) obj;
        if (!fdbq.f(this.a, cudhVar.a) || !fdbq.f(this.b, cudhVar.b) || !fdbq.f(this.c, cudhVar.c) || !fdbq.f(this.d, cudhVar.d)) {
            return false;
        }
        boolean z = cudhVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + 1231;
    }

    public final String toString() {
        return "StartChatTopAppBarUiData(autoCompleteContactBarUiData=" + this.a + ", extendedTopAppBarUiData=" + this.b + ", simSelectorRowUiData=" + this.c + ", flags=" + this.d + ", focusTextField=true)";
    }
}
