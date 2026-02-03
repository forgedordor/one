package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.accounts.FiAccountActivity;
import com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhk extends ahgn {
    final eyik A;
    final eyik B;
    public final eyik C;
    final eyik D;
    public final eyik E;
    final eyik F;
    public final eyik G;
    public final eyik H;
    public final eyik I;
    final eyik J;
    public final eyik K;
    final eyik L;
    public final eyik M;
    public final eyik N;
    final eyik O;
    public final eyik P;
    public final eyik Q;
    public final eyik R;
    public final eyik S;
    final eyik T;
    public final eyik U;
    public final eyik V;
    public final eyik W;
    public final eyik X;
    public final eyik Y;
    public final eyik Z;
    public final Activity a;
    public final eyik aA;
    final eyik aB;
    public final eyik aC;
    public final eyik aD;
    final eyik aE;
    public final eyik aF;
    public final eyik aG;
    final eyik aH;
    final eyik aI;
    public final eyik aJ;
    public final eyik aK;
    public final eyik aL;
    final eyik aM;
    public final eyik aN;
    public final eyik aO;
    public final eyik aP;
    final eyik aQ;
    final eyik aR;
    final eyik aS;
    public final eyik aT;
    final eyik aU;
    final eyik aV;
    public final eyik aW;
    public final eyik aX;
    public final eyik aY;
    final eyik aZ;
    public final eyik aa;
    public final eyik ab;
    public final eyik ac;
    public final eyik ad;
    final eyik ae;
    public final eyik af;
    final eyik ag;
    final eyik ah;
    final eyik ai;
    final eyik aj;
    final eyik ak;
    final eyik al;
    final eyik am;
    final eyik an;
    public final eyik ao;
    public final eyik ap;
    final eyik aq;
    public final eyik ar;
    final eyik as;
    public final eyik at;
    final eyik au;
    final eyik av;
    final eyik aw;
    public final eyik ax;
    public final eyik ay;
    final eyik az;
    public final ahkn b;
    public final eyik bA;
    final eyik bB;
    public final eyik bC;
    final eyik bD;
    public final eyik bE;
    final eyik bF;
    final eyik bG;
    final eyik bH;
    final eyik bI;
    final eyik bJ;
    final eyik bK;
    final eyik bL;
    final eyik bM;
    public final eyik bN;
    final eyik bO;
    public final eyik bP;
    final eyik bQ;
    public final eyik bR;
    public final eyik bS;
    public final eyik bT;
    final eyik bU;
    final eyik bV;
    final eyik bW;
    final eyik bX;
    final eyik bY;
    final eyik bZ;
    final eyik ba;
    final eyik bb;
    final eyik bc;
    public final eyik bd;
    public final eyik be;
    public final eyik bf;
    final eyik bg;
    public final eyik bh;
    public final eyik bi;
    public final eyik bj;
    final eyik bk;
    public final eyik bl;
    public final eyik bm;
    public final eyik bn;
    final eyik bo;
    final eyik bp;
    public final eyik bq;
    final eyik br;
    final eyik bs;
    final eyik bt;
    public final eyik bu;
    final eyik bv;
    final eyik bw;
    final eyik bx;
    public final eyik by;
    public final eyik bz;
    public final ahho c;
    final eyik cA;
    final eyik cB;
    final eyik cC;
    final eyik cD;
    final eyik cE;
    public final eyik cF;
    public final eyik cG;
    final eyik cH;
    final eyik cI;
    final eyik cJ;
    public final eyik cK;
    final eyik cL;
    public final eyik cM;
    final eyik cN;
    public final eyik cO;
    final eyik cP;
    final eyik cQ;
    final eyik cR;
    final eyik cS;
    public final eyik cT;
    public final eyik cU;
    final eyik cV;
    final eyik cW;
    final eyik cX;
    final eyik cY;
    final eyik cZ;
    final eyik ca;
    final eyik cb;
    final eyik cc;
    final eyik cd;
    final eyik ce;
    public final eyik cf;
    final eyik cg;
    public final eyik ch;
    public final eyik ci;
    public final eyik cj;
    final eyik ck;
    final eyik cl;
    final eyik cm;
    public final eyik cn;
    public final eyik co;
    public final eyik cp;
    final eyik cq;
    final eyik cr;
    final eyik cs;
    final eyik ct;
    final eyik cu;
    final eyik cv;
    final eyik cw;
    public final eyik cx;
    final eyik cy;
    public final eyik cz;
    public final eyik d;
    final eyik da;
    final eyik db;
    final eyik dc;
    final eyik dd;
    final eyik de;
    final eyik df;
    final eyik dg;
    final eyik dh;
    final eyik e;
    public final eyik f;
    public final eyik g;
    public final eyik h;
    public final eyik i;
    final eyik j;
    public final eyik k;
    public final eyik l;
    public final eyik m;
    public final eyik n;
    final eyik o;
    public final eyik p;
    final eyik q;
    final eyik s;
    final eyik t;
    final eyik u;
    final eyik v;
    final eyik w;
    public final eyik x;
    public final eyik y;
    final eyik z;
    private final ahhk di = this;
    final eyik r = ahox.a;

    public ahhk(ahkn ahknVar, ahho ahhoVar, Activity activity) {
        this.b = ahknVar;
        this.c = ahhoVar;
        this.a = activity;
        this.d = new ahhj(ahknVar, ahhoVar, this, 0);
        this.e = new ahhj(ahknVar, ahhoVar, this, 2);
        this.f = new ahhj(ahknVar, ahhoVar, this, 1);
        this.g = eyin.a(new ahhj(ahknVar, ahhoVar, this, 4));
        this.h = eyie.c(new ahhj(ahknVar, ahhoVar, this, 3));
        this.i = new ahhj(ahknVar, ahhoVar, this, 5);
        this.j = new ahhj(ahknVar, ahhoVar, this, 7);
        this.k = new ahhj(ahknVar, ahhoVar, this, 6);
        this.l = eyie.c(new ahhj(ahknVar, ahhoVar, this, 8));
        this.m = new ahhj(ahknVar, ahhoVar, this, 9);
        this.n = eyie.c(new ahhj(ahknVar, ahhoVar, this, 10));
        this.o = eyin.a(new ahhj(ahknVar, ahhoVar, this, 13));
        this.p = eyie.c(new ahhj(ahknVar, ahhoVar, this, 15));
        this.q = eyie.c(new ahhj(ahknVar, ahhoVar, this, 16));
        this.s = new ahhj(ahknVar, ahhoVar, this, 18);
        this.t = eyie.c(new ahhj(ahknVar, ahhoVar, this, 17));
        eyie.c(new ahhj(ahknVar, ahhoVar, this, 14));
        this.u = eyie.c(new ahhj(ahknVar, ahhoVar, this, 19));
        this.v = eyie.c(new ahhj(ahknVar, ahhoVar, this, 20));
        eyie.c(new ahhj(ahknVar, ahhoVar, this, 12));
        this.w = eyie.c(new ahhj(ahknVar, ahhoVar, this, 21));
        this.x = new ahhj(ahknVar, ahhoVar, this, 11);
        this.y = eyie.c(new ahhj(ahknVar, ahhoVar, this, 22));
        this.z = eyie.c(new ahhj(ahknVar, ahhoVar, this, 24));
        this.A = eyie.c(new ahhj(ahknVar, ahhoVar, this, 23));
        this.B = eyie.c(new ahhj(ahknVar, ahhoVar, this, 25));
        this.C = eyie.c(new ahhj(ahknVar, ahhoVar, this, 26));
        this.D = new ahhj(ahknVar, ahhoVar, this, 28);
        this.E = eyie.c(new ahhj(ahknVar, ahhoVar, this, 27));
        this.F = eyie.c(new ahhj(ahknVar, ahhoVar, this, 29));
        eyie.c(new ahhj(ahknVar, ahhoVar, this, 30));
        this.G = new ahhj(ahknVar, ahhoVar, this, 31);
        this.H = new ahhj(ahknVar, ahhoVar, this, 32);
        this.I = eyie.c(new ahhj(ahknVar, ahhoVar, this, 33));
        this.J = new ahhj(ahknVar, ahhoVar, this, 35);
        this.K = new ahhj(ahknVar, ahhoVar, this, 34);
        this.L = new ahhj(ahknVar, ahhoVar, this, 37);
        this.M = new ahhj(ahknVar, ahhoVar, this, 36);
        this.N = eyie.c(new ahhj(ahknVar, ahhoVar, this, 39));
        this.O = eyie.c(new ahhj(ahknVar, ahhoVar, this, 38));
        this.P = new ahhj(ahknVar, ahhoVar, this, 40);
        eyik eyikVar = ahox.b;
        this.Q = eyikVar;
        this.R = new ahhj(ahknVar, ahhoVar, this, 41);
        this.S = eyikVar;
        this.T = new ahhj(ahknVar, ahhoVar, this, 44);
        this.U = eyie.c(new ahhj(ahknVar, ahhoVar, this, 43));
        this.V = new ahhj(ahknVar, ahhoVar, this, 42);
        this.W = new ahhj(ahknVar, ahhoVar, this, 45);
        this.X = new ahhj(ahknVar, ahhoVar, this, 46);
        this.Y = new ahhj(ahknVar, ahhoVar, this, 47);
        this.Z = new ahhj(ahknVar, ahhoVar, this, 48);
        this.aa = new ahhj(ahknVar, ahhoVar, this, 49);
        this.ab = new ahhj(ahknVar, ahhoVar, this, 50);
        this.ac = eyie.c(new ahhj(ahknVar, ahhoVar, this, 53));
        this.ad = new ahhj(ahknVar, ahhoVar, this, 52);
        this.ae = eyie.c(new ahhj(ahknVar, ahhoVar, this, 54));
        this.af = new ahhj(ahknVar, ahhoVar, this, 57);
        this.ag = eyikVar;
        this.ah = new ahhj(ahknVar, ahhoVar, this, 60);
        this.ai = new ahhj(ahknVar, ahhoVar, this, 59);
        this.aj = new ahhj(ahknVar, ahhoVar, this, 61);
        this.ak = new ahhj(ahknVar, ahhoVar, this, 62);
        this.al = new ahhj(ahknVar, ahhoVar, this, 63);
        this.am = new ahhj(ahknVar, ahhoVar, this, 58);
        this.an = eyie.c(new ahhj(ahknVar, ahhoVar, this, 56));
        this.ao = eyie.c(new ahhj(ahknVar, ahhoVar, this, 55));
        this.ap = eyie.c(new ahhj(ahknVar, ahhoVar, this, 64));
        this.aq = new ahhj(ahknVar, ahhoVar, this, 66);
        this.ar = new ahhj(ahknVar, ahhoVar, this, 65);
        this.as = new ahhj(ahknVar, ahhoVar, this, 68);
        this.at = new ahhj(ahknVar, ahhoVar, this, 67);
        this.au = new ahhj(ahknVar, ahhoVar, this, 70);
        this.av = eyie.c(new ahhj(ahknVar, ahhoVar, this, 72));
        this.aw = new ahhj(ahknVar, ahhoVar, this, 71);
        this.ax = new ahhj(ahknVar, ahhoVar, this, 69);
        this.ay = new ahhj(ahknVar, ahhoVar, this, 73);
        this.az = new ahhj(ahknVar, ahhoVar, this, 75);
        this.aA = new ahhj(ahknVar, ahhoVar, this, 74);
        this.aB = new ahhj(ahknVar, ahhoVar, this, 77);
        this.aC = eyie.c(new ahhj(ahknVar, ahhoVar, this, 76));
        this.aD = new ahhj(ahknVar, ahhoVar, this, 78);
        this.aE = new ahhj(ahknVar, ahhoVar, this, 81);
        this.aF = new ahhj(ahknVar, ahhoVar, this, 82);
        this.aG = new ahhj(ahknVar, ahhoVar, this, 83);
        this.aH = new ahhj(ahknVar, ahhoVar, this, 84);
        this.aI = new ahhj(ahknVar, ahhoVar, this, 80);
        this.aJ = new ahhj(ahknVar, ahhoVar, this, 79);
        this.aK = new ahhj(ahknVar, ahhoVar, this, 85);
        this.aL = new ahhj(ahknVar, ahhoVar, this, 86);
        this.aM = new ahhj(ahknVar, ahhoVar, this, 88);
        this.aN = eyie.c(new ahhj(ahknVar, ahhoVar, this, 87));
        this.aO = eyikVar;
        this.aP = new ahhj(ahknVar, ahhoVar, this, 89);
        this.aQ = eyie.c(new ahhj(ahknVar, ahhoVar, this, 90));
        this.aR = new ahhj(ahknVar, ahhoVar, this, 92);
        this.aS = eyie.c(new ahhj(ahknVar, ahhoVar, this, 91));
        this.aT = new ahhj(ahknVar, ahhoVar, this, 93);
        this.aU = eyie.c(new ahhj(ahknVar, ahhoVar, this, 94));
        this.aV = eyie.c(new ahhj(ahknVar, ahhoVar, this, 95));
        this.aW = new ahhj(ahknVar, ahhoVar, this, 96);
        this.aX = new ahhj(ahknVar, ahhoVar, this, 97);
        this.aY = new ahhj(ahknVar, ahhoVar, this, 98);
        this.aZ = new ahhj(ahknVar, ahhoVar, this, 100);
        this.ba = eyie.c(new ahhj(ahknVar, ahhoVar, this, 99));
        this.bb = new ahhj(ahknVar, ahhoVar, this, 102);
        this.bc = eyie.c(new ahhj(ahknVar, ahhoVar, this, EnergyProfile.EVCONNECTOR_TYPE_OTHER));
        this.bd = new ahhj(ahknVar, ahhoVar, this, 103);
        this.be = new ahhj(ahknVar, ahhoVar, this, 104);
        this.bf = new ahhj(ahknVar, ahhoVar, this, 105);
        this.bg = eyie.c(new ahhj(ahknVar, ahhoVar, this, 106));
        this.bh = new ahhj(ahknVar, ahhoVar, this, 107);
        this.bi = eyie.c(new ahhj(ahknVar, ahhoVar, this, 108));
        this.bj = eyin.a(new ahhj(ahknVar, ahhoVar, this, 109));
        this.bk = new ahhj(ahknVar, ahhoVar, this, 111);
        this.bl = new ahhj(ahknVar, ahhoVar, this, 110);
        this.bm = new ahhj(ahknVar, ahhoVar, this, 112);
        this.bn = new ahhj(ahknVar, ahhoVar, this, 115);
        this.bo = new ahhj(ahknVar, ahhoVar, this, 116);
        this.bp = new ahhj(ahknVar, ahhoVar, this, 114);
        this.bq = eyie.c(new ahhj(ahknVar, ahhoVar, this, 113));
        this.br = new ahhj(ahknVar, ahhoVar, this, 118);
        this.bs = new ahhj(ahknVar, ahhoVar, this, 119);
        this.bt = eyin.a(new ahhj(ahknVar, ahhoVar, this, 120));
        this.bu = eyie.c(new ahhj(ahknVar, ahhoVar, this, 117));
        this.bv = new ahhj(ahknVar, ahhoVar, this, 124);
        this.bw = new ahhj(ahknVar, ahhoVar, this, 126);
        this.bx = new ahhj(ahknVar, ahhoVar, this, 125);
        this.by = eyie.c(new ahhj(ahknVar, ahhoVar, this, 129));
        this.bz = eyie.c(new ahhj(ahknVar, ahhoVar, this, 128));
        this.bA = eyie.c(new ahhj(ahknVar, ahhoVar, this, 130));
        this.bB = eyie.c(new ahhj(ahknVar, ahhoVar, this, 131));
        this.bC = eyie.c(new ahhj(ahknVar, ahhoVar, this, 127));
        this.bD = eyie.c(new ahhj(ahknVar, ahhoVar, this, 134));
        this.bE = eyie.c(new ahhj(ahknVar, ahhoVar, this, 135));
        this.bF = eyie.c(new ahhj(ahknVar, ahhoVar, this, 137));
        this.bG = eyie.c(new ahhj(ahknVar, ahhoVar, this, 136));
        this.bH = eyie.c(new ahhj(ahknVar, ahhoVar, this, 133));
        this.bI = new ahhj(ahknVar, ahhoVar, this, 132);
        this.bJ = eyie.c(new ahhj(ahknVar, ahhoVar, this, 138));
        this.bK = eyie.c(new ahhj(ahknVar, ahhoVar, this, 139));
        this.bL = new ahhj(ahknVar, ahhoVar, this, 140);
        this.bM = new ahhj(ahknVar, ahhoVar, this, 141);
        this.bN = eyie.c(new ahhj(ahknVar, ahhoVar, this, 123));
        this.bO = new ahhj(ahknVar, ahhoVar, this, 122);
        this.bP = new ahhj(ahknVar, ahhoVar, this, 143);
        this.bQ = eyie.c(new ahhj(ahknVar, ahhoVar, this, 145));
        this.bR = eyie.c(new ahhj(ahknVar, ahhoVar, this, 144));
        this.bS = eyie.c(new ahhj(ahknVar, ahhoVar, this, 146));
        this.bT = eyie.c(new ahhj(ahknVar, ahhoVar, this, 147));
        this.bU = new ahhj(ahknVar, ahhoVar, this, 142);
        this.bV = new ahhj(ahknVar, ahhoVar, this, 148);
        this.bW = new ahhj(ahknVar, ahhoVar, this, 149);
        this.bX = new ahhj(ahknVar, ahhoVar, this, 150);
        this.bY = new ahhj(ahknVar, ahhoVar, this, 151);
        this.bZ = new ahhj(ahknVar, ahhoVar, this, 152);
        this.ca = new ahhj(ahknVar, ahhoVar, this, 153);
        this.cb = new ahhj(ahknVar, ahhoVar, this, 154);
        this.cc = new ahhj(ahknVar, ahhoVar, this, 155);
        this.cd = eyie.c(new ahhj(ahknVar, ahhoVar, this, 158));
        this.ce = eyie.c(new ahhj(ahknVar, ahhoVar, this, 157));
        this.cf = new ahhj(ahknVar, ahhoVar, this, 159);
        this.cg = new ahhj(ahknVar, ahhoVar, this, 156);
        this.ch = eyie.c(new ahhj(ahknVar, ahhoVar, this, 161));
        eyid eyidVar = new eyid();
        this.ci = eyidVar;
        this.cj = new ahhj(ahknVar, ahhoVar, this, 162);
        this.ck = new ahhj(ahknVar, ahhoVar, this, 160);
        this.cl = new ahhj(ahknVar, ahhoVar, this, 163);
        this.cm = new ahhj(ahknVar, ahhoVar, this, 164);
        eyid.a(eyidVar, new ahhj(ahknVar, ahhoVar, this, 121));
        this.cn = eyie.c(new ahhj(ahknVar, ahhoVar, this, 165));
        this.co = new ahhj(ahknVar, ahhoVar, this, 168);
        this.cp = eyie.c(new ahhj(ahknVar, ahhoVar, this, 167));
        this.cq = eyie.c(new ahhj(ahknVar, ahhoVar, this, 169));
        this.cr = eyie.c(new ahhj(ahknVar, ahhoVar, this, 170));
        this.cs = eyie.c(new ahhj(ahknVar, ahhoVar, this, 171));
        this.ct = eyie.c(new ahhj(ahknVar, ahhoVar, this, 172));
        this.cu = new ahhj(ahknVar, ahhoVar, this, 173);
        this.cv = new ahhj(ahknVar, ahhoVar, this, 174);
        ahhj ahhjVar = new ahhj(ahknVar, ahhoVar, this, 166);
        this.cw = ahhjVar;
        this.cx = eyie.c(ahhjVar);
        ahhj ahhjVar2 = new ahhj(ahknVar, ahhoVar, this, 175);
        this.cy = ahhjVar2;
        this.cz = eyie.c(ahhjVar2);
        this.cA = new ahhj(ahknVar, ahhoVar, this, 176);
        this.cB = new ahhj(ahknVar, ahhoVar, this, 177);
        this.cC = new ahhj(ahknVar, ahhoVar, this, 178);
        this.cD = eyie.c(new ahhj(ahknVar, ahhoVar, this, 179));
        this.cE = new ahhj(ahknVar, ahhoVar, this, 180);
        this.cF = new ahhj(ahknVar, ahhoVar, this, 181);
        this.cG = new ahhj(ahknVar, ahhoVar, this, 182);
        this.cH = eyin.a(new ahhj(ahknVar, ahhoVar, this, 184));
        eyie.c(new ahhj(ahknVar, ahhoVar, this, 183));
        this.cI = eyin.a(new ahhj(ahknVar, ahhoVar, this, 185));
        this.cJ = new ahhj(ahknVar, ahhoVar, this, 186);
        this.cK = new ahhj(ahknVar, ahhoVar, this, 187);
        ahhj ahhjVar3 = new ahhj(ahknVar, ahhoVar, this, 188);
        this.cL = ahhjVar3;
        this.cM = eyie.c(ahhjVar3);
        this.cN = new ahhj(ahknVar, ahhoVar, this, 190);
        this.cO = new ahhj(ahknVar, ahhoVar, this, 189);
        this.cP = new ahhj(ahknVar, ahhoVar, this, 191);
        this.cQ = new ahhj(ahknVar, ahhoVar, this, 192);
        ahhj ahhjVar4 = new ahhj(ahknVar, ahhoVar, this, 193);
        this.cR = ahhjVar4;
        this.cS = eyie.c(ahhjVar4);
        this.cT = eyie.c(new ahhj(ahknVar, ahhoVar, this, 194));
        this.cU = new ahhj(ahknVar, ahhoVar, this, 195);
        this.cV = new ahhj(ahknVar, ahhoVar, this, 197);
        this.cW = new ahhj(ahknVar, ahhoVar, this, 198);
        this.cX = new ahhj(ahknVar, ahhoVar, this, 199);
        this.cY = eyie.c(new ahhj(ahknVar, ahhoVar, this, BasePaymentResult.ERROR_REQUEST_FAILED));
        this.cZ = new ahhj(ahknVar, ahhoVar, this, 196);
        this.da = new ahhj(ahknVar, ahhoVar, this, BasePaymentResult.ERROR_REQUEST_TIMEOUT);
        this.db = new ahhj(ahknVar, ahhoVar, this, BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED);
        this.dc = new ahhj(ahknVar, ahhoVar, this, BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED);
        this.dd = new ahhj(ahknVar, ahhoVar, this, 206);
        this.de = new ahhj(ahknVar, ahhoVar, this, 205);
        this.df = new ahhj(ahknVar, ahhoVar, this, 207);
        this.dg = new ahhj(ahknVar, ahhoVar, this, 204);
        this.dh = new ahhj(ahknVar, ahhoVar, this, 208);
    }

    @Override // einc.a
    public final einm A() {
        return (einm) this.b.b.nT.b();
    }

    final acvy B() {
        Context context = (Context) this.d.b();
        eyik eyikVar = this.d;
        ahkn ahknVar = this.b;
        ahnh ahnhVar = ahknVar.a;
        return new acvy(context, new cwve(eyikVar, ahnhVar.SI, this.al, this.ak, ahnhVar.Wj, ahknVar.b.jw));
    }

    final acwy C() {
        ahkn ahknVar = this.b;
        ahnh ahnhVar = ahknVar.a;
        eyik eyikVar = ahknVar.cD;
        eyik eyikVar2 = ahnhVar.vh;
        eyik eyikVar3 = this.af;
        eyik eyikVar4 = ahknVar.aI;
        eyik eyikVar5 = ahknVar.p;
        eyik eyikVar6 = ahknVar.aJ;
        eyik eyikVar7 = this.am;
        eyik eyikVar8 = ahnhVar.c;
        eyik eyikVar9 = ahnhVar.pQ;
        eyik eyikVar10 = ahnhVar.BF;
        ahng ahngVar = ahknVar.b;
        return new acwy(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, eyikVar5, eyikVar6, eyikVar7, eyikVar8, eyikVar9, eyikVar10, ahknVar.cE, ahngVar.nx, ahngVar.ny, ahngVar.nz);
    }

    final acxz D() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        eyik eyikVar = ahknVar.b.jv;
        ahnh ahnhVar = ahknVar.a;
        return new acxz(context, eyikVar, ahnhVar.vV, (arpr) ahnhVar.Be.b());
    }

    final acyh E() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        ahnh ahnhVar = ahknVar.a;
        bajh bajhVar = (bajh) ahnhVar.SI.b();
        cssf cssfVar = (cssf) ahnhVar.uo.b();
        eyik eyikVar = ahknVar.id;
        eyik eyikVar2 = ahknVar.dL;
        eyik eyikVar3 = ahnhVar.pQ;
        eyik eyikVar4 = ahknVar.ie;
        ahng ahngVar = ahknVar.b;
        return new acyh(context, bajhVar, cssfVar, eyikVar, eyikVar2, eyikVar3, eyikVar4, this.aj, ahngVar.jv, ahngVar.jw, ahnhVar.tA, ahngVar.jx, ahngVar.jy, (arpr) ahnhVar.Be.b());
    }

    final acyi F() {
        return new acyi((arpr) this.b.a.Be.b());
    }

    final acyj G() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        ahnh ahnhVar = ahknVar.a;
        eyik eyikVar = ahnhVar.qj;
        ahng ahngVar = ahknVar.b;
        return new acyj(context, eyikVar, ahngVar.jz, ahngVar.jA, ahngVar.jB, (arpr) ahnhVar.Be.b());
    }

    final acyk H() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        return new acyk(context, eyie.a(ahknVar.a.pE), ahknVar.b.jv);
    }

    final acyo I() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        return new acyo(context, (cogw) ahknVar.cD.b(), (cqjk) ahknVar.no.b(), ahknVar.b.jv, (arpr) ahknVar.a.Be.b());
    }

    final acyp J() {
        return new acyp((Context) this.d.b(), (arpr) this.b.a.Be.b());
    }

    final adap K() {
        ahho ahhoVar = this.c;
        ahkn ahknVar = ahhoVar.a;
        Map mapAG = aG();
        ahng ahngVar = this.b.b;
        return new adap(mapAG, ekhx.s(ahngVar.H(), new aczr((Context) ahknVar.t.b(), eyie.a(ahhoVar.bz)), ahngVar.G()));
    }

    final ahdu L() {
        return new ahdu((Activity) this.d.b(), (eigp) this.b.aI.b(), q(), (ahdv) this.aU.b(), this.O);
    }

    @Override // defpackage.aihm
    public final aiho M() {
        return (aiho) this.av.b();
    }

    @Override // defpackage.crml
    public final crmk N() {
        return (crmk) this.h.b();
    }

    @Override // defpackage.ctfm
    public final ctgc O() {
        return (ctgc) this.aV.b();
    }

    public final RichCardsSettingsActivity P() {
        Activity activity = (Activity) this.d.b();
        if (!(activity instanceof RichCardsSettingsActivity)) {
            throw new IllegalStateException(a.L(activity, cuxg.class, "Attempt to inject a Activity wrapper of type "));
        }
        RichCardsSettingsActivity richCardsSettingsActivity = (RichCardsSettingsActivity) activity;
        richCardsSettingsActivity.getClass();
        return richCardsSettingsActivity;
    }

    @Override // defpackage.cvuo
    public final cvum Q() {
        return (cvum) this.ba.b();
    }

    @Override // defpackage.cvup
    public final cvun R() {
        return (cvun) this.bc.b();
    }

    @Override // defpackage.cwpn
    public final cwpm S() {
        return (cwpm) this.bg.b();
    }

    @Override // defpackage.dacf
    public final dacu T() {
        return (dacu) this.bq.b();
    }

    @Override // defpackage.daio
    public final daip U() {
        return (daip) this.l.b();
    }

    @Override // defpackage.dnhk
    public final dnhi V() {
        return (dnhi) this.bi.b();
    }

    @Override // defpackage.dpjh
    public final dpjc W() {
        return (dpjc) this.bu.b();
    }

    final dpji X() {
        Activity activity = (Activity) this.d.b();
        activity.getClass();
        int i = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512;
        if (Build.VERSION.SDK_INT < 30 || i <= 0) {
            Object objB = this.bs.b();
            objB.getClass();
            return (dpji) objB;
        }
        Object objB2 = this.br.b();
        objB2.getClass();
        return (dpji) objB2;
    }

    final dplc Y() {
        Activity activity = (Activity) this.d.b();
        ahkn ahknVar = this.b;
        return new dplc(activity, (diep) ahknVar.l.b(), (ecjh) this.bt.b(), (fdjx) ahknVar.a.oQ.b(), (dngc) ahknVar.lo.b());
    }

    public final dsva Z() {
        eupp euppVarAA = aA();
        evsl evslVar = edha.a;
        eupx eupxVar = (eupx) eupy.a.createBuilder();
        eupxVar.copyOnWrite();
        eupy eupyVar = (eupy) eupxVar.instance;
        eupyVar.d = euppVarAA;
        eupyVar.c |= 1;
        return new dsva(evslVar, (eupy) eupxVar.build());
    }

    @Override // defpackage.tlu
    public final tlt a() {
        return (tlt) this.n.b();
    }

    final eupp aA() {
        eusa eusaVar = (eusa) this.bA.b();
        euqq euqqVar = (euqq) this.bB.b();
        eupo eupoVar = (eupo) eupp.a.createBuilder();
        eupoVar.copyOnWrite();
        eupp euppVar = (eupp) eupoVar.instance;
        euppVar.c = 5;
        euppVar.b |= 1;
        eupoVar.copyOnWrite();
        eupp euppVar2 = (eupp) eupoVar.instance;
        eusaVar.getClass();
        euppVar2.d = eusaVar;
        euppVar2.b |= 2;
        eupoVar.copyOnWrite();
        eupp euppVar3 = (eupp) eupoVar.instance;
        euqqVar.getClass();
        euppVar3.e = euqqVar;
        euppVar3.b |= 4;
        eupp euppVar4 = (eupp) eupoVar.build();
        euppVar4.getClass();
        return euppVar4;
    }

    @Override // eygu.a
    public final eygv aB() {
        ekgi ekgiVarH = ekgp.h(18);
        ekgiVarH.i("efxv$a", true);
        ekgiVarH.i("tgr", true);
        ekgiVarH.i("dmpe", true);
        ekgiVarH.i("ugj", true);
        ekgiVarH.i("uut", true);
        ekgiVarH.i("adcn", true);
        ekgiVarH.i("egas", true);
        ekgiVarH.i("cyha", true);
        ekgiVarH.i("ejfj", true);
        ekgiVarH.i("egqc", true);
        ekgiVarH.i("affe", true);
        ekgiVarH.i("vbx", true);
        ekgiVarH.i("afjp", true);
        ekgiVarH.i("dbab", true);
        ekgiVarH.i("edxi", true);
        ekgiVarH.i("cvgt", true);
        ekgiVarH.i("ehae", true);
        ekgiVarH.i("cvhj", true);
        return new eygv(new eyih(ekgiVarH.c()), new ahoj(this.b, this.c));
    }

    final Object aC() {
        return new achc(this.H, this.b.a.ws);
    }

    final Object aD() {
        ejwi ejwiVarAy = ay();
        ehnu ehnuVar = (ehnu) this.o.b();
        return ejwiVarAy.g() ? new efxl((eg) ejwiVarAy.c(), ehnuVar) : new efxk(ehnuVar);
    }

    final Object aE() {
        ejwi ejwiVarAy = ay();
        ehnu ehnuVar = (ehnu) this.o.b();
        return ejwiVarAy.g() ? new efya((eg) ejwiVarAy.c(), ehnuVar) : new efxz(ehnuVar);
    }

    final Object aF() {
        return new ehrj((eidm) this.T.b());
    }

    final Map aG() {
        ekgi ekgiVarH = ekgp.h(16);
        adar adarVar = adar.AVATAR;
        acvw acvwVarZ = z();
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        eyik eyikVar = ahknVar.hD;
        ahng ahngVar = ahknVar.b;
        eyik eyikVar2 = this.ag;
        eyik eyikVar3 = this.ai;
        eyik eyikVar4 = ahngVar.js;
        ahnh ahnhVar = ahknVar.a;
        ekgiVarH.i(adarVar, acxf.a(acvwVarZ, new acvx(context, eyikVar, eyikVar2, eyikVar3, eyikVar4, ahnhVar.pl, ahnhVar.aaH, ahnhVar.pD, ahngVar.jt, ahngVar.ju, ahnhVar.vV), ahngVar.aB()));
        ekgiVarH.i(adar.NAME, D());
        ekgiVarH.i(adar.SNIPPET, E());
        ekgiVarH.i(adar.SUBJECT, H());
        ekgiVarH.i(adar.TIMESTAMP, I());
        ekgiVarH.i(adar.NOTIFICATION_SNOOZE_ICON, F());
        ekgiVarH.i(adar.WORK_PROFILE_ICON, new acyq());
        adar adarVar2 = adar.REMINDER;
        Context context2 = (Context) this.d.b();
        eyik eyikVar5 = ahknVar.cD;
        ekgiVarH.i(adarVar2, new acyf(context2, (cogw) eyikVar5.b()));
        ekgiVarH.i(adar.NUDGE, new agml((Context) this.d.b(), (cgry) ahknVar.ka.b(), (cgrz) ahknVar.nm.b(), (crbi) ahnhVar.Cd.b()));
        ekgiVarH.i(adar.BIRTHDAY, new tga((Context) this.d.b(), (fdjx) ahnhVar.m.b(), ahngVar.f(), (teu) this.ak.b()));
        ekgiVarH.i(adar.OTP, new acyc((cogw) eyikVar5.b(), ahnhVar.Hf));
        ekgiVarH.i(adar.CONTENT_DESCRIPTION, B());
        ekgiVarH.i(adar.UNREAD_BADGE, J());
        ekgiVarH.i(adar.PIN_TO_TOP, new acyd());
        ekgiVarH.i(adar.STATUS, G());
        ekgiVarH.i(adar.SCHEDULED_MESSAGE, new aihp((Context) this.d.b()));
        return ekgiVarH.c();
    }

    @Override // defpackage.eigu
    public final Set aH() {
        return ekon.a;
    }

    final eddk aI() {
        return new eddk((Context) this.b.t.b());
    }

    @Override // eyhj.a
    public final ahhx aJ() {
        return new ahhx(this.b, this.c, this.di);
    }

    @Override // eyhq.b
    public final ahnp aK() {
        return new ahnp(this.b, this.c, this.di);
    }

    @Override // ehok.c
    public final ehnb aL() {
        return new ehnb(ax(), new ehmx((ehnc) this.b.b.fY.b(), ax(), (ehnu) this.o.b()), (ehnu) this.o.b());
    }

    public final dsvb aa() {
        ejwi ejwiVar = (ejwi) this.bz.b();
        return !ejwiVar.g() ? dswc.b() : dswc.a((String) ejwiVar.c());
    }

    public final ecyn ab() {
        eg egVar = (eg) this.g.b();
        return new ecyn(egVar, this.cP, this.cQ);
    }

    public final edar ac() {
        return ((edau) ((lxo) this.ci.b()).a(edau.class)).f;
    }

    final eddn ad() {
        eyik eyikVar = this.bO;
        ekgi ekgiVarH = ekgp.h(14);
        ekgiVarH.i(ecyz.class, eyikVar);
        ekgiVarH.i(edau.class, this.bU);
        ekgiVarH.i(edbo.class, this.bV);
        ekgiVarH.i(edco.class, this.bW);
        ekgiVarH.i(edcx.class, this.bX);
        ekgiVarH.i(edot.class, this.bY);
        ekgiVarH.i(edod.class, this.bZ);
        ekgiVarH.i(edqn.class, this.ca);
        ekgiVarH.i(edom.class, this.cb);
        ekgiVarH.i(edri.class, this.cc);
        ekgiVarH.i(edtf.class, this.cg);
        ekgiVarH.i(edtb.class, this.ck);
        ekgiVarH.i(edtl.class, this.cl);
        ekgiVarH.i(edmz.class, this.cm);
        return new eddn(ekgiVarH.c());
    }

    public final edds ae() {
        return new edds((Context) this.b.t.b());
    }

    final edhh af() {
        ahkn ahknVar = this.b;
        eyik eyikVar = ahknVar.aJ;
        eosc eoscVar = (eosc) eyikVar.b();
        eyik eyikVar2 = this.bv;
        edhj edhjVar = (edhj) eyikVar2.b();
        eyik eyikVar3 = this.bx;
        edgi edgiVar = (edgi) eyikVar3.b();
        eyik eyikVar4 = this.bC;
        return new edhh(ejwi.j(new edhy(eoscVar, edhjVar, edgiVar, (edgv) eyikVar4.b(), new edhw(this.bI, eyikVar, this.bJ, this.bK))), new edlu(eyikVar, eyikVar2, eyikVar3, eyikVar4, this.bL), new edlk(this.bM, eyikVar, eyikVar2, eyikVar3, eyikVar4), new edlc(ahknVar.t, eyikVar));
    }

    final edim ag() {
        edgc edgcVar = (edgc) this.bI.b();
        ahkn ahknVar = this.b;
        return new edim(edgcVar, (eosc) ahknVar.aJ.b(), (etul) this.bJ.b(), (edgi) this.bx.b(), new edkt((Context) ahknVar.t.b(), (eddy) this.bR.b()), (drjk) ahknVar.cW.b(), (ednl) this.bS.b());
    }

    final edis ah() {
        return new edis((edgc) this.bI.b(), (eosc) this.b.aJ.b(), (etul) this.bJ.b(), (edgi) this.bx.b(), (edhj) this.bv.b(), (ettv) this.bK.b());
    }

    final edjg ai() {
        return new edjg((edgc) this.bI.b(), (eosc) this.b.aJ.b(), (etul) this.bJ.b(), (edgi) this.bx.b(), (edhj) this.bv.b());
    }

    final edjm aj() {
        return new edjm((edgc) this.bI.b(), (eosc) this.b.aJ.b(), (etul) this.bJ.b(), (edgi) this.bx.b(), (edhj) this.bv.b(), (ettv) this.bK.b());
    }

    public final edlj ak() {
        return ((edhg) this.bN.b()).c();
    }

    public final edln al() {
        return ((edhg) this.bN.b()).e();
    }

    public final edlv am() {
        return ((edhg) this.bN.b()).f();
    }

    public final edty an() {
        eyik eyikVar = this.cA;
        edtt edttVar = edtt.ART;
        eygg eyggVarA = eyie.a(eyikVar);
        edtr edtrVarI = edtu.i();
        edtrVarI.e(edttVar);
        edtrVarI.b(fbgs.c());
        edtrVarI.d(edtm.START_IN_ART_TAB);
        edtrVarI.c(eyggVarA);
        edtrVarI.f(R.string.op3_picker_art_header);
        edtrVarI.g(122831);
        ((edto) edtrVarI).a = new edts() { // from class: ecym
            @Override // defpackage.edts
            public final void a(Context context, eeve eeveVar, ColorStateList colorStateList) {
                Drawable drawableA = ku.a(context, R.drawable.quantum_gm_ic_color_lens_vd_theme_24);
                eeveVar.e(drawableA);
                drawableA.setTintList(colorStateList);
            }
        };
        edtu edtuVarA = edtrVarI.a();
        eyik eyikVar2 = this.cB;
        edtt edttVar2 = edtt.DEVICE_PHOTOS;
        final eygg eyggVarA2 = eyie.a(eyikVar2);
        edtr edtrVarI2 = edtu.i();
        edtrVarI2.e(edttVar2);
        edtrVarI2.d(edtm.START_IN_DEVICE_PHOTOS_TAB);
        eyggVarA2.getClass();
        edtrVarI2.c(new eygg() { // from class: edtz
            @Override // defpackage.eygg
            public final Object b() {
                return (ea) eyggVarA2.b();
            }
        });
        edtrVarI2.f(R.string.op3_picker_device_photos);
        edtrVarI2.g(110516);
        edto edtoVar = (edto) edtrVarI2;
        edtoVar.a = new edts() { // from class: edua
            @Override // defpackage.edts
            public final void a(Context context, eeve eeveVar, ColorStateList colorStateList) {
                Drawable drawableA = ku.a(context, R.drawable.quantum_gm_ic_smartphone_vd_theme_24);
                eeveVar.e(drawableA);
                drawableA.setTintList(colorStateList);
            }
        };
        edtoVar.b = ejwi.j(new Runnable() { // from class: edub
            @Override // java.lang.Runnable
            public final void run() {
                ((DevicePhotosFragment) eyggVarA2.b()).p();
            }
        });
        edtu edtuVarA2 = edtrVarI2.a();
        eyik eyikVar3 = this.bR;
        eyik eyikVar4 = this.cC;
        edtt edttVar3 = edtt.GOOGLE_PHOTOS;
        eygg eyggVarA3 = eyie.a(eyikVar4);
        boolean zG = ((eduq) this.by.b()).b.g();
        edtr edtrVarI3 = edtu.i();
        edtrVarI3.e(edttVar3);
        edtrVarI3.b(zG);
        edtrVarI3.d(edtm.START_IN_GOOGLE_PHOTOS_TAB);
        edtrVarI3.c(eyggVarA3);
        edtrVarI3.f(R.string.op3_picker_google_photos);
        edtrVarI3.g(110515);
        ((edto) edtrVarI3).a = new edts() { // from class: educ
            @Override // defpackage.edts
            public final void a(Context context, eeve eeveVar, ColorStateList colorStateList) {
                eeveVar.e(ku.a(context, R.drawable.quantum_gm_ic_photos_vd_theme_24));
            }
        };
        return new edty(ekgp.n(edttVar, edtuVarA, edttVar2, edtuVarA2, edttVar3, edtrVarI3.a()), ejwi.j(ekjz.c(edtt.MONOGRAM, edttVar, edttVar2, edttVar3)));
    }

    final edut ao() {
        return new edut((Activity) this.d.b(), new ednk((Activity) this.d.b()));
    }

    @Override // defpackage.efxo
    public final efxf ap() {
        return (efxf) this.x.b();
    }

    public final egac aq() {
        egac egacVar = (egac) this.u.b();
        egacVar.getClass();
        return egacVar;
    }

    public final eglf ar() {
        Activity activity = (Activity) this.d.b();
        Activity activity2 = (Activity) this.d.b();
        eigp eigpVar = (eigp) this.b.aI.b();
        eyik eyikVar = this.cZ;
        eyik eyikVar2 = this.O;
        return activity instanceof FiAccountActivity ? new abxh() : new abxl(new abxf(activity2, eigpVar, eyikVar, eyikVar2), activity, eyikVar2);
    }

    @Override // ehok.a
    public final ehna as() {
        return (ehna) this.t.b();
    }

    @Override // defpackage.ehoa
    public final ehor at() {
        return (ehor) this.cD.b();
    }

    @Override // defpackage.cpcl
    public final ehrb au() {
        return (ehrb) this.U.b();
    }

    public final ehsq av() {
        Activity activity = (Activity) this.d.b();
        ekgi ekgiVarH = ekgp.h(6);
        ahng ahngVar = this.b.b;
        ekgiVarH.i("com.google.android.apps.messaging.deeplinks.InstallDeepLink", ahngVar.nP);
        ahho ahhoVar = this.c;
        eyik eyikVar = ahhoVar.bX;
        ekgiVarH.i("com.google.android.apps.messaging.emergency.EmergencySosConversation", eyikVar);
        ekgiVarH.i("com.google.android.apps.messaging.emergency.DemoEmergencySosConversation", eyikVar);
        ekgiVarH.i("com.google.android.apps.messaging.conversation.deeplink.ConversationDeeplink", ahhoVar.bY);
        ekgiVarH.i("com.google.android.apps.messaging.ui.conversation.rbm.RbmDeepLink", ahngVar.nQ);
        ekgiVarH.i("com.google.android.apps.messaging.ui.conversation.smsdeeplinks.SmsDeepLink", ahngVar.nS);
        return new ehsq(activity, ekgiVarH.c(), ejwi.j(this.cE), (egpr) this.v.b());
    }

    public final eile aw() {
        return new eile((eigp) this.b.aI.b());
    }

    final ejwi ax() {
        return ejwi.i(this.a);
    }

    final ejwi ay() {
        Activity activity = this.a;
        try {
            return activity == null ? ejud.a : ejwi.j((eg) activity);
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    @Override // ehok.e
    public final ejwi az() {
        return (ejwi) this.s.b();
    }

    @Override // defpackage.eigu
    public final eigp b() {
        return (eigp) this.b.aI.b();
    }

    @Override // defpackage.uit
    public final uix c() {
        return (uix) this.A.b();
    }

    @Override // defpackage.uiv
    public final uiy d() {
        return (uiy) this.B.b();
    }

    @Override // defpackage.ule
    public final uld e() {
        return (uld) this.E.b();
    }

    @Override // defpackage.upm
    public final upn f() {
        return (upn) this.F.b();
    }

    @Override // defpackage.abxo
    public final abwy g() {
        return (abwy) this.O.b();
    }

    @Override // defpackage.acuu
    public final acut h() {
        return (acut) this.ae.b();
    }

    @Override // defpackage.acye
    public final acxm i() {
        return (acxm) this.ao.b();
    }

    @Override // defpackage.adax
    public final adas j() {
        return (adas) this.ap.b();
    }

    @Override // defpackage.afde
    public final afdd k() {
        return new afdd();
    }

    @Override // defpackage.afjv
    public final afjt l() {
        return (afjt) this.aN.b();
    }

    @Override // defpackage.agnr
    public final agnm m() {
        return (agnm) this.aQ.b();
    }

    @Override // defpackage.agns
    public final agnq n() {
        return (agnq) this.aS.b();
    }

    @Override // defpackage.ahdw
    public final ahdv o() {
        return (ahdv) this.aU.b();
    }

    final abzr p() {
        return new abzr(this.x);
    }

    final acac q() {
        return new acac((ains) this.b.a.pQ.b());
    }

    final acag r() {
        return new acag((Activity) this.d.b(), (eigp) this.b.aI.b(), q(), this.O);
    }

    final acai s() {
        return new acai((Activity) this.d.b(), (eigp) this.b.aI.b(), this.cW, this.cX);
    }

    final acan t() {
        Activity activity = (Activity) this.d.b();
        ahkn ahknVar = this.b;
        eigp eigpVar = (eigp) ahknVar.aI.b();
        eyik eyikVar = this.aJ;
        return new acan(activity, eigpVar, q(), eyie.a(eyikVar), this.O, eyie.a(ahknVar.a.vY));
    }

    final acca u() {
        Activity activity = (Activity) this.d.b();
        ahkn ahknVar = this.b;
        ahnh ahnhVar = ahknVar.a;
        final egej egejVar = (egej) ahnhVar.pI.b();
        final fdjx fdjxVar = (fdjx) ahnhVar.m.b();
        final eyik eyikVar = ahknVar.lT;
        final eyik eyikVar2 = ahnhVar.LC;
        activity.getClass();
        egejVar.getClass();
        fdjxVar.getClass();
        eyikVar.getClass();
        eyikVar2.getClass();
        acas acasVar = new acas();
        dyun dyunVarK = dyuo.k();
        ((dyug) dyunVarK).b = ejud.a;
        dyunVarK.d(new dyuy(activity.getString(R.string.app_name)));
        dyunVarK.c(new dyuw());
        acasVar.a = dyunVarK.e();
        acasVar.d(new accc() { // from class: abin
            @Override // defpackage.accc
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewInflate = layoutInflater.inflate(R.layout.gp_web_tablet_express_sign_in, viewGroup, false);
                viewInflate.getClass();
                return viewInflate;
            }

            @Override // defpackage.accc
            public final /* synthetic */ void b() {
            }
        });
        final eyik eyikVar3 = ahknVar.b.np;
        acasVar.c(new Function() { // from class: abio
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                auvh.h(auvw.c(fdjxVar, fcyi.a, fdjz.a, new abir((efwo) obj, egejVar, eyikVar, eyikVar3, null)));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        acasVar.b(new Function() { // from class: abip
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                auvh.h(auvw.c(fdjxVar, fcyi.a, fdjz.a, new abis(eyikVar2, eyikVar, null)));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return acasVar.a();
    }

    final acca v() {
        final Activity activity = (Activity) this.d.b();
        activity.getClass();
        dyun dyunVarK = dyuo.k();
        dyug dyugVar = (dyug) dyunVarK;
        dyugVar.b = ejud.a;
        dyunVarK.d(new dyuy(activity.getString(R.string.app_name)));
        dyugVar.c = new dyux(R.style.EquallyWeightedButton);
        dyunVarK.c(new dyuw());
        acas acasVar = new acas();
        acasVar.a = dyunVarK.e();
        acasVar.d(new accc() { // from class: cysu
            @Override // defpackage.accc
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewInflate = layoutInflater.inflate(R.layout.gpp_express_sign_in, viewGroup, false);
                viewInflate.getClass();
                return viewInflate;
            }

            @Override // defpackage.accc
            public final /* synthetic */ void b() {
            }
        });
        acasVar.c(new Function() { // from class: cysv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) throws IOException {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                cysx.a(activity, efwoVar, true);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        acasVar.b(new Function() { // from class: cysw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) throws IOException {
                efwo efwoVar = (efwo) obj;
                efwoVar.getClass();
                cysx.a(activity, efwoVar, false);
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return acasVar.a();
    }

    final acca w() {
        Activity activity = (Activity) this.d.b();
        activity.getClass();
        dyun dyunVarK = dyuo.k();
        ((dyug) dyunVarK).b = ejud.a;
        dyunVarK.d(new dyuy(activity.getString(R.string.app_name)));
        dyunVarK.c(new dyuw());
        acas acasVar = new acas();
        acasVar.a = dyunVarK.e();
        acasVar.d(new accc() { // from class: accd
            @Override // defpackage.accc
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                View viewInflate = layoutInflater.inflate(R.layout.express_sign_in, viewGroup, false);
                viewInflate.getClass();
                return viewInflate;
            }

            @Override // defpackage.accc
            public final /* synthetic */ void b() {
            }
        });
        return acasVar.a();
    }

    final acca x() {
        final Activity activity = (Activity) this.d.b();
        eyik eyikVar = this.b.a.Uk;
        activity.getClass();
        eyikVar.getClass();
        eymb eymbVarA = cdpw.a(activity.getIntent());
        eovb eovbVar = null;
        if (eymbVarA == null) {
            cdpw.a.m("chatIntentApiArgs is null.");
        } else {
            evqs evqsVar = eymbVarA.i;
            if (evqsVar.H()) {
                cdpw.a.m("chatIntentApiArgs doesn't have conversationContext.");
            } else {
                try {
                    eyqz eyqzVar = (eyqz) evsn.parseFrom(eyqz.a, evqsVar, evrr.a());
                    if ((eyqzVar.b & 2) != 0) {
                        eovb eovbVar2 = eyqzVar.c;
                        eovbVar = eovbVar2 == null ? eovb.a : eovbVar2;
                    } else {
                        cdpw.a.m("BusinessData doesn't exist");
                    }
                } catch (evtj e) {
                    cdpw.a.s("InvalidProtocolBufferException in getBusinessData.", e);
                }
            }
        }
        eyik eyikVar2 = this.U;
        dyun dyunVarK = dyuo.k();
        ((dyug) dyunVarK).b = ejud.a;
        dyuo dyuoVarE = dyunVarK.e();
        acas acasVar = new acas();
        acasVar.a = dyuoVarE;
        Object objB = eyikVar.b();
        objB.getClass();
        Object objB2 = eyikVar2.b();
        objB2.getClass();
        acasVar.d(new cdqo((aijh) objB, (ehrb) objB2, eovbVar, new ejvr() { // from class: cdqs
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                activity.finish();
                return fctx.a;
            }
        }));
        return acasVar.a();
    }

    final acha y() {
        return new acha(this.b.de);
    }

    final acvw z() {
        Context context = (Context) this.d.b();
        ahkn ahknVar = this.b;
        eyik eyikVar = ahknVar.hD;
        ahng ahngVar = ahknVar.b;
        eyik eyikVar2 = this.ag;
        eyik eyikVar3 = this.ai;
        eyik eyikVar4 = ahngVar.js;
        ahnh ahnhVar = ahknVar.a;
        return new acvw(context, eyikVar, eyikVar2, eyikVar3, eyikVar4, ahnhVar.pl, ahnhVar.aaH, ahnhVar.pD, ahnhVar.vV);
    }
}
