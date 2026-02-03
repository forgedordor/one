package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hpo implements fdae {
    final /* synthetic */ hpp a;

    public hpo(hpp hppVar) {
        this.a = hppVar;
    }

    @Override // defpackage.fdae
    public final /* synthetic */ Object invoke() {
        List list = this.a.a;
        cuz cuzVar = new cuz(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hoj hojVar = (hoj) list.get(i);
            Object obj = hojVar.b;
            hui.b(cuzVar, obj != null ? new hoi(Integer.valueOf(hojVar.a), obj) : Integer.valueOf(hojVar.a), hojVar);
        }
        return new hui(cuzVar);
    }
}
