package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoe extends evsf implements evui {
    public cnoe() {
        super(cnoh.a);
    }

    public final void a(cnog cnogVar) {
        cnog cnogVar2;
        copyOnWrite();
        cnoh cnohVar = (cnoh) this.instance;
        cnoh cnohVar2 = cnoh.a;
        cnogVar.getClass();
        cnog cnogVar3 = cnohVar.c;
        if (cnogVar3 != null && cnogVar3 != (cnogVar2 = cnog.a)) {
            cnof cnofVar = (cnof) cnogVar2.createBuilder(cnogVar3);
            cnofVar.mergeFrom((cnof) cnogVar);
            cnogVar = (cnog) cnofVar.buildPartial();
        }
        cnohVar.c = cnogVar;
        cnohVar.b |= 1;
    }
}
