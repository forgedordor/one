package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyt implements doav {
    public final String a;
    public final doas b;
    private final String c;
    private final String d;
    private final Iterable e;
    private final doyq f;

    public doyt(etyp etypVar) {
        doau doauVar;
        etypVar.getClass();
        String str = etypVar.c;
        str.getClass();
        String str2 = etypVar.h;
        str2.getClass();
        doau doauVarB = doyp.b(etypVar);
        doauVarB.getClass();
        String str3 = doauVarB.b;
        doau[] doauVarArr = new doau[2];
        doauVarArr[0] = doyp.b(etypVar);
        etyb etybVar = etypVar.f;
        etybVar = etybVar == null ? etyb.a : etybVar;
        if (etybVar != null) {
            doin doinVar = doin.b;
            dohm dohmVarA = doyp.a(etybVar);
            String str4 = etybVar.c;
            str4.getClass();
            etxy etxyVar = etybVar.f;
            int i = (etxyVar == null ? etxy.a : etxyVar).b;
            etxy etxyVar2 = etybVar.f;
            doauVar = new doau(doinVar, dohmVarA, str4, i, (etxyVar2 == null ? etxy.a : etxyVar2).c, 100L, doys.a);
        } else {
            doauVar = null;
        }
        doauVarArr[1] = doauVar;
        this(str, str2, str3, fcur.K(doauVarArr), doys.a);
    }

    @Override // defpackage.doav
    public final doas a() {
        return this.b;
    }

    @Override // defpackage.doav
    public final /* synthetic */ doid b() {
        return dohm.d;
    }

    @Override // defpackage.dohr
    public final Iterable c() {
        return this.e;
    }

    @Override // defpackage.doav
    public final String d() {
        return this.c;
    }

    @Override // defpackage.doav
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doyt)) {
            return false;
        }
        doyt doytVar = (doyt) obj;
        return fdbq.f(this.a, doytVar.a) && fdbq.f(this.c, doytVar.c) && fdbq.f(this.d, doytVar.d) && fdbq.f(this.e, doytVar.e) && fdbq.f(this.b, doytVar.b);
    }

    @Override // defpackage.doav
    public final String f() {
        return this.d;
    }

    @Override // defpackage.dltd
    public final /* synthetic */ dltc fo() {
        return this.b;
    }

    @Override // defpackage.dlti
    public final /* synthetic */ Object fp() {
        return this.f;
    }

    @Override // defpackage.dltd
    public final String fq() {
        String str = this.d;
        String str2 = this.c;
        String strB = dngu.b(this.a);
        String strB2 = dngu.b(str2);
        Uri uri = Uri.parse(str);
        uri.getClass();
        String strA = dngu.a(uri);
        Iterable iterable = this.e;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((doau) it.next()).fq());
        }
        return "StickerMedia(id='" + strB + "', description='" + strB2 + "', webUrl='" + strA + "', variations=" + arrayList + ", source=" + this.b + ")";
    }

    @Override // defpackage.doav
    public final /* synthetic */ int h() {
        return doao.b(this);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.b.hashCode();
    }

    @Override // defpackage.dohs
    public final /* bridge */ /* synthetic */ doif m() {
        return b();
    }

    public final String toString() {
        return "StickerMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.d + ", variations=" + this.e + ", source=" + this.b + ")";
    }

    public doyt(String str, String str2, String str3, Iterable iterable, doas doasVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = iterable;
        this.b = doasVar;
        this.f = new doyq(new doap(this));
    }
}
