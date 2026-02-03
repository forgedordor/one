package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nse {
    final /* synthetic */ nsg a;

    public nse(nsg nsgVar) {
        this.a = nsgVar;
    }

    public final void a(int i, long j) {
        nsg nsgVar = this.a;
        if (i == 20529) {
            if (j != 0) {
                throw new mby(a.A(j, "ContentEncodingOrder ", " not supported"), null, true, 1);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw new mby(a.A(j, "ContentEncodingScope ", " not supported"), null, true, 1);
            }
            return;
        }
        switch (i) {
            case 131:
                nsgVar.i(i).e = (int) j;
                return;
            case 136:
                nsgVar.i(i).X = j == 1;
                return;
            case 155:
                nsgVar.u = nsgVar.h(j);
                return;
            case 159:
                nsgVar.i(i).Q = (int) j;
                return;
            case 176:
                nsgVar.i(i).n = (int) j;
                return;
            case 179:
                nsgVar.j(i);
                nsgVar.r.b(nsgVar.h(j));
                return;
            case 186:
                nsgVar.i(i).o = (int) j;
                return;
            case 215:
                nsgVar.i(i).d = (int) j;
                return;
            case 231:
                nsgVar.q = nsgVar.h(j);
                return;
            case 238:
                nsgVar.v = (int) j;
                return;
            case 241:
                if (nsgVar.t) {
                    return;
                }
                nsgVar.j(i);
                nsgVar.s.b(j);
                nsgVar.t = true;
                return;
            case 251:
                nsgVar.w = true;
                return;
            case 16871:
                nsgVar.i(i).h = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw new mby(a.A(j, "ContentCompAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw new mby(a.A(j, "DocTypeReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw new mby(a.A(j, "EBMLReadVersion ", " not supported"), null, true, 1);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw new mby(a.A(j, "ContentEncAlgo ", " not supported"), null, true, 1);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw new mby(a.A(j, "AESSettingsCipherMode ", " not supported"), null, true, 1);
                }
                return;
            case 21420:
                nsgVar.n = j + nsgVar.f;
                return;
            case 21432:
                int i2 = (int) j;
                nsgVar.k(i);
                if (i2 == 0) {
                    nsgVar.k.y = 0;
                    return;
                }
                if (i2 == 1) {
                    nsgVar.k.y = 2;
                    return;
                } else if (i2 == 3) {
                    nsgVar.k.y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    nsgVar.k.y = 3;
                    return;
                }
            case 21680:
                nsgVar.i(i).q = (int) j;
                return;
            case 21682:
                nsgVar.i(i).s = (int) j;
                return;
            case 21690:
                nsgVar.i(i).r = (int) j;
                return;
            case 21930:
                nsgVar.i(i).W = j == 1;
                return;
            case 21938:
                nsgVar.k(i);
                nsf nsfVar = nsgVar.k;
                nsfVar.z = true;
                nsfVar.p = (int) j;
                return;
            case 21998:
                nsgVar.i(i).g = (int) j;
                return;
            case 22186:
                nsgVar.i(i).T = j;
                return;
            case 22203:
                nsgVar.i(i).U = j;
                return;
            case 25188:
                nsgVar.i(i).R = (int) j;
                return;
            case 30114:
                nsgVar.x = j;
                return;
            case 30321:
                int i3 = (int) j;
                nsgVar.k(i);
                if (i3 == 0) {
                    nsgVar.k.t = 0;
                    return;
                }
                if (i3 == 1) {
                    nsgVar.k.t = 1;
                    return;
                } else if (i3 == 2) {
                    nsgVar.k.t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    nsgVar.k.t = 3;
                    return;
                }
            case 2352003:
                nsgVar.i(i).f = (int) j;
                return;
            case 2807729:
                nsgVar.g = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        nsgVar.k(i);
                        if (i4 == 1) {
                            nsgVar.k.C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            nsgVar.k.C = 1;
                            return;
                        }
                    case 21946:
                        nsgVar.k(i);
                        int iB = mag.b((int) j);
                        if (iB != -1) {
                            nsgVar.k.B = iB;
                            return;
                        }
                        return;
                    case 21947:
                        nsgVar.k(i);
                        nsgVar.k.z = true;
                        int iA = mag.a((int) j);
                        if (iA != -1) {
                            nsgVar.k.A = iA;
                            return;
                        }
                        return;
                    case 21948:
                        nsgVar.i(i).D = (int) j;
                        return;
                    case 21949:
                        nsgVar.i(i).E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void b(int i, long j, long j2) {
        nsg nsgVar = this.a;
        nsgVar.l();
        if (i == 160) {
            nsgVar.w = false;
            nsgVar.x = 0L;
            return;
        }
        if (i == 174) {
            nsgVar.k = new nsf();
            nsgVar.k.a = nsgVar.j;
            return;
        }
        if (i == 187) {
            nsgVar.t = false;
            return;
        }
        if (i == 19899) {
            nsgVar.m = -1;
            nsgVar.n = -1L;
            return;
        }
        if (i == 20533) {
            nsgVar.i(i).i = true;
            return;
        }
        if (i == 21968) {
            nsgVar.i(i).z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = nsgVar.f;
            if (j3 != -1 && j3 != j) {
                throw new mby("Multiple Segment elements not supported", null, true, 1);
            }
            nsgVar.f = j;
            nsgVar.e = j2;
            return;
        }
        if (i == 475249515) {
            nsgVar.r = new mfg();
            nsgVar.s = new mfg();
        } else if (i == 524531317 && !nsgVar.l) {
            if (nsgVar.d && nsgVar.p != -1) {
                nsgVar.o = true;
            } else {
                nsgVar.y.w(new nop(nsgVar.i));
                nsgVar.l = true;
            }
        }
    }
}
