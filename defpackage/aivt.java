package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivt {
    public static emyn a(int i, int i2, emqj emqjVar, boolean z) {
        emyl emylVar = (emyl) emyn.a.createBuilder();
        emylVar.copyOnWrite();
        emyn emynVar = (emyn) emylVar.instance;
        emynVar.b |= 1;
        emynVar.c = i;
        emylVar.copyOnWrite();
        emyn emynVar2 = (emyn) emylVar.instance;
        emynVar2.d = i2 - 1;
        emynVar2.b |= 2;
        emylVar.copyOnWrite();
        emyn emynVar3 = (emyn) emylVar.instance;
        emqjVar.getClass();
        emynVar3.e = emqjVar;
        emynVar3.b |= 4;
        emylVar.copyOnWrite();
        emyn emynVar4 = (emyn) emylVar.instance;
        emynVar4.b |= 8;
        emynVar4.f = z;
        return (emyn) emylVar.build();
    }
}
