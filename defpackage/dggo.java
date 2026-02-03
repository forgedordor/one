package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dggo {
    public static final dggp a(dggn dggnVar) {
        dggnVar.getClass();
        dggp dggpVar = dggnVar instanceof dggp ? (dggp) dggnVar : null;
        if (dggpVar != null) {
            return dggpVar;
        }
        Objects.toString(dggnVar);
        throw new IllegalArgumentException("Not a SimId: ".concat(dggnVar.toString()));
    }
}
