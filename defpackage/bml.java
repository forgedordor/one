package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bml {
    private static final List j = Arrays.asList(1, 5, 3);
    public final List a;
    public final bmi b;
    public final List c;
    public final List d;
    public final List e;
    public final bmf f;
    public final bjl g;
    public final int h;
    public final InputConfiguration i;

    public bml(List list, List list2, List list3, List list4, bjl bjlVar, bmf bmfVar, InputConfiguration inputConfiguration, int i, bmi bmiVar) {
        this.a = list;
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = DesugarCollections.unmodifiableList(list3);
        this.e = DesugarCollections.unmodifiableList(list4);
        this.f = bmfVar;
        this.g = bjlVar;
        this.i = inputConfiguration;
        this.h = i;
        this.b = bmiVar;
    }

    public static int a(int i, int i2) {
        List list = j;
        return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
    }

    public static bml d() {
        return new bml(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new bjj().b(), null, null, 0, null);
    }

    public final int b() {
        return this.g.f;
    }

    public final bjq c() {
        return this.g.e;
    }

    public final List e() {
        return this.g.h;
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        for (bmi bmiVar : this.a) {
            arrayList.add(bmiVar.c());
            Iterator it = bmiVar.d().iterator();
            while (it.hasNext()) {
                arrayList.add((bjz) it.next());
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }
}
