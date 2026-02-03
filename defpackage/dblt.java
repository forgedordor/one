package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dblt {
    public static etih a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        etig etigVar = (etig) etih.a.createBuilder();
        long mostSignificantBits = uuidRandomUUID.getMostSignificantBits();
        etigVar.copyOnWrite();
        etih etihVar = (etih) etigVar.instance;
        etihVar.b |= 1;
        etihVar.c = mostSignificantBits;
        long leastSignificantBits = uuidRandomUUID.getLeastSignificantBits();
        etigVar.copyOnWrite();
        etih etihVar2 = (etih) etigVar.instance;
        etihVar2.b |= 2;
        etihVar2.d = leastSignificantBits;
        return (etih) etigVar.build();
    }
}
