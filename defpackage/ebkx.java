package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkx {
    public static final ebpd a(ebma ebmaVar, String str, ebno ebnoVar, ebnn ebnnVar, eboa eboaVar, ebos ebosVar, List list, ebod ebodVar) {
        ebpd ebpdVar = new ebpd(new ebom(str, ebmaVar));
        ebpdVar.p(ebnoVar);
        ebpdVar.p(ebnnVar);
        ebpdVar.p(eboaVar);
        ebpdVar.p(ebosVar);
        ebpdVar.m("Via");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ebpdVar.k((ebob) it.next());
        }
        ebpdVar.p(ebodVar);
        return ebpdVar;
    }
}
