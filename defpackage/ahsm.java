package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsm {
    public static final ahrg a(ahqo ahqoVar) {
        ahsh ahshVarA = ahsi.a(ahqoVar);
        if (ahshVarA != ahsh.b && ahshVarA != ahsh.c) {
            Objects.toString(ahshVarA);
            throw new IllegalArgumentException("Using PlainTextContentExtractor on snippet type ".concat(String.valueOf(ahshVarA)));
        }
        ahrf ahrfVar = (ahrf) ahrg.a.createBuilder();
        ahrfVar.getClass();
        ahrh.c(ahqoVar.b(), ahrfVar);
        ahri ahriVar = (ahri) ahrj.a.createBuilder();
        ahriVar.getClass();
        String strD = ahqoVar.d();
        if (strD == null) {
            strD = "";
        }
        ahrk.b(strD, ahriVar);
        ahrh.b(ahrk.a(ahriVar), ahrfVar);
        return ahrh.a(ahrfVar);
    }
}
