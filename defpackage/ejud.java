package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejud extends ejwi {
    public static final ejud a = new ejud();
    private static final long serialVersionUID = 0;

    private ejud() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.ejwi
    public final ejwi a(ejwi ejwiVar) {
        ejwiVar.getClass();
        return ejwiVar;
    }

    @Override // defpackage.ejwi
    public final ejwi b(ejvr ejvrVar) {
        return a;
    }

    @Override // defpackage.ejwi
    public final Object c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.ejwi
    public final Object d(ejxr ejxrVar) {
        Object obj = ejxrVar.get();
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ejwi
    public final Object e(Object obj) {
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ejwi
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.ejwi
    public final Object f() {
        return null;
    }

    @Override // defpackage.ejwi
    public final boolean g() {
        return false;
    }

    @Override // defpackage.ejwi
    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
