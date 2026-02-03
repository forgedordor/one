package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class andl {
    public static final int a(ekgb ekgbVar, ajly ajlyVar, fdap fdapVar) {
        int size = ekgbVar.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            E e = ekgbVar.get(i2);
            e.getClass();
            ajly ajlyVar2 = (ajly) fdapVar.invoke(e);
            if (ajlyVar.compareTo(ajlyVar2) < 0) {
                i = i2 + 1;
            } else {
                if (ajlyVar.compareTo(ajlyVar2) <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return i;
    }
}
