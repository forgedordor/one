package defpackage;

import android.database.Cursor;
import com.google.android.ims.rcsservice.businessinfo.AgentUseCase;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsyb extends dqqf implements bsxo {
    @Deprecated
    public bsyb(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsyh bsyhVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bsyn.a, dqwjVar, dqtmVar, bsyhVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bswl();
    }

    public final long c() {
        return getLong(cO(10, bsyn.a));
    }

    public final AgentUseCase e() {
        AgentUseCase[] agentUseCaseArrValues = AgentUseCase.values();
        int i = getInt(cO(11, bsyn.a));
        if (i < agentUseCaseArrValues.length) {
            return agentUseCaseArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final String f() {
        return getString(cO(5, bsyn.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        int i;
        String[] strArr;
        long[] jArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        int i2;
        AgentUseCase[] agentUseCaseArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i3 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        String[] strArr7 = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, bsyn.a))), new String[0]) : new String[]{m()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: bsxp
            @Override // defpackage.ejxr
            public final Object get() {
                return "rbm_bot_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        String[] strArr8 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, bsyn.a))), new String[0]) : new String[]{h()} : null;
        dqqf.dA(length, strArr8, new ejxr() { // from class: bsxu
            @Override // defpackage.ejxr
            public final Object get() {
                return "display_name:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr9 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bsyn.a))), new String[0]) : new String[]{l()} : null;
        dqqf.dA(length, strArr9, new ejxr() { // from class: bsxv
            @Override // defpackage.ejxr
            public final Object get() {
                return "logo_image_remote_url:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        String[] strArr10 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bsyn.a))), new String[0]) : new String[]{k()} : null;
        dqqf.dA(length, strArr10, new ejxr() { // from class: bsxw
            @Override // defpackage.ejxr
            public final Object get() {
                return "logo_image_local_uri:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr11 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bsyn.a))), new String[0]) : new String[]{g()} : null;
        dqqf.dA(length, strArr11, new ejxr() { // from class: bsxx
            @Override // defpackage.ejxr
            public final Object get() {
                return "description:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        String[] strArr12 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bsyn.a))), new String[0]) : new String[]{f()} : null;
        dqqf.dA(length, strArr12, new ejxr() { // from class: bsxy
            @Override // defpackage.ejxr
            public final Object get() {
                return "color:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        String[] strArr13 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bsyn.a))), new String[0]) : new String[]{j()} : null;
        dqqf.dA(length, strArr13, new ejxr() { // from class: bsxz
            @Override // defpackage.ejxr
            public final Object get() {
                return "hero_image_remote_url:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        String[] strArr14 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, bsyn.a))), new String[0]) : new String[]{i()} : null;
        dqqf.dA(length, strArr14, new ejxr() { // from class: bsya
            @Override // defpackage.ejxr
            public final Object get() {
                return "hero_image_local_uri:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            i = 0;
            strArr = null;
        } else if (z) {
            i = 0;
            strArr = (String[]) dqru.D(null, du(getString(cO(8, bsyn.a))), new String[0]);
        } else {
            i = 0;
            strArr = new String[]{n()};
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: bsxq
            @Override // defpackage.ejxr
            public final Object get() {
                return "verifier_id:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr2 = null;
        } else if (z) {
            jArr = jArrDC;
            strArr2 = (String[]) dqru.D(null, du(getString(cO(9, bsyn.a))), new String[i]);
        } else {
            jArr = jArrDC;
            String[] strArr15 = new String[1];
            strArr15[i] = o();
            strArr2 = strArr15;
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: bsxr
            @Override // defpackage.ejxr
            public final Object get() {
                return "version:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        long[] jArrC = dj(10) ? z ? dqru.C(null, dt(getString(cO(10, bsyn.a)))) : new long[]{c()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: bsxs
            @Override // defpackage.ejxr
            public final Object get() {
                return "expiry_milliseconds:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            strArr3 = strArr2;
            strArr4 = strArr14;
            strArr5 = strArr;
            strArr6 = strArr7;
            i2 = 0;
            agentUseCaseArr = null;
        } else if (z) {
            int[] iArrDs = ds(getString(cO(11, bsyn.a)));
            AgentUseCase[] agentUseCaseArrValues = AgentUseCase.values();
            strArr3 = strArr2;
            int length2 = agentUseCaseArrValues.length;
            strArr4 = strArr14;
            AgentUseCase[] agentUseCaseArr2 = new AgentUseCase[iArrDs.length];
            strArr5 = strArr;
            strArr6 = strArr7;
            for (int i4 = 0; i4 < iArrDs.length; i4++) {
                int i5 = iArrDs[i4];
                if (i5 >= length2) {
                    throw new IllegalStateException();
                }
                agentUseCaseArr2[i4] = agentUseCaseArrValues[i5];
            }
            i2 = 0;
            agentUseCaseArr = (AgentUseCase[]) dqru.D(null, agentUseCaseArr2, new AgentUseCase[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = strArr14;
            strArr5 = strArr;
            strArr6 = strArr7;
            i2 = 0;
            agentUseCaseArr = new AgentUseCase[]{e()};
        }
        dqqf.dA(length, agentUseCaseArr, new ejxr() { // from class: bsxt
            @Override // defpackage.ejxr
            public final Object get() {
                return "agent_use_case_category:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        ekfw ekfwVar = new ekfw();
        for (int i6 = i2; i6 < length; i6++) {
            long j = jArr[i6];
            if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                hashSet.add(Long.valueOf(jArr[i6]));
                String[] strArr16 = bsyn.a;
                bswn bswnVar = new bswn();
                bswnVar.aF();
                bswnVar.aD();
                long j2 = jArr[i6];
                if (strArr6 != null) {
                    bswnVar.k(strArr6[i6]);
                }
                if (strArr8 != null) {
                    bswnVar.e(strArr8[i6]);
                }
                if (strArr9 != null) {
                    bswnVar.j(strArr9[i6]);
                }
                if (strArr10 != null) {
                    bswnVar.i(strArr10[i6]);
                }
                if (strArr11 != null) {
                    bswnVar.d(strArr11[i6]);
                }
                if (strArr12 != null) {
                    bswnVar.c(strArr12[i6]);
                }
                if (strArr13 != null) {
                    bswnVar.h(strArr13[i6]);
                }
                if (strArr4 != null) {
                    bswnVar.g(strArr4[i6]);
                }
                if (strArr5 != null) {
                    bswnVar.l(strArr5[i6]);
                }
                if (strArr3 != null) {
                    bswnVar.m(strArr3[i6]);
                }
                if (jArrC != null) {
                    bswnVar.f(jArrC[i6]);
                }
                if (agentUseCaseArr != null) {
                    bswnVar.b(agentUseCaseArr[i6]);
                }
                ekfwVar.h(bswnVar.a());
            }
        }
        return ekfwVar.g();
    }

    public final String g() {
        return getString(cO(4, bsyn.a));
    }

    public final String h() {
        return getString(cO(1, bsyn.a));
    }

    public final String i() {
        return getString(cO(7, bsyn.a));
    }

    public final String j() {
        return getString(cO(6, bsyn.a));
    }

    public final String k() {
        return getString(cO(3, bsyn.a));
    }

    public final String l() {
        return getString(cO(2, bsyn.a));
    }

    public final String m() {
        return getString(cO(0, bsyn.a));
    }

    public final String n() {
        return getString(cO(8, bsyn.a));
    }

    public final String o() {
        return getString(cO(9, bsyn.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
