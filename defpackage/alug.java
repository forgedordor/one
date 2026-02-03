package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alug implements alrj {
    public final eygg b;
    private final eygg c;
    private final eygg d;

    public alug(eygg eyggVar, eygg eyggVar2, eygg eyggVar3) {
        this.c = eyggVar;
        this.d = eyggVar2;
        this.b = eyggVar3;
    }

    @Override // defpackage.alrj
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bbcf.c(alnz.t(bindData.V(), bindData.T())) ? Optional.empty() : Optional.of(q(bindData));
    }

    @Override // defpackage.alfq
    public final alqm a(String str) {
        return ((alpa) this.c.b()).a(str);
    }

    @Override // defpackage.alfq
    public final alqm b(aubq aubqVar) {
        return ((alpa) this.c.b()).b(aubqVar);
    }

    @Override // defpackage.alfq
    public final alqm c(String str, ejxr ejxrVar) {
        return ((alpa) this.c.b()).c(str, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm d(final dggk dggkVar) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).d(dggkVar), new ejxr() { // from class: alty
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).d(dggkVar);
            }
        });
    }

    @Override // defpackage.alfq
    public final alqm e(String str, String str2, String str3, boolean z, String str4, ejxr ejxrVar) {
        return ((alpa) this.c.b()).e(str, str2, str3, z, str4, ejxrVar);
    }

    @Override // defpackage.alfq
    public final alqm f() {
        return ((alpa) this.c.b()).f();
    }

    @Override // defpackage.alfq
    public final alqm g(alqm alqmVar, ejxr ejxrVar) {
        return ((alpa) this.c.b()).g(alqmVar, ejxrVar);
    }

    @Override // defpackage.alfq
    @Deprecated
    public final alqm h(alqm alqmVar, String str) {
        return ((alpa) this.c.b()).h(alqmVar, str);
    }

    @Override // defpackage.alfq
    public final alqm i(alqm alqmVar, boolean z) {
        return ((alpa) this.c.b()).i(alqmVar, z);
    }

    @Override // defpackage.alfq
    public final alqm j(alqm alqmVar, int i) {
        return ((alpa) this.c.b()).j(alqmVar, i);
    }

    @Override // defpackage.alfq
    public final alqm k(alqm alqmVar) {
        return ((alpa) this.c.b()).k(alqmVar);
    }

    @Override // defpackage.alrj
    public final alqm l() {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).l(), new ejxr() { // from class: alts
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).l();
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm m() {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).m(), new ejxr() { // from class: aluf
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).m();
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm n(final String str) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).n(str), new ejxr() { // from class: aluc
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).n(str);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm o(final ParticipantsTable.BindData bindData) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).o(bindData), new ejxr() { // from class: altu
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).o(bindData);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm p(final String str) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).p(str), new ejxr() { // from class: altx
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).p(str);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm q(final ParticipantsTable.BindData bindData) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).q(bindData), new ejxr() { // from class: alue
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).q(bindData);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm r(final String str) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).r(str), new ejxr() { // from class: alud
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).r(str);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm s(final qxf qxfVar) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).s(qxfVar), new ejxr() { // from class: altv
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).s(qxfVar);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm t(final ParticipantsTable.BindData bindData) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).t(bindData), new ejxr() { // from class: altw
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).t(bindData);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm u(final String str, final int i) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).u(str, i), new ejxr() { // from class: alua
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).u(str, i);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm v() {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).v(), new ejxr() { // from class: altz
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).v();
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm w(final alqm alqmVar) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).x(alqmVar), new ejxr() { // from class: altt
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).x(alqmVar);
            }
        });
    }

    @Override // defpackage.alrj
    public final alqm x(final alqm alqmVar) {
        return ((alpa) this.c.b()).l(((alsn) this.d.b()).x(alqmVar), new ejxr() { // from class: alub
            @Override // defpackage.ejxr
            public final Object get() {
                return ((altr) this.a.b.b()).x(alqmVar);
            }
        });
    }

    @Override // defpackage.alrj
    public final ekgb y(List list) {
        ekfw ekfwVar = new ekfw();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ekfwVar.h(q((ParticipantsTable.BindData) it.next()));
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.alrj
    public final ekgb z(asrg asrgVar) {
        ekfw ekfwVar = new ekfw();
        if (asrgVar.d()) {
            ekgb ekgbVarC = asrgVar.c();
            int size = ekgbVarC.size();
            for (int i = 0; i < size; i++) {
                ekfwVar.h(((alpa) this.c.b()).b((aubq) ekgbVarC.get(i)));
            }
        } else {
            ekfwVar.h(((alpa) this.c.b()).b(asrgVar.a()));
        }
        return ekfwVar.g();
    }
}
