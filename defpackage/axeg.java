package defpackage;

import android.database.Cursor;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axeg extends dqqf implements axea {
    @Deprecated
    public axeg(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, axel axelVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, axer.a, dqwjVar, dqtmVar, axelVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new axdi();
    }

    @Override // defpackage.axea
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            if (g() != null) {
                ekfwVar.h(g());
            }
        }
        return ekfwVar.g();
    }

    public final int e() {
        return getInt(cO(0, axer.a));
    }

    public final axcm f() {
        return axcn.a(getString(cO(3, axer.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        axcm[] axcmVarArr;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                axcm[] axcmVarArr2 = null;
                int[] iArrA = zDj ? z ? dqru.A(null, ds(getString(cO(0, axer.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: axeb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sub_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, axer.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: axec
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sim_serial_number:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr2 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, axer.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: axed
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "telephony_phone_number:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                if (!dj(3)) {
                    axcmVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(3, axer.a)));
                    int length2 = strArrDu.length;
                    axcm[] axcmVarArr3 = new axcm[length2];
                    for (int i = 0; i < length2; i++) {
                        axcmVarArr3[i] = axcn.a(strArrDu[i]);
                    }
                    axcmVarArr = (axcm[]) dqru.D(null, axcmVarArr3, new axcm[0]);
                } else {
                    axcmVarArr = new axcm[]{f()};
                }
                dqqf.dA(length, axcmVarArr, new ejxr() { // from class: axee
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "my_identity_token:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (dj(4)) {
                    if (z) {
                        String[] strArrDu2 = du(getString(cO(4, axer.a)));
                        int length3 = strArrDu2.length;
                        axcm[] axcmVarArr4 = new axcm[length3];
                        for (int i2 = 0; i2 < length3; i2++) {
                            axcmVarArr4[i2] = axcn.a(strArrDu2[i2]);
                        }
                        axcmVarArr2 = (axcm[]) dqru.D(null, axcmVarArr4, new axcm[0]);
                    } else {
                        axcmVarArr2 = new axcm[]{g()};
                    }
                }
                dqqf.dA(length, axcmVarArr2, new ejxr() { // from class: axef
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "my_identity_token_with_foreign_key:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                for (int i3 = 0; i3 < length; i3++) {
                    try {
                        long j = jArrDC[i3];
                        if (j > 0 && !hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(jArrDC[i3]));
                            String[] strArr3 = axer.a;
                            axdm axdmVar = new axdm();
                            axdmVar.aF();
                            axdmVar.aD();
                            long j2 = jArrDC[i3];
                            if (iArrA != null) {
                                axdmVar.f(iArrA[i3]);
                            }
                            if (strArr != null) {
                                axdmVar.e(strArr[i3]);
                            }
                            if (strArr2 != null) {
                                axdmVar.g(strArr2[i3]);
                            }
                            if (axcmVarArr != null) {
                                axdmVar.c(axcmVarArr[i3]);
                            }
                            if (axcmVarArr2 != null) {
                                axdmVar.d(axcmVarArr2[i3]);
                            }
                            ekfwVar.h(axdmVar.a());
                        }
                    } catch (dqod unused) {
                    }
                }
                return ekfwVar.g();
            }
        }
        int i4 = ekgb.d;
        return ekoe.a;
    }

    public final axcm g() {
        return axcn.a(getString(cO(4, axer.a)));
    }

    public final String h() {
        return getString(cO(1, axer.a));
    }

    public final String i() {
        return getString(cO(2, axer.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
