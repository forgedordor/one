package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azrv implements dqoe {
    public static final azrv a = new azrv();
    private static final Map b = fcwa.h(new fcti(c("token"), d("token")), new fcti(c("address_type"), d("address_type")), new fcti(c("phone_number"), d("phone_number")), new fcti(c("display_name"), d("display_name")));

    private azrv() {
    }

    private static final azre c(String str) {
        dqpo[] dqpoVarArrB = azrp.b();
        for (int i = 0; i < 4; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (azre) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final awwm d(String str) {
        dqpo[] dqpoVarArrB = awxa.b();
        for (int i = 0; i < 7; i++) {
            dqpo dqpoVar = dqpoVarArrB[i];
            String strD = dqpoVar.d();
            if (fdbq.f(strD != null ? fdgn.C(strD, '.', strD) : null, str)) {
                dqpoVar.getClass();
                return (awwm) dqpoVar;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // defpackage.dqoe
    public final void a() {
        String[] strArr = azru.a;
        azrm azrmVar = new azrm();
        azrmVar.f("clearBackupTable");
        azrmVar.e();
        azrmVar.b().b();
    }

    @Override // defpackage.dqoe
    public final void b() {
        String[] strArr = azru.a;
        dqtq dqtqVar = new dqtq("my_identities_backup", "backup");
        dqtqVar.d = 5;
        Map map = b;
        azre[] azreVarArr = (azre[]) map.keySet().toArray(new azre[0]);
        dqtqVar.b((dqpo[]) Arrays.copyOf(azreVarArr, azreVarArr.length));
        awxc awxcVarA = awxh.a();
        awxcVarA.s();
        awwm[] awwmVarArr = (awwm[]) map.values().toArray(new awwm[0]);
        awwm[] awwmVarArr2 = (awwm[]) Arrays.copyOf(awwmVarArr, awwmVarArr.length);
        int iIntValue = awxh.c().intValue();
        for (awwm awwmVar : awwmVarArr2) {
            if (((Integer) awxh.b.getOrDefault(awwmVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        awxcVarA.m(awwmVarArr2);
        dqtqVar.c = awxcVarA.b();
        dqtqVar.a().a();
    }
}
