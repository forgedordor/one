package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmx {
    public final ehnc a;
    public final ehnu b;

    /* compiled from: PG */
    public interface a {
        ahhf hH();
    }

    /* compiled from: PG */
    public interface b {
        eyha c();
    }

    public ehmx(ehnc ehncVar, ejwi ejwiVar, ehnu ehnuVar) {
        this.a = ehncVar;
        if (ejwiVar.g()) {
            ejwl.l(ejwiVar.c() instanceof abi);
        }
        this.b = ehnuVar;
    }

    public final ehmz a(efwo efwoVar) {
        return (ehmz) new lxo(this.b, new ehmy(this, efwoVar)).b.a(fdab.c(ehmz.class), "tt_activity_account_retained:".concat((efwoVar == null ? "null" : Integer.valueOf(efwoVar.a())).toString()));
    }

    public final Object b(efwo efwoVar) {
        Object obj;
        ehmz ehmzVarA = a(efwoVar);
        synchronized (ehmzVarA.d) {
            if (ehmzVarA.e == null) {
                ahhf ahhfVarHH = ((a) eygm.a(ehmzVarA.b.a(ehmzVarA.c), a.class)).hH();
                ahhfVarHH.c = ehmzVarA.a;
                eyij.a(ahhfVarHH.c, lwn.class);
                ehmzVarA.e = new ahhh(ahhfVarHH.a, ahhfVarHH.b);
            }
            obj = ehmzVarA.e;
        }
        return obj;
    }
}
