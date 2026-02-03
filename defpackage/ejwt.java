package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwt extends ejwi {
    private static final long serialVersionUID = 0;
    public final Object a;

    public ejwt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ejwi
    public final ejwi a(ejwi ejwiVar) {
        ejwiVar.getClass();
        return this;
    }

    @Override // defpackage.ejwi
    public final ejwi b(ejvr ejvrVar) {
        Object objApply = ejvrVar.apply(this.a);
        objApply.getClass();
        return new ejwt(objApply);
    }

    @Override // defpackage.ejwi
    public final Object c() {
        return this.a;
    }

    @Override // defpackage.ejwi
    public final Object d(ejxr ejxrVar) {
        ejxrVar.getClass();
        return this.a;
    }

    @Override // defpackage.ejwi
    public final Object e(Object obj) {
        obj.getClass();
        return this.a;
    }

    @Override // defpackage.ejwi
    public final boolean equals(Object obj) {
        if (obj instanceof ejwt) {
            return this.a.equals(((ejwt) obj).a);
        }
        return false;
    }

    @Override // defpackage.ejwi
    public final Object f() {
        return this.a;
    }

    @Override // defpackage.ejwi
    public final boolean g() {
        return true;
    }

    @Override // defpackage.ejwi
    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.a.toString() + ")";
    }
}
