package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bner extends dqqf implements bndx {
    @Deprecated
    public bner(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bnez bnezVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bnfe.a, dqwjVar, dqtmVar, bnezVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bncg();
    }

    @Override // defpackage.bndx
    public final long c() {
        return getLong(cO(1, bnfe.a));
    }

    @Override // defpackage.bndx
    public final Uri e() {
        String string = getString(cO(7, bnfe.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    @Override // defpackage.bndx
    public final String f() {
        return getString(cO(4, bnfe.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Uri[] uriArr;
        long[] jArr;
        Uri[] uriArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        Uri[] uriArr3;
        Instant[] instantArr;
        Instant[] instantArr2;
        String[] strArr4;
        String[] strArr5;
        long[] jArrC;
        long[] jArr2;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        String[] strArr9;
        String[] strArr10;
        int i;
        int i2;
        long[] jArr3;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            int i3 = 0;
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                long[] jArrC2 = zDj ? z ? dqru.C(null, dt(getString(cO(0, bnfe.a)))) : new long[]{j()} : null;
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bndy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "cp2_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC3 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, bnfe.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bndz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "contact_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr11 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, bnfe.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr11, new ejxr() { // from class: bnea
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "lookup_key:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr12 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, bnfe.a))), new String[0]) : new String[]{t()} : null;
                dqqf.dA(length, strArr12, new ejxr() { // from class: bneb
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                String[] strArr13 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, bnfe.a))), new String[0]) : new String[]{f()} : null;
                dqqf.dA(length, strArr13, new ejxr() { // from class: bnec
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                String[] strArr14 = dj(5) ? z ? (String[]) dqru.D(null, du(getString(cO(5, bnfe.a))), new String[0]) : new String[]{s()} : null;
                dqqf.dA(length, strArr14, new ejxr() { // from class: bned
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "given_name:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr15 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, bnfe.a))), new String[0]) : new String[]{r()} : null;
                dqqf.dA(length, strArr15, new ejxr() { // from class: bnee
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "family_name:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(7, bnfe.a)));
                    int length2 = strArrDu.length;
                    Uri[] uriArr4 = new Uri[length2];
                    int i4 = 0;
                    while (i3 < length2) {
                        String str = strArrDu[i3];
                        int i5 = i4 + 1;
                        uriArr4[i4] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i3++;
                        i4 = i5;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr4, new Uri[0]);
                } else {
                    uriArr = new Uri[]{e()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: bnef
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "photo:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                if (!dj(8)) {
                    jArr = jArrDC;
                    uriArr2 = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(8, bnfe.a)));
                    int length3 = strArrDu2.length;
                    Uri[] uriArr5 = new Uri[length3];
                    jArr = jArrDC;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        String str2 = strArrDu2[i6];
                        int i8 = i7 + 1;
                        uriArr5[i7] = (str2 == null || str2.length() == 0) ? null : Uri.parse(str2);
                        i6++;
                        i7 = i8;
                    }
                    uriArr2 = (Uri[]) dqru.D(null, uriArr5, new Uri[0]);
                } else {
                    jArr = jArrDC;
                    uriArr2 = new Uri[]{l()};
                }
                dqqf.dA(length, uriArr2, new ejxr() { // from class: bneg
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "thumbnail:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                String[] strArr16 = dj(9) ? z ? (String[]) dqru.D(null, du(getString(cO(9, bnfe.a))), new String[0]) : new String[]{o()} : null;
                dqqf.dA(length, strArr16, new ejxr() { // from class: bneh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "birthday:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                if (!dj(10)) {
                    strArr = strArr16;
                    strArr2 = null;
                } else if (z) {
                    strArr = strArr16;
                    strArr2 = (String[]) dqru.D(null, du(getString(cO(10, bnfe.a))), new String[0]);
                } else {
                    strArr = strArr16;
                    strArr2 = new String[]{n()};
                }
                dqqf.dA(length, strArr2, new ejxr() { // from class: bnei
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "anniversary:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                if (!dj(11)) {
                    strArr3 = strArr2;
                    uriArr3 = uriArr2;
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(11, bnfe.a)));
                    int length4 = jArrDt.length;
                    strArr3 = strArr2;
                    Instant[] instantArr3 = new Instant[length4];
                    uriArr3 = uriArr2;
                    for (int i9 = 0; i9 < length4; i9++) {
                        instantArr3[i9] = bart.b(jArrDt[i9]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    strArr3 = strArr2;
                    uriArr3 = uriArr2;
                    instantArr = new Instant[]{m()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bnej
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_updated_timestamp:".concat(String.valueOf(this.a.getString(11)));
                    }
                });
                String[] strArr17 = dj(12) ? z ? (String[]) dqru.D(null, du(getString(cO(12, bnfe.a))), new String[0]) : new String[]{u()} : null;
                dqqf.dA(length, strArr17, new ejxr() { // from class: bnek
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sort_key:".concat(String.valueOf(this.a.getString(12)));
                    }
                });
                if (!dj(13)) {
                    instantArr2 = instantArr;
                    strArr4 = null;
                } else if (z) {
                    instantArr2 = instantArr;
                    strArr4 = (String[]) dqru.D(null, du(getString(cO(13, bnfe.a))), new String[0]);
                } else {
                    instantArr2 = instantArr;
                    strArr4 = new String[]{h()};
                }
                dqqf.dA(length, strArr4, new ejxr() { // from class: bnel
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "phonebook_label:".concat(String.valueOf(this.a.getString(13)));
                    }
                });
                long[] jArrC4 = dj(14) ? z ? dqru.C(null, dt(getString(cO(14, bnfe.a)))) : new long[]{k()} : null;
                dqqf.dz(length, jArrC4, new ejxr() { // from class: bnem
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "phonebook_bucket:".concat(String.valueOf(this.a.getString(14)));
                    }
                });
                if (!dj(15)) {
                    strArr5 = strArr4;
                    jArrC = null;
                } else if (z) {
                    strArr5 = strArr4;
                    jArrC = dqru.C(null, dt(getString(cO(15, bnfe.a))));
                } else {
                    strArr5 = strArr4;
                    jArrC = new long[]{i()};
                }
                dqqf.dz(length, jArrC, new ejxr() { // from class: bnen
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "contact_type:".concat(String.valueOf(this.a.getString(15)));
                    }
                });
                if (!dj(16)) {
                    jArr2 = jArrC;
                    strArr6 = strArr17;
                    strArr7 = null;
                } else if (z) {
                    jArr2 = jArrC;
                    strArr6 = strArr17;
                    strArr7 = (String[]) dqru.D(null, du(getString(cO(16, bnfe.a))), new String[0]);
                } else {
                    jArr2 = jArrC;
                    strArr6 = strArr17;
                    strArr7 = new String[]{v()};
                }
                dqqf.dA(length, strArr7, new ejxr() { // from class: bneo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "type_label:".concat(String.valueOf(this.a.getString(16)));
                    }
                });
                if (!dj(17)) {
                    strArr8 = strArr7;
                    strArr9 = null;
                } else if (z) {
                    strArr8 = strArr7;
                    strArr9 = (String[]) dqru.D(null, du(getString(cO(17, bnfe.a))), new String[0]);
                } else {
                    strArr8 = strArr7;
                    strArr9 = new String[]{q()};
                }
                dqqf.dA(length, strArr9, new ejxr() { // from class: bnep
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_destination:".concat(String.valueOf(this.a.getString(17)));
                    }
                });
                if (!dj(18)) {
                    strArr10 = null;
                    i = 0;
                } else if (z) {
                    i = 0;
                    strArr10 = (String[]) dqru.D(null, du(getString(cO(18, bnfe.a))), new String[0]);
                } else {
                    i = 0;
                    strArr10 = new String[]{p()};
                }
                dqqf.dA(length, strArr10, new ejxr() { // from class: bneq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "contact_fingerprint:".concat(String.valueOf(this.a.getString(18)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i10 = i;
                while (i10 < length) {
                    try {
                        long j = jArr[i10];
                        if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                            i2 = length;
                            jArr3 = jArrC4;
                        } else {
                            hashSet.add(Long.valueOf(jArr[i10]));
                            String[] strArr18 = bnfe.a;
                            bnci bnciVar = new bnci();
                            bnciVar.aF();
                            bnciVar.aD();
                            long j2 = jArr[i10];
                            if (jArrC2 != null) {
                                i2 = length;
                                jArr3 = jArrC4;
                                bnciVar.g(jArrC2[i10]);
                            } else {
                                i2 = length;
                                jArr3 = jArrC4;
                            }
                            if (jArrC3 != null) {
                                bnciVar.e(jArrC3[i10]);
                            }
                            if (strArr11 != null) {
                                bnciVar.m(strArr11[i10]);
                            }
                            if (strArr12 != null) {
                                bnciVar.n(strArr12[i10]);
                            }
                            if (strArr13 != null) {
                                bnciVar.i(strArr13[i10]);
                            }
                            if (strArr14 != null) {
                                bnciVar.k(strArr14[i10]);
                            }
                            if (strArr15 != null) {
                                bnciVar.j(strArr15[i10]);
                            }
                            if (uriArr != null) {
                                bnciVar.q(uriArr[i10]);
                            }
                            if (uriArr3 != null) {
                                bnciVar.s(uriArr3[i10]);
                            }
                            if (strArr != null) {
                                bnciVar.c(strArr[i10]);
                            }
                            if (strArr3 != null) {
                                bnciVar.b(strArr3[i10]);
                            }
                            if (instantArr2 != null) {
                                bnciVar.l(instantArr2[i10]);
                            }
                            if (strArr6 != null) {
                                bnciVar.r(strArr6[i10]);
                            }
                            if (strArr5 != null) {
                                bnciVar.p(strArr5[i10]);
                            }
                            if (jArr3 != null) {
                                bnciVar.o(jArr3[i10]);
                            }
                            if (jArr2 != null) {
                                bnciVar.f(jArr2[i10]);
                            }
                            if (strArr8 != null) {
                                bnciVar.t(strArr8[i10]);
                            }
                            if (strArr9 != null) {
                                bnciVar.h(strArr9[i10]);
                            }
                            if (strArr10 != null) {
                                bnciVar.d(strArr10[i10]);
                            }
                            ekfwVar.h(bnciVar.a());
                        }
                        i10++;
                        length = i2;
                        jArrC4 = jArr3;
                    } catch (dqod unused) {
                    }
                }
                return ekfwVar.g();
            }
        }
        int i11 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.bndx
    public final String g() {
        return getString(cO(2, bnfe.a));
    }

    @Override // defpackage.bndx
    public final String h() {
        return getString(cO(13, bnfe.a));
    }

    public final long i() {
        return getLong(cO(15, bnfe.a));
    }

    public final long j() {
        return getLong(cO(0, bnfe.a));
    }

    public final long k() {
        return getLong(cO(14, bnfe.a));
    }

    public final Uri l() {
        String string = getString(cO(8, bnfe.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Instant m() {
        return bart.b(getLong(cO(11, bnfe.a)));
    }

    public final String n() {
        return getString(cO(10, bnfe.a));
    }

    public final String o() {
        return getString(cO(9, bnfe.a));
    }

    public final String p() {
        return getString(cO(18, bnfe.a));
    }

    public final String q() {
        return getString(cO(17, bnfe.a));
    }

    public final String r() {
        return getString(cO(6, bnfe.a));
    }

    public final String s() {
        return getString(cO(5, bnfe.a));
    }

    public final String t() {
        return getString(cO(3, bnfe.a));
    }

    public final String u() {
        return getString(cO(12, bnfe.a));
    }

    public final String v() {
        return getString(cO(16, bnfe.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
