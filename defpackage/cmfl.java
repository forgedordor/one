package defpackage;

import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmfl extends cmgg {
    private cmfn a;
    private Optional b;
    private evuh c;
    private Optional d;
    private Optional e;
    private boolean f;
    private byte g;

    public cmfl() {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
    }

    @Override // defpackage.cmgg
    public final cmgh a() {
        cmfn cmfnVar;
        evuh evuhVar;
        if (this.g == 1 && (cmfnVar = this.a) != null && (evuhVar = this.c) != null) {
            return new cmfm(cmfnVar, this.b, evuhVar, this.d, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" key");
        }
        if (this.c == null) {
            sb.append(" schema");
        }
        if (this.g == 0) {
            sb.append(" enableCache");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cmgg
    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) 1;
    }

    @Override // defpackage.cmgg
    public final void c(Supplier supplier) {
        this.e = Optional.of(supplier);
    }

    @Override // defpackage.cmgg
    public final void d(cmfn cmfnVar) {
        if (cmfnVar == null) {
            throw new NullPointerException("Null key");
        }
        this.a = cmfnVar;
    }

    @Override // defpackage.cmgg
    public final void e(cmis cmisVar) {
        this.d = Optional.of(cmisVar);
    }

    @Override // defpackage.cmgg
    public final void f(evuh evuhVar) {
        if (evuhVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.c = evuhVar;
    }

    @Override // defpackage.cmgg
    public final void g(String str) {
        this.b = Optional.of(str);
    }

    public cmfl(cmgh cmghVar) {
        this.b = Optional.empty();
        this.d = Optional.empty();
        this.e = Optional.empty();
        cmfm cmfmVar = (cmfm) cmghVar;
        this.a = cmfmVar.a;
        this.b = cmfmVar.b;
        this.c = cmfmVar.c;
        this.d = cmfmVar.d;
        this.e = cmfmVar.e;
        this.f = cmfmVar.f;
        this.g = (byte) 1;
    }
}
