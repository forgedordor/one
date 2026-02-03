package defpackage;

import androidx.car.app.model.Alert;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cps {
    final Set a;
    final Set b;
    final Set c;
    int d;
    int e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    cpw k;

    public cps() {
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = cpw.b;
    }

    public final void a(int i) {
        this.c.add(Integer.valueOf(i));
    }

    public final void b() {
        this.e = 1;
    }

    public final void c() {
        this.g = true;
    }

    public final void d() {
        this.j = true;
    }

    public cps(cpt cptVar) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        HashSet hashSet2 = new HashSet();
        this.b = hashSet2;
        HashSet hashSet3 = new HashSet();
        this.c = hashSet3;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = 0;
        this.j = false;
        this.k = cpw.b;
        cptVar.getClass();
        this.d = cptVar.c;
        this.e = cptVar.d;
        this.f = cptVar.e;
        this.k = cptVar.j;
        hashSet.addAll(cptVar.k);
        hashSet2.addAll(cptVar.l);
        hashSet3.addAll(cptVar.m);
        this.g = cptVar.f;
        this.h = cptVar.g;
        this.i = cptVar.h;
        this.j = cptVar.i;
    }
}
