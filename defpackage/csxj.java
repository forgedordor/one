package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxj implements csyz {
    private final bbdl a;
    private final cogw b;
    private final fcsu c;

    public csxj(bbdl bbdlVar, cogw cogwVar, fcsu fcsuVar) {
        bbdlVar.getClass();
        cogwVar.getClass();
        fcsuVar.getClass();
        this.a = bbdlVar;
        this.b = cogwVar;
        this.c = fcsuVar;
    }

    private final void c(final ParticipantsTable.BindData bindData, int i, long j) {
        botb botbVarE = botm.e();
        bopq bopqVar = botm.c.a;
        botbVarE.c(bopqVar);
        botbVarE.i(new Function() { // from class: csxh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.j(0);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boca bocaVarA = bocg.a();
        bocaVarA.d(new Function() { // from class: csxi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bocf bocfVar = (bocf) obj;
                String strR = bindData.R();
                strR.getClass();
                bocfVar.c(Long.parseLong(strR));
                return bocfVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarG = ((botb) botbVarE.j(dqts.i(bocaVarA.b(), bocg.c.b, bopqVar))).b().g();
        if (((ekoe) ekgbVarG).c == 1) {
            byeb byebVar = (byeb) this.c.b();
            Optional optionalEmpty = Optional.empty();
            ekgbVarG.getClass();
            byebVar.k(optionalEmpty, (ConversationIdType) fcva.X(ekgbVarG), this.a.d(), bindData, ekgb.r(bindData), i, j, -1L);
        }
    }

    @Override // defpackage.csyz
    public final void a(ParticipantsTable.BindData bindData, long j) {
        c(bindData, 244, j);
    }

    @Override // defpackage.csyz
    public final void b(ParticipantsTable.BindData bindData) {
        bindData.getClass();
        c(bindData, 243, this.b.f().toEpochMilli());
    }
}
