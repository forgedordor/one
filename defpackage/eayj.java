package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eayj {
    public static final ecnr a;

    static {
        ecnk ecnkVar = new ecnk();
        ecnkVar.b(new ecnq() { // from class: eayi
            @Override // defpackage.ecnq
            public final void a(ecoa ecoaVar) throws InterruptedException {
                ecnr ecnrVar = eayj.a;
                ecoaVar.h("CREATE TABLE GlobalValues(key_id TEXT NOT NULL, value TEXT NOT NULL,PRIMARY KEY (key_id))");
                ecoaVar.h("CREATE TABLE SystemProfiles(system_profile_hash INTEGER UNIQUE NOT NULL, system_profile BLOB NOT NULL,PRIMARY KEY (system_profile_hash))");
                ecoaVar.h("CREATE TABLE Reports(customer_id INTEGER NOT NULL, project_id INTEGER NOT NULL, metric_id INTEGER NOT NULL, report_id INTEGER NOT NULL, last_sent_day_index INTEGER, PRIMARY KEY (customer_id,project_id,metric_id,report_id))");
                ecoaVar.h("CREATE TABLE AggregateStore(customer_id INTEGER NOT NULL, project_id INTEGER NOT NULL, metric_id INTEGER NOT NULL, report_id INTEGER NOT NULL, day_index INTEGER NOT NULL, system_profile_hash INTEGER NOT NULL, event_vector STRING NOT NULL, PRIMARY KEY (customer_id,project_id,metric_id,report_id,day_index,system_profile_hash,event_vector),CONSTRAINT report FOREIGN KEY (customer_id,project_id,metric_id,report_id) REFERENCES Reports(customer_id,project_id,metric_id,report_id) ON DELETE CASCADE CONSTRAINT system_profile FOREIGN KEY (system_profile_hash) REFERENCES SystemProfiles(system_profile_hash))");
                ecoaVar.h("CREATE TABLE ObservationStore(observation_store_id INTEGER NOT NULL, observation_batch BLOB NOT NULL,PRIMARY KEY (observation_store_id AUTOINCREMENT))");
            }
        });
        ecnkVar.c("DELETE FROM ObservationStore");
        ecnkVar.c("ALTER TABLE AggregateStore ADD COLUMN aggregate_value BLOB");
        a = ecnkVar.a();
    }
}
