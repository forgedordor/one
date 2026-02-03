package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyba extends dybb {
    public final String a;
    public final lbz b;

    public dyba(String str, lbz lbzVar) {
        if (str == null) {
            throw new NullPointerException("Null actionText");
        }
        this.a = str;
        this.b = lbzVar;
    }

    @Override // defpackage.dybb
    public final lbz a() {
        return this.b;
    }

    @Override // defpackage.dybb
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dybb) {
            dybb dybbVar = (dybb) obj;
            if (this.a.equals(dybbVar.b()) && this.b.equals(dybbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ActionButtonSpec{actionText=" + this.a + ", onButtonClicked=" + this.b.toString() + "}";
    }
}
