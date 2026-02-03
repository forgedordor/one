package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpuj extends dqqf implements bpuf {
    @Deprecated
    public bpuj(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpun bpunVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bput.a, dqwjVar, dqtmVar, bpunVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bptt();
    }

    @Override // defpackage.bpuf
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            e();
            ekfwVar.h(Long.valueOf(e()));
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(2, bput.a));
    }

    public final long f() {
        return getLong(cO(1, bput.a));
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
        String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bput.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr, new ejxr() { // from class: bpug
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        long[] jArrC = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bput.a)))) : new long[]{f()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bpuh
            @Override // defpackage.ejxr
            public final Object get() {
                return "participant_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        long[] jArrC2 = dj(2) ? z ? dqru.C(null, dt(getString(cO(2, bput.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: bpui
            @Override // defpackage.ejxr
            public final Object get() {
                return "manual_link_preview_count:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArrDC[i2];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArrDC[i2]));
                String[] strArr2 = bput.a;
                bptv bptvVar = new bptv();
                bptvVar.aF();
                bptvVar.aD();
                long j2 = jArrDC[i2];
                if (strArr != null) {
                    String str = strArr[i2];
                    bptvVar.aE(0);
                    bptvVar.a = str;
                }
                if (jArrC != null) {
                    bptvVar.c(jArrC[i2]);
                }
                if (jArrC2 != null) {
                    bptvVar.b(jArrC2[i2]);
                }
                ekfwVar.h(bptvVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(0, bput.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
