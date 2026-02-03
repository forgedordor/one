package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dhnh {
    public dhnj a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dhnh)) {
            return false;
        }
        dhnj dhnjVar = this.a;
        dhnj dhnjVar2 = ((dhnh) obj).a;
        if (dhnjVar == null) {
            if (dhnjVar2 != null) {
                return false;
            }
        } else if (!dhnjVar.equals(dhnjVar2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        dhnj dhnjVar = this.a;
        return (dhnjVar == null ? 0 : dhnjVar.hashCode()) + 31;
    }
}
