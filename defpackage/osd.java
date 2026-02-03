package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class osd extends osg {
    public static final osd a;
    public final orr b;
    public final List c;
    public final int d;
    public final int e;
    public final orq f;
    public final orq g = null;

    static {
        List listB = fcva.b(oxd.a);
        oro oroVar = oro.b;
        oro oroVar2 = oro.a;
        a = new osd(orr.a, listB, 0, 0, new orq(oroVar, oroVar2, oroVar2));
    }

    public osd(orr orrVar, List list, int i, int i2, orq orqVar) {
        this.b = orrVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = orqVar;
        if (orrVar != orr.c && i < 0) {
            throw new IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was " + i);
        }
        if (orrVar != orr.b && i2 < 0) {
            throw new IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was " + i2);
        }
        if (orrVar == orr.a && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:18:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b7 -> B:23:0x00bf). Please report as a decompilation issue!!! */
    @Override // defpackage.osg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fdat r18, defpackage.fcxy r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osd.b(fdat, fcxy):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osd)) {
            return false;
        }
        osd osdVar = (osd) obj;
        if (this.b != osdVar.b || !fdbq.f(this.c, osdVar.c) || this.d != osdVar.d || this.e != osdVar.e || !fdbq.f(this.f, osdVar.f)) {
            return false;
        }
        orq orqVar = osdVar.g;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
    }

    public final String toString() {
        List list = this.c;
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((oxd) it.next()).c.size();
        }
        int i = this.d;
        String strValueOf = i != -1 ? String.valueOf(i) : "none";
        int i2 = this.e;
        String strValueOf2 = i2 != -1 ? String.valueOf(i2) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.b);
        sb.append(", with ");
        sb.append(size);
        sb.append(" items (\n                    |   first item: ");
        oxd oxdVar = (oxd) fcva.P(list);
        sb.append(oxdVar != null ? fcva.P(oxdVar.c) : null);
        sb.append("\n                    |   last item: ");
        oxd oxdVar2 = (oxd) fcva.T(list);
        sb.append(oxdVar2 != null ? fcva.T(oxdVar2.c) : null);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(strValueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(strValueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f);
        sb.append("\n                    ");
        return fdgn.c(sb.toString().concat("|)"), "|");
    }
}
