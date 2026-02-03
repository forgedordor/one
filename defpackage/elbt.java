package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elbt extends eket {
    private final ejxr a;
    private final Set b;
    private final ejxr c;

    public elbt(Set set, ejxr ejxrVar, ejxr ejxrVar2) {
        this.b = set;
        this.a = ejxrVar;
        this.c = ejxrVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ekei, defpackage.eker
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Set hp() {
        if (((Boolean) this.a.get()).booleanValue()) {
            return this.b;
        }
        throw new IllegalStateException((String) this.c.get());
    }

    @Override // defpackage.eket, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.b.hashCode();
    }
}
