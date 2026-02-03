package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnxf {
    public final ArrayList a;
    public final ctz b;
    public final ArrayList c;
    public final ArrayList d;
    public final HashSet e;
    public final HashSet f;
    public final HashSet g;
    public final ArrayList h;

    public cnxf() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnxf)) {
            return false;
        }
        cnxf cnxfVar = (cnxf) obj;
        return fdbq.f(this.a, cnxfVar.a) && fdbq.f(this.b, cnxfVar.b) && fdbq.f(this.c, cnxfVar.c) && fdbq.f(this.d, cnxfVar.d) && fdbq.f(this.e, cnxfVar.e) && fdbq.f(this.f, cnxfVar.f) && fdbq.f(this.g, cnxfVar.g) && fdbq.f(this.h, cnxfVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "ScanLists(smsToAdd=" + this.a + ", mmsToAdd=" + this.b + ", mmsToAddInOrder=" + this.c + ", messagesToDelete=" + this.d + ", messagesToMerge=" + this.e + ", splitMessagePairs=" + this.f + ", threadsToMerge=" + this.g + ", scanProblems=" + this.h + ")";
    }

    public /* synthetic */ cnxf(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        ctz ctzVar = new ctz((byte[]) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        this.a = arrayList;
        this.b = ctzVar;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = hashSet;
        this.f = hashSet2;
        this.g = hashSet3;
        this.h = arrayList4;
    }
}
