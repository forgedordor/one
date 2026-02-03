package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eddt extends edeb {
    private final drfl a;

    public eddt(drfl drflVar) {
        this.a = drflVar;
    }

    @Override // defpackage.edeb
    public final drfl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edeb) {
            return this.a.equals(((edeb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PhotoPickerFifeModel{fifeModel=" + this.a.toString() + "}";
    }
}
