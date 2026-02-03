package defpackage;

import android.database.Cursor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aznh extends dqqf implements azmr {
    @Deprecated
    public aznh(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, dqwj dqwjVar, dqtm dqtmVar, azno aznoVar) {
        super(dqsyVar, cursor, strArr, dqxeVarArr, azns.a, dqwjVar, dqtmVar, aznoVar);
    }

    @Override // defpackage.dqqf
    protected final /* synthetic */ dqpd b() {
        return new azlh();
    }

    public final double c() {
        return getDouble(cO(8, azns.a));
    }

    public final double e() {
        return getDouble(cO(7, azns.a));
    }

    public final int f() {
        return getInt(cO(6, azns.a));
    }

    @Override // defpackage.dqqf
    public final ekgb fI(dqth dqthVar) {
        MessageIdType[] messageIdTypeArr;
        int i;
        double[] dArrH;
        long[] jArr;
        String[] strArr;
        byte[][] bArr;
        byte[][] bArrF;
        byte[][] bArr2;
        double[] dArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        int i2;
        int i3;
        HashSet hashSet;
        long[] jArr2;
        dqwl dqwlVar = dqthVar.a;
        long[] jArrDC = dC(getString(dqthVar.h + 1));
        int length = jArrDC.length;
        if (length == 0 || (length == 1 && jArrDC[0] == -1)) {
            int i4 = ekgb.d;
            return ekoe.a;
        }
        HashSet hashSet2 = new HashSet();
        dqtm dqtmVar = this.d;
        boolean zDj = dj(0);
        boolean z = dqtmVar.b;
        long[] jArrC = zDj ? z ? dqru.C(null, dt(getString(cO(0, azns.a)))) : new long[]{j()} : null;
        dqqf.dz(length, jArrC, new ejxr() { // from class: azms
            @Override // defpackage.ejxr
            public final Object get() {
                return "_id:".concat(String.valueOf(this.a.getString(0)));
            }
        });
        if (!dj(1)) {
            messageIdTypeArr = null;
        } else if (z) {
            long[] jArrDt = dt(getString(cO(1, azns.a)));
            int length2 = jArrDt.length;
            MessageIdType[] messageIdTypeArr2 = new MessageIdType[length2];
            for (int i5 = 0; i5 < length2; i5++) {
                messageIdTypeArr2[i5] = new MessageIdType(jArrDt[i5]);
            }
            messageIdTypeArr = (MessageIdType[]) dqru.D(null, messageIdTypeArr2, new MessageIdType[0]);
        } else {
            messageIdTypeArr = new MessageIdType[]{k()};
        }
        dqqf.dA(length, messageIdTypeArr, new ejxr() { // from class: aznd
            @Override // defpackage.ejxr
            public final Object get() {
                return "message_id:".concat(String.valueOf(this.a.getString(1)));
            }
        });
        String[] strArr6 = dj(2) ? z ? (String[]) dqru.D(null, du(getString(cO(2, azns.a))), new String[0]) : new String[]{n()} : null;
        dqqf.dA(length, strArr6, new ejxr() { // from class: azne
            @Override // defpackage.ejxr
            public final Object get() {
                return "content_type:".concat(String.valueOf(this.a.getString(2)));
            }
        });
        int[] iArrA = dj(3) ? z ? dqru.A(null, ds(getString(cO(3, azns.a)))) : new int[]{g()} : null;
        dqqf.dy(length, iArrA, new ejxr() { // from class: aznf
            @Override // defpackage.ejxr
            public final Object get() {
                return "source:".concat(String.valueOf(this.a.getString(3)));
            }
        });
        String[] strArr7 = dj(4) ? z ? (String[]) dqru.D(null, du(getString(cO(4, azns.a))), new String[0]) : new String[]{p()} : null;
        dqqf.dA(length, strArr7, new ejxr() { // from class: azng
            @Override // defpackage.ejxr
            public final Object get() {
                return "text:".concat(String.valueOf(this.a.getString(4)));
            }
        });
        int[] iArrA2 = dj(5) ? z ? dqru.A(null, ds(getString(cO(5, azns.a)))) : new int[]{h()} : null;
        dqqf.dy(length, iArrA2, new ejxr() { // from class: azmt
            @Override // defpackage.ejxr
            public final Object get() {
                return "width:".concat(String.valueOf(this.a.getString(5)));
            }
        });
        int[] iArrA3 = dj(6) ? z ? dqru.A(null, ds(getString(cO(6, azns.a)))) : new int[]{f()} : null;
        dqqf.dy(length, iArrA3, new ejxr() { // from class: azmu
            @Override // defpackage.ejxr
            public final Object get() {
                return "height:".concat(String.valueOf(this.a.getString(6)));
            }
        });
        double[] dArrH2 = dj(7) ? z ? dqru.H(dq(getString(cO(7, azns.a)))) : new double[]{e()} : null;
        dqqf.dw(length, dArrH2, new ejxr() { // from class: azmv
            @Override // defpackage.ejxr
            public final Object get() {
                return "longitude:".concat(String.valueOf(this.a.getString(7)));
            }
        });
        if (!dj(8)) {
            i = 0;
            dArrH = null;
        } else if (z) {
            i = 0;
            dArrH = dqru.H(dq(getString(cO(8, azns.a))));
        } else {
            i = 0;
            dArrH = new double[]{c()};
        }
        dqqf.dw(length, dArrH, new ejxr() { // from class: azmw
            @Override // defpackage.ejxr
            public final Object get() {
                return "latitude:".concat(String.valueOf(this.a.getString(8)));
            }
        });
        if (!dj(9)) {
            jArr = jArrDC;
            strArr = null;
        } else if (z) {
            jArr = jArrDC;
            strArr = (String[]) dqru.D(null, du(getString(cO(9, azns.a))), new String[i]);
        } else {
            jArr = jArrDC;
            String[] strArr8 = new String[1];
            strArr8[i] = m();
            strArr = strArr8;
        }
        dqqf.dA(length, strArr, new ejxr() { // from class: azmx
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_full_size_blob_id:".concat(String.valueOf(this.a.getString(9)));
            }
        });
        byte[][] bArrF2 = dj(10) ? z ? dqru.F(null, dD(getString(cO(10, azns.a)))) : new byte[][]{r()} : null;
        dqqf.dA(length, bArrF2, new ejxr() { // from class: azmy
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_media_encryption_key:".concat(String.valueOf(this.a.getString(10)));
            }
        });
        if (!dj(11)) {
            bArr = bArrF2;
            bArrF = null;
        } else if (z) {
            bArr = bArrF2;
            bArrF = dqru.F(null, dD(getString(cO(11, azns.a))));
        } else {
            bArr = bArrF2;
            bArrF = new byte[][]{q()};
        }
        dqqf.dA(length, bArrF, new ejxr() { // from class: azmz
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_compressed_media_encryption_key:".concat(String.valueOf(this.a.getString(11)));
            }
        });
        if (!dj(12)) {
            bArr2 = bArrF;
            dArr = dArrH;
            strArr2 = null;
        } else if (z) {
            bArr2 = bArrF;
            dArr = dArrH;
            strArr2 = (String[]) dqru.D(null, du(getString(cO(12, azns.a))), new String[0]);
        } else {
            bArr2 = bArrF;
            dArr = dArrH;
            strArr2 = new String[]{l()};
        }
        dqqf.dA(length, strArr2, new ejxr() { // from class: azna
            @Override // defpackage.ejxr
            public final Object get() {
                return "cms_compressed_blob_id:".concat(String.valueOf(this.a.getString(12)));
            }
        });
        if (!dj(13)) {
            strArr3 = strArr2;
            strArr4 = null;
        } else if (z) {
            strArr3 = strArr2;
            strArr4 = (String[]) dqru.D(null, du(getString(cO(13, azns.a))), new String[0]);
        } else {
            strArr3 = strArr2;
            strArr4 = new String[]{o()};
        }
        dqqf.dA(length, strArr4, new ejxr() { // from class: aznb
            @Override // defpackage.ejxr
            public final Object get() {
                return "file_name:".concat(String.valueOf(this.a.getString(13)));
            }
        });
        long[] jArrC2 = dj(14) ? z ? dqru.C(null, dt(getString(cO(14, azns.a)))) : new long[]{i()} : null;
        dqqf.dz(length, jArrC2, new ejxr() { // from class: aznc
            @Override // defpackage.ejxr
            public final Object get() {
                return "duration:".concat(String.valueOf(this.a.getString(14)));
            }
        });
        ekfw ekfwVar = new ekfw();
        int i6 = 0;
        while (i6 < length) {
            long j = jArr[i6];
            if (j <= 0 || hashSet2.contains(Long.valueOf(j))) {
                strArr5 = strArr4;
                i2 = i6;
                i3 = length;
                hashSet = hashSet2;
                jArr2 = jArrC2;
            } else {
                hashSet2.add(Long.valueOf(jArr[i6]));
                String[] strArr9 = azns.a;
                azlj azljVar = new azlj();
                azljVar.aF();
                azljVar.aD();
                long j2 = jArr[i6];
                strArr5 = strArr4;
                i2 = i6;
                if (jArrC != null) {
                    long j3 = jArrC[i2];
                    i3 = length;
                    azljVar.aE(0);
                    azljVar.a = j3;
                } else {
                    i3 = length;
                }
                if (messageIdTypeArr != null) {
                    MessageIdType messageIdType = messageIdTypeArr[i2];
                    azljVar.aE(1);
                    azljVar.b = messageIdType;
                }
                if (strArr6 != null) {
                    String str = strArr6[i2];
                    azljVar.aE(2);
                    azljVar.c = str;
                }
                if (iArrA != null) {
                    int i7 = iArrA[i2];
                    int i8 = azljVar.aB;
                    if (i8 < 10) {
                        dqru.x("source", i8);
                    }
                    azljVar.aE(3);
                    azljVar.d = i7;
                }
                if (strArr7 != null) {
                    String str2 = strArr7[i2];
                    azljVar.aE(4);
                    azljVar.e = str2;
                }
                if (iArrA2 != null) {
                    int i9 = iArrA2[i2];
                    azljVar.aE(5);
                    azljVar.f = i9;
                }
                if (iArrA3 != null) {
                    int i10 = iArrA3[i2];
                    azljVar.aE(6);
                    azljVar.g = i10;
                }
                if (dArrH2 != null) {
                    double d = dArrH2[i2];
                    azljVar.aE(7);
                    azljVar.h = d;
                }
                if (dArr != null) {
                    double d2 = dArr[i2];
                    azljVar.aE(8);
                    azljVar.i = d2;
                }
                if (strArr != null) {
                    String str3 = strArr[i2];
                    azljVar.aE(9);
                    azljVar.j = str3;
                }
                if (bArr != null) {
                    byte[] bArr3 = bArr[i2];
                    azljVar.aE(10);
                    azljVar.k = bArr3;
                }
                if (bArr2 != null) {
                    byte[] bArr4 = bArr2[i2];
                    azljVar.aE(11);
                    azljVar.l = bArr4;
                }
                if (strArr3 != null) {
                    String str4 = strArr3[i2];
                    azljVar.aE(12);
                    azljVar.m = str4;
                }
                if (strArr5 != null) {
                    String str5 = strArr5[i2];
                    int i11 = azljVar.aB;
                    if (i11 < 100) {
                        dqru.x("file_name", i11);
                    }
                    azljVar.aE(13);
                    azljVar.n = str5;
                }
                if (jArrC2 != null) {
                    long j4 = jArrC2[i2];
                    int i12 = azljVar.aB;
                    hashSet = hashSet2;
                    if (i12 < 130) {
                        dqru.x("duration", i12);
                    }
                    azljVar.aE(14);
                    azljVar.o = j4;
                } else {
                    hashSet = hashSet2;
                }
                azlh azlhVar = new azlh();
                azlhVar.aD(azljVar.aB());
                jArr2 = jArrC2;
                azlhVar.a = azljVar.a;
                azlhVar.b = azljVar.b;
                azlhVar.c = azljVar.c;
                azlhVar.d = azljVar.d;
                azlhVar.e = azljVar.e;
                azlhVar.f = azljVar.f;
                azlhVar.g = azljVar.g;
                azlhVar.h = azljVar.h;
                azlhVar.i = azljVar.i;
                azlhVar.j = azljVar.j;
                azlhVar.k = azljVar.k;
                azlhVar.l = azljVar.l;
                azlhVar.m = azljVar.m;
                azlhVar.n = azljVar.n;
                azlhVar.o = azljVar.o;
                azlhVar.cM = azljVar.aC();
                ekfwVar.h(azlhVar);
            }
            i6 = i2 + 1;
            jArrC2 = jArr2;
            strArr4 = strArr5;
            length = i3;
            hashSet2 = hashSet;
        }
        return ekfwVar.g();
    }

    public final int g() {
        return getInt(cO(3, azns.a));
    }

    public final int h() {
        return getInt(cO(5, azns.a));
    }

    public final long i() {
        return getLong(cO(14, azns.a));
    }

    public final long j() {
        return getLong(cO(0, azns.a));
    }

    public final MessageIdType k() {
        return new MessageIdType(getLong(cO(1, azns.a)));
    }

    public final String l() {
        return getString(cO(12, azns.a));
    }

    public final String m() {
        return getString(cO(9, azns.a));
    }

    public final String n() {
        return getString(cO(2, azns.a));
    }

    public final String o() {
        return getString(cO(13, azns.a));
    }

    public final String p() {
        return getString(cO(4, azns.a));
    }

    public final byte[] q() {
        return getBlob(cO(11, azns.a));
    }

    public final byte[] r() {
        return getBlob(cO(10, azns.a));
    }

    @Override // defpackage.dqqj
    public final Cursor a() {
        return this;
    }
}
