package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eacg implements dbzr {
    public final eacb a;

    public eacg(eacb eacbVar) {
        this.a = eacbVar;
    }

    @Override // defpackage.dbzr
    public final void a(final dbzs dbzsVar) {
        if (((dbyd) dbzsVar).a.e()) {
            return;
        }
        each.b(dbzsVar, new ejxr() { // from class: eacc
            @Override // defpackage.ejxr
            public final Object get() {
                dbyd dbydVar = (dbyd) dbzsVar;
                Set set = (Set) ((each) this.a.a).c.get(new ejwj(dbydVar.k, dbydVar.j));
                return set != null ? set : ekon.a;
            }
        }, new ejvr() { // from class: eacd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (eaca) ((each) this.a.a).a.get(new ejwj((String) obj, ((dbyd) dbzsVar).j));
            }
        });
        ejxr ejxrVar = new ejxr() { // from class: eace
            @Override // defpackage.ejxr
            public final Object get() {
                Set set = (Set) ((each) this.a.a).d.get(((dbyd) dbzsVar).k);
                return set != null ? set : ekon.a;
            }
        };
        final eacb eacbVar = this.a;
        each.b(dbzsVar, ejxrVar, new ejvr() { // from class: eacf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (eaca) ((each) eacbVar).b.get((String) obj);
            }
        });
    }
}
