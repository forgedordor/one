package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqy implements crra {
    final /* synthetic */ dids a;
    final /* synthetic */ dids b;
    final /* synthetic */ Collection c;

    public crqy(dids didsVar, dids didsVar2, Collection collection) {
        this.a = didsVar;
        this.b = didsVar2;
        this.c = collection;
    }

    @Override // defpackage.crra
    public final boolean a(String str) {
        return this.a.b(str) || this.b.b(str) || this.c.contains(str);
    }

    @Override // defpackage.dids
    public final boolean b(String str) {
        return this.a.b(str);
    }
}
