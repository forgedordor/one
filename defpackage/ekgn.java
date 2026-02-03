package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekgn extends ekgk {
    final /* synthetic */ ekgp a;

    public ekgn(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.ekgk
    public final ekqg a() {
        return new ekgm(this.a.entrySet().listIterator());
    }

    @Override // defpackage.ekgp, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.ekgk, defpackage.ekgp
    public final ekhx g() {
        return this.a.keySet();
    }

    @Override // defpackage.ekgp, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null) {
            return null;
        }
        return new ekph(obj2);
    }

    @Override // defpackage.ekgp, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.ekgp
    public final boolean hs() {
        return this.a.hs();
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.ekgk, defpackage.ekgp
    public Object writeReplace() {
        return super.writeReplace();
    }
}
