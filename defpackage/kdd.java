package defpackage;

import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdd implements kdm {
    @Override // defpackage.kdm
    public final void a(kdq kdqVar) {
        if (kdqVar.k()) {
            kdqVar.g(kdqVar.c, kdqVar.d);
            return;
        }
        if (kdqVar.b() == -1) {
            int i = kdqVar.a;
            int i2 = kdqVar.b;
            kdqVar.j(i, i);
            kdqVar.g(i, i2);
            return;
        }
        if (kdqVar.b() == 0) {
            return;
        }
        String string = kdqVar.toString();
        int iB = kdqVar.b();
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(string);
        kdqVar.g(characterInstance.preceding(iB), kdqVar.b());
    }

    public final boolean equals(Object obj) {
        return obj instanceof kdd;
    }

    public final int hashCode() {
        int i = fdcj.a;
        return new fdbi(getClass()).hashCode();
    }

    public final String toString() {
        return "BackspaceCommand()";
    }
}
