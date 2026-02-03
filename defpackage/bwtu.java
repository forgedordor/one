package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwtu {
    public static final fctc a;
    public static final bwtu b;
    public static final bwtu c;
    public static final bwtu d;
    public static final bwtu e;
    public static final bwtu f;
    public static final bwtu g;
    public static final /* synthetic */ fcza h;
    private static final /* synthetic */ bwtu[] j;
    public final int i;

    static {
        bwtu bwtuVar = new bwtu("SWITCH_TO_RCS", 0, 215);
        b = bwtuVar;
        bwtu bwtuVar2 = new bwtu("SWITCH_TO_ENCRYPTED_RCS", 1, 216);
        c = bwtuVar2;
        bwtu bwtuVar3 = new bwtu("SWITCH_TO_ENCRYPTED_RCS_INFO", 2, 219);
        d = bwtuVar3;
        bwtu bwtuVar4 = new bwtu("GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE", 3, 233);
        e = bwtuVar4;
        bwtu bwtuVar5 = new bwtu("GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS", 4, 234);
        f = bwtuVar5;
        bwtu bwtuVar6 = new bwtu("GROUP_PROTOCOL_SWITCH_TO_MMS", 5, 252);
        g = bwtuVar6;
        bwtu[] bwtuVarArr = {bwtuVar, bwtuVar2, bwtuVar3, bwtuVar4, bwtuVar5, bwtuVar6};
        j = bwtuVarArr;
        h = fczb.a(bwtuVarArr);
        a = fctd.a(new fdae() { // from class: bwts
            @Override // defpackage.fdae
            public final Object invoke() {
                List list = bwtu.h;
                LinkedHashMap linkedHashMap = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
                fcue fcueVar = new fcue((fcuh) list);
                while (fcueVar.hasNext()) {
                    Object next = fcueVar.next();
                    linkedHashMap.put(Integer.valueOf(((bwtu) next).i), next);
                }
                return linkedHashMap;
            }
        });
    }

    private bwtu(String str, int i, int i2) {
        this.i = i2;
    }

    public static bwtu[] values() {
        return (bwtu[]) j.clone();
    }

    public final bwsn a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return bwsn.d;
            }
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    return bwsn.b;
                }
                throw null;
            }
        }
        return bwsn.c;
    }
}
