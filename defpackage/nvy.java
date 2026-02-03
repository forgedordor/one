package defpackage;

import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvy extends nwc {
    private final mfr a = new mfr();
    private final mfq d = new mfq();
    private int e = -1;
    private final int f;
    private final nvw[] g;
    private nvw h;
    private List i;
    private List j;
    private nvx k;
    private int l;

    public nvy(int i, List list) {
        this.f = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = mek.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.g = new nvw[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.g[i2] = new nvw();
        }
        this.h = this.g[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List k() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nvy.k():java.util.List");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0121. Please report as an issue. */
    private final void l() {
        int i;
        char c;
        char c2;
        boolean z;
        int i2;
        nvx nvxVar = this.k;
        if (nvxVar != null) {
            int i3 = nvxVar.b;
            int i4 = nvxVar.d;
            int i5 = (i3 + i3) - 1;
            if (i4 != i5) {
                mff.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + i5 + ", but current index is " + i4 + " (sequence number " + nvxVar.a + ");");
            }
            mfq mfqVar = this.d;
            nvx nvxVar2 = this.k;
            mfqVar.k(nvxVar2.c, nvxVar2.d);
            boolean z2 = false;
            while (true) {
                if (mfqVar.a() > 0) {
                    int i6 = 3;
                    int iD = mfqVar.d(3);
                    int iD2 = mfqVar.d(5);
                    int i7 = 2;
                    if (iD == 7) {
                        mfqVar.n(2);
                        iD = mfqVar.d(6);
                        if (iD < 7) {
                            mff.f("Cea708Decoder", a.g(iD, "Invalid extended service number: "));
                        }
                    }
                    if (iD2 == 0) {
                        if (iD != 0) {
                            mff.f("Cea708Decoder", a.e(iD, "serviceNumber is non-zero (", ") when blockSize is 0"));
                        }
                    } else if (iD != this.f) {
                        mfqVar.o(iD2);
                    } else {
                        int iC = mfqVar.c() + (iD2 * 8);
                        while (mfqVar.c() < iC) {
                            int iD3 = mfqVar.d(8);
                            if (iD3 != 16) {
                                if (iD3 <= 31) {
                                    if (iD3 != 0) {
                                        if (iD3 == i6) {
                                            this.i = k();
                                        } else if (iD3 != 8) {
                                            switch (iD3) {
                                                case 12:
                                                    m();
                                                    break;
                                                case 13:
                                                    this.h.c('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (iD3 < 17 || iD3 > 23) {
                                                        if (iD3 >= 24) {
                                                            mff.f("Cea708Decoder", a.g(iD3, "Currently unsupported COMMAND_P16 Command: "));
                                                            mfqVar.n(16);
                                                            break;
                                                        } else {
                                                            mff.f("Cea708Decoder", a.g(iD3, "Invalid C0 command: "));
                                                            break;
                                                        }
                                                    } else {
                                                        mff.f("Cea708Decoder", a.g(iD3, "Currently unsupported COMMAND_EXT1 Command: "));
                                                        mfqVar.n(8);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.h.l;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    }
                                    i = i7;
                                } else {
                                    if (iD3 > 127) {
                                        if (iD3 <= 159) {
                                            switch (iD3) {
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 132:
                                                case 133:
                                                case 134:
                                                case 135:
                                                    z = true;
                                                    int i8 = iD3 - 128;
                                                    if (this.l != i8) {
                                                        this.l = i8;
                                                        this.h = this.g[i8];
                                                        break;
                                                    }
                                                    break;
                                                case 136:
                                                    z = true;
                                                    for (int i9 = 1; i9 <= 8; i9++) {
                                                        if (mfqVar.p()) {
                                                            this.g[8 - i9].d();
                                                        }
                                                    }
                                                    break;
                                                case 137:
                                                    for (int i10 = 1; i10 <= 8; i10++) {
                                                        if (mfqVar.p()) {
                                                            this.g[8 - i10].n = true;
                                                        }
                                                    }
                                                    z = true;
                                                    break;
                                                case 138:
                                                    for (int i11 = 1; i11 <= 8; i11++) {
                                                        if (mfqVar.p()) {
                                                            this.g[8 - i11].n = false;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 139:
                                                    for (int i12 = 1; i12 <= 8; i12++) {
                                                        if (mfqVar.p()) {
                                                            this.g[8 - i12].n = !r3.n;
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 140:
                                                    for (int i13 = 1; i13 <= 8; i13++) {
                                                        if (mfqVar.p()) {
                                                            this.g[8 - i13].e();
                                                        }
                                                    }
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 141:
                                                    mfqVar.n(8);
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 142:
                                                    break;
                                                case 143:
                                                    m();
                                                    z2 = true;
                                                    i7 = 2;
                                                    break;
                                                case 144:
                                                    i2 = i7;
                                                    if (this.h.m) {
                                                        mfqVar.d(4);
                                                        mfqVar.d(i2);
                                                        mfqVar.d(i2);
                                                        boolean zP = mfqVar.p();
                                                        boolean zP2 = mfqVar.p();
                                                        i6 = 3;
                                                        mfqVar.d(3);
                                                        mfqVar.d(3);
                                                        this.h.g(zP, zP2);
                                                        z2 = true;
                                                        i7 = 2;
                                                        break;
                                                    } else {
                                                        mfqVar.n(16);
                                                        i7 = i2;
                                                        z2 = true;
                                                        i6 = 3;
                                                        break;
                                                    }
                                                case 145:
                                                    if (this.h.m) {
                                                        i2 = 2;
                                                        int iA = nvw.a(mfqVar.d(2), mfqVar.d(2), mfqVar.d(2), mfqVar.d(2));
                                                        int iA2 = nvw.a(mfqVar.d(2), mfqVar.d(2), mfqVar.d(2), mfqVar.d(2));
                                                        mfqVar.n(2);
                                                        nvw.j(mfqVar.d(2), mfqVar.d(2), mfqVar.d(2));
                                                        this.h.h(iA, iA2);
                                                        i7 = i2;
                                                        z2 = true;
                                                        i6 = 3;
                                                        break;
                                                    } else {
                                                        mfqVar.n(24);
                                                        z2 = true;
                                                        i6 = 3;
                                                        i7 = 2;
                                                        break;
                                                    }
                                                case 146:
                                                    if (this.h.m) {
                                                        mfqVar.n(4);
                                                        int iD4 = mfqVar.d(4);
                                                        mfqVar.n(2);
                                                        mfqVar.d(6);
                                                        nvw nvwVar = this.h;
                                                        if (nvwVar.y != iD4) {
                                                            nvwVar.c('\n');
                                                        }
                                                        nvwVar.y = iD4;
                                                    } else {
                                                        mfqVar.n(16);
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                                case 147:
                                                case 148:
                                                case 149:
                                                case 150:
                                                default:
                                                    z = true;
                                                    mff.f("Cea708Decoder", a.g(iD3, "Invalid C1 command: "));
                                                    break;
                                                case 151:
                                                    if (this.h.m) {
                                                        int iA3 = nvw.a(mfqVar.d(2), mfqVar.d(2), mfqVar.d(2), mfqVar.d(2));
                                                        mfqVar.d(2);
                                                        nvw.j(mfqVar.d(2), mfqVar.d(2), mfqVar.d(2));
                                                        mfqVar.p();
                                                        mfqVar.p();
                                                        mfqVar.d(2);
                                                        mfqVar.d(2);
                                                        int iD5 = mfqVar.d(2);
                                                        mfqVar.n(8);
                                                        this.h.i(iA3, iD5);
                                                    } else {
                                                        mfqVar.n(32);
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                                case 152:
                                                case 153:
                                                case 154:
                                                case 155:
                                                case 156:
                                                case 157:
                                                case 158:
                                                case 159:
                                                    int i14 = iD3 - 152;
                                                    nvw[] nvwVarArr = this.g;
                                                    nvw nvwVar2 = nvwVarArr[i14];
                                                    mfqVar.n(i7);
                                                    boolean zP3 = mfqVar.p();
                                                    mfqVar.n(i7);
                                                    int iD6 = mfqVar.d(i6);
                                                    boolean zP4 = mfqVar.p();
                                                    int iD7 = mfqVar.d(7);
                                                    int iD8 = mfqVar.d(8);
                                                    int iD9 = mfqVar.d(4);
                                                    int iD10 = mfqVar.d(4);
                                                    mfqVar.n(i7);
                                                    mfqVar.n(6);
                                                    mfqVar.n(i7);
                                                    int iD11 = mfqVar.d(3);
                                                    int iD12 = mfqVar.d(3);
                                                    nvwVar2.m = true;
                                                    nvwVar2.n = zP3;
                                                    nvwVar2.o = iD6;
                                                    nvwVar2.p = zP4;
                                                    nvwVar2.q = iD7;
                                                    nvwVar2.r = iD8;
                                                    nvwVar2.s = iD9;
                                                    int i15 = iD10 + 1;
                                                    if (nvwVar2.t != i15) {
                                                        nvwVar2.t = i15;
                                                        while (true) {
                                                            List list = nvwVar2.k;
                                                            if (list.size() >= nvwVar2.t || list.size() >= 15) {
                                                                list.remove(0);
                                                            }
                                                        }
                                                    }
                                                    if (iD11 != 0 && nvwVar2.v != iD11) {
                                                        nvwVar2.v = iD11;
                                                        int i16 = iD11 - 1;
                                                        int i17 = nvw.g[i16];
                                                        boolean z3 = nvw.f[i16];
                                                        int i18 = nvw.d[i16];
                                                        int i19 = nvw.e[i16];
                                                        nvwVar2.i(i17, nvw.c[i16]);
                                                    }
                                                    if (iD12 != 0 && nvwVar2.w != iD12) {
                                                        nvwVar2.w = iD12;
                                                        int i20 = iD12 - 1;
                                                        int i21 = nvw.i[i20];
                                                        int i22 = nvw.h[i20];
                                                        nvwVar2.g(false, false);
                                                        nvwVar2.h(nvw.a, nvw.j[i20]);
                                                    }
                                                    if (this.l != i14) {
                                                        this.l = i14;
                                                        this.h = nvwVarArr[i14];
                                                    }
                                                    z2 = true;
                                                    i6 = 3;
                                                    i7 = 2;
                                                    break;
                                            }
                                        } else {
                                            z = true;
                                            if (iD3 <= 255) {
                                                this.h.c((char) (iD3 & 255));
                                            } else {
                                                mff.f("Cea708Decoder", a.g(iD3, "Invalid base command: "));
                                                i = 2;
                                            }
                                        }
                                        z2 = z;
                                        i7 = 2;
                                    } else if (iD3 == 127) {
                                        this.h.c((char) 9835);
                                    } else {
                                        this.h.c((char) (iD3 & 255));
                                    }
                                    z2 = true;
                                }
                                c = 6;
                                c2 = 7;
                                i7 = i;
                            } else {
                                int iD13 = mfqVar.d(8);
                                if (iD13 <= 31) {
                                    c2 = 7;
                                    if (iD13 > 7) {
                                        if (iD13 <= 15) {
                                            mfqVar.n(8);
                                        } else if (iD13 <= 23) {
                                            mfqVar.n(16);
                                        } else {
                                            mfqVar.n(24);
                                        }
                                    }
                                } else {
                                    c2 = 7;
                                    if (iD13 <= 127) {
                                        if (iD13 == 32) {
                                            this.h.c(' ');
                                        } else if (iD13 == 33) {
                                            this.h.c((char) 160);
                                        } else if (iD13 == 37) {
                                            this.h.c((char) 8230);
                                        } else if (iD13 == 42) {
                                            this.h.c((char) 352);
                                        } else if (iD13 == 44) {
                                            this.h.c((char) 338);
                                        } else if (iD13 == 63) {
                                            this.h.c((char) 376);
                                        } else if (iD13 == 57) {
                                            this.h.c((char) 8482);
                                        } else if (iD13 == 58) {
                                            this.h.c((char) 353);
                                        } else if (iD13 == 60) {
                                            this.h.c((char) 339);
                                        } else if (iD13 != 61) {
                                            switch (iD13) {
                                                case 48:
                                                    this.h.c((char) 9608);
                                                    break;
                                                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                    this.h.c((char) 8216);
                                                    break;
                                                case 50:
                                                    this.h.c((char) 8217);
                                                    break;
                                                case 51:
                                                    this.h.c((char) 8220);
                                                    break;
                                                case 52:
                                                    this.h.c((char) 8221);
                                                    break;
                                                case 53:
                                                    this.h.c((char) 8226);
                                                    break;
                                                default:
                                                    switch (iD13) {
                                                        case 118:
                                                            this.h.c((char) 8539);
                                                            break;
                                                        case 119:
                                                            this.h.c((char) 8540);
                                                            break;
                                                        case 120:
                                                            this.h.c((char) 8541);
                                                            break;
                                                        case 121:
                                                            this.h.c((char) 8542);
                                                            break;
                                                        case 122:
                                                            this.h.c((char) 9474);
                                                            break;
                                                        case 123:
                                                            this.h.c((char) 9488);
                                                            break;
                                                        case 124:
                                                            this.h.c((char) 9492);
                                                            break;
                                                        case 125:
                                                            this.h.c((char) 9472);
                                                            break;
                                                        case 126:
                                                            this.h.c((char) 9496);
                                                            break;
                                                        case 127:
                                                            this.h.c((char) 9484);
                                                            break;
                                                        default:
                                                            mff.f("Cea708Decoder", a.g(iD13, "Invalid G2 character: "));
                                                            break;
                                                    }
                                            }
                                        } else {
                                            this.h.c((char) 8480);
                                        }
                                        z2 = true;
                                        i7 = 2;
                                    } else {
                                        if (iD13 > 159) {
                                            i = 2;
                                            c = 6;
                                            if (iD13 <= 255) {
                                                if (iD13 == 160) {
                                                    this.h.c((char) 13252);
                                                } else {
                                                    mff.f("Cea708Decoder", a.g(iD13, "Invalid G3 character: "));
                                                    this.h.c('_');
                                                }
                                                z2 = true;
                                                i7 = 2;
                                            } else {
                                                mff.f("Cea708Decoder", a.g(iD13, "Invalid extended command: "));
                                            }
                                        } else if (iD13 <= 135) {
                                            mfqVar.n(32);
                                        } else if (iD13 <= 143) {
                                            mfqVar.n(40);
                                        } else {
                                            i = 2;
                                            mfqVar.n(2);
                                            c = 6;
                                            mfqVar.n(mfqVar.d(6) * 8);
                                        }
                                        i7 = i;
                                    }
                                }
                                i = 2;
                                c = 6;
                                i7 = i;
                            }
                        }
                    }
                }
            }
            if (z2) {
                this.i = k();
            }
            this.k = null;
        }
    }

    private final void m() {
        for (int i = 0; i < 8; i++) {
            this.g[i].e();
        }
    }

    @Override // defpackage.nwc, defpackage.miu
    public final void c() {
        super.c();
        this.i = null;
        this.j = null;
        this.l = 0;
        this.h = this.g[0];
        m();
        this.k = null;
    }

    @Override // defpackage.nwc
    protected final nva g() {
        List list = this.i;
        this.j = list;
        mee.f(list);
        return new nwd(list);
    }

    @Override // defpackage.nwc
    protected final void i(nvg nvgVar) {
        nvx nvxVar;
        ByteBuffer byteBuffer = nvgVar.d;
        mee.f(byteBuffer);
        mfr mfrVar = this.a;
        mfrVar.I(byteBuffer.array(), byteBuffer.limit());
        while (mfrVar.a() >= 3) {
            int iJ = mfrVar.j();
            int i = iJ & 3;
            byte bJ = (byte) mfrVar.j();
            byte bJ2 = (byte) mfrVar.j();
            if (i != 2) {
                if (i == 3) {
                    i = 3;
                }
            }
            if ((iJ & 4) == 4) {
                if (i == 3) {
                    l();
                    int i2 = this.e;
                    int i3 = (bJ & 192) >> 6;
                    if (i2 != -1 && i3 != (3 & (i2 + 1))) {
                        m();
                        mff.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.e + " current=" + i3);
                    }
                    this.e = i3;
                    int i4 = bJ & 63;
                    if (i4 == 0) {
                        i4 = 64;
                    }
                    nvxVar = new nvx(i3, i4);
                    this.k = nvxVar;
                    byte[] bArr = nvxVar.c;
                    int i5 = nvxVar.d;
                    nvxVar.d = i5 + 1;
                    bArr[i5] = bJ2;
                } else {
                    mee.a(true);
                    nvxVar = this.k;
                    if (nvxVar == null) {
                        mff.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i6 = nvxVar.d;
                        int i7 = i6 + 1;
                        nvxVar.d = i7;
                        byte[] bArr2 = nvxVar.c;
                        bArr2[i6] = bJ;
                        nvxVar.d = i6 + 2;
                        bArr2[i7] = bJ2;
                    }
                }
                int i8 = nvxVar.d;
                int i9 = nvxVar.b;
                if (i8 == (i9 + i9) - 1) {
                    l();
                }
            }
        }
    }

    @Override // defpackage.nwc
    protected final boolean j() {
        return this.i != this.j;
    }

    @Override // defpackage.nwc, defpackage.miu
    public final /* bridge */ /* synthetic */ void e() {
    }
}
