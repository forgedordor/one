package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwv {
    public static final fcsu a = new fcsu() { // from class: azwt
        @Override // defpackage.fcsu
        public final Object b() {
            ayur ayurVarA = ayuu.a();
            ayurVarA.A("duplicateConversationParticipantsQuery");
            ayurVarA.v();
            ayurVarA.n(new dqxl("$V", new Object[]{ayuu.c.a}), "backup_id");
            bobj bobjVar = bocg.c;
            ayurVarA.n(new dqxl("$V{J:bugle_conversation_participants}", new Object[]{bobjVar.a}), "bugle_id");
            ayur ayurVar = (ayur) ((ayur) ayurVarA.j(azwv.b())).j(azwv.c());
            boca bocaVarA = bocg.a();
            bocaVarA.v();
            dqtr dqtrVarH = dqts.h(bocaVarA.b());
            String[] strArr = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bobk bobkVar = bobjVar.b;
            bmju bmjuVar = bmkn.c.d;
            bmkmVar.ar(new dqxl("$V{J:bugle_conversation_participants} = $V{J:convo_id_map}", new Object[]{bobkVar, bmjuVar}));
            bmkmVar.ar(new dqxl("$V{J:bugle_conversation_participants} = $V{J:participant_id_map}", new Object[]{bobjVar.c, bmjuVar}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_conversation_participants";
            return fcva.g((ayur) ayurVar.j(dqtrVarH), azwv.a());
        }
    };
    public static final fcsu b = new fcsu() { // from class: azwu
        @Override // defpackage.fcsu
        public final Object b() {
            ayur ayurVarA = ayuu.a();
            ayurVarA.A("duplicateConversationToParticipantsQuery");
            ayurVarA.v();
            ayurVarA.n(new dqxl("$V", new Object[]{ayuu.c.a}), "backup_id");
            ayurVarA.n(new dqxl("$V", new Object[]{-1}), "bugle_id");
            ayur ayurVar = (ayur) ((ayur) ayurVarA.j(azwv.b())).j(azwv.c());
            String[] strArr = boiv.a;
            boiq boiqVar = new boiq(boiv.a);
            boiqVar.v();
            dqtr dqtrVarH = dqts.h(boiqVar.b());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            boic boicVar = boiv.c;
            boid boidVar = boicVar.a;
            bmju bmjuVar = bmkn.c.d;
            bmkmVar.ar(new dqxl("$V{J:bugle_conversation_to_participants} = $V{J:convo_id_map}", new Object[]{boidVar, bmjuVar}));
            bmkmVar.ar(new dqxl("$V{J:bugle_conversation_to_participants} = $V{J:participant_id_map}", new Object[]{boicVar.b, bmjuVar}));
            bmkl bmklVar = new bmkl(bmkmVar);
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = bmklVar;
            dqosVar.e = "bugle_conversation_to_participants";
            return fcva.g((ayur) ayurVar.j(dqtrVarH), azwv.a());
        }
    };

    public static final ayur a() {
        ayur ayurVarA = ayuu.a();
        ayurVarA.A("parentConversationWasADuplicateQuery");
        ayurVarA.v();
        ayua ayuaVar = ayuu.c;
        ayurVarA.n(new dqxl("$V", new Object[]{ayuaVar.a}), "backup_id");
        ayurVarA.n(new dqxl("$V", new Object[]{-1}), "bugle_id");
        String[] strArr = bmkn.a;
        bmki bmkiVar = new bmki(bmkn.a);
        bmkiVar.v();
        bmkiVar.d(new Function() { // from class: azws
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmkm bmkmVar = (bmkm) obj;
                bmkmVar.g(azvt.a.a);
                bmkmVar.c(-1L);
                return bmkmVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return (ayur) ayurVarA.j(dqts.i(bmkiVar.b(), bmkn.c.c, ayuaVar.b));
    }

    public static final dqtr b() {
        return azvg.c(ayuu.c.b, azvt.a, "convo_id_map", false, 16);
    }

    public static final dqtr c() {
        return azvg.c(ayuu.c.c, azvt.c, "participant_id_map", false, 16);
    }
}
