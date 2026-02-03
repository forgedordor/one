package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lov {
    public final pli a;
    public final char[] b;
    public final lou c;
    public final Typeface d;

    lov() {
        this.d = Typeface.DEFAULT;
        this.a = null;
        this.c = new lou(1024);
        this.b = new char[0];
    }

    public lov(Typeface typeface, pli pliVar) {
        this.d = typeface;
        this.a = pliVar;
        this.c = new lou(1024);
        int iA = pliVar.a();
        this.b = new char[iA + iA];
        int iA2 = pliVar.a();
        for (int i = 0; i < iA2; i++) {
            lol lolVar = new lol(this, i);
            Character.toChars(lolVar.c(), this.b, i + i);
            lcg.b(lolVar.b() > 0, "invalid metadata codepoint length");
            this.c.b(lolVar, 0, lolVar.b() - 1);
        }
    }
}
