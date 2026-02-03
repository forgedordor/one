package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtm extends fguu {
    final String a;
    final Pattern b;

    public fgtm(String str, Pattern pattern) {
        this.a = fgrb.b(str);
        this.b = pattern;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        String str = this.a;
        return fgrsVar2.W(str) && this.b.matcher(fgrsVar2.hS(str)).find();
    }

    public final String toString() {
        return String.format("[%s~=%s]", this.a, this.b.toString());
    }
}
