package defpackage;

import j$.util.function.BiConsumer$CC;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agoo extends aivg implements actl {
    private final agnw a;

    public agoo(agnw agnwVar, fcsu fcsuVar, admo admoVar, Executor executor) {
        super(fcsuVar, admoVar, executor);
        this.a = agnwVar;
    }

    @Override // defpackage.aivg
    public final BiConsumer a() {
        return new BiConsumer() { // from class: agom
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                enid enidVar = (enid) obj;
                enjk enjkVar = (enjk) obj2;
                enidVar.copyOnWrite();
                enie enieVar = (enie) enidVar.instance;
                enie enieVar2 = enie.a;
                enjkVar.getClass();
                enieVar.c = enjkVar;
                enieVar.b = 3;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final void b(Supplier supplier) {
        if (((Boolean) adml.a.e()).booleanValue()) {
            return;
        }
        k(supplier);
    }

    public final void c(final int i) {
        b(new Supplier() { // from class: agoi
            @Override // java.util.function.Supplier
            public final Object get() {
                eniy eniyVar = (eniy) enjk.a.createBuilder();
                enio enioVar = (enio) enir.a.createBuilder();
                enim enimVar = (enim) enin.a.createBuilder();
                enimVar.copyOnWrite();
                enin eninVar = (enin) enimVar.instance;
                eninVar.c = i - 1;
                eninVar.b |= 1;
                enioVar.copyOnWrite();
                enir enirVar = (enir) enioVar.instance;
                enin eninVar2 = (enin) enimVar.build();
                eninVar2.getClass();
                enirVar.c = eninVar2;
                enirVar.b = 2;
                eniyVar.copyOnWrite();
                enjk enjkVar = (enjk) eniyVar.instance;
                enir enirVar2 = (enir) enioVar.build();
                enirVar2.getClass();
                enjkVar.c = enirVar2;
                enjkVar.b = 1;
                return (enjk) eniyVar.build();
            }
        });
    }

    public final void d(final String str, final int i) {
        b(new Supplier() { // from class: agok
            @Override // java.util.function.Supplier
            public final Object get() {
                eniy eniyVar = (eniy) enjk.a.createBuilder();
                enje enjeVar = (enje) enjg.a.createBuilder();
                enjeVar.copyOnWrite();
                enjg enjgVar = (enjg) enjeVar.instance;
                enjgVar.c = i - 1;
                enjgVar.b |= 1;
                enjeVar.copyOnWrite();
                enjg enjgVar2 = (enjg) enjeVar.instance;
                String str2 = str;
                str2.getClass();
                enjgVar2.b |= 2;
                enjgVar2.d = str2;
                enjg enjgVar3 = (enjg) enjeVar.build();
                eniyVar.copyOnWrite();
                enjk enjkVar = (enjk) eniyVar.instance;
                enjgVar3.getClass();
                enjkVar.c = enjgVar3;
                enjkVar.b = 4;
                return (enjk) eniyVar.build();
            }
        });
    }

    @Override // defpackage.actl
    public final void n() {
        ejvr ejvrVar = new ejvr() { // from class: agod
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                agog agogVar = (agog) ((agoh) obj).toBuilder();
                int i = ((agoh) agogVar.instance).b + 1;
                agogVar.copyOnWrite();
                ((agoh) agogVar.instance).b = i;
                return (agoh) agogVar.build();
            }
        };
        agof agofVar = (agof) this.a;
        auvh.h(agofVar.d.b(ejvrVar, agofVar.b));
        b(new Supplier() { // from class: agoj
            @Override // java.util.function.Supplier
            public final Object get() {
                eniy eniyVar = (eniy) enjk.a.createBuilder();
                enio enioVar = (enio) enir.a.createBuilder();
                eniq eniqVar = eniq.a;
                enioVar.copyOnWrite();
                enir enirVar = (enir) enioVar.instance;
                eniqVar.getClass();
                enirVar.c = eniqVar;
                enirVar.b = 1;
                eniyVar.copyOnWrite();
                enjk enjkVar = (enjk) eniyVar.instance;
                enir enirVar2 = (enir) enioVar.build();
                enirVar2.getClass();
                enjkVar.c = enirVar2;
                enjkVar.b = 1;
                return (enjk) eniyVar.build();
            }
        });
    }
}
