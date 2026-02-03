package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknd extends eknf implements ekjo {
    private static final long serialVersionUID = 0;

    public eknd(ekjo ekjoVar) {
        super(ekjoVar);
    }

    @Override // defpackage.eknf, defpackage.ekeq
    /* renamed from: e */
    public final /* synthetic */ ekmj hp() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ekjo, ekmj] */
    @Override // defpackage.eknf, defpackage.ekeq, defpackage.ekmj
    /* renamed from: g */
    public final List c(Object obj) {
        return DesugarCollections.unmodifiableList(this.a.c(obj));
    }

    @Override // defpackage.eknf, defpackage.ekeq, defpackage.ekmj
    /* renamed from: h */
    public final List d(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.eknf, defpackage.ekeq, defpackage.eker
    public final /* synthetic */ Object hp() {
        return this.a;
    }
}
