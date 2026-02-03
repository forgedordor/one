package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lah {
    public static final lah a = b(new Locale[0]);
    public final lai b;

    private lah(lai laiVar) {
        this.b = laiVar;
    }

    public static lah b(Locale... localeArr) {
        return d(new LocaleList(localeArr));
    }

    public static lah c(String str) {
        if (str == null || str.isEmpty()) {
            return a;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = lag.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return b(localeArr);
    }

    public static lah d(LocaleList localeList) {
        return new lah(new lai(localeList));
    }

    public final int a() {
        return this.b.a.size();
    }

    public final String e() {
        return this.b.a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lah) && this.b.equals(((lah) obj).b);
    }

    public final Locale f(int i) {
        return this.b.a.get(i);
    }

    public final boolean g() {
        return this.b.a.isEmpty();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
