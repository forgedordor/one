package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rbw implements Cloneable {
    public rul a = rui.b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rbw clone() {
        try {
            return (rbw) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof rbw) {
            return rvk.l(this.a, ((rbw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        rul rulVar = this.a;
        if (rulVar != null) {
            return rulVar.hashCode();
        }
        return 0;
    }
}
