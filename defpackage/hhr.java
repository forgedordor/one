package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hhr {
    public final Locale a;
    public final Map b = new LinkedHashMap();

    public hhr(Locale locale) {
        this.a = locale;
    }

    public abstract int a();

    public abstract hhq b(long j);

    public abstract hhq c();

    public abstract hhq d(String str, String str2, Locale locale);

    public abstract hhv e(long j);

    public abstract hhv f(hhq hhqVar);

    public abstract hhv g(int i, int i2);

    public abstract hhv h(hhv hhvVar, int i);

    public abstract hid i(Locale locale);

    public abstract String j(long j, String str, Locale locale);

    public abstract List k();
}
