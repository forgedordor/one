package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpm extends esyv {
    private volatile esyv a;
    private final esyd b;

    public cqpm(esyd esydVar) {
        this.b = esydVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        String str = null;
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        etdbVar.m();
        String str2 = null;
        while (etdbVar.r()) {
            String strH = etdbVar.h();
            if (etdbVar.t() == 9) {
                etdbVar.p();
            } else {
                strH.hashCode();
                if ("gifObjectId".equals(strH)) {
                    esyv esyvVarB = this.a;
                    if (esyvVarB == null) {
                        esyvVarB = this.b.b(String.class);
                        this.a = esyvVarB;
                    }
                    str = (String) esyvVarB.a(etdbVar);
                } else if (ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY.equals(strH)) {
                    esyv esyvVarB2 = this.a;
                    if (esyvVarB2 == null) {
                        esyvVarB2 = this.b.b(String.class);
                        this.a = esyvVarB2;
                    }
                    str2 = (String) esyvVarB2.a(etdbVar);
                } else {
                    etdbVar.q();
                }
            }
        }
        etdbVar.o();
        return new cqpn(str, str2);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        cqpu cqpuVar = (cqpu) obj;
        if (cqpuVar == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("gifObjectId");
        esyv esyvVarB = this.a;
        if (esyvVarB == null) {
            esyvVarB = this.b.b(String.class);
            this.a = esyvVarB;
        }
        esyvVarB.b(etddVar, cqpuVar.a());
        etddVar.i(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        esyv esyvVarB2 = this.a;
        if (esyvVarB2 == null) {
            esyvVarB2 = this.b.b(String.class);
            this.a = esyvVarB2;
        }
        esyvVarB2.b(etddVar, cqpuVar.b());
        etddVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareRequest)";
    }
}
