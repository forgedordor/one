package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class babq {
    public static final fcsu a = new fcsu() { // from class: babp
        @Override // defpackage.fcsu
        public final Object b() {
            azuq azuqVarA = azut.a();
            azuqVarA.A("duplicateDestinationIdMapQuery");
            azuqVarA.v();
            aztn aztnVar = azut.c;
            azto aztoVar = aztnVar.a;
            azuqVarA.n(new dqxl("$V", new Object[]{aztoVar}), "backup_id");
            brzh brzhVar = ParticipantsTable.c;
            brzi brziVar = brzhVar.a;
            azuqVarA.n(new dqxl("$V{J:bugle_participants}", new Object[]{brziVar}), "bugle_id");
            bsbo bsboVarE = ParticipantsTable.e();
            bsboVarE.v();
            bsbm bsbmVarA = bsboVarE.a();
            brzi brziVar2 = brzhVar.f;
            azto aztoVar2 = aztnVar.c;
            bsbx bsbxVar = new bsbx();
            dqxe dqxeVar = babo.b;
            bsbxVar.ar(dqxeVar);
            dqtr dqtrVarT = bsbmVarA.t(brziVar2, aztoVar2, new bsbt(bsbxVar));
            ((dqos) dqtrVarT).e = "bugle_participants";
            azuq azuqVarA2 = azut.a();
            azuqVarA2.A("duplicateCmsIdIdMapQuery");
            azuqVarA2.v();
            azuqVarA2.n(new dqxl("$V", new Object[]{aztoVar}), "backup_id");
            azuqVarA2.n(new dqxl("$V{J:bugle_participants}", new Object[]{brziVar}), "bugle_id");
            bsbo bsboVarE2 = ParticipantsTable.e();
            bsboVarE2.v();
            dqtr dqtrVarI = dqts.i(bsboVarE2.a(), brzhVar.E, aztnVar.q);
            ((dqos) dqtrVarI).e = "bugle_participants";
            azuq azuqVarA3 = azut.a();
            azuqVarA3.A("nullDestinationIdMapQuery");
            azuqVarA3.v();
            azuqVarA3.n(new dqxl("$V", new Object[]{aztoVar}), "backup_id");
            azuqVarA3.n(new dqxl("$V{J:bugle_participants}", new Object[]{brziVar}), "bugle_id");
            bsbo bsboVarE3 = ParticipantsTable.e();
            bsboVarE3.v();
            dqtr dqtrVarH = dqts.h(bsboVarE3.a());
            bsbx bsbxVar2 = new bsbx();
            bsbxVar2.ar(babo.c);
            bsbxVar2.ar(dqxeVar);
            bsbt bsbtVar = new bsbt(bsbxVar2);
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = bsbtVar;
            dqosVar.e = "bugle_participants";
            azuqVarA3.E(dqtrVarH.g());
            return fcva.g((azuq) azuqVarA.j(dqtrVarT), (azuq) azuqVarA2.j(dqtrVarI), azuqVarA3);
        }
    };
}
