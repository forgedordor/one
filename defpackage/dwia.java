package defpackage;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwia implements dwhx {
    private final ConcurrentHashMap a;
    private final ConcurrentHashMap b;
    private final dzfj c;

    public dwia(dzfj dzfjVar) {
        new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.c = dzfjVar;
    }

    private final void a(String str, String str2, dzua dzuaVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Pair pairCreate = Pair.create(str, str2);
        dzub dzubVar = (dzub) concurrentHashMap.get(pairCreate);
        if (dzubVar == null || !concurrentHashMap.remove(pairCreate, dzubVar)) {
            return;
        }
        dzfh dzfhVar = new dzfh(str);
        dzfj dzfjVar = this.c;
        dzfjVar.a.i(dzubVar, dzfhVar, (feeg) this.b.get(str2), dzuaVar);
    }

    @Override // defpackage.dwhx
    public final void b(String str, dwqw dwqwVar) {
        a(str, dwqwVar.r(), dzua.CANCEL);
        dzub dzubVarC = this.c.c();
        this.a.putIfAbsent(Pair.create(str, dwqwVar.r()), dzubVarC);
        this.b.putIfAbsent(dwqwVar.r(), dwhy.a(dwqwVar));
    }

    @Override // defpackage.dwhx
    public final void c(String str, String str2) {
        a(str, str2, null);
    }
}
