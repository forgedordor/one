package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izy extends fdbr implements fdae {
    final /* synthetic */ izz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izy(izz izzVar) {
        super(0);
        this.a = izzVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        izz izzVar = this.a;
        izzVar.e = false;
        HashSet hashSet = new HashSet();
        hum humVar = izzVar.c;
        Object[] objArr = humVar.a;
        int i = humVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            jcr jcrVar = (jcr) objArr[i2];
            izw izwVar = (izw) izzVar.d.a[i2];
            icr icrVar = jcrVar.v.f;
            if (icrVar.C) {
                izz.b(icrVar, izwVar, hashSet);
            }
        }
        humVar.g();
        izzVar.d.g();
        hum humVar2 = izzVar.a;
        Object[] objArr2 = humVar2.a;
        int i3 = humVar2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            jap japVar = (jap) objArr2[i4];
            izw izwVar2 = (izw) izzVar.b.a[i4];
            if (japVar.C) {
                izz.b(japVar, izwVar2, hashSet);
            }
        }
        humVar2.g();
        izzVar.b.g();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((jap) it.next()).z();
        }
        return fctx.a;
    }
}
