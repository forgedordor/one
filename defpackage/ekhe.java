package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekhe<K, V> extends ekca<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final transient ekgp<K, ? extends ekfn<V>> map;
    final transient int size;

    public ekhe(ekgp ekgpVar, int i) {
        this.map = ekgpVar;
        this.size = i;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    @Deprecated
    public final boolean B(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    @Deprecated
    public final void C(ekmj ekmjVar) {
        throw null;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final ekhx x() {
        return this.map.keySet();
    }

    public final boolean E() {
        return this.map.hs();
    }

    /* renamed from: a */
    public abstract ekfn c(Object obj);

    @Override // defpackage.ekmj
    public /* bridge */ /* synthetic */ Collection c(Object obj) {
        throw null;
    }

    @Override // defpackage.ekmj
    @Deprecated
    public /* bridge */ /* synthetic */ Collection d(Object obj) {
        throw null;
    }

    @Override // defpackage.ekmj
    public final int i() {
        return this.size;
    }

    @Override // defpackage.ekbr
    public final /* synthetic */ Collection j() {
        return new ekhb(this);
    }

    @Override // defpackage.ekbr
    public final /* synthetic */ Collection k() {
        return new ekhd(this);
    }

    @Override // defpackage.ekbr
    public final /* synthetic */ Iterator l() {
        return new ekgy(this);
    }

    @Override // defpackage.ekbr
    public final Map o() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.ekbr
    public final Set p() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.ekmj
    @Deprecated
    public final void q() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public ekfn u() {
        return (ekfn) super.u();
    }

    @Override // defpackage.ekmj
    public final boolean s(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    @Deprecated
    public final boolean t(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final /* bridge */ /* synthetic */ Collection v() {
        return (ekfn) super.v();
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public /* synthetic */ Map w() {
        return this.map;
    }

    @Override // defpackage.ekbr, defpackage.ekmj
    public final boolean z(Object obj) {
        return obj != null && super.z(obj);
    }
}
