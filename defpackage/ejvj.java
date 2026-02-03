package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ejvj<A, B> implements ejvr<A, B> {
    private transient ejvj a;

    protected ejvj() {
    }

    protected abstract Object a(Object obj);

    @Override // defpackage.ejvr
    @Deprecated
    public final B apply(A a) {
        return (B) fM(a);
    }

    protected abstract Object b(Object obj);

    public ejvj fH() {
        ejvj ejvjVar = this.a;
        if (ejvjVar != null) {
            return ejvjVar;
        }
        ejvi ejviVar = new ejvi(this);
        this.a = ejviVar;
        return ejviVar;
    }

    public Object fL(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objA = a(obj);
        objA.getClass();
        return objA;
    }

    public Object fM(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objB = b(obj);
        objB.getClass();
        return objB;
    }
}
