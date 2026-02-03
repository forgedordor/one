package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eulq {
    public final euiz a;
    public final int b;
    public final int c;

    public eulq(int i, int i2, Map map) {
        ejwl.a(!map.isEmpty());
        ejwl.a(i <= i2);
        this.b = i;
        this.c = i2;
        this.a = new euiz(map);
    }

    public final int a() {
        return this.a.a().size();
    }

    public final String b(int i) {
        return (String) this.a.a().get(i);
    }

    public final String toString() {
        return String.format(Locale.US, "TextLink{start=%s, end=%s, entityScores=%s}", Integer.valueOf(this.b), Integer.valueOf(this.c), this.a);
    }
}
