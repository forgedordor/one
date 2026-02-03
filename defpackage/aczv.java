package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczv implements anpj {
    public final aofc a;
    public final ejxr b;
    private final fdjx c;

    public aczv(fdjx fdjxVar, aofc aofcVar) {
        fdjxVar.getClass();
        aofcVar.getClass();
        this.c = fdjxVar;
        this.a = aofcVar;
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: aczt
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.a.d();
            }
        });
        ejxrVarA.getClass();
        this.b = ejxrVarA;
    }

    @Override // defpackage.anpj
    public final cquc a(anpi anpiVar) {
        cquc cqucVarA = ((anpj) this.b.get()).a(anpiVar);
        cqucVarA.getClass();
        return cqucVarA;
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.c, fcyi.a, fdjz.a, new aczu(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
