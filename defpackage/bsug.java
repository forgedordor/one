package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsug extends dqqf implements bstl {
    @Deprecated
    public bsug(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bsum bsumVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, ProfilesTable.a, dqwjVar, dqtmVar, bsumVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bsrr();
    }

    @Override // defpackage.bstl
    public final ekgb c() {
        ekfw ekfwVar = new ekfw();
        while (moveToNext()) {
            h();
            ekfwVar.h(Long.valueOf(h()));
        }
        return ekfwVar.g();
    }

    public final long e() {
        return getLong(cO(19, ProfilesTable.a));
    }

    public final long f() {
        return getLong(cO(0, ProfilesTable.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        anqd[] anqdVarArr;
        chpw[] chpwVarArr;
        long[] jArr;
        chpw[] chpwVarArr2;
        Uri[] uriArr;
        Uri[] uriArr2;
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        boolean[] zArrE;
        boolean[] zArr;
        long[] jArrC;
        long[] jArr2;
        long[] jArrC2;
        long[] jArr3;
        boolean[] zArrE2;
        int i;
        boolean[] zArr2;
        String[] strArr7;
        int i2;
        chpw chpwVar;
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
                long[] jArrC3 = zDj ? z ? dqru.C(null, dt(getString(cO(0, ProfilesTable.a)))) : new long[]{f()} : null;
                dqqf.dz(length, jArrC3, new ejxr() { // from class: bstm
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                long[] jArrC4 = dj(1) ? z ? dqru.C(null, dt(getString(cO(1, ProfilesTable.a)))) : new long[]{h()} : null;
                dqqf.dz(length, jArrC4, new ejxr() { // from class: bsto
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "participant_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                String[] strArr8 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, ProfilesTable.a))), new String[0]) : new String[]{q()} : null;
                dqqf.dA(length, strArr8, new ejxr() { // from class: bstp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "person_id:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr9 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, ProfilesTable.a))), new String[0]) : new String[]{s()} : null;
                dqqf.dA(length, strArr9, new ejxr() { // from class: bstq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "profile_access_token:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    anqdVarArr = null;
                } else if (z) {
                    int[] iArrDs = ds(getString(cO(4, ProfilesTable.a)));
                    anqd[] anqdVarArrValues = anqd.values();
                    int length2 = anqdVarArrValues.length;
                    anqd[] anqdVarArr2 = new anqd[iArrDs.length];
                    for (int i4 = 0; i4 < iArrDs.length; i4++) {
                        int i5 = iArrDs[i4];
                        if (i5 >= length2) {
                            throw new IllegalStateException();
                        }
                        anqdVarArr2[i4] = anqdVarArrValues[i5];
                    }
                    anqdVarArr = (anqd[]) dqru.D(null, anqdVarArr2, new anqd[0]);
                } else {
                    anqdVarArr = new anqd[]{k()};
                }
                dqqf.dA(length, anqdVarArr, new ejxr() { // from class: bstr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sending_self_profile_interaction_state:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                if (!dj(5)) {
                    chpwVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(5, ProfilesTable.a)));
                    chpw[] chpwVarArr3 = new chpw[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i7 = i6 + 1;
                            if (bArrZ == null) {
                                chpwVar = null;
                            } else {
                                try {
                                    chpwVar = (chpw) evsn.parseFrom(chpw.a, bArrZ);
                                } catch (Throwable unused) {
                                    i6 = i7;
                                    chpwVarArr3[i6] = null;
                                    i6++;
                                    i3 = 0;
                                }
                            }
                            chpwVarArr3[i6] = chpwVar;
                            i6 = i7;
                        } catch (Throwable unused2) {
                        }
                        i3 = 0;
                    }
                    chpwVarArr = (chpw[]) dqru.D(null, chpwVarArr3, new chpw[i3]);
                } else {
                    chpwVarArr = new chpw[]{l()};
                }
                dqqf.dA(length, chpwVarArr, new ejxr() { // from class: bsts
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "self_profile_sharing_metadata:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                String[] strArr10 = dj(6) ? z ? (String[]) dqru.D(null, du(getString(cO(6, ProfilesTable.a))), new String[0]) : new String[]{o()} : null;
                dqqf.dA(length, strArr10, new ejxr() { // from class: bstt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "first_name:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                String[] strArr11 = dj(7) ? z ? (String[]) dqru.D(null, du(getString(cO(7, ProfilesTable.a))), new String[0]) : new String[]{p()} : null;
                dqqf.dA(length, strArr11, new ejxr() { // from class: bstu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_name:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                String[] strArr12 = dj(8) ? z ? (String[]) dqru.D(null, du(getString(cO(8, ProfilesTable.a))), new String[0]) : new String[]{n()} : null;
                dqqf.dA(length, strArr12, new ejxr() { // from class: bstv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "display_name:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                if (!dj(9)) {
                    jArr = jArrDC;
                    chpwVarArr2 = chpwVarArr;
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(9, ProfilesTable.a)));
                    int length3 = strArrDu.length;
                    jArr = jArrDC;
                    Uri[] uriArr3 = new Uri[length3];
                    chpwVarArr2 = chpwVarArr;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        String str = strArrDu[i8];
                        int i10 = i9 + 1;
                        uriArr3[i9] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i8++;
                        i9 = i10;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr3, new Uri[0]);
                } else {
                    jArr = jArrDC;
                    chpwVarArr2 = chpwVarArr;
                    uriArr = new Uri[]{j()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: bstw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "photo_uri:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                String[] strArr13 = dj(10) ? z ? (String[]) dqru.D(null, du(getString(cO(10, ProfilesTable.a))), new String[0]) : new String[]{t()} : null;
                dqqf.dA(length, strArr13, new ejxr() { // from class: bstx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sender_last_updated_time:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                if (!dj(11)) {
                    uriArr2 = uriArr;
                    strArr = null;
                } else if (z) {
                    uriArr2 = uriArr;
                    strArr = (String[]) dqru.D(null, du(getString(cO(11, ProfilesTable.a))), new String[0]);
                } else {
                    uriArr2 = uriArr;
                    strArr = new String[]{u()};
                }
                dqqf.dA(length, strArr, new ejxr() { // from class: bsty
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "sender_last_updated_time_from_rcs:".concat(String.valueOf(this.a.getString(11)));
                    }
                });
                if (!dj(12)) {
                    strArr2 = strArr;
                    strArr3 = null;
                } else if (z) {
                    strArr2 = strArr;
                    strArr3 = (String[]) dqru.D(null, du(getString(cO(12, ProfilesTable.a))), new String[0]);
                } else {
                    strArr2 = strArr;
                    strArr3 = new String[]{m()};
                }
                dqqf.dA(length, strArr3, new ejxr() { // from class: bstz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "contact_lookup_key:".concat(String.valueOf(this.a.getString(12)));
                    }
                });
                if (!dj(13)) {
                    strArr4 = strArr3;
                    strArr5 = null;
                } else if (z) {
                    strArr4 = strArr3;
                    strArr5 = (String[]) dqru.D(null, du(getString(cO(13, ProfilesTable.a))), new String[0]);
                } else {
                    strArr4 = strArr3;
                    strArr5 = new String[]{r()};
                }
                dqqf.dA(length, strArr5, new ejxr() { // from class: bsua
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "phone_number:".concat(String.valueOf(this.a.getString(13)));
                    }
                });
                boolean[] zArrE3 = dj(14) ? z ? dqru.E(null, dv(getString(cO(14, ProfilesTable.a)))) : new boolean[]{x()} : null;
                dqqf.dB(length, zArrE3, new ejxr() { // from class: bsub
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_self_profile_shareable:".concat(String.valueOf(this.a.getString(14)));
                    }
                });
                if (!dj(15)) {
                    strArr6 = strArr5;
                    zArrE = null;
                } else if (z) {
                    strArr6 = strArr5;
                    zArrE = dqru.E(null, dv(getString(cO(15, ProfilesTable.a))));
                } else {
                    strArr6 = strArr5;
                    zArrE = new boolean[]{w()};
                }
                dqqf.dB(length, zArrE, new ejxr() { // from class: bsuc
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "has_shared_access_token_with_user:".concat(String.valueOf(this.a.getString(15)));
                    }
                });
                if (!dj(16)) {
                    zArr = zArrE;
                    jArrC = null;
                } else if (z) {
                    zArr = zArrE;
                    jArrC = dqru.C(null, dt(getString(cO(16, ProfilesTable.a))));
                } else {
                    zArr = zArrE;
                    jArrC = new long[]{g()};
                }
                dqqf.dz(length, jArrC, new ejxr() { // from class: bsud
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "name_timestamp:".concat(String.valueOf(this.a.getString(16)));
                    }
                });
                if (!dj(17)) {
                    jArr2 = jArrC;
                    jArrC2 = null;
                } else if (z) {
                    jArr2 = jArrC;
                    jArrC2 = dqru.C(null, dt(getString(cO(17, ProfilesTable.a))));
                } else {
                    jArr2 = jArrC;
                    jArrC2 = new long[]{i()};
                }
                dqqf.dz(length, jArrC2, new ejxr() { // from class: bsue
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "photo_timestamp:".concat(String.valueOf(this.a.getString(17)));
                    }
                });
                if (!dj(18)) {
                    jArr3 = jArrC2;
                    zArrE2 = null;
                } else if (z) {
                    jArr3 = jArrC2;
                    zArrE2 = dqru.E(null, dv(getString(cO(18, ProfilesTable.a))));
                } else {
                    jArr3 = jArrC2;
                    zArrE2 = new boolean[]{v()};
                }
                dqqf.dB(length, zArrE2, new ejxr() { // from class: bsuf
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "belongs_to_self_gaia:".concat(String.valueOf(this.a.getString(18)));
                    }
                });
                long[] jArrC5 = dj(19) ? z ? dqru.C(null, dt(getString(cO(19, ProfilesTable.a)))) : new long[]{e()} : null;
                dqqf.dz(length, jArrC5, new ejxr() { // from class: bstn
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "gaia_update_timestamp:".concat(String.valueOf(this.a.getString(19)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i11 = 0;
                while (i11 < length) {
                    long j = jArr[i11];
                    if (j > 0) {
                        i = i11;
                        if (!hashSet.contains(Long.valueOf(j))) {
                            hashSet.add(Long.valueOf(jArr[i]));
                            String[] strArr14 = ProfilesTable.a;
                            bsrt bsrtVar = new bsrt();
                            bsrtVar.aF();
                            bsrtVar.aD();
                            long j2 = jArr[i];
                            zArr2 = zArrE2;
                            strArr7 = strArr13;
                            if (jArrC3 != null) {
                                long j3 = jArrC3[i];
                                i2 = length;
                                bsrtVar.aE(0);
                                bsrtVar.a = j3;
                            } else {
                                i2 = length;
                            }
                            if (jArrC4 != null) {
                                bsrtVar.i(jArrC4[i]);
                            }
                            if (strArr8 != null) {
                                bsrtVar.j(strArr8[i]);
                            }
                            if (strArr9 != null) {
                                bsrtVar.m(strArr9[i]);
                            }
                            if (anqdVarArr != null) {
                                anqd anqdVar = anqdVarArr[i];
                                int i12 = bsrtVar.aB;
                                if (i12 < 60200) {
                                    dqru.x("sending_self_profile_interaction_state", i12);
                                }
                                bsrtVar.aE(4);
                                bsrtVar.e = anqdVar;
                            }
                            if (chpwVarArr2 != null) {
                                bsrtVar.n(chpwVarArr2[i]);
                            }
                            if (strArr10 != null) {
                                bsrtVar.e(strArr10[i]);
                            }
                            if (strArr11 != null) {
                                bsrtVar.h(strArr11[i]);
                            }
                            if (strArr12 != null) {
                                bsrtVar.d(strArr12[i]);
                            }
                            if (uriArr2 != null) {
                                bsrtVar.l(uriArr2[i]);
                            }
                            if (strArr7 != null) {
                                bsrtVar.o(strArr7[i]);
                            }
                            if (strArr2 != null) {
                                bsrtVar.p(strArr2[i]);
                            }
                            if (strArr4 != null) {
                                bsrtVar.c(strArr4[i]);
                            }
                            if (strArr6 != null) {
                                bsrtVar.k(strArr6[i]);
                            }
                            if (zArrE3 != null) {
                                bsrtVar.g(zArrE3[i]);
                            }
                            if (zArr != null) {
                                boolean z2 = zArr[i];
                                int i13 = bsrtVar.aB;
                                if (i13 < 60170) {
                                    dqru.x("has_shared_access_token_with_user", i13);
                                }
                                bsrtVar.aE(15);
                                bsrtVar.p = z2;
                            }
                            if (jArr2 != null) {
                                long j4 = jArr2[i];
                                bsrtVar.aE(16);
                                bsrtVar.q = j4;
                            }
                            if (jArr3 != null) {
                                long j5 = jArr3[i];
                                bsrtVar.aE(17);
                                bsrtVar.r = j5;
                            }
                            if (zArr2 != null) {
                                bsrtVar.b(zArr2[i]);
                            }
                            if (jArrC5 != null) {
                                bsrtVar.f(jArrC5[i]);
                            }
                            ekfwVar.h(bsrtVar.a());
                        }
                        i11 = i + 1;
                        strArr13 = strArr7;
                        zArrE2 = zArr2;
                        length = i2;
                    } else {
                        i = i11;
                    }
                    zArr2 = zArrE2;
                    strArr7 = strArr13;
                    i2 = length;
                    i11 = i + 1;
                    strArr13 = strArr7;
                    zArrE2 = zArr2;
                    length = i2;
                }
                return ekfwVar.g();
            }
        }
        int i14 = ekgb.d;
        return ekoe.a;
    }

    public final long g() {
        return getLong(cO(16, ProfilesTable.a));
    }

    public final long h() {
        return getLong(cO(1, ProfilesTable.a));
    }

    public final long i() {
        return getLong(cO(17, ProfilesTable.a));
    }

    public final Uri j() {
        String string = getString(cO(9, ProfilesTable.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final anqd k() {
        anqd[] anqdVarArrValues = anqd.values();
        int i = getInt(cO(4, ProfilesTable.a));
        if (i < anqdVarArrValues.length) {
            return anqdVarArrValues[i];
        }
        throw new IllegalArgumentException();
    }

    public final chpw l() {
        byte[] blob = getBlob(cO(5, ProfilesTable.a));
        if (blob == null) {
            return null;
        }
        try {
            return (chpw) evsn.parseFrom(chpw.a, blob, evrr.a());
        } catch (Throwable unused) {
            return chpw.a;
        }
    }

    public final String m() {
        return getString(cO(12, ProfilesTable.a));
    }

    public final String n() {
        return getString(cO(8, ProfilesTable.a));
    }

    public final String o() {
        return getString(cO(6, ProfilesTable.a));
    }

    public final String p() {
        return getString(cO(7, ProfilesTable.a));
    }

    public final String q() {
        return getString(cO(2, ProfilesTable.a));
    }

    public final String r() {
        return getString(cO(13, ProfilesTable.a));
    }

    public final String s() {
        return getString(cO(3, ProfilesTable.a));
    }

    public final String t() {
        return getString(cO(10, ProfilesTable.a));
    }

    public final String u() {
        return getString(cO(11, ProfilesTable.a));
    }

    public final boolean v() {
        return getInt(cO(18, ProfilesTable.a)) == 1;
    }

    public final boolean w() {
        return getInt(cO(15, ProfilesTable.a)) == 1;
    }

    public final boolean x() {
        return getInt(cO(14, ProfilesTable.a)) == 1;
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
