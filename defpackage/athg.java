package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athg {
    public static final athh a(String str) {
        if (str != null) {
            return new athh(str);
        }
        return null;
    }

    public static final String b(athh athhVar) {
        if (athhVar != null) {
            return athhVar.a;
        }
        return null;
    }

    public static final athh c() {
        athh athhVarA = a(UUID.randomUUID().toString());
        athhVarA.getClass();
        return athhVarA;
    }
}
