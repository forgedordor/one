package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnml {
    public final int a;
    private final fctc b = fctd.a(new fdae() { // from class: dnmk
        @Override // defpackage.fdae
        public final Object invoke() {
            char[] chars = Character.toChars(this.a.a);
            chars.getClass();
            return new String(chars);
        }
    });

    public dnml(int i) {
        this.a = i;
    }

    public final String a() {
        return (String) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnml) && this.a == ((dnml) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Modifier(raw=" + this.a + ")";
    }
}
