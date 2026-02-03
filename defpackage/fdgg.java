package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdgg implements fdgd {
    public final Matcher a;
    public final fdgf b = new fdgf(this);
    private final CharSequence c;

    public fdgg(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.c = charSequence;
    }

    @Override // defpackage.fdgd
    public final String a() {
        String strGroup = this.a.group();
        strGroup.getClass();
        return strGroup;
    }

    @Override // defpackage.fdgd
    public final fddq b() {
        Matcher matcher = this.a;
        return fddu.r(matcher.start(), matcher.end());
    }

    @Override // defpackage.fdgd
    public final fdgd c() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.c;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        return fdgm.a(matcher2, iEnd, charSequence);
    }
}
