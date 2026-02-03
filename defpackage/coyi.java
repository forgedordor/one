package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coyi extends coyk {
    public final covb a;

    public coyi(covb covbVar) {
        this.a = covbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof coyi) && fdbq.f(this.a, ((coyi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(fileUploadResult=" + this.a + ")";
    }
}
