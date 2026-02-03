package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkxu implements dkxv {
    public final String a;
    public final String b;
    public final dkvq c;
    public final List d;
    public final boolean e;
    public final String f;
    private final fdae g;
    private final fdae h;
    private final fdae i;

    public dkxu() {
        this(null, null, null, null, false, null, 255);
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.i;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        return this.h;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dkxv
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkxu)) {
            return false;
        }
        dkxu dkxuVar = (dkxu) obj;
        if (!fdbq.f(this.a, dkxuVar.a) || !fdbq.f(this.b, dkxuVar.b)) {
            return false;
        }
        fdae fdaeVar = dkxuVar.g;
        return fdbq.f(null, null) && fdbq.f(this.c, dkxuVar.c) && fdbq.f(this.d, dkxuVar.d) && this.e == dkxuVar.e && fdbq.f(this.h, dkxuVar.h) && fdbq.f(this.f, dkxuVar.f);
    }

    @Override // defpackage.dkxv
    public final String f() {
        return this.a;
    }

    @Override // defpackage.dkxv
    public final List g() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        dkvq dkvqVar = this.c;
        int iHashCode3 = ((((((((((iHashCode * 31) + iHashCode2) * 961) + (dkvqVar == null ? 0 : dkvqVar.hashCode())) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231)) * 31) + this.h.hashCode()) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "VerticalRichCardUiData(title=" + this.a + ", description=" + this.b + ", onExpand=null, media=" + this.c + ", actions=" + this.d + ", isHighlighted=" + this.e + ", onLayout=" + this.h + ", contentDescription=" + this.f + ")";
    }

    public /* synthetic */ dkxu(String str, String str2, dkvq dkvqVar, List list, boolean z, String str3, int i) {
        list = (i & 16) != 0 ? fcvo.a : list;
        boolean z2 = z & ((i & 32) == 0);
        fdae fdaeVar = (i & 64) != 0 ? new fdae() { // from class: dkxs
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : null;
        int i2 = i & 2;
        int i3 = i & 1;
        dkvqVar = (i & 8) != 0 ? null : dkvqVar;
        str2 = i2 != 0 ? null : str2;
        str = 1 == i3 ? null : str;
        str3 = (i & 128) != 0 ? null : str3;
        list.getClass();
        fdaeVar.getClass();
        this.a = str;
        this.b = str2;
        this.g = null;
        this.c = dkvqVar;
        this.d = list;
        this.e = z2;
        this.h = fdaeVar;
        this.f = str3;
        if (str == null && str2 == null && dkvqVar == null) {
            throw new IllegalStateException("One of title, description, or media must be provided.");
        }
        this.i = new fdae() { // from class: dkxt
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        };
    }
}
