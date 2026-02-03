package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdc {
    public final int a = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agdc)) {
            return false;
        }
        int i = ((agdc) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return "HomeArguments(eventSource=MULTI_SHARE)";
    }
}
