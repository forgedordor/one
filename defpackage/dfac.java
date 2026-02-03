package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfac extends ArrayList {
    private static final long serialVersionUID = -4357313952926383485L;
    public final dfae a;

    public dfac(dfae dfaeVar) {
        this.a = dfaeVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dfac)) {
            return false;
        }
        dfac dfacVar = (dfac) obj;
        if (this.a == dfacVar.a) {
            return super.equals(dfacVar);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
