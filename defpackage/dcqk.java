package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcqk extends dcqo {
    public final File a;
    public final File b;
    public final File c;

    public dcqk(File file, File file2, File file3) {
        this.a = file;
        this.b = file2;
        this.c = file3;
    }

    @Override // defpackage.dcqo
    public final File a() {
        return this.b;
    }

    @Override // defpackage.dcqo
    public final File b() {
        return this.c;
    }

    @Override // defpackage.dcqo
    public final File c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcqo) {
            dcqo dcqoVar = (dcqo) obj;
            if (this.a.equals(dcqoVar.c()) && this.b.equals(dcqoVar.a()) && this.c.equals(dcqoVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        File file = this.c;
        File file2 = this.b;
        return "DiskVmCacheEntry{vmApkFile=" + this.a.toString() + ", optDir=" + file2.toString() + ", touchFile=" + file.toString() + "}";
    }
}
