package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpqb {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final dqsn d;
    private final fcsu e;
    private final fcsu f;

    public cpqb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, dqsn dqsnVar) {
        this.e = fcsuVar;
        this.a = fcsuVar2;
        this.f = fcsuVar3;
        this.b = fcsuVar4;
        this.c = fcsuVar5;
        this.d = dqsnVar;
    }

    public final ParticipantsTable.BindData a() {
        return ((bbca) this.e.b()).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cppb b(defpackage.bojh r12, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable.BindData r13, defpackage.ekgp r14, final com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpqb.b(bojh, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable$BindData, ekgp, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType):cppb");
    }

    public final Optional c(final ConversationIdType conversationIdType) {
        bojh bojhVarR = ((bakt) this.a.b()).r(conversationIdType);
        final ejvr ejvrVarA = eiid.a(new ejvr() { // from class: cppy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cpqb cpqbVar = this.a;
                return cpqbVar.b((bojh) obj, cpqbVar.a(), null, conversationIdType);
            }
        });
        return Optional.ofNullable(bojhVarR).map(new Function() { // from class: cppz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (cppb) ejvrVarA.apply((bojh) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
