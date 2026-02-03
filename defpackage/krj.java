package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class krj {
    public static final Integer c = 0;
    private int a;
    public boolean d = true;
    public final HashMap e;
    public final HashMap f;
    public final HashMap g;
    public final kqx h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public kpx l;

    public krj() {
        HashMap map = new HashMap();
        this.e = map;
        this.f = new HashMap();
        this.g = new HashMap();
        kqx kqxVar = new kqx(this);
        this.h = kqxVar;
        this.a = 0;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        Integer num = c;
        kqxVar.a = num;
        map.put(num, kqxVar);
    }

    public final int a(Object obj) {
        return Math.round(((Float) obj).floatValue());
    }

    public final kqx b(Object obj) {
        HashMap map = this.e;
        krg krgVar = (krg) map.get(obj);
        krg krgVar2 = krgVar;
        if (krgVar == null) {
            kqx kqxVar = new kqx(this);
            map.put(obj, kqxVar);
            kqxVar.a = obj;
            krgVar2 = kqxVar;
        }
        if (krgVar2 instanceof kqx) {
            return (kqx) krgVar2;
        }
        return null;
    }

    public final krr c() {
        return (krr) h(1);
    }

    public final krs d() {
        return (krs) h(2);
    }

    public final void e(Object obj) {
        this.i.add(obj);
        this.k = true;
    }

    public final boolean f() {
        return !this.d;
    }

    public final void g(Object obj, int i) {
        kqx kqxVarB = b(obj);
        krn krnVar = kqxVarB.c;
        if (krnVar == null || !(krnVar instanceof krq)) {
            krq krqVar = new krq(this);
            krqVar.b = i;
            krqVar.f = obj;
            kqxVarB.g(krqVar);
        }
    }

    public final krf h(int i) {
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.a;
        this.a = i2 + 1;
        sb.append(i2);
        sb.append("__");
        String string = sb.toString();
        HashMap map = this.f;
        krf krfVar = (krf) map.get(string);
        if (krfVar != null) {
            return krfVar;
        }
        krf krsVar = i + (-1) != 0 ? new krs(this) : new krr(this);
        krsVar.a = string;
        map.put(string, krsVar);
        return krsVar;
    }
}
