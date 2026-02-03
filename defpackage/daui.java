package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daui {
    public final dauh a;
    public final ctcj b;
    public final boolean c;

    public daui(dauh dauhVar, ctcj ctcjVar, boolean z) {
        dauhVar.getClass();
        ctcjVar.getClass();
        this.a = dauhVar;
        this.b = ctcjVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof daui)) {
            return false;
        }
        daui dauiVar = (daui) obj;
        return this.a == dauiVar.a && this.b == dauiVar.b && this.c == dauiVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "LaunchPathData(launchPath=" + this.a + ", triggerSource=" + this.b + ", hasAccountOnDevice=" + this.c + ")";
    }
}
