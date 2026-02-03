package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cptb implements Supplier {
    boolean a = false;
    epku b = epku.a;
    final /* synthetic */ cptg c;

    public cptb(cptg cptgVar) {
        this.c = cptgVar;
    }

    @Override // java.util.function.Supplier
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized epku get() {
        epku epkuVar;
        if (!this.a) {
            try {
                cptg cptgVar = this.c;
                cptv cptvVar = cptgVar.e;
                Optional optionalB = cptv.b(cptgVar.c, cptl.OBJECT_PAYLOAD_PART_ENCRYPTED_FREQ_CHANGED.d);
                if (optionalB.isEmpty()) {
                    epkuVar = epku.a;
                } else {
                    evqe evqeVar = ((eqnu) optionalB.get()).g;
                    if (evqeVar == null) {
                        evqeVar = evqe.a;
                    }
                    epkuVar = (epku) cptvVar.a.a((epkh) evsn.parseFrom(epkh.a, evqeVar.c), epku.a);
                }
                this.b = epkuVar;
            } catch (cpql e) {
                cqbd cqbdVarE = cptg.a.e();
                cqbdVarE.I("EncryptedFrequentlyChangedMessageFields decryption succeeded. Original exception is logged below.");
                cptg cptgVar2 = this.c;
                cqbdVarE.A("object_cms_id", cptgVar2.c.c);
                cqbdVarE.s(e);
                cptgVar2.f = true;
                this.b = (epku) e.a;
            } catch (evtj e2) {
                cqbd cqbdVarE2 = cptg.a.e();
                cqbdVarE2.I("Failed to create EncryptedFrequentlyChangedMessageFields.");
                cqbdVarE2.A("object_cms_id", this.c.c.c);
                cqbdVarE2.s(e2);
                throw new cpsz(e2);
            }
            this.a = true;
        }
        return this.b;
    }
}
