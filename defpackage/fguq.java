package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguq extends fguu {
    private final Pattern a;

    public fguq(Pattern pattern) {
        this.a = pattern;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        return this.a.matcher(fgrsVar2.r()).find();
    }

    public final String toString() {
        return String.format(":matchesWholeOwnText(%s)", this.a);
    }
}
