package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class antm implements bxkq {
    public final List a;
    public final dqpi b;
    public final bsbm c;
    public final dqpi d;
    public final boip e;
    private final dqsn f;
    private final fcsu g;

    public antm(dqsn dqsnVar, fcsu fcsuVar) {
        dqsnVar.getClass();
        fcsuVar.getClass();
        this.f = dqsnVar;
        this.g = fcsuVar;
        this.a = new ArrayList();
        this.b = new anvf(new antl(this));
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("ParticipantChangeObserver#query1");
        bsboVarE.b();
        bsbo bsboVarE2 = ParticipantsTable.e();
        bsum bsumVarA = ProfilesTable.a().b();
        bstk bstkVar = ProfilesTable.c.b;
        brzi brziVar = ParticipantsTable.c.a;
        bsur bsurVar = new bsur();
        bsurVar.ap(new dqpn("profiles_table.participant_id", 6));
        dqtr dqtrVarT = bsumVarA.t(bstkVar, brziVar, new bsuq(bsurVar));
        ((dqos) dqtrVarT).e = "profiles_table_join_tag";
        bsboVarE2.H(dqtrVarT.g());
        bsboVarE2.A("ParticipantChangeObserver#query2");
        this.c = bsboVarE2.b();
        this.d = new anuu(new antk(this));
        String[] strArr = boiv.a;
        boiq boiqVar = new boiq(boiv.a);
        boiqVar.A("ParticipantChangeObserver#query2");
        this.e = boiqVar.b();
    }

    public final ekgb a() {
        ekgb ekgbVarA;
        List list = this.a;
        synchronized (list) {
            ekgbVarA = ekfv.a(list);
        }
        return ekgbVarA;
    }

    public final void b(final Set set, final boolean z) {
        String strValueOf;
        dqsm dqsmVar = new dqsm() { // from class: anth
            @Override // defpackage.dqsm
            public final eieu a() {
                return eiiy.a("PCQL::handleChange::runAfterCommit");
            }
        };
        if (((apty) this.g.b()).a()) {
            strValueOf = "ParticipantObservableSupplier::" + set.hashCode();
        } else {
            strValueOf = String.valueOf(set.hashCode());
        }
        this.f.g(dqsmVar, strValueOf, new Runnable() { // from class: anti
            @Override // java.lang.Runnable
            public final void run() {
                Set set2 = set;
                int size = set2.size();
                antm antmVar = this;
                if (size >= 10) {
                    Iterator<E> it = antmVar.a().iterator();
                    while (it.hasNext()) {
                        ((antn) it.next()).a();
                    }
                } else {
                    for (antn antnVar : antmVar.a()) {
                        boolean z2 = z;
                        if (((Boolean) antnVar.a.a.a(set2, Boolean.valueOf(z2))).booleanValue()) {
                            auvh.h(antnVar.b.a());
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.bxkq
    public final void c() {
        List list = this.a;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            this.c.Q(this.b);
            this.e.Q(this.d);
        }
    }

    @Override // defpackage.bxkq
    public final void d() {
        List list = this.a;
        synchronized (list) {
            if (list.isEmpty()) {
                return;
            }
            this.c.M(this.b);
            this.e.M(this.d);
            Iterator<E> it = a().iterator();
            while (it.hasNext()) {
                ((antn) it.next()).a();
            }
        }
    }
}
