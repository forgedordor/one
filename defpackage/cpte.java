package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpte implements Supplier {
    boolean a = false;
    eplf b = eplf.a;
    final /* synthetic */ cptg c;

    public cpte(cptg cptgVar) {
        this.c = cptgVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized eplf get() {
        if (!this.a) {
            try {
                try {
                    cptg cptgVar = this.c;
                    this.b = cptgVar.e.a(cptgVar.c);
                } catch (evtj e) {
                    cqbd cqbdVarE = cptg.a.e();
                    cqbdVarE.I("Failed to create MessageModel.");
                    cqbdVarE.A("object_cms_id", this.c.c.c);
                    cqbdVarE.s(e);
                    throw new cpta(e);
                }
            } catch (cpql e2) {
                cqbd cqbdVarE2 = cptg.a.e();
                cqbdVarE2.I("MessageModel decryption succeeded. Original exception is logged below.");
                cptg cptgVar2 = this.c;
                eqnd eqndVar = cptgVar2.c;
                cqbdVarE2.A("object_cms_id", eqndVar.c);
                cqbdVarE2.s(e2);
                cptgVar2.f = true;
                eple epleVar = (eple) ((eplf) e2.a).toBuilder();
                String str = eqndVar.c;
                epleVar.copyOnWrite();
                eplf eplfVar = (eplf) epleVar.instance;
                str.getClass();
                eplfVar.d = str;
                this.b = (eplf) epleVar.build();
            }
            this.a = true;
        }
        return this.b;
    }
}
