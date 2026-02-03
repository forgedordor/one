package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eomd extends eken implements Serializable {
    final ekjo a;
    transient Collection b;
    transient Map c;

    public eomd(ekjo ekjoVar) {
        this.a = ekjoVar;
    }

    @Override // defpackage.eken
    protected final ekjo b() {
        return this.a;
    }

    @Override // defpackage.eken, defpackage.ekeq, defpackage.ekmj
    public final /* bridge */ /* synthetic */ Collection c(Object obj) {
        return c(obj);
    }

    @Override // defpackage.eken, defpackage.ekeq
    protected final /* synthetic */ ekmj e() {
        return this.a;
    }

    @Override // defpackage.eken, defpackage.ekjo
    /* renamed from: g */
    public final List c(Object obj) {
        return new eoma(this.a.c(obj));
    }

    @Override // defpackage.ekeq, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final boolean t(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return this.a.t(obj, obj2);
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Collection u() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        eolz eolzVar = new eolz(this.a.u());
        this.b = eolzVar;
        return eolzVar;
    }

    @Override // defpackage.ekeq, defpackage.ekmj
    public final Map w() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        eomc eomcVar = new eomc(this, this.a.w());
        this.c = eomcVar;
        return eomcVar;
    }
}
