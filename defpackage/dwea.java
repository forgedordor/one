package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwea {
    public static ejwi a(Map map) {
        byte[] bArr = (byte[]) map.get("Lighter");
        if (bArr == null) {
            return ejud.a;
        }
        try {
            eypn eypnVar = (eypn) evsn.parseFrom(eypn.a, ((evqe) evsn.parseFrom(evqe.a, bArr)).c, evrr.a());
            HashSet hashSet = new HashSet();
            Iterator<E> it = eypnVar.e.iterator();
            while (it.hasNext()) {
                hashSet.add(dweg.a((eypt) it.next()));
            }
            String str = eypnVar.b;
            if (str == null) {
                throw new NullPointerException("Null handlerId");
            }
            return ejwi.j(new dwaa(str, eypnVar.c, eypnVar.d, hashSet));
        } catch (evtj e) {
            dvhv.d("GroupMetadataProtos", "Conversation had invalid lighter app data", e);
            return ejud.a;
        }
    }
}
