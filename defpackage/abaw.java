package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abaw {
    public static final void a(List list, int i, abaf abafVar, cqbm cqbmVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = ((crof) it.next()).a();
            if (((cqey) cqbmVar.a()).d(i, iA) == cqgk.AVAILABLE) {
                sb.append(iA);
                sb.append(" ");
            } else {
                sb2.append(iA);
                sb2.append(" ");
            }
        }
        String str = 1 != i ? "[SMS]" : "[MMS]";
        abak abakVarA = abafVar.a();
        abakVarA.I(str);
        abakVarA.A("availableSubIds", sb);
        abakVarA.A("unavailableSubIds", sb2);
        abakVarA.r();
    }
}
