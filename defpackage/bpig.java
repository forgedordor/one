package defpackage;

import android.database.Cursor;
import android.net.Uri;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpig extends dqqf implements bphn {
    @Deprecated
    public bpig(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, bpik bpikVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, bpio.a, dqwjVar, dqtmVar, bpikVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new bpfw();
    }

    @Override // defpackage.bphn
    public final int c() {
        return getInt(cO(6, bpio.a));
    }

    @Override // defpackage.bphn
    public final int e() {
        return getInt(cO(3, bpio.a));
    }

    @Override // defpackage.bphn
    public final basd f() {
        return basd.a(getString(cO(0, bpio.a)));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        basd[] basdVarArr;
        Instant[] instantArr;
        long[] jArr;
        Uri[] uriArr;
        String[] strArr;
        byte[][] bArrF;
        byte[][] bArr;
        Uri[] uriArr2;
        String[] strArr2;
        String[] strArr3;
        byte[][] bArr2;
        Instant[] instantArr2;
        Instant[] instantArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        int i;
        epwa[] epwaVarArr;
        epwa[] epwaVarArr2;
        String[] strArr9;
        epwa epwaVar;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length != 0) {
            if (length != 1 || jArrDC[0] != -1) {
                HashSet hashSet = new HashSet();
                dqtm dqtmVar = this.d;
                boolean zDj = dj(0);
                boolean z = dqtmVar.b;
                if (!zDj) {
                    basdVarArr = null;
                } else if (z) {
                    String[] strArrDu = du(getString(cO(0, bpio.a)));
                    int length2 = strArrDu.length;
                    basd[] basdVarArr2 = new basd[length2];
                    for (int i2 = 0; i2 < length2; i2++) {
                        basdVarArr2[i2] = basd.a(strArrDu[i2]);
                    }
                    basdVarArr = (basd[]) dqru.D(null, basdVarArr2, new basd[0]);
                } else {
                    basdVarArr = new basd[]{f()};
                }
                dqqf.dA(length, basdVarArr, new ejxr() { // from class: bpho
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "rcs_message_id:".concat(String.valueOf(this.a.getString(0)));
                    }
                });
                byte[][] bArrF2 = dj(1) ? z ? dqru.F(null, dD(getString(cO(1, bpio.a)))) : new byte[][]{n()} : null;
                dqqf.dA(length, bArrF2, new ejxr() { // from class: bpif
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "preview_etouffee:".concat(String.valueOf(this.a.getString(1)));
                    }
                });
                byte[][] bArrF3 = dj(2) ? z ? dqru.F(null, dD(getString(cO(2, bpio.a)))) : new byte[][]{m()} : null;
                dqqf.dA(length, bArrF3, new ejxr() { // from class: bphp
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "preview_summary:".concat(String.valueOf(this.a.getString(2)));
                    }
                });
                int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, bpio.a)))) : new int[]{e()} : null;
                dqqf.dy(length, iArrA, new ejxr() { // from class: bphq
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "preview_version:".concat(String.valueOf(this.a.getString(3)));
                    }
                });
                byte[][] bArrF4 = dj(4) ? z ? dqru.F(null, dD(getString(cO(4, bpio.a)))) : new byte[][]{l()} : null;
                dqqf.dA(length, bArrF4, new ejxr() { // from class: bphr
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachment_etouffee:".concat(String.valueOf(this.a.getString(4)));
                    }
                });
                byte[][] bArrF5 = dj(5) ? z ? dqru.F(null, dD(getString(cO(5, bpio.a)))) : new byte[][]{k()} : null;
                dqqf.dA(length, bArrF5, new ejxr() { // from class: bphs
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachment_summary:".concat(String.valueOf(this.a.getString(5)));
                    }
                });
                int[] iArrA2 = dj(6) ? z ? dqru.A(null, ds(getString(cO(6, bpio.a)))) : new int[]{c()} : null;
                dqqf.dy(length, iArrA2, new ejxr() { // from class: bpht
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachment_version:".concat(String.valueOf(this.a.getString(6)));
                    }
                });
                if (!dj(7)) {
                    instantArr = null;
                } else if (z) {
                    long[] jArrDt = dt(getString(cO(7, bpio.a)));
                    int length3 = jArrDt.length;
                    Instant[] instantArr4 = new Instant[length3];
                    for (int i3 = 0; i3 < length3; i3++) {
                        instantArr4[i3] = bart.b(jArrDt[i3]);
                    }
                    instantArr = (Instant[]) dqru.D(null, instantArr4, new Instant[0]);
                } else {
                    instantArr = new Instant[]{p()};
                }
                dqqf.dA(length, instantArr, new ejxr() { // from class: bphu
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "creation_timestamp:".concat(String.valueOf(this.a.getString(7)));
                    }
                });
                if (!dj(8)) {
                    jArr = jArrDC;
                    uriArr = null;
                } else if (z) {
                    String[] strArrDu2 = du(getString(cO(8, bpio.a)));
                    int length4 = strArrDu2.length;
                    Uri[] uriArr3 = new Uri[length4];
                    jArr = jArrDC;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < length4) {
                        String str = strArrDu2[i4];
                        int i6 = i5 + 1;
                        uriArr3[i5] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                        i4++;
                        i5 = i6;
                    }
                    uriArr = (Uri[]) dqru.D(null, uriArr3, new Uri[0]);
                } else {
                    jArr = jArrDC;
                    uriArr = new Uri[]{o()};
                }
                dqqf.dA(length, uriArr, new ejxr() { // from class: bphv
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "attachment_uri:".concat(String.valueOf(this.a.getString(8)));
                    }
                });
                String[] strArr10 = dj(9) ? z ? (String[]) dqru.D(null, du(getString(cO(9, bpio.a))), new String[0]) : new String[]{r()} : null;
                dqqf.dA(length, strArr10, new ejxr() { // from class: bphw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "custom_delivery_receipt_mime_type:".concat(String.valueOf(this.a.getString(9)));
                    }
                });
                byte[][] bArrF6 = dj(10) ? z ? dqru.F(null, dD(getString(cO(10, bpio.a)))) : new byte[][]{t()} : null;
                dqqf.dA(length, bArrF6, new ejxr() { // from class: bphx
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "custom_delivery_receipt_content:".concat(String.valueOf(this.a.getString(10)));
                    }
                });
                if (!dj(11)) {
                    strArr = strArr10;
                    bArrF = null;
                } else if (z) {
                    strArr = strArr10;
                    bArrF = dqru.F(null, dD(getString(cO(11, bpio.a))));
                } else {
                    strArr = strArr10;
                    bArrF = new byte[][]{u()};
                }
                dqqf.dA(length, bArrF, new ejxr() { // from class: bphy
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_uploaded_xml_from_content_server:".concat(String.valueOf(this.a.getString(11)));
                    }
                });
                if (!dj(12)) {
                    bArr = bArrF;
                    uriArr2 = uriArr;
                    strArr2 = null;
                } else if (z) {
                    bArr = bArrF;
                    uriArr2 = uriArr;
                    strArr2 = (String[]) dqru.D(null, du(getString(cO(12, bpio.a))), new String[0]);
                } else {
                    bArr = bArrF;
                    uriArr2 = uriArr;
                    strArr2 = new String[]{s()};
                }
                dqqf.dA(length, strArr2, new ejxr() { // from class: bphz
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_uploaded_fallback_uri:".concat(String.valueOf(this.a.getString(12)));
                    }
                });
                if (!dj(13)) {
                    strArr3 = strArr2;
                    bArr2 = bArrF6;
                    instantArr2 = null;
                } else if (z) {
                    long[] jArrDt2 = dt(getString(cO(13, bpio.a)));
                    int length5 = jArrDt2.length;
                    strArr3 = strArr2;
                    Instant[] instantArr5 = new Instant[length5];
                    bArr2 = bArrF6;
                    for (int i7 = 0; i7 < length5; i7++) {
                        instantArr5[i7] = bart.b(jArrDt2[i7]);
                    }
                    instantArr2 = (Instant[]) dqru.D(null, instantArr5, new Instant[0]);
                } else {
                    strArr3 = strArr2;
                    bArr2 = bArrF6;
                    instantArr2 = new Instant[]{q()};
                }
                dqqf.dA(length, instantArr2, new ejxr() { // from class: bpia
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "file_uploaded_expiry:".concat(String.valueOf(this.a.getString(13)));
                    }
                });
                String[] strArr11 = dj(14) ? z ? (String[]) dqru.D(null, du(getString(cO(14, bpio.a))), new String[0]) : new String[]{i()} : null;
                dqqf.dA(length, strArr11, new ejxr() { // from class: bpib
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "plaintext_attachment_name:".concat(String.valueOf(this.a.getString(14)));
                    }
                });
                if (!dj(15)) {
                    instantArr3 = instantArr2;
                    strArr4 = null;
                } else if (z) {
                    instantArr3 = instantArr2;
                    strArr4 = (String[]) dqru.D(null, du(getString(cO(15, bpio.a))), new String[0]);
                } else {
                    instantArr3 = instantArr2;
                    strArr4 = new String[]{h()};
                }
                dqqf.dA(length, strArr4, new ejxr() { // from class: bpic
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "plaintext_attachment_content_type:".concat(String.valueOf(this.a.getString(15)));
                    }
                });
                if (!dj(16)) {
                    strArr5 = strArr4;
                    strArr6 = null;
                } else if (z) {
                    strArr5 = strArr4;
                    strArr6 = (String[]) dqru.D(null, du(getString(cO(16, bpio.a))), new String[0]);
                } else {
                    strArr5 = strArr4;
                    strArr6 = new String[]{j()};
                }
                dqqf.dA(length, strArr6, new ejxr() { // from class: bpid
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "plaintext_thumbnail_content_type:".concat(String.valueOf(this.a.getString(16)));
                    }
                });
                if (!dj(17)) {
                    strArr7 = strArr6;
                    strArr8 = strArr11;
                    i = 0;
                    epwaVarArr = null;
                } else if (z) {
                    List listDf = df(getString(cO(17, bpio.a)));
                    epwa[] epwaVarArr3 = new epwa[listDf.size()];
                    Iterator it = listDf.iterator();
                    int i8 = 0;
                    while (it.hasNext()) {
                        String[] strArr12 = strArr6;
                        try {
                            byte[] bArrZ = dqru.z((String) it.next());
                            int i9 = i8 + 1;
                            if (bArrZ == null) {
                                strArr9 = strArr11;
                                epwaVar = null;
                            } else {
                                strArr9 = strArr11;
                                try {
                                    epwaVar = (epwa) evsn.parseFrom(epwa.a, bArrZ);
                                } catch (Throwable unused) {
                                    i8 = i9;
                                    epwaVarArr3[i8] = null;
                                    i8++;
                                    strArr11 = strArr9;
                                    strArr6 = strArr12;
                                }
                            }
                            epwaVarArr3[i8] = epwaVar;
                            strArr6 = strArr12;
                            i8 = i9;
                            strArr11 = strArr9;
                        } catch (Throwable unused2) {
                            strArr9 = strArr11;
                        }
                    }
                    strArr7 = strArr6;
                    strArr8 = strArr11;
                    i = 0;
                    epwaVarArr = (epwa[]) dqru.D(null, epwaVarArr3, new epwa[0]);
                } else {
                    strArr7 = strArr6;
                    strArr8 = strArr11;
                    i = 0;
                    epwaVarArr = new epwa[]{g()};
                }
                dqqf.dA(length, epwaVarArr, new ejxr() { // from class: bpie
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return "mls_file_info:".concat(String.valueOf(this.a.getString(17)));
                    }
                });
                ekfw ekfwVar = new ekfw();
                int i10 = i;
                while (i10 < length) {
                    long j = jArr[i10];
                    if (j <= 0 || hashSet.contains(Long.valueOf(j))) {
                        epwaVarArr2 = epwaVarArr;
                    } else {
                        hashSet.add(Long.valueOf(jArr[i10]));
                        String[] strArr13 = bpio.a;
                        bpga bpgaVar = new bpga();
                        bpgaVar.aF();
                        bpgaVar.aD();
                        long j2 = jArr[i10];
                        if (basdVarArr != null) {
                            bpgaVar.r(basdVarArr[i10]);
                        }
                        if (bArrF2 != null) {
                            bpgaVar.p(bArrF2[i10]);
                        }
                        if (bArrF3 != null) {
                            bpgaVar.o(bArrF3[i10]);
                        }
                        if (iArrA != null) {
                            bpgaVar.q(iArrA[i10]);
                        }
                        if (bArrF4 != null) {
                            bpgaVar.e(bArrF4[i10]);
                        }
                        if (bArrF5 != null) {
                            bpgaVar.d(bArrF5[i10]);
                        }
                        if (iArrA2 != null) {
                            bpgaVar.f(iArrA2[i10]);
                        }
                        if (instantArr != null) {
                            bpgaVar.h(instantArr[i10]);
                        }
                        if (uriArr2 != null) {
                            bpgaVar.g(uriArr2[i10]);
                        }
                        if (strArr != null) {
                            bpgaVar.j(strArr[i10]);
                        }
                        if (bArr2 != null) {
                            bpgaVar.i(bArr2[i10]);
                        }
                        if (bArr != null) {
                            byte[] bArr3 = bArr[i10];
                            epwaVarArr2 = epwaVarArr;
                            int i11 = bpgaVar.aB;
                            if (i11 < 48010) {
                                dqru.x("file_uploaded_xml_from_content_server", i11);
                            }
                            bpgaVar.aE(11);
                            bpgaVar.l = bArr3;
                        } else {
                            epwaVarArr2 = epwaVarArr;
                        }
                        if (strArr3 != null) {
                            String str2 = strArr3[i10];
                            int i12 = bpgaVar.aB;
                            if (i12 < 48010) {
                                dqru.x("file_uploaded_fallback_uri", i12);
                            }
                            bpgaVar.aE(12);
                            bpgaVar.m = str2;
                        }
                        if (instantArr3 != null) {
                            Instant instant = instantArr3[i10];
                            int i13 = bpgaVar.aB;
                            if (i13 < 48010) {
                                dqru.x("file_uploaded_expiry", i13);
                            }
                            bpgaVar.aE(13);
                            bpgaVar.n = instant;
                        }
                        if (strArr8 != null) {
                            bpgaVar.m(strArr8[i10]);
                        }
                        if (strArr5 != null) {
                            bpgaVar.l(strArr5[i10]);
                        }
                        if (strArr7 != null) {
                            bpgaVar.n(strArr7[i10]);
                        }
                        if (epwaVarArr2 != null) {
                            bpgaVar.k(epwaVarArr2[i10]);
                        }
                        ekfwVar.h(bpgaVar.a());
                    }
                    i10++;
                    epwaVarArr = epwaVarArr2;
                }
                return ekfwVar.g();
            }
        }
        int i14 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.bphn
    public final epwa g() {
        byte[] blob = getBlob(cO(17, bpio.a));
        if (blob == null) {
            return null;
        }
        try {
            return (epwa) evsn.parseFrom(epwa.a, blob, evrr.a());
        } catch (Throwable unused) {
            return epwa.a;
        }
    }

    @Override // defpackage.bphn
    public final String h() {
        return getString(cO(15, bpio.a));
    }

    @Override // defpackage.bphn
    public final String i() {
        return getString(cO(14, bpio.a));
    }

    @Override // defpackage.bphn
    public final String j() {
        return getString(cO(16, bpio.a));
    }

    @Override // defpackage.bphn
    public final byte[] k() {
        return getBlob(cO(5, bpio.a));
    }

    @Override // defpackage.bphn
    public final byte[] l() {
        return getBlob(cO(4, bpio.a));
    }

    @Override // defpackage.bphn
    public final byte[] m() {
        return getBlob(cO(2, bpio.a));
    }

    @Override // defpackage.bphn
    public final byte[] n() {
        return getBlob(cO(1, bpio.a));
    }

    public final Uri o() {
        String string = getString(cO(8, bpio.a));
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public final Instant p() {
        return bart.b(getLong(cO(7, bpio.a)));
    }

    public final Instant q() {
        return bart.b(getLong(cO(13, bpio.a)));
    }

    public final String r() {
        return getString(cO(9, bpio.a));
    }

    public final String s() {
        return getString(cO(12, bpio.a));
    }

    public final byte[] t() {
        return getBlob(cO(10, bpio.a));
    }

    public final byte[] u() {
        return getBlob(cO(11, bpio.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
