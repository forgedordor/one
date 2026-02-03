package defpackage;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvm {
    public lvb a;
    private lvh b;

    public lvm(lvi lviVar, lvb lvbVar) {
        lvh lwaVar;
        lvbVar.getClass();
        lvq lvqVar = lvq.a;
        boolean z = lviVar instanceof lvh;
        boolean z2 = lviVar instanceof lun;
        if (z && z2) {
            lwaVar = new luo((lun) lviVar, (lvh) lviVar);
        } else if (z2) {
            lwaVar = new luo((lun) lviVar, null);
        } else if (z) {
            lwaVar = (lvh) lviVar;
        } else {
            Class<?> cls = lviVar.getClass();
            if (lvq.a.a(cls) == 2) {
                Object obj = lvq.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    lwaVar = new lxc(lvq.b((Constructor) list.get(0), lviVar));
                } else {
                    int size = list.size();
                    luu[] luuVarArr = new luu[size];
                    for (int i = 0; i < size; i++) {
                        luuVarArr[i] = lvq.b((Constructor) list.get(i), lviVar);
                    }
                    lwaVar = new lum(luuVarArr);
                }
            } else {
                lwaVar = new lwa(lviVar);
            }
        }
        this.b = lwaVar;
        this.a = lvbVar;
    }

    public final void a(lvj lvjVar, lva lvaVar) {
        lvb lvbVarA = lvaVar.a();
        this.a = lvl.a(this.a, lvbVarA);
        this.b.gL(lvjVar, lvaVar);
        this.a = lvbVarA;
    }
}
