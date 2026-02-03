package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ely {
    public final ekq a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final List g;
    public int h;
    private List i;

    public ely(ekq ekqVar) {
        this.a = ekqVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new elv());
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.i = fcvo.a;
    }

    public final int a(int i) {
        if (b() <= 0) {
            return 0;
        }
        if (i >= b()) {
            ebs.c("ItemIndex > total count");
        }
        return i / this.h;
    }

    public final int b() {
        return this.a.c.b;
    }

    public final elx c(int i) {
        List list;
        int i2 = this.h;
        int i3 = i * i2;
        int iG = fddu.g(i2, b() - i3);
        int size = this.i.size();
        int iF = fddu.f(iG, 0);
        if (iF == size) {
            list = this.i;
        } else {
            ArrayList arrayList = new ArrayList(iF);
            for (int i4 = 0; i4 < iF; i4++) {
                arrayList.add(new eki());
            }
            this.i = arrayList;
            list = arrayList;
        }
        return new elx(i3, list);
    }
}
