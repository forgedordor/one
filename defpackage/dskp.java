package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dskp {
    static final ekgb a;
    static final ecnq b;
    static final ekgb c;
    public final ecmd d;

    static {
        ecnw ecnwVar = new ecnw();
        ecnwVar.b("CREATE TABLE ");
        ecnwVar.b("clearcut_events_table");
        ecnwVar.b(" (");
        ecnwVar.b("account TEXT NOT NULL, ");
        ecnwVar.b("timestamp_ms INTEGER NOT NULL, ");
        ecnwVar.b("log_source INTEGER NOT NULL, ");
        ecnwVar.b("event_code INTEGER NOT NULL, ");
        ecnwVar.b("package_name TEXT NOT NULL)");
        ecnn ecnnVar = new ecnn(ecnwVar.a());
        ecnn ecnnVar2 = new ecnn(dslh.f("promotions"));
        ecnn ecnnVar3 = new ecnn(dslh.f("capped_promos"));
        ecnn ecnnVar4 = new ecnn(dslh.f("presented_promos"));
        ecnn ecnnVar5 = new ecnn(dslh.f("monitored_events_clearcut"));
        ecnn ecnnVar6 = new ecnn(dslh.f("monitored_events_visual_element"));
        ecnw ecnwVar2 = new ecnw();
        ecnwVar2.b("CREATE TABLE ");
        ecnwVar2.b("visual_element_events_table");
        ecnwVar2.b(" (");
        ecnwVar2.b("account TEXT NOT NULL, ");
        ecnwVar2.b("timestamp_ms INTEGER NOT NULL, ");
        ecnwVar2.b("node_id INTEGER NOT NULL, ");
        ecnwVar2.b("node_id_path TEXT NOT NULL, ");
        ecnwVar2.b("action INTEGER NOT NULL)");
        ekgb ekgbVarC = ekgb.C(ecnnVar, ecnnVar2, ecnnVar3, ecnnVar4, ecnnVar5, ecnnVar6, new ecnn(ecnwVar2.a()), new ecnn(dslh.f("preview_promotions")), new ecnn(dslh.f("eval_results")), new ecnn(dsll.d("success_event_store")), new ecnn(dsll.d("user_experiments_store")), new ecnn(dslh.f("versioned_identifiers")), new ecnn(dslh.f("chime_versioned_identifiers")));
        a = ekgbVarC;
        dsko dskoVar = new dsko();
        b = dskoVar;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(ekgbVarC);
        ekfwVar.h(dskoVar);
        c = ekfwVar.g();
    }

    public dskp(ecmf ecmfVar) {
        ekgb ekgbVar = c;
        ecnk ecnkVar = new ecnk();
        int i = ((ekoe) ekgbVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ecnkVar.b((ecnq) ekgbVar.get(i2));
        }
        this.d = ecmfVar.a("growthkit.db", ecnkVar.a());
    }
}
