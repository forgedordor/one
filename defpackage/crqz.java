package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crqz implements crra {
    final /* synthetic */ dids a;
    final /* synthetic */ dids b;
    final /* synthetic */ Collection c;
    final /* synthetic */ Collection d;

    public crqz(dids didsVar, dids didsVar2, Collection collection, Collection collection2) {
        this.a = didsVar;
        this.b = didsVar2;
        this.c = collection;
        this.d = collection2;
    }

    @Override // defpackage.crra
    public final boolean a(String str) {
        return this.a.b(str) || this.b.b(str) || this.c.contains(str);
    }

    @Override // defpackage.dids
    public final boolean b(String str) {
        if (!this.a.b(str)) {
            return false;
        }
        ekqg ekqgVarListIterator = ((ekph) this.d).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            crra crraVar = (crra) ekqgVarListIterator.next();
            if (crraVar.a(str)) {
                return crraVar.b(str);
            }
        }
        return true;
    }
}
