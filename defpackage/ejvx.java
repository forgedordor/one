package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejvx extends ejvh implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern a;

    public ejvx(Pattern pattern) {
        pattern.getClass();
        this.a = pattern;
    }

    @Override // defpackage.ejvh
    public final ejvg a(CharSequence charSequence) {
        return new ejvw(this.a.matcher(charSequence));
    }

    public final String toString() {
        return this.a.toString();
    }
}
