package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqn {
    public final lqw a;
    public final char[] b;
    public final lqm c = new lqm(1024);
    public final Typeface d;

    public lqn(Typeface typeface, lqw lqwVar) {
        this.d = typeface;
        this.a = lqwVar;
        int iA = lqwVar.a();
        this.b = new char[iA + iA];
        int iA2 = lqwVar.a();
        for (int i = 0; i < iA2; i++) {
            lqq lqqVar = new lqq(this, i);
            Character.toChars(lqqVar.e(), this.b, i + i);
            lcg.b(lqqVar.b() > 0, "invalid metadata codepoint length");
            this.c.b(lqqVar, 0, lqqVar.b() - 1);
        }
    }
}
