package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class didt implements dids {
    final /* synthetic */ Collection a;

    public didt(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.dids
    public final boolean b(String str) {
        return this.a.contains(str);
    }
}
