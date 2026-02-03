package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eknc extends ekbr {
    final ekmj a;
    final ekma b;

    public eknc(ekmj ekmjVar, ekma ekmaVar) {
        ekmjVar.getClass();
        this.a = ekmjVar;
        this.b = ekmaVar;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean A() {
        return this.a.A();
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean B(Object obj, Object obj2) {
        return c(obj).remove(obj2);
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final void C(ekmj ekmjVar) {
        throw null;
    }

    public Collection a(final Object obj, Collection collection) {
        ejvr ejvrVar = new ejvr() { // from class: eknb
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.b.a(obj, obj2);
            }
        };
        return collection instanceof List ? ekjz.g((List) collection, ejvrVar) : new ekcy(collection, ejvrVar);
    }

    @Override // defpackage.ekmj
    public Collection c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.ekmj
    public Collection d(Object obj) {
        return a(obj, this.a.d(obj));
    }

    @Override // defpackage.ekmj
    public final int i() {
        return this.a.i();
    }

    @Override // defpackage.ekbr
    public final Collection j() {
        return new ekbo(this);
    }

    @Override // defpackage.ekbr
    public final Collection k() {
        return new ekcy(this.a.u(), new ejvr() { // from class: ekmz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return this.a.b.a(entry.getKey(), entry.getValue());
            }
        });
    }

    @Override // defpackage.ekbr
    public final Iterator l() {
        return ekjc.j(this.a.u().iterator(), ekmi.b(this.b));
    }

    @Override // defpackage.ekbr
    public final Map o() {
        return new ekme(this.a.w(), new ekma() { // from class: ekna
            @Override // defpackage.ekma
            public final Object a(Object obj, Object obj2) {
                return this.a.a(obj, (Collection) obj2);
            }
        });
    }

    @Override // defpackage.ekbr
    public final Set p() {
        return this.a.x();
    }

    @Override // defpackage.ekmj
    public final void q() {
        this.a.q();
    }

    @Override // defpackage.ekmj
    public final boolean s(Object obj) {
        throw null;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
