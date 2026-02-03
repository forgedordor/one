package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlwg {
    public final String a;
    public final dlwd b;
    private final int c;

    public dlwg(String str, dlwd dlwdVar) {
        dlwdVar.getClass();
        this.a = str;
        this.c = 1;
        this.b = dlwdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlwg)) {
            return false;
        }
        dlwg dlwgVar = (dlwg) obj;
        if (!fdbq.f(this.a, dlwgVar.a)) {
            return false;
        }
        int i = dlwgVar.c;
        return fdbq.f(this.b, dlwgVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AttachmentSerializerMetadata(name=" + this.a + ", version=1, serializer=" + this.b + ")";
    }
}
