package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asum extends dqqf implements asui {
    @Deprecated
    public asum(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, asur asurVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, asux.a, dqwjVar, dqtmVar, asurVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new astx();
    }

    public final asva c() {
        byte[] blob = getBlob(cO(2, asux.a));
        if (blob == null) {
            return null;
        }
        try {
            return (asva) evsn.parseFrom(asva.a, blob, evrr.a());
        } catch (Throwable unused) {
            return asva.a;
        }
    }

    public final Instant e() {
        return bart.b(getLong(cO(1, asux.a)));
    }

    public final String f() {
        return getString(cO(0, asux.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        asva asvaVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                asva[] asvaVarArr = null;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, asux.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: asuj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "msisdn:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(1, asux.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr2 = new Instant[length2];
                    for (int i = 0; i < length2; i++) {
                        instantArr2[i] = bart.b(jArrDt[i]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr2, new Instant[0]);
                } else {
                    instantArr = new Instant[]{e()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: asuk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_refresh_timestamp:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (dj(2)) {
                    if (z) {
                        List listDf = df(getString(cO(2, asux.a)));
                        asva[] asvaVarArr2 = new asva[listDf.size()];
                        Iterator it = listDf.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            try {
                                byte[] bArrZ = dqru.z((String) it.next());
                                int i3 = i2 + 1;
                                if (bArrZ == null) {
                                    asvaVar = null;
                                } else {
                                    try {
                                        asvaVar = (asva) evsn.parseFrom(asva.a, bArrZ);
                                    } catch (Throwable unused) {
                                        i2 = i3;
                                        asvaVarArr2[i2] = null;
                                        i2++;
                                    }
                                }
                                asvaVarArr2[i2] = asvaVar;
                                i2 = i3;
                            } catch (Throwable unused2) {
                            }
                        }
                        asvaVarArr = (asva[]) dqru.D(null, asvaVarArr2, new asva[0]);
                    } else {
                        asvaVarArr = new asva[]{c()};
                    }
                }
                dqqf.dA(length, asvaVarArr, new ejxr() { // from class: asul
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_capabilities:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i4 = 0; i4 < length; i4++) {
                    long j = jArrDC[i4];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr2 = asux.a;
                        astz astzVar = new astz();
                        astzVar.aF();
                        astzVar.aD();
                        long j2 = jArrDC[i4];
                        if (strArr != null) {
                            astzVar.c(strArr[i4]);
                        }
                        if (instantArr != null) {
                            astzVar.b(instantArr[i4]);
                        }
                        if (asvaVarArr != null) {
                            astzVar.d(asvaVarArr[i4]);
                        }
                        ekfwVar.h(astzVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i5 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
