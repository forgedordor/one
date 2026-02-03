package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azzm {
    public static final fcsu a = new fcsu() { // from class: azzj
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azdx.a;
            String[] strArr2 = azdx.a;
            azdu azduVar = new azdu(strArr2);
            azduVar.A("duplicateReactedToMessageQuery");
            azduVar.v();
            azduVar.c(new Function() { // from class: azzk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    azdw azdwVar = (azdw) obj;
                    azdwVar.ap(new dqpn("message_reactions_backup.reacted_message_id", 5));
                    return azdwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            azdd azddVar = azdx.c;
            azde azdeVar = azddVar.a;
            azduVar.n(new dqxl("$V", new Object[]{azdeVar}), "backup_id");
            bqjq bqjqVar = bqkl.c.a;
            azduVar.n(new dqxl("$V{J:bugle_message_reaction}", new Object[]{bqjqVar}), "bugle_id");
            azde azdeVar2 = azddVar.b;
            azwc azwcVar = azvt.b;
            azdu azduVar2 = new azdu(strArr2);
            azduVar2.A("duplicateMessageReactionsQuery");
            azduVar2.v();
            azduVar2.c(new Function() { // from class: azzl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    azdw azdwVar = (azdw) obj;
                    azdwVar.ap(new dqpn("message_reactions_backup.reacted_message_id", 6));
                    return azdwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            azduVar2.n(new dqxl("$V", new Object[]{azdeVar}), "backup_id");
            azduVar2.n(new dqxl("$V{J:bugle_message_reaction}", new Object[]{bqjqVar}), "bugle_id");
            return fcva.g((azdu) ((azdu) azduVar.j(azvg.c(azdeVar2, azwcVar, "message_id_map", false, 16))).j(azzm.a()), (azdu) ((azdu) azduVar2.j(azvg.c(azdeVar2, azwcVar, "message_id_map", false, 16))).j(azzm.a()));
        }
    };

    public static final dqtr a() {
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.v();
        dqtr dqtrVarH = dqts.h(bqkgVarA.b());
        String[] strArr = bmkn.a;
        bmkm bmkmVar = new bmkm();
        bmkmVar.ar(new dqxl("$V{J:bugle_message_reaction} = $V{J:message_id_map}", new Object[]{bqkl.c.b, bmkn.c.d}));
        bmkl bmklVar = new bmkl(bmkmVar);
        dqos dqosVar = (dqos) dqtrVarH;
        dqosVar.d = bmklVar;
        dqosVar.e = "bugle_message_reaction";
        return dqtrVarH;
    }
}
