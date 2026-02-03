package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npm implements npf {
    public final ekgb a;
    public final int b;

    private npm(int i, ekgb ekgbVar) {
        this.b = i;
        this.a = ekgbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static npm c(int i, mfr mfrVar) {
        npf npnVar;
        String str;
        ekfw ekfwVar = new ekfw();
        int i2 = mfrVar.c;
        int iB = -2;
        while (mfrVar.a() > 8) {
            int iF = mfrVar.f();
            int iF2 = mfrVar.b + mfrVar.f();
            mfrVar.J(iF2);
            if (iF != 1414744396) {
                switch (iF) {
                    case 1718776947:
                        if (iB == 2) {
                            mfrVar.L(4);
                            int iF3 = mfrVar.f();
                            int iF4 = mfrVar.f();
                            mfrVar.L(4);
                            int iF5 = mfrVar.f();
                            switch (iF5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                mat matVar = new mat();
                                matVar.t = iF3;
                                matVar.u = iF4;
                                matVar.c(str);
                                npnVar = new npn(new mau(matVar));
                                break;
                            } else {
                                mff.f("StreamFormatChunk", a.g(iF5, "Ignoring track with unsupported compression "));
                                npnVar = null;
                                break;
                            }
                        } else {
                            if (iB == 1) {
                                int iH = mfrVar.h();
                                String str2 = iH != 1 ? iH != 85 ? iH != 255 ? iH != 8192 ? iH != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iH2 = mfrVar.h();
                                    int iF6 = mfrVar.f();
                                    mfrVar.L(6);
                                    int iN = mgb.n(mfrVar.h());
                                    int iH3 = mfrVar.a() > 0 ? mfrVar.h() : 0;
                                    mat matVar2 = new mat();
                                    matVar2.c(str2);
                                    matVar2.E = iH2;
                                    matVar2.F = iF6;
                                    if (str2.equals("audio/raw") && iN != 0) {
                                        matVar2.G = iN;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && iH3 > 0) {
                                        byte[] bArr = new byte[iH3];
                                        mfrVar.F(bArr, 0, iH3);
                                        matVar2.p = ekgb.r(bArr);
                                    }
                                    npnVar = new npn(new mau(matVar2));
                                    break;
                                } else {
                                    mff.f("StreamFormatChunk", a.g(iH, "Ignoring track with unsupported format tag "));
                                }
                            } else {
                                mff.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(mgb.N(iB)));
                            }
                            npnVar = null;
                        }
                    case 1751742049:
                        int iF7 = mfrVar.f();
                        mfrVar.L(8);
                        int iF8 = mfrVar.f();
                        int iF9 = mfrVar.f();
                        mfrVar.L(4);
                        mfrVar.f();
                        mfrVar.L(12);
                        npnVar = new npj(iF7, iF8, iF9);
                        break;
                    case 1752331379:
                        int iF10 = mfrVar.f();
                        mfrVar.L(12);
                        mfrVar.f();
                        int iF11 = mfrVar.f();
                        int iF12 = mfrVar.f();
                        mfrVar.L(4);
                        int iF13 = mfrVar.f();
                        int iF14 = mfrVar.f();
                        mfrVar.L(4);
                        npnVar = new npk(iF10, iF11, iF12, iF13, iF14, mfrVar.f());
                        break;
                    case 1852994675:
                        npnVar = new npo(mfrVar.y(mfrVar.a()));
                        break;
                    default:
                        npnVar = null;
                        break;
                }
            } else {
                npnVar = c(mfrVar.f(), mfrVar);
            }
            if (npnVar != null) {
                if (npnVar.a() == 1752331379) {
                    iB = ((npk) npnVar).b();
                }
                ekfwVar.h(npnVar);
            }
            mfrVar.K(iF2);
            mfrVar.J(i2);
        }
        return new npm(i, ekfwVar.g());
    }

    @Override // defpackage.npf
    public final int a() {
        return this.b;
    }

    public final npf b(Class cls) {
        npf npfVar;
        int i = 0;
        do {
            ekgb ekgbVar = this.a;
            if (i >= ((ekoe) ekgbVar).c) {
                return null;
            }
            npfVar = (npf) ekgbVar.get(i);
            i++;
        } while (npfVar.getClass() != cls);
        return npfVar;
    }
}
