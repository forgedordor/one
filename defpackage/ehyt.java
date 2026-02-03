package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehyt {
    public static ehyt d(ehyt ehytVar, ehyt ehytVar2) {
        ejwl.l(ehytVar.c().equals(ehytVar2.c()));
        HashSet hashSet = new HashSet();
        ejwi ejwiVarJ = ejud.a;
        ehys.a(ehytVar.c(), hashSet);
        long jMin = Math.min(ehytVar.a(), ehytVar2.a());
        ejwi ejwiVarB = ehytVar.b();
        boolean zG = ejwiVarB.g();
        ejwi ejwiVarB2 = ehytVar2.b();
        if (zG && ejwiVarB2.g()) {
            ejwiVarJ = ejwi.j(Long.valueOf(Math.min(((Long) ejwiVarB.c()).longValue(), ((Long) ejwiVarB2.c()).longValue())));
        } else if (ejwiVarB.g()) {
            ejwiVarJ = ejwiVarB;
        } else if (ejwiVarB2.g()) {
            ejwiVarJ = ejwiVarB2;
        }
        return new ehwp(hashSet, jMin, ejwiVarJ);
    }

    public abstract long a();

    public abstract ejwi b();

    public abstract Set c();
}
