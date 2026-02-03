package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceuk implements cesd {
    public final cmfo a;
    public final crqv b;

    public ceuk(cmgk cmgkVar, crqv crqvVar) {
        this.b = crqvVar;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.TACHYON_ANONYMOUS);
        cmggVarC.f(cetc.a);
        cmggVarC.c(new Supplier() { // from class: ceuh
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ceuj();
            }
        });
        this.a = cmgkVar.a(cmggVarC.a());
    }

    @Override // defpackage.cesd
    public final eiju a() {
        return this.a.j(new ejvr() { // from class: ceue
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetb cetbVar = (cetb) ((cetc) obj).toBuilder();
                cetbVar.copyOnWrite();
                ((cetc) cetbVar.instance).c = cetc.a.c;
                return (cetc) cetbVar.build();
            }
        }).h(new ejvr() { // from class: ceuf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju b() {
        return this.a.h().h(new ejvr() { // from class: ceub
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((cetc) obj).d);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju c() {
        return this.a.h().h(new ejvr() { // from class: ceug
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((cetc) obj).c.I();
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju d(final long j) {
        return this.a.j(new ejvr() { // from class: ceui
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetb cetbVar = (cetb) ((cetc) obj).toBuilder();
                cetbVar.copyOnWrite();
                ((cetc) cetbVar.instance).d = j;
                return (cetc) cetbVar.build();
            }
        }).h(new ejvr() { // from class: cets
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    @Override // defpackage.cesd
    public final eiju e(final byte[] bArr) {
        return this.a.j(new ejvr() { // from class: cetw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetb cetbVar = (cetb) ((cetc) obj).toBuilder();
                evqs evqsVarX = evqs.x(bArr);
                cetbVar.copyOnWrite();
                ((cetc) cetbVar.instance).c = evqsVarX;
                return (cetc) cetbVar.build();
            }
        }).h(new ejvr() { // from class: cetx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return null;
            }
        }, eoqg.a);
    }

    public final eiju f() {
        return this.a.h().h(new ejvr() { // from class: cetr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cetc cetcVar = (cetc) obj;
                return Long.valueOf(cetcVar != null ? cetcVar.g : 0L);
            }
        }, eoqg.a);
    }
}
