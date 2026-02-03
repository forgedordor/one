package defpackage;

import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkr implements dkfe {
    public final String a;
    public final List b;
    public final List c;
    public final fdae d;
    public final dkny e;
    public final dkly f;
    public final dkol g;
    public final boolean h;
    public final fdae i;
    public final fdae j;
    public final fdat k;
    public final fdap l;
    public final String m;
    public final fdae n;
    public final boolean o;
    public final boolean p;
    public final evxl q;
    public final fdae r;
    public final boolean s;
    public final dkkq t;
    public final fdae u;
    public final dkkp v;
    public final dkpc w;
    public final List x;
    public final dkgu y;
    private final dknh z;

    public dkkr(String str, List list, List list2, fdae fdaeVar, dkny dknyVar, dknh dknhVar, dkly dklyVar, dkol dkolVar, boolean z, fdae fdaeVar2, fdae fdaeVar3, fdat fdatVar, fdap fdapVar, String str2, fdae fdaeVar4, boolean z2, boolean z3, evxl evxlVar, fdae fdaeVar5, boolean z4, dkkq dkkqVar, dkkp dkkpVar, dkpc dkpcVar, List list3, dkgu dkguVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        fdaeVar.getClass();
        fdaeVar2.getClass();
        fdaeVar3.getClass();
        fdatVar.getClass();
        dkkqVar.getClass();
        dkkpVar.getClass();
        list3.getClass();
        dkguVar.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = fdaeVar;
        this.e = dknyVar;
        this.z = dknhVar;
        this.f = dklyVar;
        this.g = dkolVar;
        this.h = z;
        this.i = fdaeVar2;
        this.j = fdaeVar3;
        this.k = fdatVar;
        this.l = fdapVar;
        this.m = str2;
        this.n = fdaeVar4;
        this.o = z2;
        this.p = z3;
        this.q = evxlVar;
        this.r = fdaeVar5;
        this.s = z4;
        this.t = dkkqVar;
        this.u = null;
        this.v = dkkpVar;
        this.w = dkpcVar;
        this.x = list3;
        this.y = dkguVar;
    }

    @Override // defpackage.dkfe
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkkr)) {
            return false;
        }
        dkkr dkkrVar = (dkkr) obj;
        if (!fdbq.f(this.a, dkkrVar.a) || !fdbq.f(this.b, dkkrVar.b) || !fdbq.f(this.c, dkkrVar.c) || !fdbq.f(this.d, dkkrVar.d) || !fdbq.f(this.e, dkkrVar.e) || !fdbq.f(this.z, dkkrVar.z) || !fdbq.f(this.f, dkkrVar.f) || !fdbq.f(this.g, dkkrVar.g) || this.h != dkkrVar.h || !fdbq.f(this.i, dkkrVar.i) || !fdbq.f(this.j, dkkrVar.j) || !fdbq.f(this.k, dkkrVar.k) || !fdbq.f(this.l, dkkrVar.l) || !fdbq.f(this.m, dkkrVar.m) || !fdbq.f(this.n, dkkrVar.n) || this.o != dkkrVar.o || this.p != dkkrVar.p || !fdbq.f(this.q, dkkrVar.q) || !fdbq.f(this.r, dkkrVar.r) || this.s != dkkrVar.s || this.t != dkkrVar.t) {
            return false;
        }
        fdae fdaeVar = dkkrVar.u;
        return fdbq.f(null, null) && fdbq.f(this.v, dkkrVar.v) && fdbq.f(this.w, dkkrVar.w) && fdbq.f(this.x, dkkrVar.x) && fdbq.f(this.y, dkkrVar.y);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dkny dknyVar = this.e;
        int iHashCode2 = ((iHashCode * 31) + (dknyVar == null ? 0 : dknyVar.hashCode())) * 31;
        dknh dknhVar = this.z;
        int iHashCode3 = (iHashCode2 + (dknhVar == null ? 0 : dknhVar.hashCode())) * 31;
        dkly dklyVar = this.f;
        int iHashCode4 = (iHashCode3 + (dklyVar == null ? 0 : dklyVar.hashCode())) * 31;
        dkol dkolVar = this.g;
        int iHashCode5 = (((((((((iHashCode4 + (dkolVar == null ? 0 : dkolVar.hashCode())) * 31) + dkki.a(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        fdap fdapVar = this.l;
        int iHashCode6 = (iHashCode5 + (fdapVar == null ? 0 : fdapVar.hashCode())) * 31;
        String str = this.m;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        fdae fdaeVar = this.n;
        int iHashCode8 = (((((iHashCode7 + (fdaeVar == null ? 0 : fdaeVar.hashCode())) * 31) + dkki.a(this.o)) * 31) + dkki.a(this.p)) * 31;
        evxl evxlVar = this.q;
        int iHashCode9 = (iHashCode8 + (evxlVar == null ? 0 : evxlVar.hashCode())) * 31;
        fdae fdaeVar2 = this.r;
        int iHashCode10 = (((((((iHashCode9 + (fdaeVar2 == null ? 0 : fdaeVar2.hashCode())) * 31) + dkki.a(this.s)) * 31) + this.t.hashCode()) * 961) + this.v.hashCode()) * 31;
        dkpc dkpcVar = this.w;
        return ((((iHashCode10 + (dkpcVar != null ? dkpcVar.hashCode() : 0)) * 31) + this.x.hashCode()) * 31) + this.y.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageBubbleUiData(id=");
        sb.append(this.a);
        sb.append(", extraIcons=");
        sb.append(this.b);
        sb.append(", extraText=");
        sb.append(this.c);
        sb.append(", getTimestamp=");
        sb.append(this.d);
        sb.append(", reactionsBar=");
        sb.append(this.e);
        sb.append(", progressBar=");
        sb.append(this.z);
        sb.append(", bottomMetatext=");
        sb.append(this.f);
        sb.append(", separators=");
        sb.append(this.g);
        sb.append(", isError=");
        sb.append(this.h);
        sb.append(", contentOnClick=");
        sb.append(this.i);
        sb.append(", onClick=");
        sb.append(this.j);
        sb.append(", onLongClick=");
        sb.append(this.k);
        sb.append(", onDoubleTap=");
        sb.append(this.l);
        sb.append(", doubleTapLabel=");
        sb.append(this.m);
        sb.append(", onSwiped=");
        sb.append(this.n);
        sb.append(", allowFocusOnContentDecoratorsForAccessibility=");
        sb.append(this.o);
        sb.append(", useGroupHorizontalPadding=");
        sb.append(this.p);
        sb.append(", effect=");
        sb.append(this.q);
        sb.append(", onEffectFinished=");
        sb.append(this.r);
        sb.append(", shouldShowTimestampHint=");
        sb.append(this.s);
        sb.append(", selectionStatus=");
        sb.append(this.t);
        sb.append(", toggleSelected=null, flags=");
        sb.append(this.v);
        sb.append(", statusUiData=");
        sb.append(this.w);
        dkgu dkguVar = this.y;
        List list = this.x;
        sb.append(", customAccessibilityActions=");
        sb.append(list);
        sb.append(", contextUiData=");
        sb.append(dkguVar);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dkkr(String str, List list, dkkp dkkpVar, dkgu dkguVar, int i) {
        this(str, (i & 2) != 0 ? fcvo.a : list, (i & 4) != 0 ? fcvo.a : null, (i & 8) != 0 ? new fdae() { // from class: dkkj
            @Override // defpackage.fdae
            public final Object invoke() {
                return "";
            }
        } : null, null, null, null, null, false, (i & 512) != 0 ? new fdae() { // from class: dkkk
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : null, (i & 1024) != 0 ? new fdae() { // from class: dkkl
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        } : null, (i & 2048) != 0 ? new fdat() { // from class: dkkm
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return false;
            }
        } : null, null, null, null, (32768 & i) != 0, false, null, null, !((524288 & i) == 0), (1048576 & i) != 0 ? dkkq.c : null, (4194304 & i) != 0 ? new dkkp(false, false, false, 31) : dkkpVar, null, (16777216 & i) != 0 ? fcvo.a : null, (i & VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING) != 0 ? new dkgu(null, null, null, 2047) : dkguVar);
    }
}
