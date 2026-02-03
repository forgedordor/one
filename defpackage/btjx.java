package defpackage;

import android.database.Cursor;
import j$.time.Instant;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btjx extends dqqf implements btjn {
    @Deprecated
    public btjx(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, btkd btkdVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, btkh.a, dqwjVar, dqtmVar, btkdVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new btiq();
    }

    @Override // defpackage.btjn
    public final long c() {
        return getLong(cO(6, btkh.a));
    }

    @Override // defpackage.btjn
    public final Instant e() {
        return bart.b(getLong(cO(7, btkh.a)));
    }

    @Override // defpackage.btjn
    public final Instant f() {
        return bart.b(getLong(cO(4, btkh.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        Instant[] instantArr;
        Instant[] instantArr2;
        long[] jArr;
        char c;
        int i;
        HashSet hashSet;
        ekfw ekfwVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet2 = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                String[] strArr = zDj ? z ? (String[]) dqru.D(null, du(getString(cO(0, btkh.a))), new String[0]) : new String[]{l()} : null;
                dqqf.dA(length, strArr, new ejxr() { // from class: btjo
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                String[] strArr2 = dj(1) ? z ? (String[]) dqru.D(null, du(getString(cO(1, btkh.a))), new String[0]) : new String[]{g()} : null;
                dqqf.dA(length, strArr2, new ejxr() { // from class: btjp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "remote_instance_id:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                boolean[] zArrE = dj(2) ? z ? dqru.E(null, dv(getString(cO(2, btkh.a)))) : new boolean[]{i()} : null;
                dqqf.dB(length, zArrE, new ejxr() { // from class: btjq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "etouffee:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                String[] strArr3 = dj(3) ? z ? (String[]) dqru.D(null, du(getString(cO(3, btkh.a))), new String[0]) : new String[]{h()} : null;
                dqqf.dA(length, strArr3, new ejxr() { // from class: btjr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "tachyon_id:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                if (!dj(4)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(4, btkh.a)));
                    int length2 = jArrDt.length;
                    Instant[] instantArr3 = new Instant[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        instantArr3[i2] = bart.b(jArrDt[i2]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr3, new Instant[0]);
                } else {
                    instantArr = new Instant[]{f()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: btjs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "last_modified_timestamp:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                byte[][] bArrF = dj(5) ? z ? dqru.F(null, dD(getString(cO(5, btkh.a)))) : new byte[][]{k()} : null;
                dqqf.dA(length, bArrF, new ejxr() { // from class: btjt
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "identity_key:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                long[] jArrC = dj(6) ? z ? dqru.C(null, dt(getString(cO(6, btkh.a)))) : new long[]{c()} : null;
                dqqf.dz(length, jArrC, new ejxr() { // from class: btju
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "updated_at_hash:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    instantArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(7, btkh.a)));
                    int length3 = jArrDt2.length;
                    Instant[] instantArr4 = new Instant[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        instantArr4[i3] = bart.b(jArrDt2[i3]);
                    }
                    instantArr2 = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                } else {
                    instantArr2 = new Instant[]{e()};
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: btjv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "guaranteed_fresh_as_of_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                char c2 = '\b';
                boolean[] zArrE2 = dj(8) ? z ? dqru.E(null, dv(getString(cO(8, btkh.a)))) : new boolean[]{j()} : null;
                dqqf.dB(length, zArrE2, new ejxr() { // from class: btjw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "is_updated_at_hash_valid:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                ekfw ekfwVar2 = new ekfw();
                int i4 = 0;
                while (i4 < length) {
                    long j = jArrDC[i4];
                    if (j <= 0) {
                        jArr = jArrDC;
                        c = c2;
                        i = length;
                        hashSet = hashSet2;
                    } else if (hashSet2.contains(Long.valueOf(j))) {
                        jArr = jArrDC;
                        i = length;
                        hashSet = hashSet2;
                        c = '\b';
                    } else {
                        hashSet2.add(Long.valueOf(jArrDC[i4]));
                        String[] strArr4 = btkh.a;
                        btis btisVar = new btis();
                        btisVar.aF();
                        btisVar.aD();
                        long j2 = jArrDC[i4];
                        if (strArr != null) {
                            String str = strArr[i4];
                            jArr = jArrDC;
                            btisVar.aE(0);
                            btisVar.a = str;
                        } else {
                            jArr = jArrDC;
                        }
                        if (strArr2 != null) {
                            String str2 = strArr2[i4];
                            btisVar.aE(1);
                            btisVar.b = str2;
                        }
                        if (zArrE != null) {
                            boolean z2 = zArrE[i4];
                            btisVar.aE(2);
                            btisVar.c = z2;
                        }
                        if (strArr3 != null) {
                            String str3 = strArr3[i4];
                            btisVar.aE(3);
                            btisVar.d = str3;
                        }
                        if (instantArr != null) {
                            Instant instant = instantArr[i4];
                            int i5 = btisVar.aB;
                            i = length;
                            if (i5 < 35040) {
                                dqru.x("last_modified_timestamp", i5);
                            }
                            btisVar.aE(4);
                            btisVar.e = instant;
                        } else {
                            i = length;
                        }
                        if (bArrF != null) {
                            byte[] bArr = bArrF[i4];
                            int i6 = btisVar.aB;
                            if (i6 < 38010) {
                                dqru.x("identity_key", i6);
                            }
                            btisVar.aE(5);
                            btisVar.f = bArr;
                        }
                        if (jArrC != null) {
                            long j3 = jArrC[i4];
                            int i7 = btisVar.aB;
                            hashSet = hashSet2;
                            if (i7 < 39040) {
                                dqru.x("updated_at_hash", i7);
                            }
                            btisVar.aE(6);
                            btisVar.g = j3;
                        } else {
                            hashSet = hashSet2;
                        }
                        if (instantArr2 != null) {
                            Instant instant2 = instantArr2[i4];
                            int i8 = btisVar.aB;
                            if (i8 < 40010) {
                                dqru.x("guaranteed_fresh_as_of_timestamp", i8);
                            }
                            btisVar.aE(7);
                            btisVar.h = instant2;
                        }
                        if (zArrE2 != null) {
                            boolean z3 = zArrE2[i4];
                            int i9 = btisVar.aB;
                            if (i9 < 40030) {
                                dqru.x("is_updated_at_hash_valid", i9);
                            }
                            c = '\b';
                            btisVar.aE(8);
                            btisVar.i = z3;
                        } else {
                            c = '\b';
                        }
                        btiq btiqVar = new btiq();
                        btiqVar.aD(btisVar.aB());
                        btiqVar.a = btisVar.a;
                        btiqVar.b = btisVar.b;
                        btiqVar.c = btisVar.c;
                        btiqVar.d = btisVar.d;
                        btiqVar.e = btisVar.e;
                        btiqVar.f = btisVar.f;
                        ekfwVar = ekfwVar2;
                        btiqVar.g = btisVar.g;
                        btiqVar.h = btisVar.h;
                        btiqVar.i = btisVar.i;
                        btiqVar.cM = btisVar.aC();
                        ekfwVar.h(btiqVar);
                        i4++;
                        c2 = c;
                        ekfwVar2 = ekfwVar;
                        jArrDC = jArr;
                        length = i;
                        hashSet2 = hashSet;
                    }
                    ekfwVar = ekfwVar2;
                    i4++;
                    c2 = c;
                    ekfwVar2 = ekfwVar;
                    jArrDC = jArr;
                    length = i;
                    hashSet2 = hashSet;
                }
                return ekfwVar2.g();
            }
        }
        int i10 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.btjn
    public final String g() {
        return getString(cO(1, btkh.a));
    }

    @Override // defpackage.btjn
    public final String h() {
        return getString(cO(3, btkh.a));
    }

    @Override // defpackage.btjn
    public final boolean i() {
        return getInt(cO(2, btkh.a)) == 1;
    }

    @Override // defpackage.btjn
    public final boolean j() {
        return getInt(cO(8, btkh.a)) == 1;
    }

    @Override // defpackage.btjn
    public final byte[] k() {
        return getBlob(cO(5, btkh.a));
    }

    public final String l() {
        return getString(cO(0, btkh.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
