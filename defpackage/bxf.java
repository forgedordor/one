package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxf extends bxk {
    public final bxe a;

    public bxf(bxe bxeVar) {
        super(bxeVar);
        this.a = bxeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bxf) {
            return this.a.equals(((bxf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
