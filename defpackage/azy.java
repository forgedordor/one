package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azy {
    public final List a;
    public final List b;
    public final List c;
    public final long d;

    public azy(azx azxVar) {
        this.a = DesugarCollections.unmodifiableList(azxVar.a);
        this.b = DesugarCollections.unmodifiableList(azxVar.b);
        this.c = DesugarCollections.unmodifiableList(azxVar.c);
        this.d = azxVar.d;
    }
}
