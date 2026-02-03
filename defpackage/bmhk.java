package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bmhk extends dqqf implements bmhe {
    @Deprecated
    public bmhk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bmhq bmhqVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bmhw.a, dqwjVar, dqtmVar, bmhqVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bmgo();
    }

    public final long c() {
        return getLong(cO(0, bmhw.a));
    }

    public final crwi e() {
        return crwi.b(getInt(cO(3, bmhw.a)));
    }

    public final crws f() {
        return crws.b(getInt(cO(1, bmhw.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        crws[] crwsVarArr;
        Instant[] instantArr;
        crwi[] crwiVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                Instant[] instantArr2 = null;
                long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, bmhw.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: bmhf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                if (!dj(1)) {
                    crwsVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(1, bmhw.a)));
                    crws[] crwsVarArr2 = new crws[iArrDs.length];
                    for (int i = 0; i < iArrDs.length; i++) {
                        crws crwsVarB = crws.b(iArrDs[i]);
                        if (crwsVarB == null) {
                            throw new IllegalStateException();
                        }
                        crwsVarArr2[i] = crwsVarB;
                    }
                    crwsVarArr = (crws[]) dqru.D(null, crwsVarArr2, new crws[0]);
                } else {
                    crwsVarArr = new crws[]{f()};
                }
                dqqf.dA(length, crwsVarArr, new ejxr() { // from class: bmhg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_toolstone_state:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                if (!dj(2)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(2, bmhw.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr3 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr3[i2] = bart.b(jArrDt[i2]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{g()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bmhh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_toolstone_last_dismiss_timestamp:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    crwiVarArr = null;
                } else if (z) {
                    int[] iArrDs2 = ds(getString(cO(3, bmhw.a)));
                    crwi[] crwiVarArr2 = new crwi[iArrDs2.length];
                    for (int i3 = 0; i3 < iArrDs2.length; i3++) {
                        crwi crwiVarB = crwi.b(iArrDs2[i3]);
                        if (crwiVarB == null) {
                            throw new IllegalStateException();
                        }
                        crwiVarArr2[i3] = crwiVarB;
                    }
                    crwiVarArr = (crwi[]) dqru.D(null, crwiVarArr2, new crwi[0]);
                } else {
                    crwiVarArr = new crwi[]{e()};
                }
                dqqf.dA(length, crwiVarArr, new ejxr() { // from class: bmhi
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "conversation_subscription_state:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (dj(4)) {
                    if (z) {
                        long[] jArrDt2 = dt(getString(cO(4, bmhw.a)));
                        int length3 = jArrDt2.length;
                        Instant[] instantArr4 = new Instant[length3];
                        for (int i4 = 0; i4 < length3; i4++) {
                            instantArr4[i4] = bart.b(jArrDt2[i4]);
                        }
                        instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                    } else {
                        instantArr2 = new Instant[]{h()};
                    }
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: bmhj
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_action_timestamp:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i5 = 0; i5 < length; i5++) {
                    long j = jArrDC[i5];
                    if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                        hashSet.add(Long.valueOf(jArrDC[i5]));
                        String[] strArr = bmhw.a;
                        bmgq bmgqVar = new bmgq();
                        bmgqVar.aF();
                        bmgqVar.aD();
                        long j2 = jArrDC[i5];
                        if (jArrC != null) {
                            bmgqVar.e(jArrC[i5]);
                        }
                        if (crwsVarArr != null) {
                            bmgqVar.c(crwsVarArr[i5]);
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i5];
                            int i6 = bmgqVar.aB;
                            if (i6 < 61030) {
                                dqru.x("conversation_toolstone_last_dismiss_timestamp", i6);
                            }
                            bmgqVar.aE(2);
                            bmgqVar.c = instant;
                        }
                        if (crwiVarArr != null) {
                            bmgqVar.b(crwiVarArr[i5]);
                        }
                        if (instantArr2 != null) {
                            bmgqVar.d(instantArr2[i5]);
                        }
                        ekfwVar.h(bmgqVar.a());
                    }
                }
                return ekfwVar.g();
            }
        }
        int i7 = ekgb.d;
        return ekoe.a;
    }

    public final Instant g() {
        return bart.b(getLong(cO(2, bmhw.a)));
    }

    public final Instant h() {
        return bart.b(getLong(cO(4, bmhw.a)));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
