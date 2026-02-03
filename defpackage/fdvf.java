package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdvf {
    public static final fdzi a = new fdzi("NONE");
    public static final fdzi b = new fdzi("PENDING");

    public static final fduf a(Object obj) {
        if (obj == null) {
            obj = fdwz.a;
        }
        return new fdve(obj);
    }

    public static final fdpl b(fdvc fdvcVar, fcyh fcyhVar, int i, int i2) {
        boolean z = fdkb.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? fdun.c(fdvcVar, fcyhVar, i, i2) : fdvcVar;
    }
}
