package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awti extends dqqf implements awte {
    @Deprecated
    public awti(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, awtn awtnVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, awtp.a, dqwjVar, dqtmVar, awtnVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new awsr();
    }

    public final int c() {
        return getInt(cO(1, awtp.a));
    }

    public final int e() {
        return getInt(cO(2, awtp.a));
    }

    public final String f() {
        return getString(cO(0, awtp.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, awtp.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: awtf
            @Override // defpackage.ejxr
            public final Object get() {
                return "sim_serial_number:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        int[] iArrA = dj(1) ? z ? dqru.A(null, ds(getString(cO(1, awtp.a)))) : new int[]{c()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: awtg
            @Override // defpackage.ejxr
            public final Object get() {
                return "active_sub_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        int[] iArrA2 = dj(2) ? z ? dqru.A(null, ds(getString(cO(2, awtp.a)))) : new int[]{e()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: awth
            @Override // defpackage.ejxr
            public final Object get() {
                return "sim_slot_index:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr2 = awtp.a;
                awst awstVar = new awst();
                awstVar.aF();
                awstVar.aD();
                long j2 = jArrDC[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    awstVar.aE(0);
                    awstVar.a = str;
                }
                if (iArrA != null) {
                    int i3 = iArrA[i2];
                    awstVar.aE(1);
                    awstVar.b = i3;
                }
                if (iArrA2 != null) {
                    int i4 = iArrA2[i2];
                    awstVar.aE(2);
                    awstVar.c = i4;
                }
                awsr awsrVar = new awsr();
                awsrVar.aD(awstVar.aB());
                awsrVar.a = awstVar.a;
                awsrVar.b = awstVar.b;
                awsrVar.c = awstVar.c;
                awsrVar.cM = awstVar.aC();
                ekfwVar.h(awsrVar);
            }
        }
        return ekfwVar.g();
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
