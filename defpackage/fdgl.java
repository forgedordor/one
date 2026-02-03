package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdgl implements Serializable {
    private final Pattern a;

    public fdgl(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new fdgj(strPattern, pattern.flags());
    }

    public final String a() {
        String strPattern = this.a.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final String b(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final fdgd c(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new fdgg(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).find();
    }

    public final boolean e(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final fdgd f(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        return fdgm.a(matcher, 0, charSequence);
    }

    public final List g(CharSequence charSequence) {
        Matcher matcher = this.a.matcher(charSequence);
        if (!matcher.find()) {
            return fcva.b(charSequence);
        }
        ArrayList arrayList = new ArrayList(10);
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fdgl(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fdgl(String str, byte[] bArr) {
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this(patternCompile);
    }
}
