package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekls extends eket {
    final /* synthetic */ Set a;

    public ekls(Set set) {
        this.a = set;
    }

    @Override // defpackage.ekei, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ekei, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eket, defpackage.ekei
    protected final /* synthetic */ Collection b() {
        return this.a;
    }

    @Override // defpackage.eket
    protected final Set c() {
        return this.a;
    }

    @Override // defpackage.ekei, defpackage.eker
    protected final /* synthetic */ Object hp() {
        return this.a;
    }
}
