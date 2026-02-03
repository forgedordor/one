package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fdcy implements fdcz {
    private Object a;

    public fdcy(Object obj) {
        this.a = obj;
    }

    protected void a(fdeh fdehVar, Object obj, Object obj2) {
        throw null;
    }

    protected boolean b(Object obj, Object obj2) {
        return true;
    }

    @Override // defpackage.fdcz
    public final Object c(fdeh fdehVar) {
        fdehVar.getClass();
        return this.a;
    }

    @Override // defpackage.fdcz
    public final void d(fdeh fdehVar, Object obj) {
        fdehVar.getClass();
        Object obj2 = this.a;
        if (b(obj2, obj)) {
            this.a = obj;
            a(fdehVar, obj2, obj);
        }
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ")";
    }
}
