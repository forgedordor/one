package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awow {
    private final fctc a;

    public awow() {
        this((byte[]) null);
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        if (b().isEmpty()) {
            sb.append("No verified my identities\n");
        } else {
            for (Map.Entry entry : b().entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                Map map = (Map) entry.getValue();
                sb.append("MyIdentity: subId=" + iIntValue);
                sb.append('\n');
                Object obj = (List) map.get(awos.d);
                if (obj == null) {
                    obj = fcvo.a;
                }
                Object obj2 = (List) map.get(awos.e);
                if (obj2 == null) {
                    obj2 = fcvo.a;
                }
                sb.append(fdgn.b("\n      Number of attempts: " + fcva.q(map.values()).size() + "\n      Groups members mismatch : " + obj + "\n      Groups details mismatch : " + obj2 + "\n      "));
                sb.append("\n\n");
            }
        }
        return sb.toString();
    }

    public final Map b() {
        return (Map) this.a.a();
    }

    public awow(final Map map) {
        map.getClass();
        this.a = fctd.a(new fdae() { // from class: awov
            @Override // defpackage.fdae
            public final Object invoke() {
                Map map2 = map;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(map2.size()));
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        fcti fctiVar = (fcti) obj;
                        awmp awmpVar = (awmp) fctiVar.a;
                        awmp awmpVar2 = (awmp) fctiVar.b;
                        if (eooc.a(((awmt) awmpVar.d).h, ((awmt) awmpVar2.d).h).abs().compareTo(eoob.g(60)) < 0) {
                            arrayList.add(obj);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj2 : arrayList) {
                        fcti fctiVar2 = (fcti) obj2;
                        awos awosVarB = awot.b((awmp) fctiVar2.a, (awmp) fctiVar2.b, null);
                        Object arrayList2 = linkedHashMap2.get(awosVarB);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap2.put(awosVarB, arrayList2);
                        }
                        ((List) arrayList2).add(obj2);
                    }
                    linkedHashMap.put(key, linkedHashMap2);
                }
                return linkedHashMap;
            }
        });
    }

    public /* synthetic */ awow(byte[] bArr) {
        this(fcvp.a);
    }
}
