package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csjk extends fcyv {
    boolean a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ csjm d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjk(csjm csjmVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.d = csjmVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, false, this);
    }
}
