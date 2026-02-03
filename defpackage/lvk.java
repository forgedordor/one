package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvk {
    public static final lvd a(lvj lvjVar) {
        lvc lvcVarP = lvjVar.P();
        lvcVarP.getClass();
        while (true) {
            lui luiVar = lvcVarP.a;
            lvf lvfVar = (lvf) luiVar.a();
            if (lvfVar != null) {
                return lvfVar;
            }
            fdmt fdmtVar = new fdmt(null);
            fdjq fdjqVar = fdkq.a;
            fdmi fdmiVar = fdzb.a;
            lvf lvfVar2 = new lvf(lvcVarP, fcye.d(fdmtVar, fdmiVar.j()));
            AtomicReference atomicReference = luiVar.a;
            while (!atomicReference.compareAndSet(null, lvfVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            fdil.d(lvfVar2, fdmiVar.j(), null, new lve(lvfVar2, null), 2);
            return lvfVar2;
        }
    }
}
