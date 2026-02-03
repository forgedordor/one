package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgjm implements fgmm {
    private final char a;
    private int b = 0;
    private final LinkedList c = new LinkedList();

    public fgjm(char c) {
        this.a = c;
    }

    @Override // defpackage.fgmm
    public final char a() {
        return this.a;
    }

    @Override // defpackage.fgmm
    public final char b() {
        return this.a;
    }

    @Override // defpackage.fgmm
    public final int c() {
        return this.b;
    }

    @Override // defpackage.fgmm
    public final int d(fgij fgijVar, fgij fgijVar2) {
        fgmm fgmmVar;
        int iA = fgijVar.a();
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                fgmmVar = (fgmm) linkedList.getFirst();
                break;
            }
            fgmmVar = (fgmm) it.next();
            if (fgmmVar.c() <= iA) {
                break;
            }
        }
        return fgmmVar.d(fgijVar, fgijVar2);
    }

    final void e(fgmm fgmmVar) {
        int iC = fgmmVar.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            fgmm fgmmVar2 = (fgmm) listIterator.next();
            int iC2 = fgmmVar2.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(fgmmVar);
                return;
            }
            if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iC + "; conflicting processors: " + String.valueOf(fgmmVar2) + ", " + String.valueOf(fgmmVar));
            }
        }
        linkedList.add(fgmmVar);
        this.b = iC;
    }
}
