package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekmy extends eknc implements ekjo {
    public ekmy(ekjo ekjoVar, ekma ekmaVar) {
        super(ekjoVar, ekmaVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.eknc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final List a(final Object obj, Collection collection) {
        return ekjz.g((List) collection, new ejvr() { // from class: ekmx
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.b.a(obj, obj2);
            }
        });
    }

    @Override // defpackage.eknc, defpackage.ekmj
    /* renamed from: g */
    public final List c(Object obj) {
        return a(obj, this.a.c(obj));
    }

    @Override // defpackage.eknc, defpackage.ekmj
    /* renamed from: h */
    public final List d(Object obj) {
        return a(obj, this.a.d(obj));
    }
}
