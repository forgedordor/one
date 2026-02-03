package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayuv implements aytd {
    private static final String a = String.valueOf(ayuu.c.d.d()).concat("_expression");
    private static final String b = String.valueOf(ayuu.c.f.d()).concat("_expression");
    private static final String c = String.valueOf(ayuu.c.a.d()).concat("_expression");

    private static final void c(dqwl dqwlVar, int i) {
        String[] strArr = ayuu.a;
        dqtq dqtqVar = new dqtq("conversation_participants_backup", "backup");
        ayua ayuaVar = ayuu.c;
        dqtqVar.b(ayuaVar.b, ayuaVar.c, ayuaVar.e, ayuaVar.d, ayuaVar.f, ayuaVar.a);
        dqtqVar.c = dqwlVar;
        dqtqVar.d = i;
        dqtqVar.a().a();
    }

    @Override // defpackage.aytd
    public final void a() {
        String[] strArr = ayuu.a;
        ayul ayulVar = new ayul();
        ayulVar.f("clearTable");
        ayulVar.e();
        ayulVar.b().b();
    }

    @Override // defpackage.aytd
    public final void b(aytc aytcVar) {
        aytcVar.getClass();
        boca bocaVarA = bocg.a();
        bobj bobjVar = bocg.c;
        bocaVarA.c(bobjVar.b, bobjVar.c, bobjVar.e);
        dqxl dqxlVar = new dqxl("$V", new Object[]{bobjVar.d});
        String str = a;
        bocaVarA.n(dqxlVar, str);
        dqxl dqxlVar2 = new dqxl("0", new Object[0]);
        String str2 = b;
        bocaVarA.n(dqxlVar2, str2);
        dqxl dqxlVar3 = new dqxl("ROW_NUMBER() OVER()", new Object[0]);
        String str3 = c;
        bocaVarA.n(dqxlVar3, str3);
        c(bocaVarA.b(), 0);
        if (aytcVar.a) {
            String[] strArr = boiv.a;
            boiq boiqVar = new boiq(boiv.a);
            boiqVar.A("conversationToParticipantsTableQuery");
            boic boicVar = boiv.c;
            boiqVar.c(boicVar.a, boicVar.b, boicVar.c);
            boiqVar.n(new dqxl("1", new Object[0]), str);
            boiqVar.n(new dqxl("1", new Object[0]), str2);
            boca bocaVarA2 = bocg.a();
            bocaVarA2.A("conversationParticipantsTableCountQuery");
            boiqVar.n(new dqxl("$V + ROW_NUMBER() OVER()", new Object[]{Integer.valueOf(bocaVarA2.b().h())}), str3);
            c(boiqVar.b(), 4);
        }
    }
}
