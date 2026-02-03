package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aff extends afl {
    public aff(ajy ajyVar) {
        super(ajyVar);
    }

    public final String a() {
        String str = this.a.d;
        lcg.i(str);
        return str;
    }

    public final List b() {
        ajt ajtVar = this.a.f;
        return ajtVar == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(ajtVar.b);
    }

    public final boolean c() {
        ajt ajtVar = this.a.f;
        if (ajtVar == null) {
            return false;
        }
        return ajtVar.a;
    }
}
