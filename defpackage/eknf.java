package defpackage;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eknf extends ekeq implements Serializable {
    private static final long serialVersionUID = 0;
    final ekmj a;
    transient Collection b;
    transient Set c;
    transient Map d;

    public eknf(ekmj ekmjVar) {
        this.a = ekmjVar;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final boolean B(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final void C(ekmj ekmjVar) {
        throw null;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public Collection c(Object obj) {
        return ekng.a(((eken) this.a).c(obj));
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public Collection d(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ekeq, defpackage.eker
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ekmj hp() {
        return this.a;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final void q() {
        throw null;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        ekmf ekmfVar = new ekmf(DesugarCollections.unmodifiableCollection(this.a.u()));
        this.b = ekmfVar;
        return ekmfVar;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Collection v() {
        throw null;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Map w() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(ekmi.l(this.a.w(), new ejvr() { // from class: ekne
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ekng.a((Collection) obj);
            }
        }));
        this.d = mapUnmodifiableMap;
        return mapUnmodifiableMap;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Set x() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.a.x());
        this.c = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
