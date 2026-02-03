package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaam implements dktt {
    public final fdat a;

    public aaam(fdat fdatVar) {
        this.a = fdatVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aaam) && fdbq.f(this.a, ((aaam) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReactionBottomSheetPickerUiLoader(content=" + this.a + ")";
    }
}
