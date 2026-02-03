package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoj implements aalp {
    public final armf a;
    public zoi b;
    public ajlt c;
    public final ahnx d;
    private final Set e;

    public zoj(ahnx ahnxVar, Set set, armf armfVar) {
        ahnxVar.getClass();
        this.d = ahnxVar;
        this.e = set;
        this.a = armfVar;
    }

    public final synchronized ymx a(ajlt ajltVar, ajlt ajltVar2, ajlt ajltVar3) {
        Object next;
        zoh zohVar;
        ync yncVarA;
        zoi zoiVar = this.b;
        if (ajltVar3 == null) {
            zohVar = null;
        } else {
            ekqg ekqgVarListIterator = ((ekph) this.e).listIterator();
            while (true) {
                if (!ekqgVarListIterator.hasNext()) {
                    next = null;
                    break;
                }
                next = ekqgVarListIterator.next();
                if (((zoh) next).b(ajltVar, ajltVar3)) {
                    break;
                }
            }
            zohVar = (zoh) next;
        }
        boolean z = true;
        boolean z2 = zoiVar != null;
        if (zohVar == null) {
            z = false;
        }
        if (z2 && z) {
            yncVarA = this.d.a(new zjm(ajltVar), null, null);
            zoi zoiVar2 = this.b;
            zoiVar2.getClass();
            zohVar.getClass();
            zoiVar2.getClass();
            ajltVar3.getClass();
            this.b = new zoi(zohVar.a(zoiVar2.a, ajltVar3), zoiVar2.b);
        } else if (z2) {
            ahnx ahnxVar = this.d;
            zoi zoiVar3 = this.b;
            zoiVar3.getClass();
            zoiVar3.getClass();
            yncVarA = ahnxVar.a(zoiVar3.a, zoiVar3.b, ajltVar3);
            this.b = null;
        } else if (z) {
            ync yncVarA2 = this.d.a(new zjm(ajltVar), null, null);
            zohVar.getClass();
            ajltVar3.getClass();
            this.b = new zoi(zohVar.a(ajltVar, ajltVar3), ajltVar2);
            yncVarA = yncVarA2;
        } else {
            yncVarA = this.d.a(ajltVar, ajltVar2, ajltVar3);
        }
        return yncVarA;
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        this.b = null;
        this.c = null;
    }
}
