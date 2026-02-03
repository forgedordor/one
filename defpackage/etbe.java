package defpackage;

import defpackage.esyd;
import defpackage.esyv;
import defpackage.etcz;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbe extends esyv {
    public static final esyw a = c(2);
    private final int b;

    private etbe(int i) {
        this.b = i;
    }

    public static esyw c(int i) {
        final etbe etbeVar = new etbe(i);
        return new esyw() { // from class: com.google.gson.internal.bind.NumberTypeAdapter$1
            @Override // defpackage.esyw
            public final esyv a(esyd esydVar, etcz etczVar) {
                if (etczVar.a == Number.class) {
                    return this.a;
                }
                return null;
            }
        };
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        int iT = etdbVar.t();
        int i = iT - 1;
        if (i == 5 || i == 6) {
            return esyt.a(this.b, etdbVar);
        }
        if (i == 8) {
            etdbVar.p();
            return null;
        }
        throw new esyr("Expecting number, got: " + etdc.a(iT) + "; at path " + etdbVar.e());
    }

    @Override // defpackage.esyv
    public final /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        etddVar.l((Number) obj);
    }
}
