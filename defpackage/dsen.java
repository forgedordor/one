package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsen {
    public static final etkl a(etkl etklVar) {
        String strA = etii.a(etklVar.e);
        etkk etkkVar = (etkk) etklVar.toBuilder();
        etkkVar.copyOnWrite();
        etkl etklVar2 = (etkl) etkkVar.instance;
        strA.getClass();
        etklVar2.b |= 4;
        etklVar2.e = strA;
        return (etkl) etkkVar.build();
    }

    public static final boolean b(List list, etot etotVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            if (etotVar.c.d(i2) == ((Integer) list.get(i)).intValue() && (i2 = i2 + 1) == etotVar.c.size()) {
                return i == list.size() + (-1);
            }
            i++;
        }
        return false;
    }
}
