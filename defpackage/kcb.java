package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcb {
    public static final kbz a(String str, float f) {
        if (str.length() != 4) {
            kfq.b("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new kbz(str, f);
    }
}
