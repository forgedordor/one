package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aysb {
    public final File a;
    private final aiaa b;

    public aysb(File file, aiaa aiaaVar) {
        file.getClass();
        aiaaVar.getClass();
        this.a = file;
        this.b = aiaaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aysb)) {
            return false;
        }
        aysb aysbVar = (aysb) obj;
        return fdbq.f(this.a, aysbVar.a) && fdbq.f(this.b, aysbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Backup(backupDbFile=" + this.a + ", metadata=" + this.b + ")";
    }
}
