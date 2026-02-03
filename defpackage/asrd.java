package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asrd {
    public static String a(aubq aubqVar) {
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.b(!aubpVarB.equals(aubp.GROUP), "Unexpected remote chat endpoint of type group");
        return UUID.nameUUIDFromBytes(aubqVar.d.getBytes(StandardCharsets.UTF_8)).toString();
    }
}
