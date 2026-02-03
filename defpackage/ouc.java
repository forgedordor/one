package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouc implements owg {
    public static final ouc a = new ouc(osd.a);
    public final List b;
    public int c;
    public int d;
    public int e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ouc(osd osdVar) {
        this(osdVar.c, osdVar.d, osdVar.e);
        osdVar.getClass();
    }

    private static final int j(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((oxd) it.next()).c.size();
        }
        return size;
    }

    @Override // defpackage.owg
    public final int a() {
        return this.c;
    }

    public final int b() {
        int[] iArr = ((oxd) fcva.N(this.b)).b;
        int i = iArr[0];
        int iA = fcur.A(iArr);
        if (iA > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i > i3) {
                    i = i3;
                }
                if (i2 == iA) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    public final int c() {
        int[] iArr = ((oxd) fcva.S(this.b)).b;
        int i = iArr[0];
        int iA = fcur.A(iArr);
        if (iA > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == iA) {
                    break;
                }
                i2++;
            }
        }
        Integer.valueOf(i).getClass();
        return i;
    }

    @Override // defpackage.owg
    public final int d() {
        return this.e;
    }

    @Override // defpackage.owg
    public final int e() {
        return this.d;
    }

    @Override // defpackage.owg
    public final int f() {
        return this.d + this.c + this.e;
    }

    public final ovg g(osg osgVar) {
        osgVar.getClass();
        if (!(osgVar instanceof osd)) {
            if (!(osgVar instanceof osb)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            osb osbVar = (osb) osgVar;
            fddq fddqVar = new fddq(osbVar.b, osbVar.c);
            Iterator it = this.b.iterator();
            int size = 0;
            while (it.hasNext()) {
                oxd oxdVar = (oxd) it.next();
                int[] iArr = oxdVar.b;
                int i = 0;
                while (true) {
                    if (i > 0) {
                        break;
                    }
                    if (fddqVar.g(iArr[i])) {
                        size += oxdVar.c.size();
                        it.remove();
                        break;
                    }
                    i++;
                }
            }
            int i2 = this.c - size;
            this.c = i2;
            if (osbVar.a == orr.b) {
                int i3 = this.d;
                int i4 = osbVar.d;
                this.d = i4;
                return new ovd(size, i4, i3);
            }
            int i5 = this.e;
            int i6 = osbVar.d;
            this.e = i6;
            return new ovc(this.d + i2, size, i6, i5);
        }
        osd osdVar = (osd) osgVar;
        List list = osdVar.c;
        orr orrVar = osdVar.b;
        int iJ = j(list);
        int iOrdinal = orrVar.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i7 = this.d;
            this.b.addAll(0, list);
            this.c += iJ;
            this.d = osdVar.d;
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                fcva.y(arrayList, ((oxd) it2.next()).c);
            }
            return new ove(arrayList, this.d, i7);
        }
        if (iOrdinal != 2) {
            throw new fctg();
        }
        int i8 = this.e;
        int i9 = this.c;
        List list2 = this.b;
        list2.addAll(list2.size(), list);
        this.c += iJ;
        this.e = osdVar.e;
        int i10 = this.d + i9;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            fcva.y(arrayList2, ((oxd) it3.next()).c);
        }
        return new ovb(i10, arrayList2, this.e, i8);
    }

    public final oxf h(int i) {
        List list;
        int i2 = 0;
        int size = i - this.d;
        while (true) {
            list = this.b;
            if (size < ((oxd) list.get(i2)).c.size() || i2 >= fcva.e(list)) {
                break;
            }
            size -= ((oxd) list.get(i2)).c.size();
            i2++;
        }
        oxd oxdVar = (oxd) list.get(i2);
        int i3 = i - this.d;
        int iF = ((f() - i) - this.e) - 1;
        int iB = b();
        int iC = c();
        int i4 = oxdVar.d;
        List list2 = oxdVar.e;
        return new oxf(i4, size, i3, iF, iB, iC);
    }

    @Override // defpackage.owg
    public final Object i(int i) {
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((oxd) list.get(i2)).c.size();
            if (size2 > i) {
                break;
            }
            i2++;
            i -= size2;
        }
        return ((oxd) list.get(i2)).c.get(i);
    }

    public final String toString() {
        int i = this.c;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(i(i2));
        }
        return "[(" + this.d + " placeholders), " + fcva.aF(arrayList, null, null, null, null, 63) + ", (" + this.e + " placeholders)]";
    }

    public ouc(List list, int i, int i2) {
        list.getClass();
        this.b = fcva.aq(list);
        this.c = j(list);
        this.d = i;
        this.e = i2;
    }
}
