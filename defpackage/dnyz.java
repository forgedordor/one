package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnyz implements doav {
    public final String a;
    public final String b;
    private final String c;
    private final Iterable d;
    private final doas e;
    private final dnyy f;

    public /* synthetic */ dnyz(String str, String str2, String str3, Iterable iterable, doas doasVar, int i) {
        doasVar = (i & 16) != 0 ? doar.a : doasVar;
        str.getClass();
        str2.getClass();
        str3.getClass();
        iterable.getClass();
        doasVar.getClass();
        this.a = str;
        this.c = str2;
        this.b = str3;
        this.d = iterable;
        this.e = doasVar;
        this.f = new dnyy(new doap(this));
    }

    @Override // defpackage.doav
    public final doas a() {
        return this.e;
    }

    @Override // defpackage.doav
    public final /* synthetic */ doid b() {
        return dohm.d;
    }

    @Override // defpackage.dohr
    public final Iterable c() {
        return this.d;
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
        if (!(obj instanceof dnyz)) {
            return false;
        }
        dnyz dnyzVar = (dnyz) obj;
        return fdbq.f(this.a, dnyzVar.a) && fdbq.f(this.c, dnyzVar.c) && fdbq.f(this.b, dnyzVar.b) && fdbq.f(this.d, dnyzVar.d) && fdbq.f(this.e, dnyzVar.e);
    }

    @Override // defpackage.doav
    public final String f() {
        return this.b;
    }

    @Override // defpackage.dltd
    public final /* synthetic */ dltc fo() {
        return this.e;
    }

    @Override // defpackage.dlti
    public final /* synthetic */ Object fp() {
        return this.f;
    }

    @Override // defpackage.dltd
    public final String fq() {
        String str = this.b;
        String str2 = this.c;
        String strB = dngu.b(this.a);
        String strB2 = dngu.b(str2);
        Uri uri = Uri.parse(str);
        uri.getClass();
        String strA = dngu.a(uri);
        Iterable iterable = this.d;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((doau) it.next()).fq());
        }
        return "GifMedia(id='" + strB + "', description='" + strB2 + "', webUrl='" + strA + "', variations=" + arrayList + ", source=" + this.e + ")";
    }

    @Override // defpackage.doav
    public final /* synthetic */ int h() {
        return doao.b(this);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    @Override // defpackage.dohs
    public final /* bridge */ /* synthetic */ doif m() {
        return b();
    }

    public final String toString() {
        return "GifMedia(id=" + this.a + ", description=" + this.c + ", webUrl=" + this.b + ", variations=" + this.d + ", source=" + this.e + ")";
    }
}
