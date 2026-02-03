package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcy implements afzv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/navigation/targets/ForwardMessage");
    public final amvr b;

    public agcy(amvr amvrVar) {
        this.b = amvrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agcy) && fdbq.f(this.b, ((agcy) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ForwardMessage(content=" + this.b + ")";
    }

    public agcy(ajlt ajltVar) {
        this(ajltVar.g());
    }
}
