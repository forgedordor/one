package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjr extends eyjl {
    private final eyjl b;

    public eyjr(eyjl eyjlVar) {
        this.b = eyjlVar;
    }

    @Override // defpackage.eyjl
    public final eyjm a(Object obj) {
        try {
            return new eyjs(this.b.a(obj));
        } catch (RuntimeException e) {
            eyjt.b(e, this.b, obj);
            return eyjm.a;
        }
    }
}
