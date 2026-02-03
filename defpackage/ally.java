package defpackage;

import j$.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ally implements eyif {
    public static alpc a(Set set) {
        if (set.isEmpty()) {
            return new alpb();
        }
        if (set.size() <= 1) {
            return (alpc) Collection.EL.stream(set).findFirst().get();
        }
        throw new IllegalStateException("@Override CsMessagingIdentityFlags bound multiple times");
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
