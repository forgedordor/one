package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fheo implements fhbv {
    private static final feyt a;
    private static final Charset b;
    private final esyd c;
    private final esyv d;

    static {
        Pattern pattern = feyt.a;
        a = feys.a("application/json; charset=UTF-8");
        b = Charset.forName("UTF-8");
    }

    public fheo(esyd esydVar, esyv esyvVar) {
        this.c = esydVar;
        this.d = esyvVar;
    }

    @Override // defpackage.fhbv
    public final /* bridge */ /* synthetic */ Object a(Object obj) throws IOException {
        ffez ffezVar = new ffez();
        etdd etddVarD = this.c.d(new OutputStreamWriter(new ffey(ffezVar), b));
        this.d.b(etddVarD, obj);
        etddVarD.close();
        return new fezc(a, ffezVar.u());
    }
}
