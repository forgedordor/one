package defpackage;

import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echy {
    public static final exyv a;

    static {
        exyu exyuVar = (exyu) exyv.a.createBuilder();
        exyj exyjVar = exyj.a;
        exyuVar.copyOnWrite();
        exyv exyvVar = (exyv) exyuVar.instance;
        exyjVar.getClass();
        exyvVar.c = exyjVar;
        exyvVar.b = 1;
        exyu exyuVar2 = (exyu) exyv.a.createBuilder();
        exyr exyrVar = exyr.a;
        exyuVar2.copyOnWrite();
        exyv exyvVar2 = (exyv) exyuVar2.instance;
        exyrVar.getClass();
        exyvVar2.c = exyrVar;
        exyvVar2.b = 2;
        a = (exyv) exyuVar2.build();
        exyu exyuVar3 = (exyu) exyv.a.createBuilder();
        exyt exytVar = exyt.a;
        exyuVar3.copyOnWrite();
        exyv exyvVar3 = (exyv) exyuVar3.instance;
        exytVar.getClass();
        exyvVar3.c = exytVar;
        exyvVar3.b = 3;
    }

    public static String a(exyx exyxVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        Iterator<E> it = exyxVar.b.iterator();
        while (it.hasNext()) {
            ekfwVar.h(b((exyv) it.next()));
        }
        return ecgp.a(ekfwVar.g());
    }

    public static String b(exyv exyvVar) {
        int i;
        String str;
        int i2 = exyvVar.b;
        switch (i2) {
            case 0:
                i = 7;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            return "compress";
        }
        if (i3 == 1) {
            exyr exyrVar = i2 == 2 ? (exyr) exyvVar.c : exyr.a;
            int i4 = exyrVar.b;
            if (i4 == 1) {
                return "encrypt(aes_gcm_key=" + c((String) exyrVar.c) + ")";
            }
            if (i4 != 2) {
                return "encrypt";
            }
            return "encrypt(aes_gcm_hkdf_key=" + c((String) exyrVar.c) + ")";
        }
        if (i3 == 2) {
            exyt exytVar = i2 == 3 ? (exyt) exyvVar.c : exyt.a;
            if (exytVar.b != 1) {
                return "integrity";
            }
            return "integrity(sha256=" + c((String) exytVar.c) + ")";
        }
        if (i3 == 3) {
            exyz exyzVar = i2 == 4 ? (exyz) exyvVar.c : exyz.a;
            ejwl.a(1 == (exyzVar.b & 1));
            return "zip(target=" + c(exyzVar.c) + ")";
        }
        if (i3 != 4) {
            if (i3 == 5) {
                return "defrag";
            }
            throw new IllegalArgumentException("No transform specified");
        }
        exyn exynVar = i2 == 5 ? (exyn) exyvVar.c : exyn.a;
        if (exynVar.c.size() > 0) {
            int i5 = ekgb.d;
            ekfw ekfwVar = new ekfw();
            for (exym exymVar : exynVar.c) {
                ejwl.a(1 == (exymVar.b & 1));
                if ((exymVar.b & 2) != 0) {
                    ekfwVar.h(exymVar.c + "=" + c(exymVar.d));
                } else {
                    ekfwVar.h(exymVar.c);
                }
            }
            str = "(" + new ejwc(",").b(ekfwVar.g()) + ")";
        } else {
            str = "";
        }
        return String.valueOf(exynVar.b).concat(str);
    }

    private static final String c(String str) {
        try {
            return URLEncoder.encode(str, ecgk.a.displayName());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }
}
