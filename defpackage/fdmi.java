package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdmi extends fdjq {
    protected final String g() {
        fdmi fdmiVarJ;
        fdjq fdjqVar = fdkq.a;
        fdmi fdmiVar = fdzb.a;
        if (this == fdmiVar) {
            return "Dispatchers.Main";
        }
        try {
            fdmiVarJ = fdmiVar.j();
        } catch (UnsupportedOperationException unused) {
            fdmiVarJ = null;
        }
        if (this == fdmiVarJ) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // defpackage.fdjq
    public final fdjq i(int i) {
        fdys.a(1);
        return this;
    }

    public abstract fdmi j();

    @Override // defpackage.fdjq
    public String toString() {
        String strG = g();
        if (strG != null) {
            return strG;
        }
        return fdkc.a(this) + "@" + fdkc.b(this);
    }
}
