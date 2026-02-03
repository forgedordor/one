package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaob extends dqpi {
    public static final cczi a = cdag.h(cdag.b, "enable_rcs_group_id_update_check", false);
    public final aaoq b;
    public final eosc c;
    public final eijt d = new eijt();
    public final bosz e;
    private final dqsn f;

    public aaob(dqsn dqsnVar, aaoq aaoqVar, eosc eoscVar) {
        botb botbVarE = botm.e();
        botbVarE.A("rcsGroupIdQuery");
        botbVarE.g(new Function() { // from class: aanx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = aaob.a;
                return ((bopp) obj).aa;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.e = botbVarE.b();
        this.f = dqsnVar;
        this.b = aaoqVar;
        this.c = eoscVar;
    }

    @Override // defpackage.dqpi
    public final /* bridge */ /* synthetic */ void b(dqwl dqwlVar, dqsd dqsdVar) {
        if (((botd) dqsdVar.c()) != null) {
            dqsn dqsnVar = this.f;
            dqsm dqsmVar = new dqsm() { // from class: aanz
                @Override // defpackage.dqsm
                public final eieu a() {
                    cczi ccziVar = aaob.a;
                    return eiiy.k("CTCL::onChangeInTransaction::runAfterCommit");
                }
            };
            final aaoq aaoqVar = this.b;
            dqsnVar.g(dqsmVar, null, new Runnable() { // from class: aaoa
                @Override // java.lang.Runnable
                public final void run() {
                    final aaoq aaoqVar2 = aaoqVar;
                    eijx.f(new Runnable() { // from class: aaol
                        @Override // java.lang.Runnable
                        public final void run() {
                            eksp ekspVar = aaoq.a;
                            ((eksl) ekspVar.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "evaluate", 89, "RcsGroupIdUpdateChecker.java")).q("Started evaluation.");
                            for (Map.Entry entry : aaoq.a().entrySet()) {
                                aaoq aaoqVar3 = aaoqVar2;
                                ConversationIdType conversationIdType = (ConversationIdType) entry.getKey();
                                String str = (String) entry.getValue();
                                Optional optionalOfNullable = Optional.ofNullable((String) aaoqVar3.e.a.replace(conversationIdType, str));
                                if (optionalOfNullable.isEmpty()) {
                                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "isUnexpectedRcsGroupIdUpdate", 114, "RcsGroupIdUpdateChecker.java")).t("Set RCS Group id to map for the first time in conversation %s", conversationIdType);
                                } else if (!((String) optionalOfNullable.get()).equals(str)) {
                                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/custodian/inspectors/misthreading/RcsGroupIdUpdateChecker", "isUnexpectedRcsGroupIdUpdate", 126, "RcsGroupIdUpdateChecker.java")).I("RCS Group Id updated for conversation %s. Old value: %s. New value: %s.", conversationIdType, optionalOfNullable.get(), str);
                                    aapx aapxVar = aaoqVar3.d;
                                    aaps aapsVar = new aaps();
                                    aapsVar.d(emvl.RCS_GROUP_ID_UPDATED);
                                    aapsVar.c((ConversationIdType) entry.getKey());
                                    aapxVar.b(aapsVar.e());
                                }
                            }
                        }
                    }, aaoqVar2.b).k(auvh.b(), aaoqVar2.c);
                }
            });
        }
    }
}
