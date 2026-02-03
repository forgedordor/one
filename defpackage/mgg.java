package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgg extends mgi {
    public final long a;
    public final List b;
    public final List c;

    public mgg(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final mgg a(int i) {
        List list = this.c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mgg mggVar = (mgg) list.get(i2);
            if (mggVar.d == i) {
                return mggVar;
            }
        }
        return null;
    }

    public final mgh b(int i) {
        List list = this.b;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mgh mghVar = (mgh) list.get(i2);
            if (mghVar.d == i) {
                return mghVar;
            }
        }
        return null;
    }

    public final void c(mgg mggVar) {
        this.c.add(mggVar);
    }

    public final void d(mgh mghVar) {
        this.b.add(mghVar);
    }

    @Override // defpackage.mgi
    public final String toString() {
        List list = this.b;
        return e(this.d) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
