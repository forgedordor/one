package defpackage;

import android.net.Uri;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eaoy extends eatj {
    public final String A;
    public final String B;
    public final List C;
    public final List D;
    public final List E;
    public final eatm F;
    public final Integer G;
    public final eatn H;
    public final String I;
    public final String J;
    public final String K;
    public final Double L;
    public final eatb M;
    public final List N;
    public final List O;
    public final eatb P;
    public final eatb Q;
    public final eatb R;
    public final eatb S;
    public final eatb T;
    public final eatb U;
    public final eatb V;
    public final eatb W;
    public final List X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final Integer aa;
    public final LatLngBounds ab;
    public final Uri ac;
    public final Uri ad;
    public final eatb ae;
    public final eapm af;
    public final east ag;
    public final easv ah;
    public final earz ai;
    public final eatb aj;
    public final eatb ak;
    public final eatb al;
    public final eatb am;
    public final eatb an;
    public final eatb ao;
    public final eatb ap;
    public final eatb aq;
    public final eatb ar;
    public final eatb as;
    public final eatb at;
    public final List au;
    public final easd av;
    public final eatb aw;
    public final String b;
    public final String c;
    public final String d;
    public final eapp e;
    public final List f;
    public final eate g;
    public final eatb h;
    public final easp i;
    public final eatb j;
    public final eatb k;
    public final String l;
    public final String m;
    public final Integer n;
    public final String o;
    public final String p;
    public final String q;
    public final LatLng r;
    public final LatLng s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final easp y;
    public final String z;

    public eaoy(String str, String str2, String str3, String str4, eapp eappVar, List list, eate eateVar, eatb eatbVar, easp easpVar, eatb eatbVar2, eatb eatbVar3, String str5, String str6, Integer num, String str7, String str8, String str9, LatLng latLng, LatLng latLng2, String str10, String str11, String str12, String str13, String str14, easp easpVar2, String str15, String str16, String str17, List list2, List list3, List list4, eatm eatmVar, Integer num2, eatn eatnVar, String str18, String str19, String str20, Double d, eatb eatbVar4, List list5, List list6, eatb eatbVar5, eatb eatbVar6, eatb eatbVar7, eatb eatbVar8, eatb eatbVar9, eatb eatbVar10, eatb eatbVar11, eatb eatbVar12, List list7, Integer num3, Integer num4, Integer num5, LatLngBounds latLngBounds, Uri uri, Uri uri2, eatb eatbVar13, eapm eapmVar, east eastVar, easv easvVar, earz earzVar, eatb eatbVar14, eatb eatbVar15, eatb eatbVar16, eatb eatbVar17, eatb eatbVar18, eatb eatbVar19, eatb eatbVar20, eatb eatbVar21, eatb eatbVar22, eatb eatbVar23, eatb eatbVar24, List list8, easd easdVar, eatb eatbVar25) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = eappVar;
        this.f = list;
        this.g = eateVar;
        if (eatbVar == null) {
            throw new NullPointerException("Null curbsidePickup");
        }
        this.h = eatbVar;
        this.i = easpVar;
        if (eatbVar2 == null) {
            throw new NullPointerException("Null delivery");
        }
        this.j = eatbVar2;
        if (eatbVar3 == null) {
            throw new NullPointerException("Null dineIn");
        }
        this.k = eatbVar3;
        this.l = str5;
        this.m = str6;
        this.n = num;
        this.o = str7;
        this.p = str8;
        this.q = str9;
        this.r = latLng;
        this.s = latLng2;
        this.t = str10;
        this.u = str11;
        this.v = str12;
        this.w = str13;
        this.x = str14;
        this.y = easpVar2;
        this.z = str15;
        this.A = str16;
        this.B = str17;
        this.C = list2;
        this.D = list3;
        this.E = list4;
        this.F = eatmVar;
        this.G = num2;
        this.H = eatnVar;
        this.I = str18;
        this.J = str19;
        this.K = str20;
        this.L = d;
        if (eatbVar4 == null) {
            throw new NullPointerException("Null reservable");
        }
        this.M = eatbVar4;
        this.N = list5;
        this.O = list6;
        if (eatbVar5 == null) {
            throw new NullPointerException("Null servesBeer");
        }
        this.P = eatbVar5;
        if (eatbVar6 == null) {
            throw new NullPointerException("Null servesBreakfast");
        }
        this.Q = eatbVar6;
        if (eatbVar7 == null) {
            throw new NullPointerException("Null servesBrunch");
        }
        this.R = eatbVar7;
        if (eatbVar8 == null) {
            throw new NullPointerException("Null servesDinner");
        }
        this.S = eatbVar8;
        if (eatbVar9 == null) {
            throw new NullPointerException("Null servesLunch");
        }
        this.T = eatbVar9;
        if (eatbVar10 == null) {
            throw new NullPointerException("Null servesVegetarianFood");
        }
        this.U = eatbVar10;
        if (eatbVar11 == null) {
            throw new NullPointerException("Null servesWine");
        }
        this.V = eatbVar11;
        if (eatbVar12 == null) {
            throw new NullPointerException("Null takeout");
        }
        this.W = eatbVar12;
        this.X = list7;
        this.Y = num3;
        this.Z = num4;
        this.aa = num5;
        this.ab = latLngBounds;
        this.ac = uri;
        this.ad = uri2;
        if (eatbVar13 == null) {
            throw new NullPointerException("Null wheelchairAccessibleEntrance");
        }
        this.ae = eatbVar13;
        this.af = eapmVar;
        this.ag = eastVar;
        this.ah = easvVar;
        this.ai = earzVar;
        if (eatbVar14 == null) {
            throw new NullPointerException("Null outdoorSeating");
        }
        this.aj = eatbVar14;
        if (eatbVar15 == null) {
            throw new NullPointerException("Null liveMusic");
        }
        this.ak = eatbVar15;
        if (eatbVar16 == null) {
            throw new NullPointerException("Null menuForChildren");
        }
        this.al = eatbVar16;
        if (eatbVar17 == null) {
            throw new NullPointerException("Null servesCocktails");
        }
        this.am = eatbVar17;
        if (eatbVar18 == null) {
            throw new NullPointerException("Null servesDessert");
        }
        this.an = eatbVar18;
        if (eatbVar19 == null) {
            throw new NullPointerException("Null servesCoffee");
        }
        this.ao = eatbVar19;
        if (eatbVar20 == null) {
            throw new NullPointerException("Null goodForChildren");
        }
        this.ap = eatbVar20;
        if (eatbVar21 == null) {
            throw new NullPointerException("Null allowsDogs");
        }
        this.aq = eatbVar21;
        if (eatbVar22 == null) {
            throw new NullPointerException("Null restroom");
        }
        this.ar = eatbVar22;
        if (eatbVar23 == null) {
            throw new NullPointerException("Null goodForGroups");
        }
        this.as = eatbVar23;
        if (eatbVar24 == null) {
            throw new NullPointerException("Null goodForWatchingSports");
        }
        this.at = eatbVar24;
        this.au = list8;
        this.av = easdVar;
        if (eatbVar25 == null) {
            throw new NullPointerException("Null pureServiceAreaBusiness");
        }
        this.aw = eatbVar25;
    }

    @Override // defpackage.eatj
    public final eatb A() {
        return this.P;
    }

    @Override // defpackage.eatj
    public final eatb B() {
        return this.Q;
    }

    @Override // defpackage.eatj
    public final eatb C() {
        return this.R;
    }

    @Override // defpackage.eatj
    public final eatb D() {
        return this.am;
    }

    @Override // defpackage.eatj
    public final eatb E() {
        return this.ao;
    }

    @Override // defpackage.eatj
    public final eatb F() {
        return this.an;
    }

    @Override // defpackage.eatj
    public final eatb G() {
        return this.S;
    }

    @Override // defpackage.eatj
    public final eatb H() {
        return this.T;
    }

    @Override // defpackage.eatj
    public final eatb I() {
        return this.U;
    }

    @Override // defpackage.eatj
    public final eatb J() {
        return this.V;
    }

    @Override // defpackage.eatj
    public final eatb K() {
        return this.W;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final eatb L() {
        return this.ae;
    }

    @Override // defpackage.eatj
    public final eate M() {
        return this.g;
    }

    @Override // defpackage.eatj
    public final eatm N() {
        return this.F;
    }

    @Override // defpackage.eatj
    public final eatn O() {
        return this.H;
    }

    @Override // defpackage.eatj
    public final Double P() {
        return this.L;
    }

    @Override // defpackage.eatj
    public final Integer Q() {
        return this.n;
    }

    @Override // defpackage.eatj
    public final Integer R() {
        return this.G;
    }

    @Override // defpackage.eatj
    public final Integer S() {
        return this.Z;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final Integer T() {
        return this.Y;
    }

    @Override // defpackage.eatj
    public final Integer U() {
        return this.aa;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final String V() {
        return this.a;
    }

    @Override // defpackage.eatj
    public final String W() {
        return this.d;
    }

    @Override // defpackage.eatj
    public final String X() {
        return this.u;
    }

    @Override // defpackage.eatj
    public final String Y() {
        return this.w;
    }

    @Override // defpackage.eatj
    public final String Z() {
        return this.l;
    }

    @Override // defpackage.eatj
    public final Uri a() {
        return this.ad;
    }

    @Override // defpackage.eatj
    public final String aa() {
        return this.m;
    }

    @Override // defpackage.eatj
    public final String ab() {
        return this.b;
    }

    @Override // defpackage.eatj
    public final String ac() {
        return this.p;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final String ad() {
        return this.o;
    }

    @Override // defpackage.eatj
    public final String ae() {
        return this.q;
    }

    @Override // defpackage.eatj
    public final String af() {
        return this.A;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final String ag() {
        return this.t;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final String ah() {
        return this.v;
    }

    @Override // defpackage.eatj
    public final String ai() {
        return this.B;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final String aj() {
        return this.z;
    }

    @Override // defpackage.eatj
    public final String ak() {
        return this.I;
    }

    @Override // defpackage.eatj
    public final String al() {
        return this.J;
    }

    @Override // defpackage.eatj
    public final String am() {
        return this.K;
    }

    @Override // defpackage.eatj
    public final String an() {
        return this.x;
    }

    @Override // defpackage.eatj
    public final String ao() {
        return this.c;
    }

    @Override // defpackage.eatj
    public final List ap() {
        return this.f;
    }

    @Override // defpackage.eatj
    public final List aq() {
        return this.O;
    }

    @Override // defpackage.eatj
    public final List ar() {
        return this.C;
    }

    @Override // defpackage.eatj
    public final List as() {
        return this.E;
    }

    @Override // defpackage.eatj
    public final List at() {
        return this.D;
    }

    @Override // defpackage.eatj
    public final List au() {
        return this.N;
    }

    @Override // defpackage.eatj
    public final List av() {
        return this.au;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final List aw() {
        return this.X;
    }

    @Override // defpackage.eatj
    public final Uri b() {
        return this.ac;
    }

    @Override // defpackage.eatj
    @Deprecated
    public final LatLng c() {
        return this.r;
    }

    @Override // defpackage.eatj
    public final LatLng d() {
        return this.s;
    }

    @Override // defpackage.eatj
    public final LatLngBounds e() {
        return this.ab;
    }

    public final boolean equals(Object obj) {
        easp easpVar;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        LatLng latLng;
        LatLng latLng2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        easp easpVar2;
        String str11;
        String str12;
        String str13;
        List list;
        List list2;
        List list3;
        eatm eatmVar;
        Integer num2;
        eatn eatnVar;
        String str14;
        String str15;
        String str16;
        Double d;
        List list4;
        List list5;
        List list6;
        Integer num3;
        Integer num4;
        Integer num5;
        LatLngBounds latLngBounds;
        Uri uri;
        Uri uri2;
        eapm eapmVar;
        east eastVar;
        easv easvVar;
        earz earzVar;
        List list7;
        easd easdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatj) {
            eatj eatjVar = (eatj) obj;
            String str17 = this.a;
            if (str17 != null ? str17.equals(eatjVar.V()) : eatjVar.V() == null) {
                String str18 = this.b;
                if (str18 != null ? str18.equals(eatjVar.ab()) : eatjVar.ab() == null) {
                    String str19 = this.c;
                    if (str19 != null ? str19.equals(eatjVar.ao()) : eatjVar.ao() == null) {
                        String str20 = this.d;
                        if (str20 != null ? str20.equals(eatjVar.W()) : eatjVar.W() == null) {
                            eapp eappVar = this.e;
                            if (eappVar != null ? eappVar.equals(eatjVar.g()) : eatjVar.g() == null) {
                                List list8 = this.f;
                                if (list8 != null ? list8.equals(eatjVar.ap()) : eatjVar.ap() == null) {
                                    eate eateVar = this.g;
                                    if (eateVar != null ? eateVar.equals(eatjVar.M()) : eatjVar.M() == null) {
                                        if (this.h.equals(eatjVar.o()) && ((easpVar = this.i) != null ? easpVar.equals(eatjVar.j()) : eatjVar.j() == null) && this.j.equals(eatjVar.p()) && this.k.equals(eatjVar.q()) && ((str = this.l) != null ? str.equals(eatjVar.Z()) : eatjVar.Z() == null) && ((str2 = this.m) != null ? str2.equals(eatjVar.aa()) : eatjVar.aa() == null) && ((num = this.n) != null ? num.equals(eatjVar.Q()) : eatjVar.Q() == null) && ((str3 = this.o) != null ? str3.equals(eatjVar.ad()) : eatjVar.ad() == null) && ((str4 = this.p) != null ? str4.equals(eatjVar.ac()) : eatjVar.ac() == null) && ((str5 = this.q) != null ? str5.equals(eatjVar.ae()) : eatjVar.ae() == null) && ((latLng = this.r) != null ? latLng.equals(eatjVar.c()) : eatjVar.c() == null) && ((latLng2 = this.s) != null ? latLng2.equals(eatjVar.d()) : eatjVar.d() == null) && ((str6 = this.t) != null ? str6.equals(eatjVar.ag()) : eatjVar.ag() == null) && ((str7 = this.u) != null ? str7.equals(eatjVar.X()) : eatjVar.X() == null) && ((str8 = this.v) != null ? str8.equals(eatjVar.ah()) : eatjVar.ah() == null) && ((str9 = this.w) != null ? str9.equals(eatjVar.Y()) : eatjVar.Y() == null) && ((str10 = this.x) != null ? str10.equals(eatjVar.an()) : eatjVar.an() == null) && ((easpVar2 = this.y) != null ? easpVar2.equals(eatjVar.k()) : eatjVar.k() == null) && ((str11 = this.z) != null ? str11.equals(eatjVar.aj()) : eatjVar.aj() == null) && ((str12 = this.A) != null ? str12.equals(eatjVar.af()) : eatjVar.af() == null) && ((str13 = this.B) != null ? str13.equals(eatjVar.ai()) : eatjVar.ai() == null) && ((list = this.C) != null ? list.equals(eatjVar.ar()) : eatjVar.ar() == null) && ((list2 = this.D) != null ? list2.equals(eatjVar.at()) : eatjVar.at() == null) && ((list3 = this.E) != null ? list3.equals(eatjVar.as()) : eatjVar.as() == null) && ((eatmVar = this.F) != null ? eatmVar.equals(eatjVar.N()) : eatjVar.N() == null) && ((num2 = this.G) != null ? num2.equals(eatjVar.R()) : eatjVar.R() == null) && ((eatnVar = this.H) != null ? eatnVar.equals(eatjVar.O()) : eatjVar.O() == null) && ((str14 = this.I) != null ? str14.equals(eatjVar.ak()) : eatjVar.ak() == null) && ((str15 = this.J) != null ? str15.equals(eatjVar.al()) : eatjVar.al() == null) && ((str16 = this.K) != null ? str16.equals(eatjVar.am()) : eatjVar.am() == null) && ((d = this.L) != null ? d.equals(eatjVar.P()) : eatjVar.P() == null) && this.M.equals(eatjVar.y()) && ((list4 = this.N) != null ? list4.equals(eatjVar.au()) : eatjVar.au() == null) && ((list5 = this.O) != null ? list5.equals(eatjVar.aq()) : eatjVar.aq() == null) && this.P.equals(eatjVar.A()) && this.Q.equals(eatjVar.B()) && this.R.equals(eatjVar.C()) && this.S.equals(eatjVar.G()) && this.T.equals(eatjVar.H()) && this.U.equals(eatjVar.I()) && this.V.equals(eatjVar.J()) && this.W.equals(eatjVar.K()) && ((list6 = this.X) != null ? list6.equals(eatjVar.aw()) : eatjVar.aw() == null) && ((num3 = this.Y) != null ? num3.equals(eatjVar.T()) : eatjVar.T() == null) && ((num4 = this.Z) != null ? num4.equals(eatjVar.S()) : eatjVar.S() == null) && ((num5 = this.aa) != null ? num5.equals(eatjVar.U()) : eatjVar.U() == null) && ((latLngBounds = this.ab) != null ? latLngBounds.equals(eatjVar.e()) : eatjVar.e() == null) && ((uri = this.ac) != null ? uri.equals(eatjVar.b()) : eatjVar.b() == null) && ((uri2 = this.ad) != null ? uri2.equals(eatjVar.a()) : eatjVar.a() == null) && this.ae.equals(eatjVar.L()) && ((eapmVar = this.af) != null ? eapmVar.equals(eatjVar.f()) : eatjVar.f() == null) && ((eastVar = this.ag) != null ? eastVar.equals(eatjVar.l()) : eatjVar.l() == null) && ((easvVar = this.ah) != null ? easvVar.equals(eatjVar.m()) : eatjVar.m() == null) && ((earzVar = this.ai) != null ? earzVar.equals(eatjVar.h()) : eatjVar.h() == null) && this.aj.equals(eatjVar.w()) && this.ak.equals(eatjVar.u()) && this.al.equals(eatjVar.v()) && this.am.equals(eatjVar.D()) && this.an.equals(eatjVar.F()) && this.ao.equals(eatjVar.E()) && this.ap.equals(eatjVar.r()) && this.aq.equals(eatjVar.n()) && this.ar.equals(eatjVar.z()) && this.as.equals(eatjVar.s()) && this.at.equals(eatjVar.t()) && ((list7 = this.au) != null ? list7.equals(eatjVar.av()) : eatjVar.av() == null) && ((easdVar = this.av) != null ? easdVar.equals(eatjVar.i()) : eatjVar.i() == null) && this.aw.equals(eatjVar.x())) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.eatj
    public final eapm f() {
        return this.af;
    }

    @Override // defpackage.eatj
    public final eapp g() {
        return this.e;
    }

    @Override // defpackage.eatj
    public final earz h() {
        return this.ai;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        eapp eappVar = this.e;
        int iHashCode5 = (iHashCode4 ^ (eappVar == null ? 0 : eappVar.hashCode())) * 1000003;
        List list = this.f;
        int iHashCode6 = (iHashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        eate eateVar = this.g;
        int iHashCode7 = (((iHashCode6 ^ (eateVar == null ? 0 : eateVar.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        easp easpVar = this.i;
        int iHashCode8 = (((((iHashCode7 ^ (easpVar == null ? 0 : easpVar.hashCode())) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str5 = this.l;
        int iHashCode9 = (iHashCode8 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.m;
        int iHashCode10 = (iHashCode9 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        Integer num = this.n;
        int iHashCode11 = (iHashCode10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str7 = this.o;
        int iHashCode12 = (iHashCode11 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.p;
        int iHashCode13 = (iHashCode12 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.q;
        int iHashCode14 = (iHashCode13 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        LatLng latLng = this.r;
        int iHashCode15 = (iHashCode14 ^ (latLng == null ? 0 : latLng.hashCode())) * 1000003;
        LatLng latLng2 = this.s;
        int iHashCode16 = (iHashCode15 ^ (latLng2 == null ? 0 : latLng2.hashCode())) * 1000003;
        String str10 = this.t;
        int iHashCode17 = (iHashCode16 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.u;
        int iHashCode18 = (iHashCode17 ^ (str11 == null ? 0 : str11.hashCode())) * 1000003;
        String str12 = this.v;
        int iHashCode19 = (iHashCode18 ^ (str12 == null ? 0 : str12.hashCode())) * 1000003;
        String str13 = this.w;
        int iHashCode20 = (iHashCode19 ^ (str13 == null ? 0 : str13.hashCode())) * 1000003;
        String str14 = this.x;
        int iHashCode21 = (iHashCode20 ^ (str14 == null ? 0 : str14.hashCode())) * 1000003;
        easp easpVar2 = this.y;
        int iHashCode22 = (iHashCode21 ^ (easpVar2 == null ? 0 : easpVar2.hashCode())) * 1000003;
        String str15 = this.z;
        int iHashCode23 = (iHashCode22 ^ (str15 == null ? 0 : str15.hashCode())) * 1000003;
        String str16 = this.A;
        int iHashCode24 = (iHashCode23 ^ (str16 == null ? 0 : str16.hashCode())) * 1000003;
        String str17 = this.B;
        int iHashCode25 = (iHashCode24 ^ (str17 == null ? 0 : str17.hashCode())) * 1000003;
        List list2 = this.C;
        int iHashCode26 = (iHashCode25 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        List list3 = this.D;
        int iHashCode27 = (iHashCode26 ^ (list3 == null ? 0 : list3.hashCode())) * 1000003;
        List list4 = this.E;
        int iHashCode28 = (iHashCode27 ^ (list4 == null ? 0 : list4.hashCode())) * 1000003;
        eatm eatmVar = this.F;
        int iHashCode29 = (iHashCode28 ^ (eatmVar == null ? 0 : eatmVar.hashCode())) * 1000003;
        Integer num2 = this.G;
        int iHashCode30 = (iHashCode29 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        eatn eatnVar = this.H;
        int iHashCode31 = (iHashCode30 ^ (eatnVar == null ? 0 : eatnVar.hashCode())) * 1000003;
        String str18 = this.I;
        int iHashCode32 = (iHashCode31 ^ (str18 == null ? 0 : str18.hashCode())) * 1000003;
        String str19 = this.J;
        int iHashCode33 = (iHashCode32 ^ (str19 == null ? 0 : str19.hashCode())) * 1000003;
        String str20 = this.K;
        int iHashCode34 = (iHashCode33 ^ (str20 == null ? 0 : str20.hashCode())) * 1000003;
        Double d = this.L;
        int iHashCode35 = (((iHashCode34 ^ (d == null ? 0 : d.hashCode())) * 1000003) ^ this.M.hashCode()) * 1000003;
        List list5 = this.N;
        int iHashCode36 = (iHashCode35 ^ (list5 == null ? 0 : list5.hashCode())) * 1000003;
        List list6 = this.O;
        int iHashCode37 = (((((((((((((((((iHashCode36 ^ (list6 == null ? 0 : list6.hashCode())) * 1000003) ^ this.P.hashCode()) * 1000003) ^ this.Q.hashCode()) * 1000003) ^ this.R.hashCode()) * 1000003) ^ this.S.hashCode()) * 1000003) ^ this.T.hashCode()) * 1000003) ^ this.U.hashCode()) * 1000003) ^ this.V.hashCode()) * 1000003) ^ this.W.hashCode()) * 1000003;
        List list7 = this.X;
        int iHashCode38 = (iHashCode37 ^ (list7 == null ? 0 : list7.hashCode())) * 1000003;
        Integer num3 = this.Y;
        int iHashCode39 = (iHashCode38 ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Integer num4 = this.Z;
        int iHashCode40 = (iHashCode39 ^ (num4 == null ? 0 : num4.hashCode())) * 1000003;
        Integer num5 = this.aa;
        int iHashCode41 = (iHashCode40 ^ (num5 == null ? 0 : num5.hashCode())) * 1000003;
        LatLngBounds latLngBounds = this.ab;
        int iHashCode42 = (iHashCode41 ^ (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 1000003;
        Uri uri = this.ac;
        int iHashCode43 = (iHashCode42 ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        Uri uri2 = this.ad;
        int iHashCode44 = (((iHashCode43 ^ (uri2 == null ? 0 : uri2.hashCode())) * 1000003) ^ this.ae.hashCode()) * 1000003;
        eapm eapmVar = this.af;
        int iHashCode45 = (iHashCode44 ^ (eapmVar == null ? 0 : eapmVar.hashCode())) * 1000003;
        east eastVar = this.ag;
        int iHashCode46 = (iHashCode45 ^ (eastVar == null ? 0 : eastVar.hashCode())) * 1000003;
        easv easvVar = this.ah;
        int iHashCode47 = (iHashCode46 ^ (easvVar == null ? 0 : easvVar.hashCode())) * 1000003;
        earz earzVar = this.ai;
        int iHashCode48 = (((((((((((((((((((((((iHashCode47 ^ (earzVar == null ? 0 : earzVar.hashCode())) * 1000003) ^ this.aj.hashCode()) * 1000003) ^ this.ak.hashCode()) * 1000003) ^ this.al.hashCode()) * 1000003) ^ this.am.hashCode()) * 1000003) ^ this.an.hashCode()) * 1000003) ^ this.ao.hashCode()) * 1000003) ^ this.ap.hashCode()) * 1000003) ^ this.aq.hashCode()) * 1000003) ^ this.ar.hashCode()) * 1000003) ^ this.as.hashCode()) * 1000003) ^ this.at.hashCode()) * 1000003;
        List list8 = this.au;
        int iHashCode49 = (iHashCode48 ^ (list8 == null ? 0 : list8.hashCode())) * 1000003;
        easd easdVar = this.av;
        return ((iHashCode49 ^ (easdVar != null ? easdVar.hashCode() : 0)) * 1000003) ^ this.aw.hashCode();
    }

    @Override // defpackage.eatj
    public final easd i() {
        return this.av;
    }

    @Override // defpackage.eatj
    public final easp j() {
        return this.i;
    }

    @Override // defpackage.eatj
    public final easp k() {
        return this.y;
    }

    @Override // defpackage.eatj
    public final east l() {
        return this.ag;
    }

    @Override // defpackage.eatj
    public final easv m() {
        return this.ah;
    }

    @Override // defpackage.eatj
    public final eatb n() {
        return this.aq;
    }

    @Override // defpackage.eatj
    public final eatb o() {
        return this.h;
    }

    @Override // defpackage.eatj
    public final eatb p() {
        return this.j;
    }

    @Override // defpackage.eatj
    public final eatb q() {
        return this.k;
    }

    @Override // defpackage.eatj
    public final eatb r() {
        return this.ap;
    }

    @Override // defpackage.eatj
    public final eatb s() {
        return this.as;
    }

    @Override // defpackage.eatj
    public final eatb t() {
        return this.at;
    }

    public final String toString() {
        eatb eatbVar = this.ak;
        eatb eatbVar2 = this.aj;
        earz earzVar = this.ai;
        easv easvVar = this.ah;
        east eastVar = this.ag;
        eapm eapmVar = this.af;
        eatb eatbVar3 = this.ae;
        Uri uri = this.ad;
        Uri uri2 = this.ac;
        LatLngBounds latLngBounds = this.ab;
        List list = this.X;
        eatb eatbVar4 = this.W;
        eatb eatbVar5 = this.V;
        eatb eatbVar6 = this.U;
        eatb eatbVar7 = this.T;
        eatb eatbVar8 = this.S;
        eatb eatbVar9 = this.R;
        eatb eatbVar10 = this.Q;
        eatb eatbVar11 = this.P;
        List list2 = this.O;
        List list3 = this.N;
        eatb eatbVar12 = this.M;
        eatn eatnVar = this.H;
        eatm eatmVar = this.F;
        List list4 = this.E;
        List list5 = this.D;
        List list6 = this.C;
        easp easpVar = this.y;
        LatLng latLng = this.s;
        LatLng latLng2 = this.r;
        eatb eatbVar13 = this.k;
        eatb eatbVar14 = this.j;
        easp easpVar2 = this.i;
        eatb eatbVar15 = this.h;
        eate eateVar = this.g;
        List list7 = this.f;
        String strValueOf = String.valueOf(this.e);
        String strValueOf2 = String.valueOf(list7);
        String strValueOf3 = String.valueOf(eateVar);
        String string = eatbVar15.toString();
        String strValueOf4 = String.valueOf(easpVar2);
        String string2 = eatbVar14.toString();
        String string3 = eatbVar13.toString();
        String strValueOf5 = String.valueOf(latLng2);
        String strValueOf6 = String.valueOf(latLng);
        String strValueOf7 = String.valueOf(easpVar);
        String strValueOf8 = String.valueOf(list6);
        String strValueOf9 = String.valueOf(list5);
        String strValueOf10 = String.valueOf(list4);
        String strValueOf11 = String.valueOf(eatmVar);
        String strValueOf12 = String.valueOf(eatnVar);
        String string4 = eatbVar12.toString();
        String strValueOf13 = String.valueOf(list3);
        String strValueOf14 = String.valueOf(list2);
        String string5 = eatbVar11.toString();
        String string6 = eatbVar10.toString();
        String string7 = eatbVar9.toString();
        String string8 = eatbVar8.toString();
        String string9 = eatbVar7.toString();
        String string10 = eatbVar6.toString();
        String string11 = eatbVar5.toString();
        String string12 = eatbVar4.toString();
        String strValueOf15 = String.valueOf(list);
        String strValueOf16 = String.valueOf(latLngBounds);
        String strValueOf17 = String.valueOf(uri2);
        String strValueOf18 = String.valueOf(uri);
        String string13 = eatbVar3.toString();
        String strValueOf19 = String.valueOf(eapmVar);
        String strValueOf20 = String.valueOf(eastVar);
        String strValueOf21 = String.valueOf(easvVar);
        String strValueOf22 = String.valueOf(earzVar);
        String string14 = eatbVar2.toString();
        String string15 = eatbVar.toString();
        eatb eatbVar16 = this.al;
        String str = this.x;
        String str2 = this.w;
        String str3 = this.v;
        String str4 = this.u;
        String str5 = this.t;
        String str6 = this.q;
        String str7 = this.p;
        String str8 = this.o;
        Integer num = this.n;
        String str9 = this.m;
        String str10 = this.l;
        String str11 = this.d;
        String str12 = this.c;
        String str13 = this.b;
        String str14 = this.a;
        eatb eatbVar17 = this.am;
        eatb eatbVar18 = this.an;
        eatb eatbVar19 = this.ao;
        eatb eatbVar20 = this.ap;
        eatb eatbVar21 = this.aq;
        eatb eatbVar22 = this.ar;
        eatb eatbVar23 = this.as;
        eatb eatbVar24 = this.at;
        List list8 = this.au;
        easd easdVar = this.av;
        eatb eatbVar25 = this.aw;
        String string16 = eatbVar16.toString();
        String string17 = eatbVar17.toString();
        String string18 = eatbVar18.toString();
        String string19 = eatbVar19.toString();
        String string20 = eatbVar20.toString();
        String string21 = eatbVar21.toString();
        String string22 = eatbVar22.toString();
        String string23 = eatbVar23.toString();
        String string24 = eatbVar24.toString();
        String strValueOf23 = String.valueOf(list8);
        String strValueOf24 = String.valueOf(easdVar);
        String string25 = eatbVar25.toString();
        StringBuilder sb = new StringBuilder("Place{address=");
        sb.append(str14);
        sb.append(", formattedAddress=");
        sb.append(str13);
        sb.append(", shortFormattedAddress=");
        sb.append(str12);
        sb.append(", adrFormatAddress=");
        sb.append(str11);
        sb.append(", addressComponents=");
        sb.append(strValueOf);
        sb.append(", attributions=");
        sb.append(strValueOf2);
        sb.append(", businessStatus=");
        sb.append(strValueOf3);
        sb.append(", curbsidePickup=");
        sb.append(string);
        sb.append(", currentOpeningHours=");
        sb.append(strValueOf4);
        sb.append(", delivery=");
        sb.append(string2);
        sb.append(", dineIn=");
        sb.append(string3);
        sb.append(", editorialSummary=");
        sb.append(str10);
        sb.append(", editorialSummaryLanguageCode=");
        sb.append(str9);
        sb.append(", iconBackgroundColor=");
        sb.append(num);
        sb.append(", iconUrl=");
        sb.append(str8);
        sb.append(", iconMaskUrl=");
        sb.append(str7);
        sb.append(", id=");
        sb.append(str6);
        sb.append(", latLng=");
        sb.append(strValueOf5);
        sb.append(", location=");
        sb.append(strValueOf6);
        sb.append(", name=");
        sb.append(str5);
        sb.append(", displayName=");
        sb.append(str4);
        sb.append(", nameLanguageCode=");
        sb.append(str3);
        sb.append(", displayNameLanguageCode=");
        sb.append(str2);
        sb.append(", resourceName=");
        sb.append(str);
        sb.append(", openingHours=");
        sb.append(strValueOf7);
        sb.append(", phoneNumber=");
        Integer num2 = this.aa;
        Integer num3 = this.Z;
        Integer num4 = this.Y;
        Double d = this.L;
        String str15 = this.K;
        String str16 = this.J;
        String str17 = this.I;
        Integer num5 = this.G;
        String str18 = this.B;
        String str19 = this.A;
        sb.append(this.z);
        sb.append(", internationalPhoneNumber=");
        sb.append(str19);
        sb.append(", nationalPhoneNumber=");
        sb.append(str18);
        sb.append(", photoMetadatas=");
        sb.append(strValueOf8);
        sb.append(", reviews=");
        sb.append(strValueOf9);
        sb.append(", placeTypes=");
        sb.append(strValueOf10);
        sb.append(", plusCode=");
        sb.append(strValueOf11);
        sb.append(", priceLevel=");
        sb.append(num5);
        sb.append(", priceRange=");
        sb.append(strValueOf12);
        sb.append(", primaryType=");
        sb.append(str17);
        sb.append(", primaryTypeDisplayName=");
        sb.append(str16);
        sb.append(", primaryTypeDisplayNameLanguageCode=");
        sb.append(str15);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", reservable=");
        sb.append(string4);
        sb.append(", secondaryOpeningHours=");
        sb.append(strValueOf13);
        sb.append(", currentSecondaryOpeningHours=");
        sb.append(strValueOf14);
        sb.append(", servesBeer=");
        sb.append(string5);
        sb.append(", servesBreakfast=");
        sb.append(string6);
        sb.append(", servesBrunch=");
        sb.append(string7);
        sb.append(", servesDinner=");
        sb.append(string8);
        sb.append(", servesLunch=");
        sb.append(string9);
        sb.append(", servesVegetarianFood=");
        sb.append(string10);
        sb.append(", servesWine=");
        sb.append(string11);
        sb.append(", takeout=");
        sb.append(string12);
        sb.append(", types=");
        sb.append(strValueOf15);
        sb.append(", userRatingsTotal=");
        sb.append(num4);
        sb.append(", userRatingCount=");
        sb.append(num3);
        sb.append(", utcOffsetMinutes=");
        sb.append(num2);
        sb.append(", viewport=");
        sb.append(strValueOf16);
        sb.append(", websiteUri=");
        sb.append(strValueOf17);
        sb.append(", googleMapsUri=");
        sb.append(strValueOf18);
        sb.append(", wheelchairAccessibleEntrance=");
        sb.append(string13);
        sb.append(", accessibilityOptions=");
        sb.append(strValueOf19);
        sb.append(", parkingOptions=");
        sb.append(strValueOf20);
        sb.append(", paymentOptions=");
        sb.append(strValueOf21);
        sb.append(", evChargeOptions=");
        sb.append(strValueOf22);
        sb.append(", outdoorSeating=");
        sb.append(string14);
        sb.append(", liveMusic=");
        sb.append(string15);
        sb.append(", menuForChildren=");
        sb.append(string16);
        sb.append(", servesCocktails=");
        sb.append(string17);
        sb.append(", servesDessert=");
        sb.append(string18);
        sb.append(", servesCoffee=");
        sb.append(string19);
        sb.append(", goodForChildren=");
        sb.append(string20);
        sb.append(", allowsDogs=");
        sb.append(string21);
        sb.append(", restroom=");
        sb.append(string22);
        sb.append(", goodForGroups=");
        sb.append(string23);
        sb.append(", goodForWatchingSports=");
        sb.append(string24);
        sb.append(", subDestinations=");
        sb.append(strValueOf23);
        sb.append(", fuelOptions=");
        sb.append(strValueOf24);
        sb.append(", pureServiceAreaBusiness=");
        sb.append(string25);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.eatj
    public final eatb u() {
        return this.ak;
    }

    @Override // defpackage.eatj
    public final eatb v() {
        return this.al;
    }

    @Override // defpackage.eatj
    public final eatb w() {
        return this.aj;
    }

    @Override // defpackage.eatj
    public final eatb x() {
        return this.aw;
    }

    @Override // defpackage.eatj
    public final eatb y() {
        return this.M;
    }

    @Override // defpackage.eatj
    public final eatb z() {
        return this.ar;
    }
}
