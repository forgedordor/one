package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwx {
    public static final dxvi a(dxww dxwwVar) {
        int i = dxwwVar.b;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        if (i3 == 0) {
            String str = (i == 1 ? (dxwr) dxwwVar.c : dxwr.a).b;
            str.getClass();
            return new dxvp(str);
        }
        if (i3 == 1) {
            return dxwh.a;
        }
        if (i3 == 2) {
            return dxwf.a;
        }
        if (i3 == 3) {
            String str2 = (i == 4 ? (dxwn) dxwwVar.c : dxwn.a).b;
            str2.getClass();
            return new dxvl(str2);
        }
        if (i3 != 4) {
            if (i3 != 5) {
                throw new fctg();
            }
            throw new IllegalStateException("Account not set in account representation proto");
        }
        String str3 = (i == 5 ? (dxwp) dxwwVar.c : dxwp.a).b;
        str3.getClass();
        return new dxvn(str3, (dxwwVar.b == 5 ? (dxwp) dxwwVar.c : dxwp.a).c);
    }
}
