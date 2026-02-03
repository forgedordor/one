package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgt {
    public final String a;
    public final String b;

    public dlgt(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgt)) {
            return false;
        }
        dlgt dlgtVar = (dlgt) obj;
        return fdbq.f(this.a, dlgtVar.a) && fdbq.f(this.b, dlgtVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EmojiAnimationFile(emoji=" + this.a + ", animationFileName=" + this.b + ")";
    }
}
