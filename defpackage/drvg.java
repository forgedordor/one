package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drvg {
    public static final drvi a;

    static {
        drle drleVarA = drle.a();
        if (drleVarA.g == null) {
            drln drlnVarF = drle.f();
            drli drliVar = new drli(drlnVarF, new drlg("ExeSeq-P10", 10, drlnVarF));
            List list = drleVarA.c;
            synchronized (list) {
                list.add(drlnVarF);
            }
            drleVarA.g = new drlh(eosj.b(drliVar));
        }
        a = new drvi(drleVarA.g);
    }
}
