package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqo {
    private final Resources.Theme a;
    private final int b;

    public jqo(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqo)) {
            return false;
        }
        jqo jqoVar = (jqo) obj;
        return fdbq.f(this.a, jqoVar.a) && this.b == jqoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "Key(theme=" + this.a + ", id=" + this.b + ')';
    }
}
