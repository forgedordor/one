package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fbqj extends fbpy {
    public fbro b(Map map) {
        throw null;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        ejwfVarB.b("policy", c());
        ejwfVarB.f("priority", 5);
        ejwfVarB.h("available", true);
        return ejwfVarB.toString();
    }
}
