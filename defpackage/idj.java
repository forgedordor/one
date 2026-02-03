package defpackage;

/* compiled from: PG */
@fdac
/* loaded from: classes.dex */
public final class idj {
    public final int a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof idj)) {
            return false;
        }
        int i = ((idj) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=1)";
    }
}
