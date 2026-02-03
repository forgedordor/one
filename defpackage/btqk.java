package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import j$.util.Optional;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btqk extends dqqf implements btpx {
    @Deprecated
    public btqk(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btqr btqrVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btqy.a, dqwjVar, dqtmVar, btqrVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btos();
    }

    public final long c() {
        return getLong(cO(0, btqy.a));
    }

    public final long e() {
        return getLong(cO(7, btqy.a));
    }

    public final aiaa f() {
        byte[] blob = getBlob(cO(6, btqy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aiaa) evsn.parseFrom(aiaa.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aiaa.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Optional[] optionalArr;
        aiba[] aibaVarArr;
        aiaf[] aiafVarArr;
        Instant[] instantArr;
        Instant[] instantArr2;
        aiaa[] aiaaVarArr;
        long[] jArr;
        Instant[] instantArr3;
        Instant[] instantArr4;
        Instant[] instantArr5;
        Instant[] instantArr6;
        aiay[] aiayVarArr;
        aiay[] aiayVarArr2;
        int i;
        Instant[] instantArr7;
        Iterator it;
        aiay aiayVar;
        aiaa aiaaVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i2 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        aiaa aiaaVar2 = null;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, btqy.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: btpy
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            optionalArr = null;
        } else if (z) {
            String[] strArrDu = du(getString(cO(1, btqy.a)));
            int length2 = strArrDu.length;
            Optional[] optionalArr2 = new Optional[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                optionalArr2[i3] = basg.a(strArrDu[i3]);
            }
            optionalArr = (Optional[]) dqru.D(null, optionalArr2, new Optional[0]);
        } else {
            optionalArr = new Optional[]{n()};
        }
        dqqf.dA(length, optionalArr, new ejxr() { // from class: btqd
            @Override // defpackage.ejxr
            public final Object get() {
                return "session_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        if (!dj(2)) {
            aibaVarArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(2, btqy.a)));
            aiba[] aibaVarArr2 = new aiba[iArrDs.length];
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                aiba aibaVarB = aiba.b(iArrDs[i4]);
                if (aibaVarB == null) {
                    throw new IllegalStateException();
                }
                aibaVarArr2[i4] = aibaVarB;
            }
            aibaVarArr = (aiba[]) dqru.D(null, aibaVarArr2, new aiba[0]);
        } else {
            aibaVarArr = new aiba[]{i()};
        }
        dqqf.dA(length, aibaVarArr, new ejxr() { // from class: btqe
            @Override // defpackage.ejxr
            public final Object get() {
                return "feature:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        if (!dj(3)) {
            aiafVarArr = null;
        } else if (z) {
            int[] iArrDs2 = ds(getString(cO(3, btqy.a)));
            aiaf[] aiafVarArr2 = new aiaf[iArrDs2.length];
            for (int i5 = 0; i5 < iArrDs2.length; i5++) {
                aiaf aiafVarB = aiaf.b(iArrDs2[i5]);
                if (aiafVarB == null) {
                    throw new IllegalStateException();
                }
                aiafVarArr2[i5] = aiafVarB;
            }
            aiafVarArr = (aiaf[]) dqru.D(null, aiafVarArr2, new aiaf[0]);
        } else {
            aiafVarArr = new aiaf[]{g()};
        }
        dqqf.dA(length, aiafVarArr, new ejxr() { // from class: btqf
            @Override // defpackage.ejxr
            public final Object get() {
                return "status:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        if (!dj(4)) {
            instantArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(4, btqy.a)));
            int length3 = jArrDt.length;
            Instant[] instantArr8 = new Instant[length3];
            for (int i6 = 0; i6 < length3; i6++) {
                instantArr8[i6] = bart.b(jArrDt[i6]);
            }
            instantArr = (Instant[]) dqru.D(null, instantArr8, new Instant[0]);
        } else {
            instantArr = new Instant[]{l()};
        }
        dqqf.dA(length, instantArr, new ejxr() { // from class: btqg
            @Override // defpackage.ejxr
            public final Object get() {
                return "start_time:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        if (!dj(5)) {
            instantArr2 = null;
        } else if (z) {
            long[] jArrDt2 = dt(getString(cO(5, btqy.a)));
            int length4 = jArrDt2.length;
            Instant[] instantArr9 = new Instant[length4];
            for (int i7 = 0; i7 < length4; i7++) {
                instantArr9[i7] = bart.b(jArrDt2[i7]);
            }
            instantArr2 = (Instant[]) dqru.D(null, instantArr9, new Instant[0]);
        } else {
            instantArr2 = new Instant[]{j()};
        }
        dqqf.dA(length, instantArr2, new ejxr() { // from class: btqh
            @Override // defpackage.ejxr
            public final Object get() {
                return "finish_time:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        if (!dj(6)) {
            aiaaVarArr = null;
        } else if (z) {
            List listDf = df(getString(cO(6, btqy.a)));
            aiaa[] aiaaVarArr2 = new aiaa[listDf.size()];
            Iterator it2 = listDf.iterator();
            int i8 = 0;
            while (it2.hasNext()) {
                try {
                    byte[] bArrZ = dqru.z((String) it2.next());
                    int i9 = i8 + 1;
                    if (bArrZ == null) {
                        aiaaVar = aiaaVar2;
                    } else {
                        aiaaVar = aiaaVar2;
                        try {
                            aiaaVar2 = (aiaa) evsn.parseFrom(aiaa.a, bArrZ);
                        } catch (Throwable unused) {
                            i8 = i9;
                            aiaaVarArr2[i8] = aiaaVar;
                            i8++;
                            aiaaVar2 = aiaaVar;
                        }
                    }
                    aiaaVarArr2[i8] = aiaaVar2;
                    i8 = i9;
                } catch (Throwable unused2) {
                    aiaaVar = aiaaVar2;
                }
                aiaaVar2 = aiaaVar;
            }
            aiaaVarArr = (aiaa[]) dqru.D(aiaaVar2, aiaaVarArr2, new aiaa[0]);
        } else {
            aiaaVarArr = new aiaa[]{f()};
        }
        dqqf.dA(length, aiaaVarArr, new ejxr() { // from class: btqi
            @Override // defpackage.ejxr
            public final Object get() {
                return "backup_database_metadata:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        long[] jArrC2 = dj(7) ? z ? dqru.C(null, dt(getString(cO(7, btqy.a)))) : new long[]{e()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: btqj
            @Override // defpackage.ejxr
            public final Object get() {
                return "initial_messages_version:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            jArr = jArrDC;
            instantArr3 = null;
        } else if (z) {
            long[] jArrDt3 = dt(getString(cO(8, btqy.a)));
            int length5 = jArrDt3.length;
            Instant[] instantArr10 = new Instant[length5];
            jArr = jArrDC;
            for (int i10 = 0; i10 < length5; i10++) {
                instantArr10[i10] = bart.b(jArrDt3[i10]);
            }
            instantArr3 = (Instant[]) dqru.D(null, instantArr10, new Instant[0]);
        } else {
            jArr = jArrDC;
            instantArr3 = new Instant[]{m()};
        }
        dqqf.dA(length, instantArr3, new ejxr() { // from class: btpz
            @Override // defpackage.ejxr
            public final Object get() {
                return "status_timestamp:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            instantArr4 = instantArr2;
            instantArr5 = null;
        } else if (z) {
            long[] jArrDt4 = dt(getString(cO(9, btqy.a)));
            int length6 = jArrDt4.length;
            Instant[] instantArr11 = new Instant[length6];
            instantArr4 = instantArr2;
            for (int i11 = 0; i11 < length6; i11++) {
                instantArr11[i11] = bart.b(jArrDt4[i11]);
            }
            instantArr5 = (Instant[]) dqru.D(null, instantArr11, new Instant[0]);
        } else {
            instantArr4 = instantArr2;
            instantArr5 = new Instant[]{k()};
        }
        dqqf.dA(length, instantArr5, new ejxr() { // from class: btqa
            @Override // defpackage.ejxr
            public final Object get() {
                return "last_attachment_request_timestamp:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        if (!dj(10)) {
            instantArr6 = instantArr5;
            aiayVarArr = null;
        } else if (z) {
            List listDf2 = df(getString(cO(10, btqy.a)));
            aiay[] aiayVarArr3 = new aiay[listDf2.size()];
            Iterator it3 = listDf2.iterator();
            int i12 = 0;
            while (it3.hasNext()) {
                Instant[] instantArr12 = instantArr5;
                try {
                    byte[] bArrZ2 = dqru.z((String) it3.next());
                    int i13 = i12 + 1;
                    if (bArrZ2 == null) {
                        it = it3;
                        aiayVar = null;
                    } else {
                        it = it3;
                        try {
                            aiayVar = (aiay) evsn.parseFrom(aiay.a, bArrZ2);
                        } catch (Throwable unused3) {
                            i12 = i13;
                            aiayVarArr3[i12] = null;
                            i12++;
                            instantArr5 = instantArr12;
                            it3 = it;
                        }
                    }
                    aiayVarArr3[i12] = aiayVar;
                    i12 = i13;
                } catch (Throwable unused4) {
                    it = it3;
                }
                instantArr5 = instantArr12;
                it3 = it;
            }
            instantArr6 = instantArr5;
            aiayVarArr = (aiay[]) dqru.D(null, aiayVarArr3, new aiay[0]);
        } else {
            instantArr6 = instantArr5;
            aiayVarArr = new aiay[]{h()};
        }
        dqqf.dA(length, aiayVarArr, new ejxr() { // from class: btqb
            @Override // defpackage.ejxr
            public final Object get() {
                return "config:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        boolean[] zArrE = dj(11) ? z ? dqru.E(null, dv(getString(cO(11, btqy.a)))) : new boolean[]{o()} : null;
        dqqf.dB(length, zArrE, new ejxr() { // from class: btqc
            @Override // defpackage.ejxr
            public final Object get() {
                return "cleaned_up:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i14 = 0;
        while (i14 < length) {
            long j = jArr[i14];
            if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                aiayVarArr2 = aiayVarArr;
                i = length;
                instantArr7 = instantArr3;
            } else {
                hashSet.add(Long.valueOf(jArr[i14]));
                String[] strArr = btqy.a;
                btow btowVar = new btow();
                btowVar.aF();
                btowVar.aD();
                long j2 = jArr[i14];
                aiayVarArr2 = aiayVarArr;
                i = length;
                if (jArrC != null) {
                    long j3 = jArrC[i14];
                    btowVar.aE(0);
                    btowVar.a = j3;
                }
                if (optionalArr != null) {
                    btowVar.f(optionalArr[i14]);
                }
                if (aibaVarArr != null) {
                    btowVar.d(aibaVarArr[i14]);
                }
                if (aiafVarArr != null) {
                    btowVar.h(aiafVarArr[i14]);
                }
                if (instantArr != null) {
                    btowVar.g(instantArr[i14]);
                }
                if (instantArr4 != null) {
                    Instant instant = instantArr4[i14];
                    btowVar.aE(5);
                    btowVar.f = instant;
                }
                if (aiaaVarArr != null) {
                    aiaa aiaaVar3 = aiaaVarArr[i14];
                    btowVar.aE(6);
                    btowVar.g = aiaaVar3;
                }
                instantArr7 = instantArr3;
                if (jArrC2 != null) {
                    btowVar.e(jArrC2[i14]);
                }
                if (instantArr7 != null) {
                    btowVar.i(instantArr7[i14]);
                }
                if (instantArr6 != null) {
                    Instant instant2 = instantArr6[i14];
                    int i15 = btowVar.aB;
                    if (i15 < 60330) {
                        dqru.x("last_attachment_request_timestamp", i15);
                    }
                    btowVar.aE(9);
                    btowVar.j = instant2;
                }
                if (aiayVarArr2 != null) {
                    btowVar.c(aiayVarArr2[i14]);
                }
                if (zArrE != null) {
                    btowVar.b(zArrE[i14]);
                }
                ekfwVar.h(btowVar.a(new Supplier() { // from class: btot
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new btos();
                    }
                }));
            }
            i14++;
            instantArr3 = instantArr7;
            length = i;
            aiayVarArr = aiayVarArr2;
        }
        return ekfwVar.g();
    }

    public final aiaf g() {
        return aiaf.b(getInt(cO(3, btqy.a)));
    }

    public final aiay h() {
        byte[] blob = getBlob(cO(10, btqy.a));
        if (blob == null) {
            return null;
        }
        try {
            return (aiay) evsn.parseFrom(aiay.a, blob, evrr.a());
        } catch (Throwable unused) {
            return aiay.a;
        }
    }

    public final aiba i() {
        return aiba.b(getInt(cO(2, btqy.a)));
    }

    public final Instant j() {
        return bart.b(getLong(cO(5, btqy.a)));
    }

    public final Instant k() {
        return bart.b(getLong(cO(9, btqy.a)));
    }

    public final Instant l() {
        return bart.b(getLong(cO(4, btqy.a)));
    }

    public final Instant m() {
        return bart.b(getLong(cO(8, btqy.a)));
    }

    public final Optional n() {
        return basg.a(getString(cO(1, btqy.a)));
    }

    public final boolean o() {
        return getInt(cO(11, btqy.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
