package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covb {
    public final aucl a;
    public final Optional b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public covb(aucl auclVar) {
        this(auclVar, Optional.empty());
        auclVar.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof covb)) {
            return false;
        }
        covb covbVar = (covb) obj;
        return fdbq.f(this.a, covbVar.a) && fdbq.f(this.b, covbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FileUploadResult(fileUploadResponse=" + this.a + ", thumbnailError=" + this.b + ")";
    }

    public covb(aucl auclVar, Optional optional) {
        auclVar.getClass();
        this.a = auclVar;
        this.b = optional;
    }
}
