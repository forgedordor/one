package defpackage;

import com.google.gson.internal.Excluder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszv extends esyv {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ esyd c;
    final /* synthetic */ etcz d;
    final /* synthetic */ Excluder e;
    private volatile esyv f;

    public eszv(Excluder excluder, boolean z, boolean z2, esyd esydVar, etcz etczVar) {
        this.a = z;
        this.b = z2;
        this.c = esydVar;
        this.d = etczVar;
        this.e = excluder;
    }

    private final esyv c() {
        esyv esyvVar = this.f;
        if (esyvVar != null) {
            return esyvVar;
        }
        esyv esyvVarC = this.c.c(this.e, this.d);
        this.f = esyvVarC;
        return esyvVarC;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) throws IOException {
        if (!this.a) {
            return c().a(etdbVar);
        }
        etdbVar.q();
        return null;
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException {
        if (this.b) {
            etddVar.j();
        } else {
            c().b(etddVar, obj);
        }
    }
}
