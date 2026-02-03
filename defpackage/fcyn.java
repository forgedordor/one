package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcyn extends fcyx {
    final /* synthetic */ fdat a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcyn(fcxy fcxyVar, fdat fdatVar, Object obj) {
        super(fcxyVar);
        this.a = fdatVar;
        this.b = obj;
    }

    @Override // defpackage.fcyt
    protected final Object b(Object obj) throws Throwable {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            fctl.b(obj);
            return obj;
        }
        this.c = 1;
        fctl.b(obj);
        fdat fdatVar = this.a;
        fdcm.e(fdatVar, 2);
        return fdatVar.a(this.b, this);
    }
}
